/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sobrecarga.model;

/**
 *
 * @author CLARA
 */
public class profMestrado {
    private int artigos;

    public ProfessorMestrado(String nome, int disciplinas, int artigos) {
        super(nome, disciplinas);
        this.artigos = artigos;
    }

   
    public double Salario(double salarioBruto, int disciplinas, int artigos) {
        double salarioBase = super.Salario(salarioBruto, disciplinas);
        double adicionalArtigos = artigos * 150;
        return salarioBase + adicionalArtigos;
    }

    @Override
    public void info() {
        double salarioLiquido = Salario(salarioBruto, disciplinas, artigos);
        System.out.println("Professor de Mestrado: " + nome);
        System.out.println("Disciplinas: " + disciplinas);
        System.out.println("Artigos Publicados: " + artigos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
    }
}
}
