/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

/**
 *
 * @author Gustavo
 */
public class TestaCursoComAluno {
    
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        
        Aluno a1 = new Aluno("Rodrigo Turini", "34762");
        Aluno a2 = new Aluno("Guilherme Silveira", "5617");
        Aluno a3 = new Aluno("Mauricio Aniche", "17645");
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Alunos Matriculados");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
        
    }
    
}