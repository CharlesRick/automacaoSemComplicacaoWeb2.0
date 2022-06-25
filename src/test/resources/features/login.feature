#language:pt
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

    @fecharModal
  Cenario: Fechar modal ao clicar no icone fechar
    Quando for realizado um clique no icone de fechar
    Entao a janela model deve ser fechada

  Cenario: Fechar modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela model deve ser fechada

  Cenario: validar link create new account
    Quando for realizado no clique no link create new account
    Entao a pagina create new account deve ser exibida

  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchido da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | Remember | <remember> |
    Quando for realizado um clique no botao sign in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao      | login   | password | remember |
      | todos os campos    | chronos | senha    | true     |
      | campos obrigatorio | chronos | senha    | false    |

  Esquema do Cenario:  Realizar login com <identificacao>
    Quando os campos de login forem preenchido da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | Remember | <remember> |
    Quando for realizado um clique no botao sign in
    Entao o sistema deve exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login   | password | remember |
      | usuario invalido | ivalido | senha    | true     |
      | senha invalido   | chronos | invalido | true     |

  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login forem preenchido da seguinte forma
      | login    | <login>    |
      | password | <password> |
      | Remember | <remember> |
    Entao o botao sign in deve permanecer desabilitado

    Exemplos:
      | identificacao     | login   | password | remember |
      | usuario em branco |         | senha    | false    |
      | senha em branco   | chronos |          | false    |
