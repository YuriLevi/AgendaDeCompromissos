package Menu;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBCD {
   
    public Connection connect() {
        Connection conn = null;
        try {
            
            String url = "jdbc:sqlite:BDTeste.db";
            
            conn = DriverManager.getConnection(url);
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        
        return conn;
    }
    
    public void criaTabelaCompromisso (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS compromisso (";
                sql += "	id integer PRIMARY KEY,";
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
    
    public void criaTabelaUsuario (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS usuario (";
                sql += "	id integer PRIMARY KEY,";
                sql += "	nome text NOT NULL,";
                sql += "	senha text NOT NULL,";
                
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void inserirCompromisso (Connection conn, int id , String nome, String data, String hora, String info) {
        String sql = "INSERT INTO compromisso VALUES(?,?,?,?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setInt(1, id);
                pstmt.setString(2, nome);
                pstmt.setString(3, data);
                pstmt.setString(4, hora);
                pstmt.setString(5, info);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void inserirUsuario (Connection conn, int id , String nome, String senha) {
        String sql = "INSERT INTO compromisso VALUES(?,?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setInt(1, id);
                pstmt.setString(2, nome);
                pstmt.setString(3, senha);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selecionaDados (Connection conn) {
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso;";
        
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
    
    public void  selecionaDadosUsuario (Connection conn) {
        
        String sql = "SELECT id, nome,senha "
                     + "FROM usuario';";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
            // loop no resultado
            while (rs.next()) {
                
                int x = rs.getInt("id");
                
                return x;
                
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

