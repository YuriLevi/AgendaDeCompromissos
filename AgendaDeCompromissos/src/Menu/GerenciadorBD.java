package Menu;

import java.sql.Connection;


/**
 *
 * @author Rizzadinha
 */
public class GerenciadorBD {
    
   static SQLiteJDBCD banco = new SQLiteJDBCD();
    
    
      
    
    public  static void inserir(int idBD , String nomeBD, String dataBD, String horaBD, String infoBD){
        
        Connection conn = banco.connect();
        banco.criaTabela(conn);
        banco.inserirCompromisso(conn, idBD, nomeBD, dataBD, horaBD, infoBD);
        
    }
            
    
    
}
