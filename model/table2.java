/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class table2 extends AbstractTableModel {
    private String[] col2= {"Num", "Item", "Unit Price", "Quantity", "Total"};
    private ArrayList<InvoiceLine> InvoiceLines;
    
    public String getColumnName(int column) {
        return col2[column];
    }

    public ArrayList<InvoiceLine> getInvoiceLines() {
        return InvoiceLines;
    }

    public void setInvoiceLines(ArrayList<InvoiceLine> InvoiceLines) {
        this.InvoiceLines = InvoiceLines;
    }

    public table2(ArrayList<InvoiceLine> InvoiceLines) {
        this.InvoiceLines = InvoiceLines;
    }

    @Override
    public int getRowCount() {
         return InvoiceLines.size();

    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
 InvoiceLine n =InvoiceLines.get(rowIndex)  ;
        switch(columnIndex){
            case 0:
                return InvoiceLines.get(rowIndex).getInv().getNum();
              
                
            case 1:
               return InvoiceLines.get(rowIndex).getItemname();
             
                
            case 2:
                return InvoiceLines.get(rowIndex).getPrice();
            
            
            case 3: 
                return InvoiceLines.get(rowIndex).getQuantity();
           
            case 4: 
                return InvoiceLines.get(rowIndex).getTotal();   
        }
        
        return null;
    }
    
}
