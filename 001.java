
/** 
LINGUAGEM DE PORGRAMAÇÃO:
conjunto de regras léxas(ortografica, correção de palavras 
isoladas) e sintáticas (gramatical, sentido como um todo)
para escrever um programa

Na intenção de resolver problemas com ponteiros, gerenciamento 
de memória, controle manual de definição de variáveis 
no C/C++, (ficando mais sucetíveis a erros), não suporte 
há utilização em diversos dispositivos, o JAVA surgiu na 
metáde da década de 90, sendo:
linguagem e também uma plataforma de desenvolvimento e 
execução (bibliotecas API, ambientes de execução),
linguagem de alto nível
orientada a objetos
Comprado pela Oracel em 2010,
é portável, seguro e robusto, 
roda em vários dispositivos, 
utilizada no Android por muito tempo,
linguagem mais utilizada no mundo
 
IDE:
Testador e editor de cóodigo

COMPILADOR:
transforma código fonte em código objeto, por meio da análise
léxica e sintática, onde se houver algum erro, a compilação
para e retorna o erro para o terminal.
Extensão do aruqivo(código) objeto: .O
Uma vez compilado e transformado em código objeto, terá de passar
pelo gerador de código para torna-lo executável

DIFERENÇA DE CÓDIGO COMPILADO E INTERPRETADO:
Compilado: O código-fonte é traduzido integralmente para 
linguagem de máquina (código executável) antes da execução. 
Isso é feito por um compilador. O código compilado é 
geralmente mais rápido, pois já está traduzido para a 
linguagem do computador. Exemplos: C, C++, Java (em parte),
menos sucetível a bugs, pois o compilador ajuda o programador
a verificar o código

Interpretado: O código-fonte é lido linha por linha e 
traduzido em instruções executáveis pela máquina em tempo 
de execução. Isso é feito por um interpretador, que faz a 
análise lexica, sintatica e a geração de código sob demanda,
ou seja, lê, traduz e executa, depois próxima linha, ... e
assim vai.
O código interpretado geralmente é mais lento, pois requer 
essa tradução em tempo real. Exemplos: Python, JavaScript.
Porém esse código é mais usado em produção, pois não exige 
recompilar todo o código durante manutenções, oque gera
uma linguagem mais expressiva e não precisa ser recompilado
para rodar em plataformas diferentes

HÍBIDO (COMPILADO E INTERPRETADO):
Código fonte é compilado
vira bytecode (código objeto pré-compilado)
passa para a máquina virtual
faz a geração de código sob demanda
ou seja, interpreta e executa, linha a linha
(chamada de compilação just in time)
Como feito em Java (JVM) e C# (microsoft .NET framework)

.java (arquivo fonte)
.class (código pré -compilado, bytecode)

ao rodar, grava o bytecode compilado na BIN
na forma exe (quando executado, aciona a máquina virtual)

Características da íbrida:
velocidade do porgrama devido a compilação
flexibilidade em produção
codigo fonte (aquele que o programador escreve) e não precisa
ser recompilado
tem auxílio do compilador antes da execução
(não rodando o código casa tenha algum erro)

Java X JS ou Python:
Desempenho: Geralmente, Java tende a ser mais rápido que 
JavaScript em operações intensivas de processamento de dados,
especialmente em aplicações de grande escala. 
Isso ocorre porque o código Java é pré-compilado para 
bytecode e depois traduzido para linguagem de máquina 
durante a execução, enquanto o JavaScript é interpretado 
linha por linha durante a execução.

Otimização: Java possui técnicas de otimização mais avançadas,
como a compilação just-in-time (JIT), que pode converter o 
bytecode em código de máquina durante a execução, 
melhorando ainda mais o desempenho. 
Além disso, Java tem um sistema de tipos estáticos, 
o que permite ao compilador realizar mais otimizações 
em tempo de compilação.

Uso de Memória: JavaScript tende a consumir mais memória 
do que Java devido à natureza dinâmica e flexível da linguagem,
o que pode ser uma consideração importante em aplicações que
precisam otimizar o uso de recursos.

JAVA PRECISA DE UMA MÁQUINA VÍRTUAL PARA RODAR:
Sim, uma máquina virtual Java (JVM) é essencial para rodar 
programas Java. A JVM interpreta o bytecode Java e o 
traduz em instruções executáveis para o sistema operacional. 
Isso permite que os programas Java sejam executados em 
qualquer dispositivo ou sistema operacional com uma JVM 
compatível, proporcionando portabilidade e independência 
de plataforma.

JS NÃO PRECISA DE MÁQUINA VIRTUAL:
Como o JavaScript é uma linguagem interpretada, 
não é necessário uma máquina virtual específica para 
executá-lo. Os navegadores da web e os ambientes de execução 
JavaScript (como Node.js) possuem interpretadores embutidos 
que leem e executam o código JavaScript diretamente, 
linha por linha, sem a necessidade de compilação prévia 
em linguagem de máquina. Isso torna o JavaScript mais 
simples de implantar e executar em uma variedade de ambientes,
sem a necessidade de uma máquina virtual separada.

Exemplos das principais IDEs utilizadas para cada linguagem:

C/C++:
Code::Blocks
Visual Studio (com o plugin Visual C++)
CLion
Eclipse CDT

Java:
Eclipse
IntelliJ IDEA
NetBeans

Python:
PyCharm
Visual Studio Code (com extensões)
Spyder
Jupyter Notebook/JupyterLab

JavaScript:
Visual Studio Code
WebStorm
Atom
Sublime Text (com plugins)

C#/.NET:
Visual Studio (Community, Professional, Enterprise)
Rider
SharpDevelop

PHP:
PhpStorm
Visual Studio Code (com extensões)
Sublime Text (com plugins)

Ruby:
RubyMine
Visual Studio Code (com extensões)
Sublime Text (com plugins)

Swift:
Xcode (para desenvolvimento em macOS e iOS)

VERSÕES DO JAVA:
JDK 21 is the latest long-term support 
release of Java SE Platform:

LTS: Long term support
 Versão prefirível pois contém poucas atualizações,
 mais estável e com suporte oficial da Oracle

JVM:
necessário quando há trocas de sistema operacional

Java é orientado a objetos
oque significa que java tem classes

Pacote(entities): 
agrupamento lógico de classes relacionadas

Serviços:
Serviços de email, log, pedidos

Repositorios:
classes para acessar os dados

Módulo:
Agrupa pacotes de entities de classes, 
por exemplo o módulo financeiro:
agrupa as entidades, serviços e repositórios do finaneciro,
compondo assim um módulo específico, para fisn de organização

runtime: agrupamento físico que pode ser instalado para rodar em
dispositivos

API(aplicação): agrupamento de módulos relacionados

-- eclipse 4.11

Tipagem forte:
rigidamente aplicados e não são implicitamente convertidos 
de um tipo para outro sem uma declaração explícita

A linguagem faz verificações rigorosas para garantir que as 
operações sejam realizadas apenas entre tipos compatíveis e
que não ocorram conversões automáticas entre tipos incompatíveis.

Tipagem fraca:
os tipos de dados são mais flexíveis e podem ser implicitamente 
convertidos de um tipo para outro em certas situações
a linguagem permite operações entre tipos de dados diferentes
sem exigir conversões explícitas por parte do programador, tendendo
a ser mais permissivas, mas levando a erros difíceis de detectar

Wokspace:
.metadata
RemoteSystemTempFiles

pubic static void main (permite que o porgrama seja executável)
--> ponto onde o programa começa

system.out.orintIn("olá mundo");
 */

