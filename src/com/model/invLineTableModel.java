/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author moh.kamal
 */
public class invLineTableModel extends AbstractTableModel {
     private ArrayList<InvoiceLine> lineData;
    private String[] cols = {"Item Name","Item Price", "Count" , "Total Price"};
    
    public invLineTableModel(ArrayList<InvoiceLine> data) {
        this.lineData = data;
    }

    public ArrayList<InvoiceLine> getLineData() {
        return lineData;
    }

    public int getRowCount() {
        return lineData.size();
    }
    
    public String getColumnName(int column) {
        return cols[column];
    }
    public int getColumnCount() {
        return cols.length;
    }

    public Object getValueAt(int rowIndx, int columnIndx) {
        InvoiceLine invoiceItem = lineData.get(rowIndx);
        switch (columnIndx){
            case 0:
                return invoiceItem.getName();
            case 1:
                return invoiceItem.getPrice();
            case 2:
                return invoiceItem.getCount();
            case 3:
                return invoiceItem.getTotal();
        }
        return "";

    }
}
