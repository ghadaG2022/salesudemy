/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.FileOperation;
import model.InvoiceHeader;
import model.InvoiceLine;
import model.table1;
import model.table2;
//import view.Dialog1;
//import view.Dialog2;
import view.NewJFrame;
import view.createinvoice;

/**
 *
 * @author Administrator
 */
public class actionshandling implements ActionListener,ListSelectionListener  {
   
 //  private table1 tabel3;
   private NewJFrame j ;
 // private Dialog1 invDialog;
  //       private   Dialog2 ItemDialog;

  public actionshandling(NewJFrame j) {
        this.j = j;

    }
  
  
 

    @Override
    public void actionPerformed(ActionEvent e) {
        
  
   
    String ActionCommand=e.getActionCommand();
      System.out.println(ActionCommand);
      
       if(ActionCommand=="Save File"){
        
             FileOperation o=new FileOperation(j);
             o.savefile(j.getAllinvoices());
          

      
      }  
       
          
      
      
    if(ActionCommand=="5"){
            
             int num= j.getTotalInvNum();
      num++;
         j.getNumLabel().setText(""+num);

      
      }  
    
     if(ActionCommand=="8"){
            
            
         j.getNumLabel().setText("");
           j.getjTextField2().setText("   ");
             j.getjTextField6().setText("    ");

      
      }  
    
    
    
    
     if(ActionCommand=="Save"){
             
             
                int s= j.getJFrameTable().getSelectedRow();
        if(s != -1){
                 
     
          InvoiceHeader inv=j.getAllinvoices().get(s);
       //      j.getAllinvoices().remove(s);
       //   j.getTabel1().fireTableDataChanged();
         
        // int num=inv.getNum();
      //String name= j.getjTextField2().getText();
       //String date= j.getjTextField6().getText();
         //InvoiceHeader inv2 = new InvoiceHeader(num,name,date);
         
//      j.getAllinvoices().add(inv2);
   
          
     
  //          j.getTabel1().fireTableDataChanged();
          
          String name= j.getjTextField2().getText();
          String date= j.getjTextField6().getText();
         inv.setName(name);
         inv.setDate(date);
           j.getTabel1().fireTableDataChanged();
        }
                    
        else{
      
             int num=Integer.parseInt(j.getNumLabel().getText());
      String name= j.getjTextField2().getText();
       String date= j.getjTextField6().getText();
         InvoiceHeader inv2 = new InvoiceHeader(num,name,date);
      j.getAllinvoices().add(inv2);
       j.getTabel1().fireTableDataChanged();
        }
       
          
          
        
       
      
      
      
      }  
    
    
    
    
    
    
    
    if(ActionCommand=="Load File")
    {
         System.out.println(e.getActionCommand());
        FileOperation FObject=new FileOperation(j);
        ArrayList<InvoiceHeader> inv=FObject.FileRead();
        // System.out.print(inv);

        
    j.setAllinvoices(inv);
         table1 invoiceTable = new table1(inv);
         j.setTabel1(invoiceTable);
        j.getJFrameTable().setModel(invoiceTable);
        j.getTabel1().fireTableDataChanged();
       
        
        
        
        
    }
   
     if(ActionCommand=="Delete Invoice")
          
    {
         int rowdeleted = j.getJFrameTable().getSelectedRow();
        
        if(rowdeleted!= -1){
            j.getAllinvoices().remove(rowdeleted);
          
     
            j.getTabel1().fireTableDataChanged();
            
    }
    }    
    
     /*if(ActionCommand=="deletein")
          
    {System.out.println(e.getActionCommand());
        int Selectedinvoice= j.getJFrameTable().getSelectedRow();
         int Selectedinvoiceline= j.gettable2().getSelectedRow();
        
          
         
        if((Selectedinvoice!=-1) && (Selectedinvoiceline!= -1)){
            
           InvoiceHeader invoice = j.getAllinvoices().get(Selectedinvoice);
            invoice.getListofitems().remove(Selectedinvoiceline);
            j.getTabel1().fireTableDataChanged();
            table2 ta = new table2(invoice.getListofitems());
            j. gettable2().setModel(ta);
             ta.fireTableDataChanged();
    }
    }*/
     /*if(ActionCommand=="ok"){
             System.out.print("zzzzzzzzzzzzz");
     //    String date= invDialog.getInvoiceDate().getText();
    //String customer = invDialog.getCustomerName().getText();
      int num= j.getTotalInvNum();
      num++;
    
      InvoiceHeader inv2 = new InvoiceHeader(num,customer,date);
      j.getAllinvoices().add(inv2);
      j.getTabel1().fireTableDataChanged();
       invDialog.setVisible(false);
      invDialog.dispose();
        invDialog=null;
     
    }*/
   /*   if(ActionCommand=="createIn"){
       invDialog = new Dialog1(j);
        invDialog.setVisible(true);

      
      }*/
      
      
      
       /* 
          if(ActionCommand=="inlineok"){
          int Selectedinvoice= j.getJFrameTable().getSelectedRow();
        if(Selectedinvoice!=-1){
            InvoiceHeader invoice = j.getAllinvoices().get(Selectedinvoice);
            String itemName= ItemDialog.getItemName().getText();
            
            double Price = Double.parseDouble(ItemDialog.getItemPrice().getText());
            int quantity = Integer.parseInt(ItemDialog.getItemQuantity().getText());
           
          
            InvoiceLine newInLine = new  InvoiceLine(invoice,itemName,Price,quantity);
            invoice.getListofitems().add(newInLine);
            j.getTabel1().fireTableDataChanged();
              table2 line2 = new table2(invoice.getListofitems());
          j.gettable2().setModel(line2);
        line2.fireTableDataChanged();
        invDialog.dispose();
        invDialog=null;
            
           

        }*/
        
        
      
      }
    
      
      
    
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int x=j.getJFrameTable().getSelectedRow();
          if(x!= -1){
        InvoiceHeader inv=j.getAllinvoices().get(x);
        ArrayList<InvoiceLine>items=inv.getListofitems();
        j.getNumLabel().setText(""+inv.getNum());
       // j.getDateLabel().setText(inv.getDate());
        j.getjTextField6().setText(inv.getDate());
         j.getjTextField2().setText(inv.getName());
         j.getNameLabel().setText(inv.getName());
          j.getTotalLabel().setText(""+inv.getnvoiceTotal());
       
       //  ArrayList<InvoiceLine> items = inv.getListofitems();
        table2 ta =new table2( items);
         j.gettable2().setModel(ta);
             ta.fireTableDataChanged();
          }
        
  
    
    }
}