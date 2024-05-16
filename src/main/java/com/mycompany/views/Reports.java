package com.mycompany.views;

import com.mycompany.ilib.DAOLendingsImpl;
import com.mycompany.interfaces.DAOLendings;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reports extends javax.swing.JPanel implements ActionListener {

    public Reports() {
        initComponents();
        InitStyles();
        LoadLendings();
    }
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        textSearch.putClientProperty("JTextField.placeholderText", "Ingrese el User ID ó Book ID a buscar.");
    }
    
    private void LoadLendings() {
        try {
            DAOLendings dao = new DAOLendingsImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            // Limpiamos tabla
            model.setRowCount(0);
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getUser_id(), u.getBook_id(), u.getDate_out(), u.getDate_return()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Reportes");

        jButton2.setBackground(new java.awt.Color(18, 90, 173));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Book ID", "Fecha de Salida", "Fecha de Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        textSearch = new JTextField();
        
        searchButton = new JButton();
        searchButton.addActionListener(this);
        searchButton.setText("Buscar");
        searchButton.setForeground(Color.WHITE);
        searchButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        searchButton.setBorderPainted(false);
        searchButton.setBackground(new Color(18, 90, 173));
        GroupLayout gl_bg = new GroupLayout(bg);
        gl_bg.setHorizontalGroup(
        	gl_bg.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_bg.createSequentialGroup()
        			.addGap(10)
        			.addComponent(title))
        		.addGroup(gl_bg.createSequentialGroup()
        			.addGap(10)
        			.addComponent(textSearch, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(searchButton))
        		.addGroup(gl_bg.createSequentialGroup()
        			.addGap(10)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE))
        		.addGroup(gl_bg.createSequentialGroup()
        			.addGap(591)
        			.addComponent(jButton2))
        );
        gl_bg.setVerticalGroup(
        	gl_bg.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_bg.createSequentialGroup()
        			.addGap(11)
        			.addComponent(title)
        			.addGap(5)
        			.addGroup(gl_bg.createParallelGroup(Alignment.LEADING)
        				.addComponent(textSearch, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(8)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(jButton2))
        );
        bg.setLayout(gl_bg);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        //nothing
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoadLendings();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    private JTextField textSearch;
    private JButton searchButton;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == searchButton) {
			actionPerformedSearchButton(e);
		}
	}
	protected void actionPerformedSearchButton(ActionEvent e) {
		try {
            DAOLendings dao = new DAOLendingsImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(textSearch.getText()).forEach((u) -> model.addRow(new Object[]{u.getUser_id(), u.getBook_id(), u.getDate_out(), u.getDate_return()}));
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
	}
}