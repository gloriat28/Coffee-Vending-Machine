/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.views;

import java.awt.Color;
import javax.swing.JSlider;

/**
 *
 * @author 
 */
public class MachineStatsGUI extends javax.swing.JFrame {
    
    private static MachineStatsGUI instance;
    
    public static MachineStatsGUI getInstance(){
        if(instance != null)
            return instance;
        else
            return instance=new MachineStatsGUI();
    }
    
    
    /**
     * Creates new form MachineStatsGUI
     */
    private MachineStatsGUI() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                setLocation(CoffeeMachineGUI.getCoffeeMachineGUI().getX() + CoffeeMachineGUI.getCoffeeMachineGUI().getWidth(), CoffeeMachineGUI.getCoffeeMachineGUI().getY());
            }
        });
        initComponents();
    }
    
    public void setTemp(String tempreture) {
        this.tempreture.setText(tempreture);
    }

    public void setStatus(String status) {
        this.status.setText(status);
        if (status == "COOLING") {
            this.status.setForeground(Color.BLUE);
        } else if (status == "HEATING") {
            this.status.setForeground(Color.RED);
        } else {
            this.status.setForeground(Color.BLACK);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SugerSlider = new javax.swing.JSlider();
        WaterSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MilkSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        ChocolateSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        LargeSlider = new javax.swing.JSlider();
        SmallSlider = new javax.swing.JSlider();
        MediumSlider = new javax.swing.JSlider();
        CoffeeSlider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tempreture = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SugerSlider.setMaximum(20);
        SugerSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        SugerSlider.setValue(0);
        SugerSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SugerSliderStateChanged(evt);
            }
        });
        getContentPane().add(SugerSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 310));

        WaterSlider.setMaximum(200);
        WaterSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        WaterSlider.setValue(0);
        WaterSlider.setPreferredSize(new java.awt.Dimension(30, 150));
        getContentPane().add(WaterSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 40, 310));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sugar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Water");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 70, 40));

        MilkSlider.setMaximum(20);
        MilkSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        MilkSlider.setValue(0);
        getContentPane().add(MilkSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 40, 140));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chocolate");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 100, 40));

        ChocolateSlider.setMaximum(20);
        ChocolateSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        ChocolateSlider.setValue(0);
        getContentPane().add(ChocolateSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 40, 140));

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Coffee");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 80, 40));

        LargeSlider.setMaximum(30);
        LargeSlider.setValue(0);
        getContentPane().add(LargeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, 40));

        SmallSlider.setMaximum(30);
        SmallSlider.setValue(0);
        getContentPane().add(SmallSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 40));

        MediumSlider.setMaximum(30);
        MediumSlider.setValue(0);
        getContentPane().add(MediumSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, 40));

        CoffeeSlider.setMaximum(20);
        CoffeeSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        CoffeeSlider.setToolTipText("");
        CoffeeSlider.setValue(0);
        getContentPane().add(CoffeeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 40, 140));

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Milk");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 50, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Large");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medium");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Small");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 60, 40));

        tempreture.setEditable(false);
        tempreture.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tempreture.setText("temperature");
        tempreture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempretureActionPerformed(evt);
            }
        });
        getContentPane().add(tempreture, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 130, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Water Tempreture");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        status.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 0));
        status.setText("Status");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/views/coffee_minimal_wallpapers_by_webmozg-d3d9qfb - Copy.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SugerSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SugerSliderStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SugerSliderStateChanged

    private void tempretureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempretureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempretureActionPerformed

    /**
     * @param args the command line arguments
     */

    public JSlider getChoclateSlider() {
        return ChocolateSlider;
    }

    public JSlider getCoffeeSlider() {
        return CoffeeSlider;
    }

    public JSlider getLargeSlider() {
        return LargeSlider;
    }

    public JSlider getMediumSlider() {
        return MediumSlider;
    }

    public JSlider getMilkSlider() {
        return MilkSlider;
    }

    public JSlider getSmallSlider() {
        return SmallSlider;
    }

    public JSlider getSugerSlider() {
        return SugerSlider;
    }

    public JSlider getWaterSlider() {
        return WaterSlider;
    }

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ChocolateSlider;
    private javax.swing.JSlider CoffeeSlider;
    private javax.swing.JSlider LargeSlider;
    private javax.swing.JSlider MediumSlider;
    private javax.swing.JSlider MilkSlider;
    private javax.swing.JSlider SmallSlider;
    private javax.swing.JSlider SugerSlider;
    private javax.swing.JSlider WaterSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tempreture;
    // End of variables declaration//GEN-END:variables
}
