# STACK-TRUCK-QUESTION 
## QUAL O PROBLEMA A SER RESOLVIDO:grey_question:
Uma empresa de logística precisa organizar sua frota de caminhões de forma eficiente
para realizar entregas em diferentes locais. Implemente um programa em Java que
utilize pilhas para ajudar na organização e na priorização das entregas.
Para resolver este problema, o aluno deve implementar a lógica de pilha em Java e
utilizar essa estrutura para armazenar as informações dos caminhões e das entregas. O
aluno deve criar funções que permitam inserir e remover elementos da pilha e definir a
lógica de priorização das entregas com base nas informações fornecidas. É importante
que o código esteja bem organizado e documentado para facilitar o entendimento. As
estruturas de classe do Caminhão e da carga devem ser pensadas. Quando um objeto
for colocado na pilha ele deve saber qual o nível de criticidade da sua carga.

## QUAL A RESOLUÇÃO DO PROBLEMA:grey_question:
### CLASSE PILHA GENÉRICA

Foi criado uma classe de pilha genérica com a lógica LIFO(Last in First out), usando os seguinte Métodos: pop(remover o primeiro da pilha, no caso o ultimo da lista que foi criada), push(adiciona o item, e conforme vai adicionado, vai indo para o final da pilha), top(exibe o topo da pilha, no caso o último item da lista), is Empty(é um booleano que afirma se a pilha está vazia ou com algum item),size(retorna o tamanho da pilha). É tambem criado um metodo To String para sobrescrever o que já existe, retornando a lista ao contrário para printar em formato de pilha.

### DEMAIS CLASSES

Foi criado uma classe Carga para o caminhão, e essa carga recebe como atributo a pericibilidade, para definir a priorização de entregas, recebeu tambem o tamanho e o peso como atributos.
Foi criado uma classe Caminhão que recebe como atributos uma carga e a sua placa, além disso nessa classe é usado um ToString para poder retornar um print indicando a placa do caminhão e a pericibilidade do produto que ele carrega.
