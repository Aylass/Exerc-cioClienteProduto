package com.company;

public class Cliente {
    // Atributos
    private String nome;
    private String sexo;
    private int cod;
    private String telefone;
    private int idade;

    //Construtor
    public Cliente(String nome, String sexo, int idade, int cod, String telefone )
    {
        this.cod = cod;
        this.telefone = telefone;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getSexo(){
        return sexo;
    }
    public int getCod(){
        return cod;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return cod + " - " + nome;
    }
}
