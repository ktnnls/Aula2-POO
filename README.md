# Aula2-POO
Armazenando alguns exercícios da faculdade ADS Uninter, Matéria Programação Orientada a Objetos em JAVA.

Sistema de Avaliação de Alunos
Este repositório contém um projeto Java desenvolvido para calcular a média de avaliações de alunos, armazenando informações de notas e fornecendo funcionalidades de cálculo de média aritmética e ponderada. As classes principais do projeto são Aluno, Avaliacao, e Principal.

Estrutura das Classes
Classe Aluno:

Armazena informações sobre um aluno, incluindo suas notas e métodos para acessar e manipular esses dados.
Classe Avaliacao:

Contém métodos para calcular a média aritmética e a média ponderada de três notas, utilizando diferentes pesos para cada nota.
Construtores:
Construtor padrão que cria uma avaliação sem valores iniciais.
Construtor com parâmetros para inicializar as notas ao instanciar um objeto.
Classe Principal:

A classe principal do projeto, utilizada para instanciar objetos Aluno e Avaliacao, exibir os resultados dos cálculos de média e demonstrar o funcionamento das classes.
Funcionalidades
Cálculo da Média Aritmética: Calcula a média simples das notas.
Cálculo da Média Ponderada: Calcula a média com pesos distintos para as notas.
Exemplo de Uso
O exemplo de uso pode ser encontrado na classe Principal, onde é possível instanciar alunos e avaliações, e ver os cálculos de média em execução.

java
Copiar código
public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nome do Aluno");
        Avaliacao avaliacao = new Avaliacao(7.5, 8.0, 9.0);

        System.out.println("Média Aritmética: " + avaliacao.mediaAritmetica());
        System.out.println("Média Ponderada: " + avaliacao.mediaPonderada());
    }
}
Como Executar
Clone o repositório e navegue até o diretório do projeto.
Compile os arquivos Java:
bash
Copiar código
javac empresa/*.java
Execute a classe principal:
bash
Copiar código
java empresa.Principal
