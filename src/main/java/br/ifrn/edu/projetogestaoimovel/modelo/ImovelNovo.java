/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

/**
 *
 * @author 1577655
 */
public class ImovelNovo extends Imovel {
    private double precoAdicional;
    
    public ImovelNovo(String endereco,double preco,double precoAdicional){
        super(endereco,preco);
        this.precoAdicional=precoAdicional;
    }
    
    @Override
    public double calcularValorImovel() {
       return super.getPreco()+this.precoAdicional;
    }
    
    
}
