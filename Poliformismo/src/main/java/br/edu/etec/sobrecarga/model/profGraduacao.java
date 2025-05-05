/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sobrecarga.model;

/**
 *
 * @author CLARA
 */
public class profGraduacao {
    public String nome;
    public int disciplinas;
    public final double salarioBruto = 25000.00;

    public ProfessorGraduacao(String nome, int disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public double Salario(double salarioBruto, int disciplinas) {
        double desconto = salarioBruto * 0.20;
        double adicional = disciplinas * 50;
        return salarioBruto - desconto + adicional;
    }

    public void info() {
        double salarioLiquido = Salario(salarioBruto, disciplinas);
        System.out.println("Professor de Graduação: " + nome);
        System.out.println("Disciplinas: " + disciplinas);
        System.out.printf("Salário Líquido: R$ ", salarioLiquido);
    }
}
    
}
