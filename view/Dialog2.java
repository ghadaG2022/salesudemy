/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator

public class Dialog2 extends JDialog {
        private JLabel ItemName;
    private JLabel ItemQuantity;
     private JLabel Itemprice;
    private JButton ok;
    private JButton cancel;
 private JTextField ItemNameText;
    private JTextField ItemquantityText;
     private JTextField ItempriceText;
    
    public Dialog2(NewJFrame j) {
       ItemName= new JLabel("ItemName");
        ItemNameText = new JTextField(15);
        ItemQuantity = new JLabel("ItemQuantity");
        ItemquantityText = new JTextField(15);
        Itemprice = new JLabel("Itemprice");
      ItempriceText = new JTextField(15);
         setLayout(new GridLayout(4, 4));
        ok= new JButton("OK");
        cancel = new JButton("Cancel");
        ok.setActionCommand("inlineok");
        cancel.setActionCommand("cancelInvoice");
        ok.addActionListener(j.getController());
        cancel.addActionListener(j.getController());
     
        add( ItemName);
        add(  ItemNameText);
        add(  ItemQuantity);
        add( ItemquantityText);
        add( Itemprice);
        add( ItemquantityText);
         add(ItempriceText);
        add(ok);
        add(cancel);
        
        
        pack();
        
        
    }
    
     public JTextField getItemName() {
        return ItemNameText;
    }
    

    public JTextField getItemPrice() {
        return ItempriceText;
    }
    
     public JTextField getItemQuantity() {
        return ItemquantityText;
    }
    
}
 
 */
