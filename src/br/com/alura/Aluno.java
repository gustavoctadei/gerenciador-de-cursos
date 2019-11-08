/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.Objects;

/**
 *
 * @author Gustavo
 */
public class Aluno {
    
    private String nome;
    private String numeroMatricula;

    public Aluno(String nome, String numeroMatricula) {
        
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo.");
        }
        
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
