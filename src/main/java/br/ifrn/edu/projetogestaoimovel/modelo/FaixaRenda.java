/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

/**
 *
 * @author 1577655
 */
public enum FaixaRenda {
    
    FAIXA_1A5("FAIXA 1 A 5"),FAIXA_6A10("FAIXA 6 A 10"),FAIXA_ACIMA10("FAIXA ACIMA 10");
    
    private final String valor;
    
    FaixaRenda(String valor){
        this.valor=valor;
    }
    
    public String getValor(){
        return this.valor;
    } 
    
}
