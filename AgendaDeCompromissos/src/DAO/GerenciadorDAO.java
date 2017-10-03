package DAO;

import Tipos.Compromisso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rizzadinha
 */
public class GerenciadorDAO {
    
    private  static DataSource dataSource;
    
    public GerenciadorDAO(DataSource newdataSource){
        dataSource = newdataSource;
    }
    
    
    public static void criaTabelaCompromisso() {
        
        String sql = "CREATE TABLE IF NOT EXISTS compromisso (";
                sql += "	id integer PRIMARY KEY ,";
                sql += "	nome text NOT NULL,";
                sql += "	data text NOT NULL,";
                sql += "	hora text NOT NULL,";
                sql += "	info text NOT NULL";
                sql += ");";
        
        try {
                
            Statement stmt = dataSource.getConnection().createStatement();
                
            stmt.execute(sql);
            
            stmt.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    public static void inserirCompromisso(int id,String nome, String data, String hora, String info){
        String sql = "INSERT INTO compromisso VALUES(?,?,?,?,?)";
        
        try {
                PreparedStatement pstmt = dataSource.getConnection().prepareStatement(sql); 
                
                
                pstmt.executeUpdate();
                   
                pstmt.close();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
    public  static ArrayList<Compromisso> SelectTodos(){
        
        String sql = "SELECT id, nome,data,hora,info "
                     + "FROM compromisso;";
        
        try{
            
            Statement comandoSql = dataSource.getConnection().createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
            ArrayList<Compromisso> lista = new ArrayList<Compromisso>();
            
                while(rs.next()){
                    
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
            
            }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return null;
                  
        }
    
    
    
    
    
    
    
    
    
    
    
    
        
}  