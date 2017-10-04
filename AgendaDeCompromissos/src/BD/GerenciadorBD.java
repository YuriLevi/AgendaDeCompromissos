package BD;

import Tipos.Compromisso;
import Tipos.Usuario;
import java.sql.Connection;
import java.util.ArrayList;


/**
 *
 * @author Rizzadinha
 */
public class GerenciadorBD {
    
   static SQLiteJDBCD banco = new SQLiteJDBCD();
    
    //Compromisso    
    public  static void inserirCompromisso(Compromisso compromissoBD){
        
        banco.connect();
        banco.criaTabelaCompromisso();
        banco.inserirCompromisso(compromissoBD);
        //banco.selecionaDados();
        banco.closeConnect();
        
    }
    
    public static void alterarCompromisso(Compromisso compromissoBD, String dataGBD, String nomeGBD){
        
        banco.connect();
        
        banco.alterarCompromisso(compromissoBD, dataGBD, nomeGBD);
        
        banco.closeConnect();
    }
    
    public static void deletarCompromisso(String dataGBD,String nomeGBD){
        
        banco.connect();
        
        banco.deletarCompromisso(dataGBD, nomeGBD);
        
        banco.closeConnect();
        
        
    }
    
    public static  ArrayList<Compromisso> listarUltimos(){
        
        ArrayList<Compromisso> GBDLista = new ArrayList<Compromisso>();
        banco.connect();
        GBDLista = banco.selecionaCompromissoUltimos();
    
        for(int i=0;i<GBDLista.size(); i++){
            
            System.out.println("Id: "+ GBDLista.get(i).getId() + "  Nome: " + GBDLista.get(i).getNome() + "  Hora:  " + GBDLista.get(i).getHora() + "  Data: " + GBDLista.get(i).getData()+ "  Info: " + GBDLista.get(i).getInfo() + "\n\n"); 
        }
    
        banco.closeConnect();
        
        return GBDLista;
        
    }
    
    public static  ArrayList<Compromisso> listarNomes(String nomeGBD){
        
        ArrayList<Compromisso> GBDLista = new ArrayList<Compromisso>();
        banco.connect();
        
        GBDLista = banco.selecionaCompromissoNomes(nomeGBD);
    
        for(int i=0;i<GBDLista.size(); i++){
            
            System.out.println("Id: "+ GBDLista.get(i).getId() + "  Nome: " + GBDLista.get(i).getNome() + "  Hora:  " + GBDLista.get(i).getHora() + "  Data: " + GBDLista.get(i).getData()+ "  Info: " + GBDLista.get(i).getInfo() + "\n\n"); 
        }
    
        banco.closeConnect();
        
        return GBDLista;
        
    }
    
    public static  ArrayList<Compromisso> listarDatas(String dataGBD){
        
        ArrayList<Compromisso> GBDLista = new ArrayList<Compromisso>();
        banco.connect();
        
        GBDLista = banco.selecionaCompromissoData(dataGBD);
    
        for(int i=0;i<GBDLista.size(); i++){
            
            System.out.println("Id: "+ GBDLista.get(i).getId() + "  Nome: " + GBDLista.get(i).getNome() + "  Hora:  " + GBDLista.get(i).getHora() + "  Data: " + GBDLista.get(i).getData()+ "  Info: " + GBDLista.get(i).getInfo() + "\n\n"); 
        }
    
        banco.closeConnect();
        
        return GBDLista;
        
    }
    
    public static  Compromisso auxAlterar(String nomeGBD, String dataGBD){
       
        
        banco.connect();
        
        Compromisso cGBD = banco.selecionaCompromissoAlterar(nomeGBD, dataGBD);
    
        banco.closeConnect();
        System.out.println("teste:" + cGBD.getNome());
        
        return cGBD;  
        
    }
            
    

//Usuário
    public static void inserirUusuario(Usuario usuarioGBD){
        
        banco.connect();
        banco.criaTabelaUsuario();
        banco.inserirUsuario(usuarioGBD);
        
        banco.closeConnect();
        
        
    }
    
    public static void alterarUsuario(Usuario usuarioGBD, String loginGBD, String senhaGBD){
        
        banco.connect();
        
        banco.alterarUsuario(usuarioGBD, loginGBD, senhaGBD);
        
        banco.closeConnect();
        
    }
    
    public static void deletarUsuario(String loginGBD,String senhaGBD){
        
        banco.connect();
        
        banco.deletarUsuario(loginGBD, senhaGBD);
        
        banco.closeConnect();
        
        
    }
    
    
    public static Usuario auxAlterarU(String loginGBD, String senhaGBD){
  
        banco.connect();
        
        Usuario uGBD = banco.selecionaUsuario(loginGBD, senhaGBD);
    
        banco.closeConnect();
        
        System.out.println( " nome:" + uGBD.getLogin()+" senha: " + uGBD.getSenha());
        
        return uGBD; 
        
    }
    
    public static  ArrayList<Usuario> listarUsuarioTodos(){
        
        ArrayList<Usuario> GBDLista = new ArrayList<Usuario>();
        banco.connect();
        
        GBDLista = banco.selecionaDadosUsuarioTodos();
    
        for(int i=0;i<GBDLista.size(); i++){
            
            System.out.println("Id: "+ GBDLista.get(i).getId()+ "  Nome: " + GBDLista.get(i).getLogin()+  "\n\n"); 
        }
    
        banco.closeConnect();
        
        return GBDLista;
        
        
    }
    
    
    
}
