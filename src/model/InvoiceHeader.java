/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class InvoiceHeader {
    private int headernum;
    private String date;
    private String name;
    private ArrayList<InvoiceLine> listofitems;

    public InvoiceHeader(int num, String date, String name) {
        this.headernum = num;
        this.date = date;
        this.name = name;
    }

    public ArrayList<InvoiceLine> getListofitems() {
        if(listofitems==null)
        {
            listofitems=new ArrayList();
        }
        return listofitems;
    }

    public void setListofitems(ArrayList<InvoiceLine> listofitems) {
        this.listofitems = listofitems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return headernum;
    }

    public void setNum(int num) {
        this.headernum = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public double getnvoiceTotal(){
        double total=0;
        if(listofitems!=null){
             for(int i=0;i<listofitems.size();i++){   
    double t=listofitems.get(i).getTotal();
   total=total+t;
   return total;
        }}
       
    
     return 0;}
        
    
    //return total;
 //   double total=0.0;
   //     for(InvoiceLine item : getListofitems()){
     //       total= total + item.getTotal();
       // }
       


    
    @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + headernum + ", date=" + date + ", name=" + name + '}';
    }
    
    
    
}
