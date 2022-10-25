/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import view.NewJFrame;

/**
 *
 * @author Administrator
 */
public class FileOperation {
    public int Selecingresult ;
    public File FileObject;
    
    private NewJFrame j;
   



    public FileOperation(NewJFrame frame) {
        j = frame;
    }
    private ArrayList <InvoiceHeader> listofinvoiceobjects=new ArrayList<InvoiceHeader>();
  public  ArrayList <InvoiceHeader> FileRead(){
       JFileChooser fc = new JFileChooser();
        JFileChooser fc2 = new JFileChooser();
       Selecingresult = fc.showOpenDialog(null);
       int Selecingresult2 = fc2.showOpenDialog(null);
     
            if (Selecingresult  == JFileChooser.APPROVE_OPTION  ) {
                FileObject = fc.getSelectedFile();
               String Pathx =FileObject.getPath();
        
               if (Pathx.contains(".csv"))
               {
                     
                      
                  try {
                          BufferedReader READER = new BufferedReader(new FileReader(Pathx));
                          String line;
            
            while ((line = READER.readLine()) != null) {
                System.out.println(line);
                String row[] = line.split(",");
                int num = Integer.parseInt(row[0]);
                String date = row[1];
                String name = row[2];
                InvoiceHeader invoice = new InvoiceHeader(num, date, name);
                listofinvoiceobjects.add(invoice);
              
                
            }
        }
        catch (Exception e)
        {System.out.print("ddfd");
        e.printStackTrace();}

                      
                   
               }
               else{ 
                   System.out.print("wrong file format");
                    JOptionPane.showMessageDialog(j,"Wrong  File Format");
               }
               
                   }
            
            if (Selecingresult2  == JFileChooser.APPROVE_OPTION  ) {
           File FileObject2 = fc2.getSelectedFile();
               String Path2 =FileObject2.getAbsolutePath();
        
               if (Path2.contains(".csv"))
               {
                      
                      try {
                        BufferedReader READER2 = new BufferedReader(new FileReader(Path2));
                          String line2;
          //  READER2 = new BufferedReader(new FileReader(File2));
            while ((line2 = READER2.readLine()) != null) {
                String row[] = line2.split(",");
                int num = Integer.parseInt(row[0]);
                String itemname = row[1];
                 double price = Double.parseDouble(row[2]);
                 int quntity = Integer.parseInt(row[3]);
                  InvoiceHeader invoiceheaderobject=getinvoiceheaderobject(num);
                  InvoiceLine item = new InvoiceLine(invoiceheaderobject,itemname,price,quntity);
                invoiceheaderobject.getListofitems().add(item);
               
                
            }
                       }
            catch(Exception e){}
               } 
                else{ 
                   System.out.print("wrong file format");
                //    JOptionPane.showMessageDialog(j, "Please insert Headers File then Lines File"); 
               }
               }
               
             return listofinvoiceobjects;
              
                   }

    private InvoiceHeader getinvoiceheaderobject(int num) {
      
    
       for (int count = 0; count < listofinvoiceobjects.size(); count++) {

           int headerID = listofinvoiceobjects.get(count).getNum();
           if (headerID == num) {
               InvoiceHeader invoiceobj = listofinvoiceobjects.get(count);
              
               return invoiceobj;
           }

  }
       
       return null;
    }
    
 /*  public ArrayList<InvoiceHeader> sendarrattoframe() {
      
        return listofinvoiceobjects;
      
}*/

    public void savefile(ArrayList<InvoiceHeader> Invoiceheaders) {
      JFileChooser fc3= new  JFileChooser();
       JFileChooser fc4= new  JFileChooser();
        int Selecingresult1 = fc3.showOpenDialog(null);
        int Selecingresult2 = fc4.showOpenDialog(null);
          if (Selecingresult1  == JFileChooser.APPROVE_OPTION  ) {
                FileObject = fc3.getSelectedFile();
               String Pathx =FileObject.getAbsolutePath();
        
               if (Pathx.contains(".csv"))
               {
                   
                     
       FileWriter myWriter=null;
                    try {
                     myWriter = new FileWriter(Pathx);
                    } catch (IOException ex) {
                        Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
       for(InvoiceHeader header: Invoiceheaders){
          try {
              myWriter.write(" "+header.getNum()+","+header.getName()+","+header.getDate()+"");
               myWriter.write("\n");
          } catch (IOException ex) {
              Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
          }
                      
                      
                      
                      
                      
               }
                    try {
                        myWriter.close();
                    } catch (IOException ex) {
                        Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
    }
               else{System.out.print("wrong");
                  JOptionPane.showMessageDialog(j,"Wrong  File Format");}
               
          }
        
    
          
        if (Selecingresult2  == JFileChooser.APPROVE_OPTION  ) {
                    File FileObject2 = fc4.getSelectedFile();
               String Pathx2 =FileObject2.getAbsolutePath();
        
               if (Pathx2.contains(".csv"))
               {
                      
                       FileWriter myWriter2=null;
                    try {
                     myWriter2 = new FileWriter(Pathx2);
                    } catch (IOException ex) {
                        Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
       for(InvoiceHeader header: Invoiceheaders){
          try {
              for(int i=0;i<header.getListofitems().size();i++)
              {myWriter2.write(" "+header.getNum()+","+ header.getListofitems().get(i).getItemname()+","+header.getListofitems().get(i).getPrice()+","+header.getListofitems().get(i).getQuantity()+"");
         myWriter2.write("\n"); }
          } catch (IOException ex) {
              Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
          }
                      
                      
                      
                      
                      
               }
                    try {
                        myWriter2.close();
                    } catch (IOException ex) {
                        Logger.getLogger(FileOperation.class.getName()).log(Level.SEVERE, null, ex);
                    }
      
                      
                      
                      
                      
               }
       
      
  
 
}
    
}
    
    
    
    
    
    
    
    
    
    
    
     public  ArrayList <InvoiceHeader> FileRead2(){
       
 try {
          BufferedReader READER = new BufferedReader(new FileReader("src/csv/InvoiceHeader.csv"));
          String line;                
          while ((line = READER.readLine()) != null) {
                System.out.println(line);
                String row[] = line.split(",");
                int num = Integer.parseInt(row[0]);
                String date = row[1];
                String name = row[2];
                InvoiceHeader invoice = new InvoiceHeader(num, date, name);
                listofinvoiceobjects.add(invoice);
              
          }
          BufferedReader READER2 = new BufferedReader(new FileReader("src/csv/InvoiceLine.csv"));
         String line2;
            while ((line2 = READER2.readLine()) != null) {
                String row2[] = line2.split(",");
                int num2 = Integer.parseInt(row2[0]);
                String itemname = row2[1];
                 double price = Double.parseDouble(row2[2]);
                 int quntity = Integer.parseInt(row2[3]);
                  InvoiceHeader invoiceheaderobject=getinvoiceheaderobject(num2);
                  InvoiceLine item = new InvoiceLine(invoiceheaderobject,itemname,price,quntity);
                invoiceheaderobject.getListofitems().add(item);}
  
}
   
        catch (Exception e)
        {System.out.print("ddfd");
        e.printStackTrace();}
  return listofinvoiceobjects;

     }     
    
    
    
    
    
    
    
    
    
    
    
}
    
    
     
