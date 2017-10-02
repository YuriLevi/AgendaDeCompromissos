package Tipos;



/**
 *
 * @author Rizzadinha
 */
public class Usuario {
    
    private String login,senha;
    private int id;
    
    
 //Set   
    public void setlogin(String newLogin){
        
        login = newLogin;
      
    }
    
    public void setSenha(String newSenha){
        
        senha = newSenha;
      
    }
    
    public void setID(int newID){
        
        id = newID;
      
    }
    
    
    
 //Get   
    public String getLogin(){
        
        return login;
    }
    
    public String getSenha(){
        
        return senha;
    }
    
    public int getID(){
        
        return id;
    }
    
   
    
}