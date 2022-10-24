#language:pt
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @fecharModal
  Cenario: Fechar modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela model deve ser fechada

  @fecharModalIcone
  Cenario: Fechar modal ao clicar no icone fechar
    Quando for realizado um clique no icone de fechar
    Entao a janela model deve ser fechada

  @createNewAccount
  Cenario: validar link create new account
    Quando for realizado no clique no link create new account
    Entao a pagina create new account deve ser exibida

  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchido da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | Remember | <remember> |
    Quando for realizado um clique no botao sign in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao      | login           | password | remember |
      | todos os campos    | CharlesOliveira | Senha123 | true     |
      | campos obrigatorio | CharlesOliveira | Senha123 | false    |

  @loginInvalido
  Esquema do Cenario:  Realizar login com <identificacao>
    Quando os campos de log in forem preenchido da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | Remember | <remember> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login           | password | remember |
      | usuario invalido | ivalido         | Senha123 | true     |
      | senha invalido   | charlesOliveira | invalido | true     |

  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchido da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | Remember | <remember> |
    Entao o botao sign in deve permanecer desabilitado

    Exemplos:
      | identificacao     | login           | password | remember |
      | usuario em branco |                 | Senha123 | false    |
      | senha em branco   | charlesOliveira |          | false    |
