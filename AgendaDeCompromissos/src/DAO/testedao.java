/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Rizzadinha
 */
public class testedao {
    
    public static void main(String args[]){
        
        String nome = "asdas", hora ="dsa",data= "asdd", info="adas";
        int id= 1;
        
        GerenciadorDAO.criaTabelaCompromisso();
        GerenciadorDAO.inserirCompromisso(id, nome, data, hora, info);
        
    }
    
}
