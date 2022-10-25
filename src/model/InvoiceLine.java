/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Administrator
 */
public class InvoiceLine {
    private InvoiceHeader inv; 
    private String itemname;
   private double price;
   private double total; 
   private int inlinenumber;
   private int quantity;
    public InvoiceLine(InvoiceHeader inv, String itemname, double price,int quantity) {
        this.inv = inv;
        this.itemname = itemname;
        this.price = price;
        this.quantity=quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public double getTotal() {
     
        
        total=price*quantity;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getInlinenumber() {
        return inlinenumber;
    }

    public void setInlinenumber(int inlinenumber) {
        this.inlinenumber = inlinenumber;
    }
    
    
}
