/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

/**
 *
 * @author 1577655
 */
public class ImovelVelho extends Imovel {
    private double desconto;
    public ImovelVelho(String endereco,double preco,double desconto) {
        super(endereco, preco);
        this.desconto=desconto;
    }

    @Override
    public double calcularValorImovel() {
      return super.getPreco()*(1-(this.desconto/100));
    }
    
    
    
}
