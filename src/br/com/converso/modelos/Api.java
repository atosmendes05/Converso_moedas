package br.com.converso.modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {

    public ExchangeRate BuscaMoeda(String moeda) {
        try {
            // Criação do HttpClient e requisição HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/8fc08ed4a8e9395e390ff74a/latest/" + moeda))
                    .build();

            // Enviando a requisição e obtendo a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            // Usando Gson para converter a resposta JSON
            Gson gson = new Gson();
            JsonObject respostaJson = gson.fromJson(response.body(), JsonObject.class);

            // Verificando se a chave "conversion_rates" está presente
            if (!respostaJson.has("conversion_rates")) {
                System.out.println("Erro: 'conversion_rates' não encontrado.");
                return null;
            }

            JsonObject rates = respostaJson.getAsJsonObject("conversion_rates");

            // Retornando um objeto ExchangeRate com as taxas de conversão
            return new ExchangeRate(rates);

        } catch (IOException | InterruptedException e) {
            // Captura de possíveis erros relacionados à comunicação HTTP
            System.out.println("Erro ao fazer a requisição: " + e.getMessage());
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            // Captura de erros na conversão JSON
            System.out.println("Erro ao processar a resposta JSON: " + e.getMessage());
            e.printStackTrace();
        }

        // Caso ocorra qualquer erro, retorna null
        return null;
    }


}
