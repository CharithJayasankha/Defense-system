/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import defencesystem.Starter;
import enums.Strength;
import interfaces.Obsever;
import javax.swing.JOptionPane;
import utils.SuperDefence;

/**
 *
 * @author 94705
 */
public class Helicopter extends SuperDefence implements Obsever{
    private boolean isPosition;
    private String messages = "";
    /**
     * Creates new form Helicopter
     */
    public Helicopter() {
        initComponents();
        setVisible(true);
        soldiersSpinner.setValue(12);
        ammoSpinner.setValue(56);
        missileSpinner.setValue(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        areClearLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inboxMsg = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        msgBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendBtn = new javax.swing.JButton();
        isPositionCb = new javax.swing.JCheckBox();
        missileBtn = new javax.swing.JButton();
        shootBtn = new javax.swing.JButton();
        laserBtn = new javax.swing.JButton();
        energySlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        soldiersSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ammoSpinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        missileSpinner = new javax.swing.JSpinner();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter");
        setResizable(false);

        areClearLabel.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        areClearLabel.setText("Area Not cleared");

        inboxMsg.setEditable(false);
        inboxMsg.setColumns(20);
        inboxMsg.setRows(5);
        jScrollPane1.setViewportView(inboxMsg);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setText("Inbox Messages");

        msgBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Send Messages");

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        isPositionCb.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        isPositionCb.setText("Position");
        isPositionCb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                isPositionCbStateChanged(evt);
            }
        });
        isPositionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPositionCbActionPerformed(evt);
            }
        });

        missileBtn.setText("Missile operations");
        missileBtn.setEnabled(false);
        missileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                missileBtnActionPerformed(evt);
            }
        });

        shootBtn.setText("Shoot");
        shootBtn.setEnabled(false);
        shootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootBtnActionPerformed(evt);
            }
        });

        laserBtn.setText("Laser operations");
        laserBtn.setEnabled(false);
        laserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laserBtnActionPerformed(evt);
            }
        });

        energySlider.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        energySlider.setMajorTickSpacing(20);
        energySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        energySlider.setPaintLabels(true);
        energySlider.setValue(100);
        energySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                energySliderStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Energy");

        soldiersSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldiersSpinnerStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Soldiers");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("Ammo");

        ammoSpinner.setPreferredSize(new java.awt.Dimension(70, 22));
        ammoSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammoSpinnerStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Missile");

        missileSpinner.setPreferredSize(new java.awt.Dimension(70, 22));
        missileSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                missileSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sendBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(laserBtn)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(msgBox)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(areClearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(isPositionCb))
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(missileBtn)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(missileSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soldiersSpinner)
                                    .addComponent(ammoSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(energySlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(48, 48, 48))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areClearLabel)
                            .addComponent(isPositionCb))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(soldiersSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ammoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(missileSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(energySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(missileBtn)
                    .addComponent(shootBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendBtn)
                    .addComponent(laserBtn))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void msgBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msgBoxActionPerformed

    private void isPositionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPositionCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPositionCbActionPerformed

    private void missileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_missileBtnActionPerformed
       int value = (int)missileSpinner.getValue();
        value--;
        missileSpinner.setValue(value);
    }//GEN-LAST:event_missileBtnActionPerformed

    private void shootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootBtnActionPerformed
        int value = (int)ammoSpinner.getValue();
        value--;
        ammoSpinner.setValue(value);
    }//GEN-LAST:event_shootBtnActionPerformed

    private void laserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laserBtnActionPerformed

    private void isPositionCbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_isPositionCbStateChanged
        isPosition = isPositionCb.isSelected();
        if(isPosition == false){
            shootBtn.setEnabled(false);
            missileBtn.setEnabled(false);
            laserBtn.setEnabled(false);
        }
    }//GEN-LAST:event_isPositionCbStateChanged

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        if(msgBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Message...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
        Starter.mainController.setMessages(" (Helicopter) - "+msgBox.getText());
        msgBox.setText("");
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    private void soldiersSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_soldiersSpinnerStateChanged
        Starter.mainController.setHelicopterValues(1,(int)soldiersSpinner.getValue());
    }//GEN-LAST:event_soldiersSpinnerStateChanged

    private void ammoSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ammoSpinnerStateChanged
        Starter.mainController.setHelicopterValues(2,(int)ammoSpinner.getValue());
    }//GEN-LAST:event_ammoSpinnerStateChanged

    private void missileSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_missileSpinnerStateChanged
        Starter.mainController.setHelicopterValues(3,(int)missileSpinner.getValue());
    }//GEN-LAST:event_missileSpinnerStateChanged

    private void energySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_energySliderStateChanged
        Starter.mainController.setHelicopterValues(4,energySlider.getValue());
    }//GEN-LAST:event_energySliderStateChanged

    //==================================================================
    //area clear msg
    @Override
    public void sendAreaClearedMsg(boolean value){
    areClearLabel.setText(value == true?"Area cleared":"Area Not cleard");
    }
    
    @Override
    public void sendMessages(String message){
        messages += message+"\n";
       inboxMsg.setText(messages);
    }
     
    //enable options
    @Override
    public void enableOptions(Strength strength){
        shootBtn.setEnabled(false);
        missileBtn.setEnabled(false);
        laserBtn.setEnabled(false);
        
        if(isPosition){
            switch(strength){
    //            LOW, MEDIUM, HIGH, STRONG, CLOSED
                case CLOSED:
                    break;
                case LOW:
                    shootBtn.setEnabled(true);
                    break;
                case MEDIUM:
                    shootBtn.setEnabled(true);
                    missileBtn.setEnabled( true);
                    break;
                case HIGH:
                    shootBtn.setEnabled(true);
                    missileBtn.setEnabled( true);
                    laserBtn.setEnabled(true);
                    break;
                case STRONG:
                    shootBtn.setEnabled(true);
                    missileBtn.setEnabled( true);
                    laserBtn.setEnabled(true);
                    break;      
            }
        }
    }   
    
    public void setPrivateMessage(String message){
        messages += message+"\n";
        inboxMsg.setText(messages);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner ammoSpinner;
    private javax.swing.JLabel areClearLabel;
    private javax.swing.JSlider energySlider;
    private javax.swing.JTextArea inboxMsg;
    private javax.swing.JCheckBox isPositionCb;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton laserBtn;
    private javax.swing.JButton missileBtn;
    private javax.swing.JSpinner missileSpinner;
    private javax.swing.JTextField msgBox;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton shootBtn;
    private javax.swing.JSpinner soldiersSpinner;
    // End of variables declaration//GEN-END:variables
}
