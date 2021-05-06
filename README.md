#Proposta

Realizar a implementação do Jogo Gourmet disponibilizado pela Objective.


## Regras Identificadas


 * Ao abrir o jogo o mesmo solicita a pensar em um prato. 
 
 * Sendo que, ao iniciar o mesmo questiona uma particularidade do prato já tendo como padrão Massa.
 	
 * Caso o jogador confirme que essa característica está correta ele chama o próximo nó da árvore com o valor do parto como Lasanha. 
 
 * Caso no passo 2 o mesmo tenha selecionado não o jogo Questiona se o prato é um Bolo de Chocolate.
  
 * Tendo como todos os pratos não identificados pelo jogo será solicitado ao jogador qual prato o mesmo está pensando seguido de qual característica este prato tem de diferente do último palpite executado pela lógica.
 
 * Ao adicionar um novo registro a árvore esta é reorganizada a partir desse último nó executado deixando sempre o Bolo de Chocolate por último e adicionando novos nós antes dele.
 

## Configurações do projeto
 
 * AdoptOpenJDK: 11.0.9.101
 * Junit 4: org.junit_4.13.0.v20200204-1500.jar
 * Hamcrest: org.hamcrest.core_1.3.0.v20180420-1519.jar
 
## Erros/Bugs
 
 * Ao selecionar tudo como não o jogo permite que o prato aceite e apresente null nos próximos questionamentos


 
## Estrutura do projeto pensada

 * Main: Class de execução do jogo
 * EngineCore: Class de execução dos passos do jogo.
 * Service: Class com responsabilidade de inicializar os valores do jogo.
 * IEngine: Interface utilizada para fins de inicialização do jogo e atualização do nó da árvore em execução.
 * NodeJUnitTests: Class responsável por testes unitários.

## Como foi obtido a lógica do jogo

 * Realizando os testes em cima do executável enviado e implementado a lógica e observando o comportamento.
 * Auxílio da Class NodeJUnitTests para implementação executando os passos.
 
## Implementações
 
 * As implementações segui conforme indicado nos passos anteriores.
 
 * Foi alterado o fluxo da frase "Acertei de novo" para que esta relamente seja apresentada quando o acerto for maior que 1. 
 
 * Como utilizei o JOptionPane e não conheço muito das disposições do Java Swing para encerrar o programa utilizei uma função separada para possibilitar o usuário a finalizar o programa.