/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.modelo;

import java.time.LocalDate;

/**
 *
 * @author 1577655
 */
public class RegistroVenda {
    
    private LocalDate dataVenda;
    private Cliente cliente;
    private Imovel imovel;

    public RegistroVenda() {
    }

    public RegistroVenda(LocalDate dataVenda, Cliente cliente, Imovel imovel) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.imovel = imovel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
    
}
