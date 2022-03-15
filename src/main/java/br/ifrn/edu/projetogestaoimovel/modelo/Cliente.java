/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

/**
 *
 * @author 1577655
 */
public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private FaixaRenda faixaRenda;

    public Cliente(String nome, String telefone, String endereco, FaixaRenda faixaRenda) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.faixaRenda = faixaRenda;
    }

    public String getEndereco() {
        return endereco;
    }

    public FaixaRenda getFaixaRenda() {
        return faixaRenda;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFaixaRenda(FaixaRenda faixaRenda) {
        this.faixaRenda = faixaRenda;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
