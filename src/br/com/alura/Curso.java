/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
        int tempoTotal = 0;
        
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[Curso: " + "nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + "Tempo total: " + this.getTempoTotal() + ']';
    }
    
    
    
}
