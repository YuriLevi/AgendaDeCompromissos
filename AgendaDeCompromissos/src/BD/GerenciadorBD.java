package BD;

import Tipos.Compromisso;
import java.sql.Connection;
import java.util.ArrayList;


/**
 *
 * @author Rizzadinha
 */
public class GerenciadorBD {
    
   static SQLiteJDBCD banco = new SQLiteJDBCD();
    
        
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
            
    
    
}
