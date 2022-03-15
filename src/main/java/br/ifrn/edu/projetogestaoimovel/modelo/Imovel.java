/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

/**
 *
 * @author 1577655
 */
public abstract class Imovel {
    
    private String endereco;
    private double preco;
    
    public Imovel(String endereco,double preco){
        this.endereco=endereco;
        this.preco=preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public abstract double calcularValorImovel();
}
