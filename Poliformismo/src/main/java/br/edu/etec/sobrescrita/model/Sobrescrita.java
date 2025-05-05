/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sobrescrita.model;

/**
 *
 * @author CLARA
 */
public class Sobrescrita {
  public  String nome;
  public  double salarioBruto;
   public int anoAdm;

    public Sobrescrita(String nome, double salarioBruto, int anoAdm) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.anoAdm = anoAdm;
    }
     public double PL(){
    if(anoAdm < 5){
        System.out.println("Seu ano de Admissão é baixo, não tem direito a Participação de Lucros");
        return 0.0;
    }else{
    return salarioBruto * 0.0;
    }

     
}
     public void Info(){
         System.out.println("Nome: " + nome);
         System.out.println("Salário Bruto: " + salarioBruto);
         System.out.println("Ano de Admissão: " + anoAdm);}
}

