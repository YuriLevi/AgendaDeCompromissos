/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Tipos.Compromisso;
import Tipos.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rizzadinha
 */
public class testador {
    
    public static void main(String args[]){
        
        String nome = "asdas", hora ="dsa",data= "2017/05/25", info="adas";
        int id= 1;
        String nomeM= "jaum";
        
        Compromisso cInserir1 = new Compromisso();
        
        cInserir1.setNome("joano");
        cInserir1.setHora("12:30");
        cInserir1.setData("2017/05/25");      
        cInserir1.setInfo("vamo zuaaar"); 
        
        //DateFormat dataFomatador = new SimpleDateFormat("yyyy/MM/dd"); 
        
        //Date data1 = new Date();
        
        //dataFomatador.format(data);
        
        //System.out.println("data:" + data);
        
      Date data1 = new Date( );
      SimpleDateFormat formatador = new SimpleDateFormat ("yyyy/MM/dd");

      System.out.println("Current Date: " + formatador.format(data1));
        
        
        
       //GerenciadorBD.inserirCompromisso(cInserir1);
       //GerenciadorBD.listarUltimos();
       //GerenciadorBD.listarNomes("luide");
       //GerenciadorBD.listarDatas(data);
       
        //GerenciadorBD.alterarCompromisso(cInserir1, data, nomeM);
        
       // Usuario uInserir2 = new Usuario();
        
        //uInserir2.setLogin("yuri");
       //uInserir2.setSenha("123");
        
        //GerenciadorBD.inserirUusuario(uInserir2);
        //GerenciadorBD.listarUsuarioTodos();
        
       
       
    }
    
    
}
