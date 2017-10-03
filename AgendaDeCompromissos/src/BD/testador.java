/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Tipos.Compromisso;

/**
 *
 * @author Rizzadinha
 */
public class testador {
    
    public static void main(String args[]){
        
        String nome = "asdas", hora ="dsa",data= "2017/10/31", info="adas";
        int id= 1;
        Compromisso cInserir1 = new Compromisso();
        
        cInserir1.setNome("luide");
        cInserir1.setHora("12:30");
        cInserir1.setData("2017/05/22");      
        cInserir1.setInfo("vamo zuaaar"); 
        
       //GerenciadorBD.inserirCompromisso(cInserir1);
       //GerenciadorBD.listarUltimos();
       //GerenciadorBD.listarNomes("luide");
       GerenciadorBD.listarDatas(data);
    }
    
    
}
