package BD;



import Tipos.Compromisso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLiteJDBCD {
   
    private Connection conn;
    
    public Connection connect() {
        
        try {
            
            String url = "jdbc:sqlite:BDBeta5.db";
            
            conn = DriverManager.getConnection(url);
                     
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        
        return conn;
    }
    
    public void closeConnect(){
        
        try{      
            conn.close();
            
        }catch(Exception e){
            System.out.println( e.getMessage());
        }
           
    }
       
    //Compromisso
    public void criaTabelaCompromisso () {
        
        String sql = "CREATE TABLE IF NOT EXISTS compromisso (";
                sql += "	id integer PRIMARY KEY AUTOINCREMENT,";
                sql += "	nome text NOT NULL,";
                sql += "	data text NOT NULL,";
                sql += "	hora text NOT NULL,";
                sql += "	info text NOT NULL";         
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inserirCompromisso (Compromisso icCompromisso) {
        
        String sql = "INSERT INTO compromisso VALUES($next_id,?,?,?,?)";
  
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setString(2, icCompromisso.getNome());
                pstmt.setString(3, icCompromisso.getData());
                pstmt.setString(4, icCompromisso.getHora());
                pstmt.setString(5, icCompromisso.getInfo());
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void alterarCompromisso(Compromisso acCompromisso, String aData, String aNome){
        
        String sql = "UPDATE compromisso SET nome = ?,";
               sql+= " data = ?,";
               sql+= " hora = ?,";
               sql+= " info = ?";
               sql+= " WHERE data = ? AND nome = ?";
              
  
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setString(1, acCompromisso.getNome());
                pstmt.setString(2, acCompromisso.getData());
                pstmt.setString(3, acCompromisso.getHora());
                pstmt.setString(4, acCompromisso.getInfo());
                
                pstmt.setString(5,aData);
                pstmt.setString(6, aNome);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
    public  ArrayList<Compromisso> selecionaCompromissoUltimos () {
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso ORDER BY data ASC;";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
            ArrayList<Compromisso> lista = new ArrayList<Compromisso>();
            
            while (rs.next()) {
                Compromisso c = new Compromisso();
                    
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    c.setData(rs.getString("data"));
                    c.setHora(rs.getString("hora"));
                    c.setInfo(rs.getString("info"));
                                   
                    lista.add(c);
            }
            
                comandoSql.close();
                
                return lista;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
        
    }
    
    public  ArrayList<Compromisso> selecionaCompromissoNomes (String nome) {
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso WHERE nome LIKE ? ;";
        
        try {
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, nome);
            
            ResultSet rs  = pstmt.executeQuery();
            
            ArrayList<Compromisso> lista = new ArrayList<Compromisso>();
            
            while (rs.next()) {
                Compromisso c = new Compromisso();
                    
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    c.setData(rs.getString("data"));
                    c.setHora(rs.getString("hora"));
                    c.setInfo(rs.getString("info"));
                                   
                    lista.add(c);
            }
            
                pstmt.close();
                
                return lista;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
        
    }
    
    public  ArrayList<Compromisso> selecionaCompromissoData(String data) {
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso WHERE data = ? ;";
        
        try {
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, data);
            
            ResultSet rs  = pstmt.executeQuery();
            
            ArrayList<Compromisso> lista = new ArrayList<Compromisso>();
            
            while (rs.next()) {
                Compromisso c = new Compromisso();
                    
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    c.setData(rs.getString("data"));
                    c.setHora(rs.getString("hora"));
                    c.setInfo(rs.getString("info"));
                                   
                    lista.add(c);
            }
            
                pstmt.close();
                
                return lista;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
        
    }
    
    public  Compromisso selecionaCompromissoAlterar(String nome, String data) {
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso WHERE data = ?  AND nome = ?;";
        
        try {
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, data);
            pstmt.setString(2, nome);
            
            ResultSet rs  = pstmt.executeQuery();
            
            
            
            while (rs.next()) {
                Compromisso c = new Compromisso();
                    
                    c.setId(rs.getInt("id"));
                    c.setNome(rs.getString("nome"));
                    c.setData(rs.getString("data"));
                    c.setHora(rs.getString("hora"));
                    c.setInfo(rs.getString("info"));
                                   
                    return c;
            }
            
                pstmt.close();
                
                
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
        
    }
    
    
    
    
   

   
    //Usuario
    public void criaTabelaUsuario (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS usuario (";
                sql += "	id integer PRIMARY KEY AUTOINCREMENT,";
                sql += "	login text NOT NULL,";
                sql += "	senha text NOT NULL,";
                
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inserirUsuario (Connection conn, String nome, String senha) {
        String sql = "INSERT INTO compromisso VALUES($next_id,?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                
                pstmt.setString(2, nome);
                pstmt.setString(3, senha);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
    public void  selecionaDadosUsuario (Connection conn) {
        
        String sql = "SELECT id, nome,senha "
                     + "FROM usuario';";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
            // loop no resultado
            while (rs.next()) {
                
                System.out.println(rs.getInt("id") +  "\t" +
                                   rs.getString("nome") + "\t" +
                                   rs.getString("data") + "\t" +  
                                   rs.getString("hora") + "\t" +  
                                   rs.getString("info"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

