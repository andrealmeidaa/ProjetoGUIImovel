/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.controle;

import br.ifrn.edu.projetogestaoimovel.modelo.Imovel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 1577655
 */
public class ControleImovel {
    private final List<Imovel> imoveis;
    
    public ControleImovel(){
        this.imoveis=new ArrayList<>();
    }
    
    public List<Imovel> getImoveis(){
        return this.imoveis;
    }
    
    public void adicionarImovel(Imovel imovel, int idImovel){
        if(idImovel==-1){
            this.imoveis.add(imovel);
        }else{
            this.imoveis.set(idImovel,imovel);
        }
    }
    
    public Imovel getImovel(int idImovel){
        try{
            return this.imoveis.get(idImovel);
        }catch(IndexOutOfBoundsException error){
            return null;
        }
    }
    
    public boolean excluirImovel(int idImovel){
        try{
            this.imoveis.remove(idImovel);
            return true;
        }catch(IndexOutOfBoundsException error){
            return false;
        }
    }
}
