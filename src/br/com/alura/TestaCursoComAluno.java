/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.Iterator;
import java.util.Set;

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
        
        System.out.println("Todos os alunos matriculados");
        
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while(iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }
        
        
        System.out.println("A aluno a1 está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        
        Aluno turini = new Aluno("Rodrigo Turini", "34672");
        System.out.println("A aluno turini está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));
        
        System.out.println("a1==turini?");
        System.out.println(a1.equals(turini));
        
        System.out.println("Comparando os hashCodes");
        System.out.println(a1.hashCode() == turini.hashCode());
        
        
        
    }
    
}
