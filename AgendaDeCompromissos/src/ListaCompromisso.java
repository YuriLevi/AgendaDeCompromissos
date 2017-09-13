/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rizzadinha
 */
public class ListaCompromisso {
    
    List<Compromisso> lc =  new ArrayList<>();
    private int i=-1;
  
    
 //Adicionar   
    public void createCompromisso(String nomeAdd, String dataAdd, String horaAdd, String infoAdd){
    
        i++;
        lc.add( new Compromisso());
        
        lc.get(i).setNome(nomeAdd);
        lc.get(i).setData(dataAdd);
        lc.get(i).setHora(horaAdd);
        lc.get(i).setInfo(infoAdd);
    }
    
 //Retornar   
    public String readNomePosicao(int i){
    
    return lc.get(i).getNome();
        
    }
    
    public String readDataPosicao(int i){
    
    return lc.get(i).getData();
        
    }
    
    public String readHoraPosicao(int i){
    
    return lc.get(i).getHora();
        
    }
    
    public String readInfoPosicao(int i){
    
    return lc.get(i).getInfo();
        
    }
    
//Atualizar
    public  void updateCompromisso(int i, String nomeAdd, String dataAdd, String horaAdd, String infoAdd){
       
        lc.get(i).setNome(nomeAdd);
        lc.get(i).setData(dataAdd);
        lc.get(i).setHora(horaAdd);
        lc.get(i).setInfo(infoAdd);
     
    }
    
 //Remover   
    public void removeDisciplina(int i){
    
        lc.remove(i);
        this.i--;
    
    }
    
    
    
    
}
