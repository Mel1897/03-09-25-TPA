/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoratarifas;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculadoraTarifas {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1 - Ônibus urbano (R$4.40)");
            System.out.println("2 - Metrô (R$5.00)");
            System.out.println("3 - Trem intermunicipal (R$6.50)");
            System.out.println("4 - Ônibus rodoviário (R$12.00)");
            System.out.print("Escolha o tipo: ");
            int tipo = Integer.parseInt(sc.nextLine());

            System.out.print("Quantidade: ");
            int qtd = Integer.parseInt(sc.nextLine());

            double valor = 0;
            switch (tipo) {
                case 1: valor = 4.40; break;
                case 2: valor = 5.00; break;
                case 3: valor = 6.50; break;
                case 4: valor = 12.00; break;
                default:
                    System.out.println("Opção inválida");
                    return;
            }
            System.out.println("Total: R$ " + (valor * qtd));

        } catch (Exception e) {
            System.out.println("Valor digitado inválido");
        } finally {
            sc.close();
        }

    }
}
