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

public class Dialog1 extends JDialog{
    
    private JLabel custNameLabel;
    private JLabel dateLabel;
    private JButton ok;
    private JButton cancel;
 private JTextField customerName;
    private JTextField invoiceDate;
    
    public Dialog1(NewJFrame j) {
        custNameLabel= new JLabel("Customer Name:");
        customerName = new JTextField(30);
        dateLabel = new JLabel("Date:");
        invoiceDate = new JTextField(30);
        ok= new JButton("OK");
        cancel = new JButton("Cancel");
        ok.setActionCommand("ok");
        cancel.setActionCommand("cancelInvoice");
        ok.addActionListener(j.getController());
        cancel.addActionListener(j.getController());
        setLayout(new GridLayout(4, 4));
        add(custNameLabel);
        add(customerName);
        add(dateLabel);
        add(invoiceDate);
        add(ok);
        add(cancel);
        
        
        pack();
        
        
    }
    
     public JTextField getInvoiceDate() {
        return invoiceDate;
    }
    

    public JTextField getCustomerName() {
        return customerName;
    }

   
    

}
*/