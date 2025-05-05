/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sobrescrita.model;

/**
 *
 * @author CLARA
 */
public class GHI extends Sobrescrita {
     public GHI(String nome, double salarioBruto, int anoAdm){
    super(nome, salarioBruto, anoAdm); 
    }
    
@Override
public double PL(){
if(anoAdm < 5){
        System.out.println("Seu ano de Admissão é baixo, não tem direito a Participação de Lucros");
        return 0.0;
    }else{
    return salarioBruto * 2;
    }
}
    
}
