/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 1577655
 */
public class MainImovel {
    public static void main(String[] args) {
        
        Cliente cliente=new Cliente("André", "7890", "Novo endereço", FaixaRenda.FAIXA_6A10);
        Imovel imovel=new ImovelNovo("Novo Horizonte", 50000, 5000);
        RegistroVenda vendaImovel=new RegistroVenda();
        
        vendaImovel.setCliente(cliente);
        vendaImovel.setImovel(imovel);
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/uuuu");
        vendaImovel.setDataVenda(LocalDate.parse("20/02/2022",formato));
        
        System.out.println("O imóvel vendido tem custo de "+vendaImovel.getImovel().calcularValorImovel()+" no dia "+vendaImovel.getDataVenda().toString());
    }
    
}
