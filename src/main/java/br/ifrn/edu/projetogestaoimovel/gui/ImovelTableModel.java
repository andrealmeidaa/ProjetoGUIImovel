/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifrn.edu.projetogestaoimovel.gui;

import br.ifrn.edu.projetogestaoimovel.modelo.Imovel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 1577655
 * 
 * Documentação de referência: https://pt.stackoverflow.com/questions/121513/como-popular-uma-jtable-com-tablemodel-pr%C3%B3prio
 */
public class ImovelTableModel extends AbstractTableModel {
    
    
    private final List<Imovel> imoveis;
    
    private final String colunas[]={"ID","Endereço","Preço","Preço Real"};
    
    private final int COLUNA_ID=0;
    private final int COLUNA_ENDERECO=1;
    private final int COLUNA_PRECO=2;
    private final int COLUNA_PRECO_REAL=3;
    
    public ImovelTableModel(List<Imovel> imoveis){
        this.imoveis=imoveis;
    }
    
    @Override
    public int getRowCount() {
       return this.imoveis.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
    }

    @Override
    public String getColumnName(int column) {
      return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
      switch(columnIndex){
          case (COLUNA_ID)->{
              return Integer.class;
          }
          case (COLUNA_ENDERECO)->{
              return String.class;
          }
          case (COLUNA_PRECO)->{
              return Double.class;
          }
          case(COLUNA_PRECO_REAL)->{
              return Double.class;
          }
          default->{
                  return String.class;
          }
      }
    }
    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Imovel imovel=this.imoveis.get(rowIndex);
       
       switch(columnIndex){
           case (COLUNA_ID) -> {
               return rowIndex+1;
            }
           case (COLUNA_ENDERECO) -> {
               return imovel.getEndereco();
            }
           case (COLUNA_PRECO) -> {
               return imovel.getPreco();
            }
           case (COLUNA_PRECO_REAL) -> {
               return imovel.calcularValorImovel();
            }
       }
       return null;
       
    }
    
}
