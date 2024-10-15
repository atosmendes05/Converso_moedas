# Conversor de Moedas

Este é um projeto de **Conversor de Moedas** utilizando a API Exchangerate-API para buscar as taxas de câmbio entre diferentes moedas. O sistema permite ao usuário selecionar um par de moedas para conversão e visualizar o valor convertido com base nas taxas de câmbio mais recentes.

## Funcionalidades

- Conversão de várias moedas:
  - Real (BRL) para Dólar (USD)
  - Dólar (USD) para Real (BRL)
  - Euro (EUR) para Dólar (USD)
  - Dólar (USD) para Euro (EUR)
  - Libra Esterlina (GBP) para Iene Japonês (JPY)
  - Iene Japonês (JPY) para Libra Esterlina (GBP)
- Busca das taxas de câmbio em tempo real usando a [Exchangerate-API](https://www.exchangerate-api.com/)
- Menu interativo para o usuário escolher o par de moedas e o valor para conversão

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal
- **HttpClient**: Para realizar requisições HTTP à API de taxas de câmbio
- **Gson**: Para fazer o parsing da resposta JSON da API
- **Exchangerate-API**: API para obter as taxas de câmbio

## Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
