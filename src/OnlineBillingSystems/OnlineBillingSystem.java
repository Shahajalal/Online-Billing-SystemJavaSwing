/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineBillingSystems;

/**
 *
 * This project is coded by Md shahajalal.
 * Bsc in CSE NWU,Khulna.
 */
public class OnlineBillingSystem extends javax.swing.JFrame {

    /**
     * Creates new form OnlineBillingSystem
     */
    public OnlineBillingSystem() {
        setTitle("Onlie Billing System");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTxt1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTxt2 = new javax.swing.JTextField();
        jRadio1 = new javax.swing.JRadioButton();
        jRadio2 = new javax.swing.JRadioButton();
        jTxt3 = new javax.swing.JTextField();
        jTxt4 = new javax.swing.JTextField();
        jRadio5 = new javax.swing.JRadioButton();
        jTxt5 = new javax.swing.JTextField();
        jTxt6 = new javax.swing.JTextField();
        jTxt7 = new javax.swing.JTextField();
        jTxt8 = new javax.swing.JTextField();
        jTxt9 = new javax.swing.JTextField();
        jTxt10 = new javax.swing.JTextField();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jTxt11 = new javax.swing.JTextField();
        jTxt12 = new javax.swing.JTextField();
        jTxt13 = new javax.swing.JTextField();
        jTxt14 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 8));

        jTxt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTxt1.setText("Online Billing System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxt1))
        );

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asus", "Hp", "Dell", "Apple" }));

        jTxt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt2.setText("Laptop");

        jRadio1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadio1.setText("Mouse");

        jRadio2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadio2.setText("Keyboard");

        jTxt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt3.setText("Laptop cost");
        jTxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt3ActionPerformed(evt);
            }
        });

        jTxt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jTxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt4ActionPerformed(evt);
            }
        });

        jRadio5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadio5.setText("Vat");

        jTxt5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt5.setText("SubTotal");

        jTxt6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt6.setText("Tax");

        jTxt7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt7.setText("Total");

        jTxt8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jTxt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt8ActionPerformed(evt);
            }
        });

        jTxt9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jTxt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt9ActionPerformed(evt);
            }
        });

        jTxt10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jTxt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt10ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn1.setText("Calculate");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn2.setText("Clear");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtn3.setText("Exit");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jTxt11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt11.setText("Mouse cost");
        jTxt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt11ActionPerformed(evt);
            }
        });

        jTxt12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt12.setText("Keyboard cost");
        jTxt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt12ActionPerformed(evt);
            }
        });

        jTxt13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jTxt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt13ActionPerformed(evt);
            }
        });

        jTxt14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jTxt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadio1)
                            .addComponent(jRadio2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadio5)
                                .addGap(40, 40, 40)
                                .addComponent(jTxt11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxt12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxt13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTxt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxt10, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn2)
                    .addComponent(jBtn1)
                    .addComponent(jBtn3))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadio5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadio1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadio2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt3ActionPerformed

    private void jTxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt4ActionPerformed

    private void jTxt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt8ActionPerformed

    private void jTxt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt9ActionPerformed

    private void jTxt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt10ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jTxt4.setText(null);
        jTxt8.setText(null);
        jTxt9.setText(null);
        jTxt10.setText(null);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        int mouse=300;
        int keyboard=250;
        int asus=40000;
        int hp=35000;
        int dell=30000;
        int apple=100000;
        int avat=100;
        int hvat=80;
        int dvat=50;
        int apvat=500;
        int mvat=20;
        int kvat=10;
        
        //For laptop mouse and keyboard
        if((jComboBox1.getSelectedItem().equals("Asus"))&&(jRadio1.isSelected())&&(jRadio5.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(asus));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt8.setText(String.valueOf(asus+mouse+keyboard));
            jTxt9.setText(String.valueOf(avat+mvat+kvat));
            jTxt10.setText(String.valueOf(asus+mouse+avat+mvat+keyboard+kvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Hp"))&&(jRadio5.isSelected())&&(jRadio1.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(hp));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt8.setText(String.valueOf(hp+mouse+keyboard));
            jTxt9.setText(String.valueOf(hvat+mvat+kvat));
            jTxt10.setText(String.valueOf(hp+mouse+hvat+mvat+keyboard+kvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Dell"))&&(jRadio5.isSelected())&&(jRadio1.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(dell));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt8.setText(String.valueOf(dell+mouse+keyboard));
            jTxt9.setText(String.valueOf(dvat+mvat+kvat));
            jTxt10.setText(String.valueOf(dell+mouse+dvat+mvat+keyboard+kvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Apple"))&&(jRadio5.isSelected())&&(jRadio1.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(apple));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt8.setText(String.valueOf(apple+mouse+keyboard));
            jTxt9.setText(String.valueOf(apvat+mvat+kvat));
            jTxt10.setText(String.valueOf(apple+mouse+apvat+mvat+keyboard+kvat));
        }
        
        
        //For laptop and mouse
        else if((jComboBox1.getSelectedItem().equals("Asus"))&&(jRadio1.isSelected())&&(jRadio5.isSelected()))
        {
            jTxt4.setText(String.valueOf(asus));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(asus+mouse));
            jTxt9.setText(String.valueOf(avat+mvat));
            jTxt10.setText(String.valueOf(asus+mouse+avat+mvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Hp"))&&(jRadio5.isSelected())&&(jRadio1.isSelected()))
        {
            jTxt4.setText(String.valueOf(hp));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(hp+mouse));
            jTxt9.setText(String.valueOf(hvat+mvat));
            jTxt10.setText(String.valueOf(hp+mouse+hvat+mvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Dell"))&&(jRadio5.isSelected())&&(jRadio1.isSelected()))
        {
            jTxt4.setText(String.valueOf(dell));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(dell+mouse));
            jTxt9.setText(String.valueOf(dvat+mvat));
            jTxt10.setText(String.valueOf(dell+mouse+dvat+mvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Apple"))&&(jRadio5.isSelected())&&(jRadio1.isSelected()))
        {
            jTxt4.setText(String.valueOf(apple));
            jTxt13.setText(String.valueOf(mouse));
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(apple+mouse));
            jTxt9.setText(String.valueOf(apvat+mvat));
            jTxt10.setText(String.valueOf(apple+mouse+apvat+mvat));
        }
        //For laptop and keyboard
        else if((jComboBox1.getSelectedItem().equals("Asus"))&&(jRadio2.isSelected())&&(jRadio5.isSelected()))
        {
            jTxt4.setText(String.valueOf(asus));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt13.setText("0");
            jTxt8.setText(String.valueOf(asus+keyboard));
            jTxt9.setText(String.valueOf(avat+kvat));
            jTxt10.setText(String.valueOf(asus+keyboard+avat+kvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Hp"))&&(jRadio5.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(hp));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt13.setText("0");
            jTxt8.setText(String.valueOf(hp+keyboard));
            jTxt9.setText(String.valueOf(hvat+kvat));
            jTxt10.setText(String.valueOf(hp+keyboard+hvat+kvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Dell"))&&(jRadio5.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(dell));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt13.setText("0");
            jTxt8.setText(String.valueOf(dell+keyboard));
            jTxt9.setText(String.valueOf(dvat+kvat));
            jTxt10.setText(String.valueOf(dell+keyboard+dvat+kvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Apple"))&&(jRadio5.isSelected())&&(jRadio2.isSelected()))
        {
            jTxt4.setText(String.valueOf(apple));
            jTxt14.setText(String.valueOf(keyboard));
            jTxt13.setText("0");
            jTxt8.setText(String.valueOf(apple+keyboard));
            jTxt9.setText(String.valueOf(apvat+kvat));
            jTxt10.setText(String.valueOf(apple+keyboard+apvat+kvat));
        }
         //Only for laptop
        else if((jComboBox1.getSelectedItem().equals("Asus"))&&(jRadio5.isSelected()))
        {
            jTxt4.setText(String.valueOf(asus));
            jTxt13.setText("0");
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(asus));
            jTxt9.setText(String.valueOf(avat));
            jTxt10.setText(String.valueOf(asus+avat));
        }
        else if((jComboBox1.getSelectedItem().equals("Hp"))&&(jRadio5.isSelected()))
        {
            jTxt4.setText(String.valueOf(hp));
            jTxt13.setText("0");
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(hp));
            jTxt9.setText(String.valueOf(hvat));
            jTxt10.setText(String.valueOf(hp+hvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Dell"))&&(jRadio5.isSelected()))
        {
            jTxt4.setText(String.valueOf(dell));
            jTxt13.setText("0");
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(dell));
            jTxt9.setText(String.valueOf(dvat));
            jTxt10.setText(String.valueOf(dell+dvat));
        }
        else if((jComboBox1.getSelectedItem().equals("Apple"))&&(jRadio5.isSelected()))
        {
            jTxt4.setText(String.valueOf(apple));
            jTxt13.setText("0");
            jTxt14.setText("0");
            jTxt8.setText(String.valueOf(apple));
            jTxt9.setText(String.valueOf(apvat));
            jTxt10.setText(String.valueOf(apple+apvat));
        }
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jTxt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt11ActionPerformed

    private void jTxt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt12ActionPerformed

    private void jTxt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt13ActionPerformed

    private void jTxt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OnlineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnlineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnlineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnlineBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineBillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadio1;
    private javax.swing.JRadioButton jRadio2;
    private javax.swing.JRadioButton jRadio5;
    private javax.swing.JTextField jTxt1;
    private javax.swing.JTextField jTxt10;
    private javax.swing.JTextField jTxt11;
    private javax.swing.JTextField jTxt12;
    private javax.swing.JTextField jTxt13;
    private javax.swing.JTextField jTxt14;
    private javax.swing.JTextField jTxt2;
    private javax.swing.JTextField jTxt3;
    private javax.swing.JTextField jTxt4;
    private javax.swing.JTextField jTxt5;
    private javax.swing.JTextField jTxt6;
    private javax.swing.JTextField jTxt7;
    private javax.swing.JTextField jTxt8;
    private javax.swing.JTextField jTxt9;
    // End of variables declaration//GEN-END:variables
}
