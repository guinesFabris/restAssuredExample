Feature: Testar funcionalidade de login
  Como um usuário
  Quero ser capaz de fazer login
  Para acessar a aplicação

  Scenario: Login com sucesso
    Given que o usuário está na página de login
    When o usuário insere o username "user123" e o password "senha123"
    Then o login é realizado com sucesso