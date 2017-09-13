/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizzadinha
 */
public class Compromisso {
    
    private String nome,data,hora,info;
    
 //Set   
    public void setNome(String newNome){
        
        nome = newNome;
      
    }
    
    public void setData(String newData){
        
        data = newData;
      
    }
    
    public void setHora(String newHora){
        
        hora = newHora;
      
    }
    
    public void setInfo(String newInfo){
        
        info = newInfo;
      
    }
    
 //Get   
    public String getNome(){
        
        return nome;
    }
    
    public String getData(){
        
        return data;
    }
    
    public String getHora(){
        
        return hora;
    }
    
    public String getInfo(){
        
        return info;
    }
    
}
