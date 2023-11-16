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
    double somaNotas = 0;

    for (int i = 0; i < qntAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nomeAtividades[i] = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      pesoAtividades[i] = scanner.nextInt();
      somaDosPesos += pesoAtividades[i];
      scanner.nextLine();

      System.out.println("Digite a nota obtida para " + nomeAtividades[i] + ":");
      notaAtividades[i] = scanner.nextInt();
      somaNotas += pesoAtividades[i] * notaAtividades[i];
      scanner.nextLine();
    }

    if (somaDosPesos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      System.out.println("Atividades cadastradas com sucesso!");
    }

    double notaFinal = somaNotas / 100;
    if (notaFinal >= 85) {
      System.out.println(
          "Parabéns! Você alcançou"
              + notaFinal
              + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período,"
          + notaFinal
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}