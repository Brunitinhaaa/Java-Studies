

LINGUAGEM DE PROGRAMAÇÃO:
/*conjunto de regras léxas(ortografica, correção de palavras 
isoladas) e sintáticas (gramatical, sentido como um todo)
para escrever um programa

Na intenção de resolver problemas com ponteiros, gerenciamento 
de memória, controle manual de definição de variáveis 
no C/C++, (ficando mais sucetíveis a erros), não suporte 
há utilização em diversos dispositivos, o JAVA surgiu na 
metáde da década de 90, sendo:
-- linguagem e também uma plataforma de desenvolvimento e 
-- execução (bibliotecas API, ambientes de execução),
-- linguagem de alto nível
-- orientada a objetos
-- Comprado pela Oracel em 2010,
-- é portável, seguro e robusto, 
-- roda em vários dispositivos, 
-- utilizada no Android por muito tempo,
-- linguagem mais utilizada no mundo*/
 
IDE:
//Testador e editor de cóodigo

COMPILADOR:
/*transforma código fonte em código objeto, por meio da análise
léxica e sintática, onde se houver algum erro, a compilação
para e retorna o erro para o terminal.
Extensão do arquivo(código) objeto: .O
Uma vez compilado e transformado em código objeto, 
terá de passar pelo gerador de código para torna-lo executável*/

DIFERENÇA DE CÓDIGO COMPILADO E INTERPRETADO:
/*

-- Compilado: O código-fonte é traduzido integralmente para 
linguagem de máquina (código executável) antes da execução. 
Isso é feito por um compilador. O código compilado é 
geralmente mais rápido, pois já está traduzido para a 
linguagem do computador. Exemplos: C, C++, Java (em parte),
menos sucetível a bugs, pois o compilador ajuda o programador
a verificar o código

-- Interpretado: O código-fonte é lido linha por linha e 
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
*/

HÍBIDO (COMPILADO E INTERPRETADO):
/*
-- Código fonte é compilado
-- vira bytecode (código objeto pré-compilado)
-- passa para a máquina virtual
-- faz a geração de código sob demanda
-- ou seja, interpreta e executa, linha a linha
-- (chamada de compilação just in time)
-- Como feito em Java (JVM) e C# (microsoft .NET framework)

.java (arquivo fonte)
.class (código pré -compilado, bytecode)

ao rodar, grava o bytecode compilado na BIN
na forma exe (quando executado, aciona a máquina virtual)

Características da Híbrida:
-- velocidade do porgrama devido a compilação
-- flexibilidade em produção
-- codigo fonte (aquele que o programador escreve) e não precisa
-- ser recompilado
-- tem auxílio do compilador antes da execução
-- (não rodando o código casa tenha algum erro)
*/

Java X JS ou Python:
/*
-- Desempenho: Geralmente, Java tende a ser mais rápido que 
JavaScript em operações intensivas de processamento de dados,
especialmente em aplicações de grande escala. 
Isso ocorre porque o código Java é pré-compilado para 
bytecode e depois traduzido para linguagem de máquina 
durante a execução, enquanto o JavaScript é interpretado 
linha por linha durante a execução.

-- Otimização: Java possui técnicas de otimização mais avançadas,
como a compilação just-in-time (JIT), que pode converter o 
bytecode em código de máquina durante a execução, 
melhorando ainda mais o desempenho. 
Além disso, Java tem um sistema de tipos estáticos, 
o que permite ao compilador realizar mais otimizações 
em tempo de compilação.

-- Uso de Memória: JavaScript tende a consumir mais memória 
do que Java devido à natureza dinâmica e flexível da linguagem,
o que pode ser uma consideração importante em aplicações que
precisam otimizar o uso de recursos.
*/

JAVA PRECISA DE UMA MÁQUINA VÍRTUAL PARA RODAR:
/*Sim, uma máquina virtual Java (JVM) é essencial para rodar 
programas Java. A JVM interpreta o bytecode Java e o 
traduz em instruções executáveis para o sistema operacional. 
Isso permite que os programas Java sejam executados em 
qualquer dispositivo ou sistema operacional com uma JVM 
compatível, proporcionando portabilidade e independência 
de plataforma.*/

