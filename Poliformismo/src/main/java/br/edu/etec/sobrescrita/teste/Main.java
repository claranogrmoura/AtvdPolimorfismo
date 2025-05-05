/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sobrescrita.teste;

import br.edu.etec.sobrescrita.model.ABC;
import br.edu.etec.sobrescrita.model.DEF;
import br.edu.etec.sobrescrita.model.GHI;
import br.edu.etec.sobrescrita.model.Sobrescrita;

/**
 *
 * @author CLARA
 */
public class Main {
     public static void main(String[] args) {
         
         Sobrescrita GrupoABC = new ABC("Clara", 10.000, 2020);
         Sobrescrita GrupoDEF = new DEF("Sabrina", 5.000, 2022);
         Sobrescrita GrupoGHI = new GHI("Enzo", 25.000, 2018);
         System.out.println("FUNCIONARIOS");
         GrupoABC.PL();
         GrupoABC.Info();

         GrupoDEF.PL();
         GrupoDEF.Info();

         GrupoGHI.PL();
        GrupoGHI.Info();

}
}
