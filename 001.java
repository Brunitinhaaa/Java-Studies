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


Tipagem:


 */

