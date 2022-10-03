#language: pt
#encoding: utf-8

Funcionalidade: Cadastro de clientes com sucesso
  Eu como cliente
  Quero cadastrar meu nome, e-mail, bandeira e número do cartão de crédito e minha data de nascimento
  Para ter acesso ao sistema

  Contexto: Dado que o cliente esteja logado no gmail

  Cenario: Cadastrar cliente no sistema
    Dado que estou na página do formulário
    Quando preencho os campos nome, e-mail, cartão de crédito, número do cartão e data de nascimento
    E clico no botão enviar
    Então sou redirecionado para tela de sucesso, exibindo a mensagem  "Seu cadastro foi realizado  com sucesso!
    E os dados são salvos no banco


    Cenario: Campos vazios cadastro
      Dado que não preencho nenhum campo do formulário
      Quando clico no botão enviar
      Entao o formulário não é submetido
      E o foco vai para o primeiro campo obrigatório

    Cenario: Mensagem campos obrigatório
      Dado que não preencho nenhum campo do formulario
      Quando clico em um campo e depois clico em outro
      Entao aparece mensagem em vermelho com o aviso para preencher o campo

    Cenario: Mensagem dados inválidos
      Dado que preencho os campos com dados inválidos
      Quando clico em outro campo
      Entao aparece a menssagem em vermelho com o aviso de preenchimento de dados válidos