#Proposta

Realizar a implementa��o do Jogo Gourmet disponibilizado pela Objective.


## Regras Identificadas


 * Ao abrir o jogo o mesmo solicita a pensar em um prato. 
 
 * Sendo que, ao iniciar o mesmo questiona uma particularidade do prato j� tendo como padr�o Massa.
 	
 * Caso o jogador confirme que essa caracter�stica est� correta ele chama o pr�ximo n� da �rvore com o valor do parto como Lasanha. 
 
 * Caso no passo 2 o mesmo tenha selecionado n�o o jogo Questiona se o prato � um Bolo de Chocolate.
  
 * Tendo como todos os pratos n�o identificados pelo jogo ser� solicitado ao jogador qual prato o mesmo est� pensando seguido de qual caracter�stica este prato tem de diferente do �ltimo palpite executado pela l�gica.
 
 * Ao adicionar um novo registro a �rvore esta � reorganizada a partir desse �ltimo n� executado deixando sempre o Bolo de Chocolate por �ltimo e adicionando novos n�s antes dele.
 

## Configura��es do projeto
 
 * AdoptOpenJDK: 11.0.9.101
 * Junit 4: org.junit_4.13.0.v20200204-1500.jar
 * Hamcrest: org.hamcrest.core_1.3.0.v20180420-1519.jar
 
## Erros/Bugs
 
 * Ao selecionar tudo como n�o o jogo permite que o prato aceite e apresente null nos pr�ximos questionamentos


 
## Estrutura do projeto pensada

 * Main: Class de execu��o do jogo
 * EngineCore: Class de execu��o dos passos do jogo.
 * Service: Class com responsabilidade de inicializar os valores do jogo.
 * IEngine: Interface utilizada para fins de inicializa��o do jogo e atualiza��o do n� da �rvore em execu��o.
 * NodeJUnitTests: Class respons�vel por testes unit�rios.

## Como foi obtido a l�gica do jogo

 * Realizando os testes em cima do execut�vel enviado e implementado a l�gica e observando o comportamento.
 * Aux�lio da Class NodeJUnitTests para implementa��o executando os passos.
 
## Implementa��es
 
 * As implementa��es segui conforme indicado nos passos anteriores.
 
 * Foi alterado o fluxo da frase "Acertei de novo" para que esta relamente seja apresentada quando o acerto for maior que 1. 
 
 * Como utilizei o JOptionPane e n�o conhe�o muito das disposi��es do Java Swing para encerrar o programa utilizei uma fun��o separada para possibilitar o usu�rio a finalizar o programa.