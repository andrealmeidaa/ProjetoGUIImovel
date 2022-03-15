/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.controle;
import br.ifrn.edu.projetogestaoimovel.modelo.Cliente;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author 1577655
 */
public class ControleCliente {
    private final List<Cliente> clientes;
    
    public ControleCliente(){
        clientes=new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente,int idCliente){
        if(idCliente==-1){
            clientes.add(cliente);
        }else{
            clientes.set(idCliente, cliente);
        }
        
    }
    public List<Cliente> getClientes(){
        return this.clientes;
    }
    public Cliente getCliente(int idCliente){
        try{
             return clientes.get(idCliente);
        }catch(IndexOutOfBoundsException error){
            return null;
        }
       
    }
    public boolean excluirCliente(int idCliente){
        if (clientes.get(idCliente)==null){
            return false;
        }else{
            clientes.remove(idCliente);
            return true;
        }
    }
}
