package br.com.converso.principal;


import br.com.converso.modelos.Api;
import br.com.converso.modelos.Painel;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Api minhaApi = new Api();

        Painel meuPainel = new Painel();

        meuPainel.exibirPainel(minhaApi);

    }
}