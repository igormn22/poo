                                                     Arrays e ArrayList em Java



Introdução.
Java possui diversas estruturas para armazenar dados. Entre as mais utilizadas estão os arrays e
o ArrayList. Os arrays possuem tamanho fixo, enquanto o ArrayList permite adicionar e remover
elementos dinamicamente.


1. Arrays Unidimensionais
Arrays armazenam vários valores do mesmo tipo em posições indexadas. Exemplo: int[] numeros =
{10, 20, 30}; Para percorrer um array pode-se utilizar o laço for tradicional ou o enhanced for.
Também é importante evitar acessar posições inválidas para não ocorrer
ArrayIndexOutOfBoundsException.
A classe Arrays oferece métodos úteis: sort() - ordena elementos binarySearch() - realiza busca
fill() - preenche posições copyOf() - cria cópias toString() - exibe o conteúdo 2. Arrays
Multidimensionais
Arrays multidimensionais são usados para representar tabelas e matrizes. Exemplo: int[][] matriz =
new int[3][3]; Os elementos são acessados por linha e coluna. Em matrizes irregulares, cada linha
pode possuir tamanhos diferentes.


3. ArrayList
O ArrayList faz parte do framework Collections e possui tamanho dinâmico. Exemplo:
ArrayList<String> nomes = new ArrayList<>(); Principais métodos: add() get() set() remove() size()
isEmpty() É muito utilizado em aplicações como listas de produtos, alunos e carrinhos de compras.


4. Comparação entre Array e ArrayList
Array: tamanho fixo, melhor desempenho e suporte direto a tipos primitivos.
ArrayList: tamanho dinâmico, maior flexibilidade e diversos métodos prontos.


Conclusão.
Arrays e ArrayList são estruturas importantes na linguagem Java. Arrays são indicados quando o
tamanho dos dados já é conhecido, enquanto ArrayList é mais adequado para situações em que a
quantidade de elementos pode variar durante a execução do programa. A escolha depende das
necessidades do projeto.  