JS NÃO PRECISA DE MÁQUINA VIRTUAL:
/*Como o JavaScript é uma linguagem interpretada, 
não é necessário uma máquina virtual específica para 
executá-lo. Os navegadores da web e os ambientes de execução 
JavaScript (como Node.js) possuem interpretadores embutidos 
que leem e executam o código JavaScript diretamente, 
linha por linha, sem a necessidade de compilação prévia 
em linguagem de máquina. Isso torna o JavaScript mais 
simples de implantar e executar em uma variedade de ambientes,
sem a necessidade de uma máquina virtual separada.*/

PRINCIPAIS IDEs POR LINGUAGEM:

C/C++:
-- //Code::Blocks
-- //Visual Studio (com o plugin Visual C++)
-- //CLion
-- //Eclipse CDT

Java:
-- //Eclipse
-- //IntelliJ IDEA
-- //NetBeans

Python:
-- //PyCharm
-- //Visual Studio Code (com extensões)
-- //Spyder
-- //Jupyter Notebook/JupyterLab

JavaScript:
-- //Visual Studio Code
-- //WebStorm
-- //Atom
-- //Sublime Text (com plugins)

C#/.NET:
-- //Visual Studio (Community, Professional, Enterprise)
-- //Rider
-- //SharpDevelop

PHP:
-- //PhpStorm
-- //Visual Studio Code (com extensões)
-- //Sublime Text (com plugins)

Ruby:
-- //RubyMine
-- //Visual Studio Code (com extensões)
-- //Sublime Text (com plugins)

Swift:
-- //Xcode (para desenvolvimento em macOS e iOS)

VERSÕES DO JAVA:
/*
JDK 21 is the latest long-term support 
release of Java SE Platform

LTS: Long term support
 Versão prefirível pois contém poucas atualizações,
 mais estável e com suporte oficial da Oracle

JVM:
necessário quando há trocas de sistema operacional
*/

SOBRE O JAVA:
/*
Java é orientado a objetos
oque significa que java tem classes

-- Pacote(entities): 
agrupamento lógico de classes relacionadas

-- Serviços:
Serviços de email, log, pedidos

-- Repositorios:
classes para acessar os dados

-- Módulo:
Agrupa pacotes de entities de classes, 
por exemplo o módulo financeiro:
agrupa as entidades, serviços e repositórios do finaneciro,
compondo assim um módulo específico, para fisn de organização

-- runtime: 
Agrupamento físico que pode ser instalado para rodar em
dispositivos

-- API:
agrupamento de módulos relacionados
*/

TIPAGEM:
/*
-- Tipagem forte:
rigidamente aplicados e não são implicitamente convertidos 
de um tipo para outro sem uma declaração explícita

A linguagem faz verificações rigorosas para garantir que as 
operações sejam realizadas apenas entre tipos compatíveis e
que não ocorram conversões automáticas entre tipos incompatíveis.

-- Tipagem fraca:
os tipos de dados são mais flexíveis e podem ser implicitamente 
convertidos de um tipo para outro em certas situações
a linguagem permite operações entre tipos de dados diferentes
sem exigir conversões explícitas por parte do programador, tendendo
a ser mais permissivas, mas levando a erros difíceis de detectar
*/

WORKSPACE:
.metadata
RemoteSystemTempFiles

ESTRUTURA DO CÓDIGO:

pubic static void main 
//permite que o programa seja executável
//ponto onde o programa começa

system.out.printf("olá mundo");
//printa na tela

//Assim, teremos:

public class Main {

    public static void main(String[] args){

        System.out.println("Olá Mundo");
    }

}

//Estrutura sequencial:

//Estrutura condicional:

//Estrutura repetititvas:

VARIÁVEIS:
//As variáveis ficam armazenadas na memória RAM:
//Possuem nome, tipo, valor e endereço de memória

//<tipo> <nome> = <valor>:
int idade = 22;
double altura = 1.67;
char sexo = 'F';

