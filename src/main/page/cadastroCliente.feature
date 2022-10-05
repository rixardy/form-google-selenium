#language: pt
#encoding: utf-8

Funcionalidade: Cadastro de clientes com sucesso
  Eu como cliente
  Quero cadastrar meu nome, e-mail, bandeira e número do cartão de crédito e minha data de nascimento
  Para ter acesso ao sistema

  Contexto: Dado que o cliente esteja logado no gmail

  Cenario: Campos vazios cadastro
    Dado que não preencho nenhum campo do formulário
    Quando clico no botão enviar
    Entao o formulário não é submetido
    E o foco vai para o primeiro campo obrigatório

  Cenario: Mensagens campos obrigatório
    Dado que não preencho nenhum campo do formulario
    Quando clico em um campo e depois clico em outro
    Entao aparece uma mensagem na cor vermelha com o aviso para preencher o campo

  Cenario: Mensagens dados inválidos
    Dado que preencho os campos com dados inválidos
    Quando clico em outro campo
    Entao aparece uma menssagem em vermelho com o aviso de preenchimento de dados válidos

  Cenario: Limpar formulário
    Dado que preencho pelo menos 1 campo
    Quando clico no botão limpar formulário
    E confirmo clicando na opção limpar formulário
    Entao todo e qualquer valor digitado nos campos são apagados

  Cenario: Camcelar a limpeza de formulário
    Dado que preencho pelo menos 1 campo
    Quando clico no botão limpar formulário
    E clico na opção cancelar
    Entao todo e qualquer valor digitado continuam no formulário

  Cenario: Cadastrar cliente no sistema com sucesso
    Dado que estou na página do formulário
    Quando preencho os campos nome, e-mail, cartão de crédito, número do cartão e data de nascimento com dados válidos
    E clico no botão enviar
    Então sou redirecionado para tela de sucesso, exibindo a mensagem  "Seu cadastro foi realizado  com sucesso!"

  Cenario: Mensagem de usuário já cadastrado
    Dado que estou logado no gmail
    Quando acesso o formulário de cadastro
    Então sou redirecionado para tela de usuário cadastrado

  Cenario: Editar cadastrado
    Dado que estou logado no gmail
    E já estou cadastrado sou redirecionado para tela de usuário cadastrado
    Quando clico em editar formulário
    Então retorno para a tela de cadastro para alterar as informações