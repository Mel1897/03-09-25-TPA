/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladorbanco;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class SimuladorBanco {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double saldo = 1000;

        try {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar");
            System.out.print("Opção: ");
            int op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Valor saque: ");
                    double saque = Double.parseDouble(sc.nextLine());
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else if (saque <= 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo -= saque;
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Valor depósito: ");
                    double dep = Double.parseDouble(sc.nextLine());
                    if (dep <= 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldo += dep;
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Atendimento encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } catch (Exception e) {
            System.out.println("Valor digitado inválido");
        } finally {
            sc.close();
        }
    }

    }

