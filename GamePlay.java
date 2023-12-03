/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import java.util.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalButtonUI;
/**
 *
 * @author adnan
 */
public class GamePlay extends javax.swing.JFrame implements ActionListener{
    private final JButton[] btnArr = new JButton[9];
    public Random random = new Random();
    private int i = 0;
    private int rand;
    private int confirm;
    private boolean check;
    private boolean isRand;
    private final int min = 0;
    private final int max = 8;
    
    private void initBtnArr(){
        btnArr[0] = btn1;
        btnArr[1] = btn2;
        btnArr[2] = btn3;
        btnArr[3] = btn4;
        btnArr[4] = btn5;
        btnArr[5] = btn6;
        btnArr[6] = btn7;
        btnArr[7] = btn8;
        btnArr[8] = btn9;
    }
    
    public GamePlay() {
        initComponents();
    }
    
    private void bot(){
        if (i<8) {
            while(!isRand) {
                rand = random.nextInt(max-min+1)+min;
                if(!btnArr[rand].getText().equals("")){
                    continue;
                }
                btnArr[rand].setText("O");     
                btnArr[rand].setEnabled(false);
                btnArr[rand].setUI(new MetalButtonUI() {
                    @Override
                    protected Color getDisabledTextColor() {
                        return Color.blue;
                    }
                });
                isRand=true;
                i++;
            }
            winningCheck(); 
        }
    }
    
    private void reset(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        i = 0;
    }
    
    private void confirmPlay(String status){
        if (status.equals("Win")||status.equals("Lose")){
        confirm = JOptionPane.showConfirmDialog(this, "You " + status + "! Wanna Play Again?", "Tic Tac Toe Game",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
           switch(confirm){
            case JOptionPane.YES_OPTION -> {
                JOptionPane.showMessageDialog(this, "Let's Play!");
                reset();
                }
            case JOptionPane.NO_OPTION -> System.exit(0);
         }
        }else {
          confirm = JOptionPane.showConfirmDialog(this, status + "! Wanna Play Again?", "Tic Tac Toe Game",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
           switch(confirm){
            case JOptionPane.YES_OPTION -> {
                JOptionPane.showMessageDialog(this, "Let's Play!");
                reset();
                }
            case JOptionPane.NO_OPTION -> System.exit(0);
       }
    }
    }
            
    private void winningCheck(){
    
        if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")){
           check = true;
           confirmPlay("Win");
        }else if(btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }else if(btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }else if(btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }else if(btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }else if(btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }else if(btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }else if(btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X")){
            check = true;
            confirmPlay("Win");
        }
//        Bot Check
        else if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")){
            check = true;
           confirmPlay("Lose");
        }else if(btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }else if(btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }else if(btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }else if(btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }else if(btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }else if(btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }else if(btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O")){
            check = true;
            confirmPlay("Lose");
        }
        else if(i==9){
            check = true;
            confirmPlay("Draw");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton("");
        jPanel13 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton("");
        jPanel14 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton("");
        jPanel15 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton("");
        jPanel16 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton("");
        jPanel17 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton("");
        jPanel18 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton("");
        jPanel19 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton("");
        jPanel20 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton("");
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new java.awt.GridLayout(3, 3));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new java.awt.BorderLayout());

        btn1.setBackground(new java.awt.Color(187, 187, 187));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn1.setForeground(java.awt.Color.red);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel12.add(btn1, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new java.awt.BorderLayout());

        btn2.setBackground(new java.awt.Color(187, 187, 187));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel13.add(btn2, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new java.awt.BorderLayout());

        btn3.setBackground(new java.awt.Color(187, 187, 187));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel14.add(btn3, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new java.awt.BorderLayout());

        btn4.setBackground(new java.awt.Color(187, 187, 187));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel15.add(btn4, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new java.awt.BorderLayout());

        btn5.setBackground(new java.awt.Color(187, 187, 187));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel16.add(btn5, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel16);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(new java.awt.BorderLayout());

        btn6.setBackground(new java.awt.Color(187, 187, 187));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel17.add(btn6, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel17);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new java.awt.BorderLayout());

        btn7.setBackground(new java.awt.Color(187, 187, 187));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel18.add(btn7, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setLayout(new java.awt.BorderLayout());

        btn8.setBackground(new java.awt.Color(187, 187, 187));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel19.add(btn8, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new java.awt.BorderLayout());

        btn9.setBackground(new java.awt.Color(187, 187, 187));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel20.add(btn9, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel20);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 440, 300));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE GAME");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn1.setText("X");
        btn1.setEnabled(false);
        btn1.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck();
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn2.setText("X");
        btn2.setEnabled(false);
        btn2.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn3.setText("X");
        btn3.setEnabled(false);
        btn3.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn4.setText("X");
        btn4.setEnabled(false);
        btn4.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck();
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn5.setText("X");
        btn5.setEnabled(false);
        btn5.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
       if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn6.setText("X");
        btn6.setEnabled(false);
        btn6.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn7.setText("X");
        btn7.setEnabled(false);
        btn7.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn8.setText("X");
        btn8.setEnabled(false);
        btn8.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
        if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (null == btnArr[0]) {
            initBtnArr();
        }
        btn9.setText("X");
        btn9.setEnabled(false);
        btn9.setUI(new MetalButtonUI() {
            @Override
            protected Color getDisabledTextColor() {
                return Color.red;
            }
        });
        isRand = false;
        i++;
        winningCheck(); 
       if (!check) {
            bot();
        }
        check = false;
    }//GEN-LAST:event_btn9ActionPerformed

    
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JButton btn1;
    public static javax.swing.JButton btn2;
    public static javax.swing.JButton btn3;
    public static javax.swing.JButton btn4;
    public static javax.swing.JButton btn5;
    public static javax.swing.JButton btn6;
    public static javax.swing.JButton btn7;
    public static javax.swing.JButton btn8;
    public static javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