public class Main {

    public static void main(String[] args){

        System.out.printIn("Olá Mundo");
    }

}

//Estrutura sequencial:

//Estrutura condicional:

//Estrutura repetititvas:

variável fica armazenada na memória RAM:
possui nome, tipo, valor, endereço de memória

<tipo> <nome> = <valor>;
int idade = 22;
double altura = 1.67;
char sexo = 'F';

tipos primitivos:

1 bit -> 2 possibilidades
8 bits -> 2^8 = 256 possibilidades
de 0 a 255 

Tabela unicode table:

1 byte = 8 bits = 0 até 255, porém esses números iniciam 
negativos, portanto -128 até 127 

1 short = 16 bits = 2^16 = 65536 /2 (metade é negativo)
 -32768 a 32767

 1 int = 32 bits = 2^32 = 4.294.967.296 /2 = 2.147.483.648
 - 2.147.483.648 a 2.147.483.647

 1 long = 64 bits = 2^64 = 1.8446744e+19 ...

 1 float = 32 bits = 

 1 double = 64 bits

 1 char = 16 bits = '\u0061 = A ou \uFFFF'
 \u unicode hexadecimal
 \x hexadecimal
 \octal

 1 boolean = 1  bit = {true, false}

 
//Bytecode:
0:   ldc           #2; //String "Olá Mundo"
2:   invokevirtual #3; //Method java/io/PrintStream.println:(Ljava/lang/String;)V
5:   return

//Assembly:
section .data
    mensagem db "Olá Mundo", 0x0A

