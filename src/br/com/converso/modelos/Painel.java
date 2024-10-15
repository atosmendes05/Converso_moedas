package br.com.converso.modelos;

import java.io.IOException;
import java.util.Scanner;

public class Painel {


    public void exibirPainel(Api minhaApi) throws IOException, InterruptedException {
        Scanner lerOpcao = new Scanner(System.in);
        Scanner lervalor = new Scanner(System.in);

        System.out.println("""
                ##############################################################
                
                1 - Real --> Dolar
                2 - Dolar --> Real
                3 - Euro --> Dolar
                4 - Dolar --> Euro
                5 - Libra Esterlina --> Iene Japonês
                6 - Iene Japonês --> Libra Esterlina
                
                ##############################################################
                """);


        System.out.println("digite a opcao desejada:");
        int opcao = lerOpcao.nextInt();
        System.out.println("digite o valor de conversao desejado:");
        double valor = lervalor.nextDouble();
        double moeda = 0;
        String mensage = "";

       if (opcao == 1){
           moeda = minhaApi.BuscaMoeda("BRL").getUsd();
           mensage = "Valor " + valor + " BRL" + " corresponde ao valor final de: " + valor * moeda + "USD";
       } else if (opcao == 2) {
           moeda = minhaApi.BuscaMoeda("USD").getBrl();
           mensage = "Valor " + valor + " USD" + " corresponde ao valor final de: " + valor * moeda + "BRL";
       } else if (opcao == 3 ) {
           moeda = minhaApi.BuscaMoeda("EUR").getUsd();
           mensage = "Valor " + valor + " corresponde ao valor final de: " + valor * moeda + "USD";
       } else if (opcao == 4) {
           moeda = minhaApi.BuscaMoeda("USD").getEur();
           mensage = "Valor " + valor + " corresponde ao valor final de: " + valor * moeda + "EUR";
       } else if (opcao == 5) {
           moeda = minhaApi.BuscaMoeda("GBP").getJpy();
           mensage = "Valor " + valor + " corresponde ao valor final de: " + valor * moeda + "JPY";
       } else if (opcao == 6) {
           moeda = minhaApi.BuscaMoeda("JPY").getGbp();
           mensage = "Valor " + valor + " corresponde ao valor final de: " + valor * moeda + "GBP";
       } else {
           System.out.println("por favor selecione um opcao valida");
       }


        System.out.println(mensage);

    }

}


