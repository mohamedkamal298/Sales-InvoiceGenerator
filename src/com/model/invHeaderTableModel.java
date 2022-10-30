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
public class invHeaderTableModel extends AbstractTableModel{
     private ArrayList<InvoiceHeader> invdata;

   
    private String[] cols = {"No.", "Date", "Customer", "Total"};

    public invHeaderTableModel(ArrayList<InvoiceHeader> invdata) {
        this.invdata = invdata;
    }

   
    public ArrayList<InvoiceHeader> getinvData() {
        return invdata;
    }
    
    public int getRowCount() {
        return invdata.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndx, int columnIndx) {
        InvoiceHeader invHeader = invdata.get(rowIndx);
        switch (columnIndx){
            case 0:
                return invHeader.getNum();
            case 1:
                return invHeader.getDate();
            case 2:
                return invHeader.getName();
            case 3:
                return invHeader.getTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int col) {
        return cols[col]; //To change body of generated methods, choose Tools | Templates.
    }
}
