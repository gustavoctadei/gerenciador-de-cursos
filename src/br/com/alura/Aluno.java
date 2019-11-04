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
public class Aluno {
    
    private String nome;
    private String numeroMatricula;

    public Aluno(String nome, String numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", numeroMatricula=" + numeroMatricula + '}';
    }
    
    
    
}