TIPOS PRIMITIVOS, UNICODE TABLE:
/*
-- 1 bit -> 2 possibilidades

-- 8 bits -> 2^8 = 256 possibilidades
ou seja, iria de 0 a 255 

-- 1 byte = 8 bits = 0 até 255, porém esses números iniciam 
negativos, portanto -128 até 127 

-- 1 short = 16 bits = 2^16 = 65536 /2 (metade é negativo)
 -32768 a 32767

--  1 int = 32 bits = 2^32 = 4.294.967.296 /2 = 2.147.483.648
 - 2.147.483.648 a 2.147.483.647

-- 1 long = 64 bits = 2^64 = 1.8446744e+19 ...

-- 1 float = 32 bits 

-- 1 double = 64 bits

-- 1 char = 16 bits = '\u0061 = A ou \uFFFF'
    \u unicode hexadecimal
    \x hexadecimal
    \octal

-- 1 boolean = 1  bit = {true, false}
*/

BYTECODE:

0:   ldc           #2; //String "Olá Mundo"
2:   invokevirtual #3; //Method java/io/PrintStream.println:(Ljava/lang/String;)V
5:   return

ASSEMBLY:

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

LINGAUGEM DE MÁQUINA:
68 78 56 34 12   ; push mensagem
E8 34 12 00 00   ; call printf
83 C4 04         ; add esp, 4

OQUE ACONTECE NO ATO DE PROGRAMAR:
/*
-- No processo de programação, escrevemos código-fonte em uma 
linguagem de programação, que inclui declaração de variáveis,
estruturas de controle, funções, entre outros elementos. 
Essas variáveis e estruturas de dados são armazenadas na
memória RAM do computador enquanto o programa está em execução.

-- Compilação/Interpretação: O código-fonte é então compilado 
ou interpretado para produzir instruções de máquina específicas 
para a arquitetura do processador em que o programa será 
executado. Isso pode incluir a conversão do código-fonte 
para bytecode em linguagens como Java, ou diretamente 
para código de máquina binário em linguagens compiladas 
como C++.

-- Execução de Instruções: As instruções de máquina geradas pelo
compilador ou interpretador são carregadas na CPU e executadas 
sequencialmente. Isso envolve abrir e fechar transistores em 
circuitos específicos para realizar operações lógicas e 
aritméticas, manipular dados na memória, transferir dados 
entre registradores, entre outras tarefas.

-- Operações na CPU: Dentro da CPU, as operações são realizadas 
pelos componentes internos, como a Unidade de Controle 
(Control Unit), que coordena a execução de instruções, e a 
Unidade de Execução (Execution Unit), que realiza operações 
aritméticas e lógicas. Os transistores são usados para 
implementar portas lógicas e outros circuitos necessários 
para processar as instruções.

-- Interação com a Memória: Durante a execução do programa, a 
CPU pode acessar dados na memória RAM para ler variáveis, 
gravar resultados de cálculos, ou buscar instruções adicionais.
Isso envolve a abertura e o fechamento de portas de acesso à
 memória, controlado pela lógica interna da CPU./*
*/

3 OPERAÇÕES BÁSICAS DO COMPUTADOR:
-- //entrada de dados (programa faz a leitura)
-- //processamento de dados (CPU - atribuição)
-- //saída de dados (escrita)

CASAS DECIMAIS:
printf('%.2f%n', variavel);

-- %: //Indica o início de um especificador de conversão.

-- .2: //Indica a precisão da formatação de  ponto flutuante,
// neste caso, dois dígitos após o ponto decimal.

-- f: //Especifica que o valor a ser formatado é um número 
// de ponto flutuante.

-- %n: //Especifica uma nova linha na saída.

IMPORTANDO E USANDO LOCALE PARA ALTERAR ENTRE 
PONTO E VÍRGULA PARA NÚMERO FLOAT OU DOUBLE

import java.util.Locale;
Locale.setDefaut(Locale.US);
//Exemplo de uso, setando em US
//Neste caso o código apenas ceitaria números com . e não ,

CONCATENAÇÃO:
//x + y + 'stringTest'

MARCADOR DE VARIÁVEL:

-- %d: //formata valores inteiros
-- %f: //formata valores de ponto flutuante
-- %s: //formata valores de string
-- %n: //pula uma linha

PRINTs DO JAVA:

