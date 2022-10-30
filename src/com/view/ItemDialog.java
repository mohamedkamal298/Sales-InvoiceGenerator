/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

/**
 *
 * @author moh.kamal
 */
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ItemDialog extends JDialog{
    
    private JLabel itemNameLabel;
    private JTextField itemNameText;    
    private JLabel itemCountLabel;
    private JTextField itemCountText;    
    private JLabel itemPriceLabel;
    private JTextField itemPriceText;
    private JButton okButtton;
    private JButton cancelButton;
    
    public ItemDialog(SIGFrame frame) {
        itemNameText = new JTextField(20);
        itemNameLabel = new JLabel("Item Name");
        
        itemCountText = new JTextField(20);
        itemCountLabel = new JLabel("Item Count");
        
        itemPriceText = new JTextField(20);
        itemPriceLabel = new JLabel("Item Price");
        
        okButtton = new JButton("OK");        
        okButtton.setActionCommand("addItemOK");
        okButtton.addActionListener(frame.getcontroller());
        
        cancelButton = new JButton("Cancel");        
        cancelButton.setActionCommand("addItemCancel");        
        cancelButton.addActionListener(frame.getcontroller());
        
        setLayout(new GridLayout(6, 3));
        
        add(itemNameLabel);
        add(itemNameText);
        add(itemCountLabel);
        add(itemCountText);
        add(itemPriceLabel);
        add(itemPriceText);
        add(okButtton);
        add(cancelButton);
        
        pack();
    }

    public JTextField getItemNameText() {
        return itemNameText;
    }

    public JTextField getItemCountText() {
        return itemCountText;
    }
     public JTextField getItemPriceText() {
        return itemPriceText;
    }
}

