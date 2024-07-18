/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import enums.Strength;
import interfaces.Obsever;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author 94705
 */
public class MainController extends javax.swing.JFrame {

        private ArrayList <Obsever> unitList;
        private int msgCount = 0;
        private int sendMsgCount = 0;
        private boolean isSendHelicopter = false;
        private boolean isSendSubmarine = false;
        private boolean isSendTank = false;
        
    /**
     * Creates new form MainController
     */
    public MainController() {
        unitList = new ArrayList<>();
        initComponents();
        sendPrivateBox(false);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        areaClearCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        inboxMsg = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        msgBox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        sendBtn = new javax.swing.JButton();
        positionSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hS = new javax.swing.JLabel();
        tS = new javax.swing.JLabel();
        sS = new javax.swing.JLabel();
        sA = new javax.swing.JLabel();
        tA = new javax.swing.JLabel();
        hA = new javax.swing.JLabel();
        hM = new javax.swing.JLabel();
        tM = new javax.swing.JLabel();
        sM = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sO = new javax.swing.JLabel();
        hE = new javax.swing.JLabel();
        tE = new javax.swing.JLabel();
        sE = new javax.swing.JLabel();
        sendPrivateCb = new javax.swing.JCheckBox();
        hCheckBox = new javax.swing.JCheckBox();
        tCheckBox = new javax.swing.JCheckBox();
        sCheckBox = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Controller");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Defense System");