System.out.print    //saida padrão sem quebra de linha
System.out.println  //saída padrão com quebra de linha
System.out.printf   //permite inserir valores formatados,
                    // como %d, %f e e %s, por exemplo.



//DIFERENÇAS:
//Printlf
//Println
//printin
//printf

----------------------------------------------------
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';
    
        double price1 = 2100.0; //(double põe .0 por boas práticas)
        double price2 = 650.0;
        double price3 = 53.234567;

        System.out.printf("Products:%n %s, witch price is %.2f%n %s, witch price is %.2f%n", product1, price1, product2, price2);
        System.out.printf("%nRecord: %d, years old, code %d, and gender: %s%n", age, code, gender);
        System.out.printf("%nMeasure with eight decimal places: %.8f%nRounded (three decimal places): %.3f", price3, price3, price3);

        Locale.setDefault(Locale.US);
        System.out.printf("%nUS deciaml point: %.3f", price3);
    }
}
-------------------------------------------------------------
//quando o compilador faz uma expressão com 2 números int,
//o resultado será um int, para que o resultado seja em 
//um tipo diferente deve-se declarar o tipo na expressão:

public class Main {
    public static void main(String[] args) { 

    int a,b;
    double resultado;

    a = 5;
    b = 2;

    resultado = (double) a / b; 
    // Casting para double para realizar a divisão corretamente

    System.out.println(resultado);
    //esse processo de conversão explícita dos valores 
    //é chamada de casting

    //o castign também pode ser usando quando o compilador acha
    //que algum valor será perdido no resultado

    double c;
    int d;

    c = 5.0;
    d = (int) c; 
    //isso nao roda, por isso faz o casting explícito
    // evitar=ndo assim, perda de precisão

    System.out.println(d);
    }
}
-------------------------------------------------------
//Particularidade para entrada de dados:

import java.util.Scanner; //adiciona a biblioteca
import java.util.Locale; 

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        //chama a função pra dentro da variável
        //sc --> variável scanner 
        
        
        System.out.printf("digite uma string%n");
        String X;
        //declara X
        X = sc.next();
        //atribui a X o valor recebido dentro do SC
        System.out.printf("valor digitado: %s%n", X);
        //quando não precisa mais do objeto sc



        System.out.printf("digite um inteiro:%n");
        int Y;
        Y = sc.nextInt();
        System.out.printf("valor digitado: %d%n", Y);
        //nextInt para valores inteiros
        
        
        
        System.out.printf("digite um ponto flutuante:%n");
        double Z;
        Z = sc.nextDouble();
        //dependendo da localidade do sistema,
        //é possível preencher com , ou .
        //por isso dentro do parenteses
        //enviamos a localidade do sistema
        //pode ser adiiconado antes da declaração:
        Locale.setDefault(Locale.US);
        //ou pode passar dentro dos parênteses
        //adiciona a bilbioteca
        System.out.printf("valor digitado: %.2f%n", Z);
       
       
       
        System.out.printf("digite um caractere:%n");
        //para ler um caractere:
        char W;
        W = sc.next().charAt(0);
        //pega apenas o 1 caracter
        System.out.printf("valor digitado: %c%n", W);
        sc.close();
    }
}

------------------------------------------------------

LENDO VÁRIOS DADOS NA MESMA LINHA:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 

        String x;
        int y;
        double z;
        
        Scanner sc = new Scanner(System.in); 

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
--------------------------------------------------------------
        x = sc.next(); //lê a próxima palavra
        y = sc.nextLine(); //lê a próxima linha
                           //e limpa o buffer de leitura

//Ao usar algum comando de leitura diferente do nextLine()
//e der alguma quebra de linha, essa quebra de linha
//fica "pendente" na entrada padrão.

//Então, ao fazer um nextLine(), a quebra de linha pendente 
//será absorvida pelo nextLine(), para resolver isso,
//faz um next.line extra
------------------------------------------------------------
ATALHOS:

Ctrl shift F //indenta o código automaticamente
------------------------------------------------------------
FUNÇÕES:

Math.sqrt(x); 
// raiz quadrada
Math.pow(x, y);
// potenciação
Math.abs(x, y);
// valor absoluto
------------------------------------------------------------





