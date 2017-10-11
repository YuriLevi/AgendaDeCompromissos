/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Janelas;

/**
 *
 * @author Rizzadinha
 */
public class AuxCompromissoUsuario {
    
    private static int idUC,valida;
    private static String nomeUC, senhaUC;
    
    
    public static void setValida(int newValida){
        
        valida = newValida;
        
    }
    
    public static void setIdUC(int newIdUC){
        
        idUC = newIdUC;
        
    }
     
    public static void setNomeUC(String newNomeUC){
        
        nomeUC = newNomeUC;
        
    }
   
    public static void setSenhaUC(String newSenhaUC){
        
        senhaUC = newSenhaUC;
        
    }
    
    public static int getValida(){
        
        return valida;
    }
    
    public static int getIdUC(){
        
        return idUC;
        
    }
    
    public static String getNomeUC(){
        
        return nomeUC;
        
    }
    
    public static String getSenhaUC(){
        
        return senhaUC;
        
    }
    
    
    
    
}