        areaClearCheckBox.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        areaClearCheckBox.setText("Area Clear");
        areaClearCheckBox.setFocusable(false);
        areaClearCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearCheckBoxActionPerformed(evt);
            }
        });

        inboxMsg.setEditable(false);
        inboxMsg.setColumns(20);
        inboxMsg.setRows(5);
        jScrollPane1.setViewportView(inboxMsg);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Inbox Messages");

        msgBox.setColumns(20);
        msgBox.setRows(5);
        jScrollPane2.setViewportView(msgBox);

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Send Messages");

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        positionSlider.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        positionSlider.setMajorTickSpacing(10);
        positionSlider.setMinorTickSpacing(10);
        positionSlider.setPaintLabels(true);
        positionSlider.setValue(0);
        positionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionSliderStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Position");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Live Updates...");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Units");

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Helicopter");

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setText("Tank");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("Submarine");

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Soldiers");

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Ammo");

        jLabel12.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Missiles");

        jLabel13.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Oxygen");

        jLabel14.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Energy");

        hS.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        hS.setText("0");

        tS.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tS.setText("0");

        sS.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        sS.setText("0");

        sA.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        sA.setText("0");

        tA.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tA.setText("0");

        hA.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        hA.setText("0");

        hM.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        hM.setText("0");

        tM.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tM.setText("0");

        sM.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        sM.setText("0");

        jLabel24.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel24.setText("100%");

        jLabel25.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel25.setText("100%");

        sO.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        sO.setText("100%");

        hE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        hE.setText("100%");

        tE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tE.setText("100%");

        sE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        sE.setText("100%");

        sendPrivateCb.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        sendPrivateCb.setText("Send Private");
        sendPrivateCb.setFocusable(false);
        sendPrivateCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sendPrivateCbStateChanged(evt);
            }
        });
        sendPrivateCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrivateCbActionPerformed(evt);
            }
        });

        hCheckBox.setText("H");
        hCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hCheckBoxStateChanged(evt);
            }
        });
        hCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hCheckBoxActionPerformed(evt);
            }
        });

        tCheckBox.setText("T");
        tCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tCheckBoxStateChanged(evt);
            }
        });

        sCheckBox.setText("S");
        sCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sCheckBoxStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areaClearCheckBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(175, 175, 175))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(hCheckBox)
                                    .addGap(18, 18, 18)
                                    .addComponent(tCheckBox)
                                    .addGap(18, 18, 18)
                                    .addComponent(sCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sendBtn))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sendPrivateCb)
                                    .addGap(8, 8, 8))))))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(areaClearCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(sendPrivateCb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hCheckBox)
                                .addComponent(tCheckBox)
                                .addComponent(sCheckBox))
                            .addComponent(sendBtn))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hS)
                    .addComponent(hA)
                    .addComponent(hM)
                    .addComponent(jLabel24)
                    .addComponent(hE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tS)
                    .addComponent(tA)
                    .addComponent(tM)
                    .addComponent(jLabel25)
                    .addComponent(tE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sS)
                    .addComponent(sA)
                    .addComponent(sM)
                    .addComponent(sO)
                    .addComponent(sE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaClearCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearCheckBoxActionPerformed
        for (Obsever obsever : unitList) {
            obsever.sendAreaClearedMsg(areaClearCheckBox.isSelected());
        }
    }//GEN-LAST:event_areaClearCheckBoxActionPerformed

    private void positionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionSliderStateChanged
        int value = positionSlider.getValue();
        Strength strength = Strength.CLOSED;
        
        if(value == 0) strength = Strength.CLOSED;
        else if(value >= 1 & value <= 25) strength = Strength.LOW;
        else if(value >= 26 & value <= 50) strength = Strength.MEDIUM;
        else if(value >= 51 & value <= 75) strength = Strength.HIGH;
        else if(value >= 76 & value <= 100) strength = Strength.STRONG;
        
        for (Obsever obsever : unitList) {
            obsever.enableOptions(strength);
        }
        
    }//GEN-LAST:event_positionSliderStateChanged

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        
        if(msgBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Message...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(sendPrivateCb.isSelected()){
                if(isSendHelicopter){
                   Helicopter helicopter =  (Helicopter)unitList.get(0);
                   helicopter.setPrivateMessage(" (private) - "+msgBox.getText());
                   hCheckBox.setSelected(false);
                }
                if(isSendTank){
                    Tank tank = (Tank)unitList.get(1);
                    tank.setPrivateMessage(" (private) - "+msgBox.getText()); 
                    System.out.println("tank");
                    tCheckBox.setSelected(false);
                }
                if(isSendSubmarine){
                    Submarine submarine = (Submarine)unitList.get(2);
                    submarine.setPrivateMessage(" (private) - "+msgBox.getText());
                    sCheckBox.setSelected(false);            
                }
            }else{
                sendMsgCount++;
                for (Obsever obsever : unitList) {
                obsever.sendMessages(sendMsgCount+" - "+msgBox.getText());
                }
            }
            msgBox.setText("");
    }//GEN-LAST:event_sendBtnActionPerformed
    }
    private void sendPrivateCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrivateCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendPrivateCbActionPerformed

    private void hCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hCheckBoxActionPerformed

    private void sendPrivateCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sendPrivateCbStateChanged
        sendPrivateBox(sendPrivateCb.isSelected());
    }//GEN-LAST:event_sendPrivateCbStateChanged

    private void hCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hCheckBoxStateChanged
        isSendHelicopter = hCheckBox.isSelected();
    }//GEN-LAST:event_hCheckBoxStateChanged

    private void tCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tCheckBoxStateChanged
        isSendTank = tCheckBox.isSelected();
    }//GEN-LAST:event_tCheckBoxStateChanged

    private void sCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sCheckBoxStateChanged
           isSendSubmarine = sCheckBox.isSelected();
    }//GEN-LAST:event_sCheckBoxStateChanged

    
    public void addToList(Obsever obsever){
        unitList.add(obsever);
    }
    
    public void setMessages(String messages){
        msgCount++;
        inboxMsg.append(msgCount+messages+"\n");
    }
    
    public void setHelicopterValues(int id,int value){
        switch(id){
            case 1:
                hS.setText(value > -1?Integer.toString(value):"0");
                break;
            case 2:
                hA.setText(value > -1?Integer.toString(value):"0");
                break;
            case 3:
               hM.setText(value > -1?Integer.toString(value):"0");
               break;
             case 4:
               hE.setText(Integer.toString(value)+"%");
               break;
        }
    }
    
    public void setTankValues(int id,int value){
        switch(id){
            case 1:
                tS.setText(value > -1?Integer.toString(value):"0");
                break;
            case 2:
                tA.setText(value > -1?Integer.toString(value):"0");
                break;
            case 3:
               tM.setText(value > -1?Integer.toString(value):"0");
               break;
             case 4:
               tE.setText(Integer.toString(value)+"%");
               break;
        }
    }
    
    public void setSubmarineValues(int id,int value){
        switch(id){
            case 1:
                sS.setText(value > -1?Integer.toString(value):"0");
                break;
            case 2:
                sA.setText(value > -1?Integer.toString(value):"0");
                break;
            case 3:
               sM.setText(value > -1?Integer.toString(value):"0");
               break;
             case 4:
               sE.setText(Integer.toString(value)+"%");
               break;
             case 5:
               sO.setText(Integer.toString(value)+"%");
               break;
        }
    }
    
    private void sendPrivateBox(boolean value){
        hCheckBox.setVisible(value);
        tCheckBox.setVisible(value);
        sCheckBox.setVisible(value);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox areaClearCheckBox;
    private javax.swing.JLabel hA;
    private javax.swing.JCheckBox hCheckBox;
    private javax.swing.JLabel hE;
    private javax.swing.JLabel hM;
    private javax.swing.JLabel hS;
    private javax.swing.JTextArea inboxMsg;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea msgBox;
    private javax.swing.JSlider positionSlider;
    private javax.swing.JLabel sA;
    private javax.swing.JCheckBox sCheckBox;
    private javax.swing.JLabel sE;
    private javax.swing.JLabel sM;
    private javax.swing.JLabel sO;
    private javax.swing.JLabel sS;
    private javax.swing.JButton sendBtn;
    private javax.swing.JCheckBox sendPrivateCb;
    private javax.swing.JLabel tA;
    private javax.swing.JCheckBox tCheckBox;
    private javax.swing.JLabel tE;
    private javax.swing.JLabel tM;
    private javax.swing.JLabel tS;
    // End of variables declaration//GEN-END:variables
}