section .text
    global _main

_main:
    push mensagem
    call printf
    add esp, 4

    mov eax, 0
    ret
//https://pt.wikipedia.org/wiki/Linguagem_assembly

//Linguagem de máquina:
68 78 56 34 12   ; push mensagem
E8 34 12 00 00   ; call printf
83 C4 04         ; add esp, 4

/* Programação e Variáveis: No processo de programação, 
você escreve código-fonte em uma linguagem de programação,
que inclui declaração de variáveis, estruturas de controle,
funções, entre outros elementos. Essas variáveis e estruturas 
de dados são armazenadas na memória RAM do computador 
enquanto o programa está em execução.

Compilação/Interpretação: O código-fonte é então compilado 
ou interpretado para produzir instruções de máquina específicas 
para a arquitetura do processador em que o programa será 
executado. Isso pode incluir a conversão do código-fonte 
para bytecode em linguagens como Java, ou diretamente 
para código de máquina binário em linguagens compiladas 
como C++.

Execução de Instruções: As instruções de máquina geradas pelo
compilador ou interpretador são carregadas na CPU e executadas 
sequencialmente. Isso envolve abrir e fechar transistores em 
circuitos específicos para realizar operações lógicas e 
aritméticas, manipular dados na memória, transferir dados 
entre registradores, entre outras tarefas.

Operações na CPU: Dentro da CPU, as operações são realizadas 
pelos componentes internos, como a Unidade de Controle 
(Control Unit), que coordena a execução de instruções, e a 
Unidade de Execução (Execution Unit), que realiza operações 
aritméticas e lógicas. Os transistores são usados para 
implementar portas lógicas e outros circuitos necessários 
para processar as instruções.

Interação com a Memória: Durante a execução do programa, a 
CPU pode acessar dados na memória RAM para ler variáveis, 
gravar resultados de cálculos, ou buscar instruções adicionais.
Isso envolve a abertura e o fechamento de portas de acesso à
 memória, controlado pela lógica interna da CPU./*

3 operações básicas do computador:
entrada de dados (programa faz a leitura)
processamento de dados (CPU - atribuição)
saída de dados (escrita)

*/

//Print do JAVA:
System.out.date     //sem quebra de linha
System.out.printIn  //com quebra de linha

//printf (abreviado para F de Formatação)

Casas decimais:
printf('%.2f%n', variavel);

%: Indica o início de um especificador de 
conversão.

.2: Indica a precisão da formatação de 
ponto flutuante, neste caso, dois dígitos 
após o ponto decimal.

f: Especifica que o valor a ser formatado 
é um número de ponto flutuante.

%n: Especifica uma nova linha na saída.


import java.util.Locale;
Locale.setDefaut(Locale.US);

cancatenação:
x + y + 'stringTest'

System.out.printf('Resultado' = %.2f metros%n, x);
System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",
nome, idade, renda);

marcador de variável:
%d, %f, %s, %n

----------------------------------------------------
import java.util.Locale;

String product1 = "Computer";
String product2 = "Office desk";

int age = 30;
int code = 5290;
char gender = 'F';

double price1 = 2100.0; //(double põe .0 por boas práticas)
double price2 = 650.0;
double price 3 = 53.234567;

System.out.printf("Products;%n %s, witch price is %.2f%n %s, wich price is %.2f%n", product1, price1, product2, price2);
System.out.printf("Record; %d, years old, code %d, and gender: %d%n", age, code, gender);
System.out.printf("Measure with eight decimal places: %.8f%n Rounded (three decimal places): %.3f", price3, price3, price3);

Locale.setDefaut(Locale.US);
System.out.printf("US deciaml point: %.3f", price3);

quando o compilador faz uma expressão com 2 números int,
o resultado será um int, para que o resultado seja em 
um tipo diferente deve-se declarar o tipo na expressão:

int a,b;
double resultado;

a = 5;
b = 2;

resultado = (double) a/b;
// esse processo de conversão explícita dos valores é chamada
// de casting
System.out.printIn(resultado);

//o castign também pode ser usando quando o compilador acha
//que algum valor será perdido no resultado

double a;
int b;

a = 5.0;
b = a; //isso nao roda, por isso faz o casting:

b = (int) a;

System.Out.printIn(b);
-------------------------------------------------------

//Particularidade para entrada de dados:

adiciona a biblioteca
import java.util.scanner;

sc.close() quando não precima mais do objeto sc

Scanner sc = new Scanner(System.in);
associa o objeto scanner ao teclado console

x = sc.next();

sc --> variável scanner 




