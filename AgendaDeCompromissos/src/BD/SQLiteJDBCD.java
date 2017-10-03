package BD;



import Tipos.Compromisso;
import Tipos.Usuario;
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
            
            String url = "jdbc:sqlite:BDBeta7.db";
            
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
    
    public void deletarCompromisso(String aData,String aNome){
                            
        String sql = "DELETE FROM compromisso WHERE nome = ? AND data = ?";
                            
  
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setString(1, aNome);
                pstmt.setString(2, aData);
                                       
              
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public  ArrayList<Compromisso> selecionaCompromissoUltimos () {
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso ;";
        
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
    
   
    //Usuario
    public void criaTabelaUsuario () {
        
        String sql = "CREATE TABLE IF NOT EXISTS usuario (";
                sql += "	id integer PRIMARY KEY AUTOINCREMENT,";
                sql += "	login text NOT NULL,";
                sql += "	senha text NOT NULL";
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inserirUsuario (Usuario iuUsuario) {
        
        String sql = "INSERT INTO usuario VALUES($next_id,?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 

                pstmt.setString(2, iuUsuario.getLogin());
                pstmt.setString(3, iuUsuario.getSenha());
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
    public ArrayList<Usuario> selecionaDadosUsuarioTodos() {
        
        String sql = "SELECT id, login"
                     + "FROM usuario;";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            while (rs.next()) {
                Usuario u = new Usuario();
                    
                    u.setId(rs.getInt("id"));
                    u.setLogin(rs.getString("login"));
                    
                    
                                   
                    lista.add(u);
            }
            
                comandoSql.close();
                
                return lista;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return null;
        
    }
    
}

