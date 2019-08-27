/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Aluno {
    private int idAluno;
    private String nome;
    private String celular;
    
    //CONSTRUTORES
    //VAZIO
    public Aluno() {
    }
    //CHEIO
    public Aluno(int idAluno, String nome, String celular) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.celular = celular;
    }
    
    
    //GETTERS & SETTERS

    public int getIdAluno() {
        return this.idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

   
    
}
