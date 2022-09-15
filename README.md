# Claro

Esse é um reporsitório que contem a automação do teste de Login inválido, criado para entrevista com a Claro.
Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- Selenium
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

- JUnit
https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api


## Testes Automatizados

Testes para validar a mensagem de erro esta de acordo quando um login invalido é submetido no site netcom - claro.

## Notas Gerais

- Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de test
- Nesse projeto fazemos uso do JUnit, o que nos dá a possibilidade de usar a anotação DisplayName para dar descrições em portugues para nossos testes