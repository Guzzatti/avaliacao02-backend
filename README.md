# Avaliação 02 de Back End
## Aluno: Gabriel Guzzatti
## Professor: Ramon Venson

# Weather Service

Este projeto é um web service que fornece dados meteorológicos a partir de uma API externa (OpenWeatherMap). Ele foi desenvolvido usando Java e Spring Boot e está configurado para ser executado em um container Docker.

## Como Executar o Projeto

### Pré-requisitos

- [Docker](https://www.docker.com/get-started) instalado na sua máquina.
- [Maven](https://maven.apache.org/download.cgi) para compilar o projeto (opcional, se você quiser construir localmente).

### Executando com Docker

Para executar o projeto usando Docker, siga os passos abaixo:

1. Navegue até o diretório raiz do projeto.
2. Execute o seguinte comando para construir e iniciar os containers:

   ```bash
   docker-compose up --build
3. O serviço estará disponível na porta 8080.
   Testando o Serviço
   Após iniciar o serviço, você pode testá-lo utilizando uma ferramenta como Postman ou curl.

Rotas
1. GET /weather

Descrição: Obtém os dados meteorológicos para uma cidade especificada.
Parâmetros: city (query parameter, exemplo: ?city=São Paulo)
Resposta:
Status 200 OK:
{
"cidade": "São Paulo",
"temperatura": 25,
"descricao": "Céu limpo",
"umidade": 60
}

2. POST /favorite-city

Descrição: Envia dados para o serviço (por exemplo, uma nova cidade favorita).
Corpo da Mensagem:
{
"city": "São Paulo"
}
Resposta:
Status 200 OK:
Cidade favorita definida para: São Paulo

3. GET /sobre

Descrição: Retorna informações sobre o estudante e o projeto.
Resposta:
Status 200 OK:
{
"estudante": "Gabriel Guzzatti",
"projeto": "Serviço de Meteorologia"
}
