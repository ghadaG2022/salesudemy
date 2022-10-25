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
public class table1 extends AbstractTableModel {
ArrayList <InvoiceHeader> data ;

    @Override
    public int getRowCount() {
      
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public String getColumName(int col) {
       if(col==0)
       {return "Id";}
        if(col==1)
       {return "Name";}
          if(col==2)
       { return "date";}
            if(col==3)
       { return "total";}
            return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    InvoiceHeader h =data.get(rowIndex)  ;
    if(columnIndex==0)
       {return data.get(rowIndex).getNum();}
     if(columnIndex==1)
       {return data.get(rowIndex).getName();}
      if(columnIndex==2)
       {return data.get(rowIndex).getDate();}
      if(columnIndex==3)
       {return data.get(rowIndex).getnvoiceTotal();}
            return null;
    }

    public table1(ArrayList<InvoiceHeader> data) {
        this.data = data;
    }
    
    
    
    }
   

    
    

