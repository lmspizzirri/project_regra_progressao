package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int qntAtividades = scanner.nextInt();
    scanner.nextLine();

    String[] nomeAtividades = new String[qntAtividades];
    int[] pesoAtividades = new int[qntAtividades];
    int[] notaAtividades = new int[qntAtividades];
    int somaDosPesos = 0;

    for (int i = 0; i < qntAtividades; i++) {
      System.out.println("Digite o nome da atividade" + (i + 1) + ":");
      nomeAtividades[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade" + (i + 1) + ":");
      pesoAtividades[i] = scanner.nextInt();
      somaDosPesos += pesoAtividades[i];

      System.out.println("Digite sua nota obtida na atividade" + (i + 1) + ":");
      notaAtividades[i] = scanner.nextInt();

      scanner.nextLine();
    }

    if (somaDosPesos != 100) {
      System.out.println("A soma dos pesos deve ser 100");
    } else {
      System.out.println("Atividades cadastradas com sucesso!");
    }
  }
}