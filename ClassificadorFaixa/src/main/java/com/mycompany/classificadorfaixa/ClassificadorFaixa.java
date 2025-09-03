/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadorfaixa;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ClassificadorFaixa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            int codigo;
            if (idade >= 0 && idade <= 12) {
                codigo = 1;
            } else if (idade <= 17) {
                codigo = 2;
            } else if (idade <= 59) {
                codigo = 3;
            } else {
                codigo = 4;
            }

            switch (codigo) {
                case 1: System.out.println("Criança"); break;
                case 2: System.out.println("Adolescente"); break;
                case 3: System.out.println("Adulto"); break;
                case 4: System.out.println("Idoso"); break;
            }

        } catch (Exception e) {
            System.out.println("Valor digitado inválido");
        } finally {
            sc.close();
        }
    }

    }

