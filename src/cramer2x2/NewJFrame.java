/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cramer2x2;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
/**
 *
 * @author humer
 */

public class NewJFrame extends javax.swing.JFrame  {
    int xMouse,yMouse;
    MetodoCramer m1 = new MetodoCramer();
    public NewJFrame() {
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

        background = new javax.swing.JPanel();
        valor03 = new javax.swing.JTextField();
        valor00 = new javax.swing.JTextField();
        valor01 = new javax.swing.JTextField();
        valor02 = new javax.swing.JTextField();
        valor10 = new javax.swing.JTextField();
        valor11 = new javax.swing.JTextField();
        valor13 = new javax.swing.JTextField();
        valor20 = new javax.swing.JTextField();
        valor21 = new javax.swing.JTextField();
        valor23 = new javax.swing.JTextField();
        valor12 = new javax.swing.JTextField();
        valor22 = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        A = new javax.swing.JPanel();
        separador3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        separador6 = new javax.swing.JSeparator();
        separador5 = new javax.swing.JSeparator();
        separador4 = new javax.swing.JSeparator();
        salir1 = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        B = new javax.swing.JPanel();
        respuesta3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JLabel();
        respuesta2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valor03.setForeground(java.awt.Color.gray);
        valor03.setText("0");
        valor03.setBorder(null);
        valor03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor03MousePressed(evt);
            }
        });
        background.add(valor03, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 40, 20));

        valor00.setForeground(java.awt.Color.gray);
        valor00.setText("0");
        valor00.setBorder(null);
        valor00.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        valor00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor00MousePressed(evt);
            }
        });
        background.add(valor00, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 40, 20));

        valor01.setForeground(java.awt.Color.gray);
        valor01.setText("0");
        valor01.setBorder(null);
        valor01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor01MousePressed(evt);
            }
        });
        background.add(valor01, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 40, 20));

        valor02.setForeground(java.awt.Color.gray);
        valor02.setText("0");
        valor02.setBorder(null);
        valor02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor02MousePressed(evt);
            }
        });
        background.add(valor02, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 40, 20));

        valor10.setForeground(java.awt.Color.gray);
        valor10.setText("0");
        valor10.setBorder(null);
        valor10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor10MousePressed(evt);
            }
        });
        background.add(valor10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 40, 20));

        valor11.setForeground(java.awt.Color.gray);
        valor11.setText("0");
        valor11.setBorder(null);
        valor11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor11MousePressed(evt);
            }
        });
        background.add(valor11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 40, 20));

        valor13.setForeground(java.awt.Color.gray);
        valor13.setText("0");
        valor13.setBorder(null);
        valor13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor13MousePressed(evt);
            }
        });
        background.add(valor13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 40, 20));

        valor20.setForeground(java.awt.Color.gray);
        valor20.setText("0");
        valor20.setBorder(null);
        valor20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor20MousePressed(evt);
            }
        });
        background.add(valor20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 40, 20));

        valor21.setForeground(java.awt.Color.gray);
        valor21.setText("0");
        valor21.setBorder(null);
        valor21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor21MousePressed(evt);
            }
        });
        background.add(valor21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 40, 20));

        valor23.setForeground(java.awt.Color.gray);
        valor23.setText("0");
        valor23.setBorder(null);
        valor23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor23MousePressed(evt);
            }
        });
        background.add(valor23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 40, 20));

        valor12.setForeground(java.awt.Color.gray);
        valor12.setText("0");
        valor12.setBorder(null);
        valor12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor12MousePressed(evt);
            }
        });
        background.add(valor12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 40, 20));

        valor22.setForeground(java.awt.Color.gray);
        valor22.setText("0");
        valor22.setBorder(null);
        valor22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                valor22MousePressed(evt);
            }
        });
        background.add(valor22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 40, 20));

        label6.setText("x3=");
        background.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel2.setText("x1 +");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel3.setText("x1 +");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        label7.setText("x1 +");
        background.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        label3.setText("x2 +");
        background.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        label2.setText("x2 +");
        background.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        label1.setText("x2 +");
        background.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        label4.setText("x3  =");
        background.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        label5.setText("x3 =");
        background.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        A.setBackground(java.awt.Color.gray);
        A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ALayout = new javax.swing.GroupLayout(A);
        A.setLayout(ALayout);
        ALayout.setHorizontalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        ALayout.setVerticalGroup(
            ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        background.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 20, 20));
        background.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 40, 10));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 40, 10));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 40, 10));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 40, 10));
        background.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 40, 10));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 40, 10));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 40, 10));
        background.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 40, 10));
        background.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 40, 10));
        background.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 40, 10));
        background.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 40, 10));
        background.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 40, 10));

        salir1.setBackground(new java.awt.Color(255, 255, 255));

        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("X");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setDoubleBuffered(true);
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salir1Layout = new javax.swing.GroupLayout(salir1);
        salir1.setLayout(salir1Layout);
        salir1Layout.setHorizontalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        salir1Layout.setVerticalGroup(
            salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel6.setText("calcular");

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        background.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 450, 30));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 480, 10));

        B.setBackground(java.awt.Color.gray);
        B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BLayout = new javax.swing.GroupLayout(B);
        B.setLayout(BLayout);
        BLayout.setHorizontalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        BLayout.setVerticalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        background.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 20));
        background.add(respuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 20));

        jLabel4.setText("3x3");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel5.setText("2x2");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));
        background.add(respuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 230, 20));
        background.add(respuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 230, 20));

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Calculadora cramer 2x2 y 3x3");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));
        background.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse );
    }//GEN-LAST:event_barraMouseDragged

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir1.setBackground(Color.red);
        salir.setForeground(Color.white);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir1.setBackground(Color.white);
        salir.setForeground(Color.black);
    }//GEN-LAST:event_salirMouseExited

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/newpackage/videoplayback.wav"));
            sonido.play();
        B.setBackground(Color.gray);
        valor03.setVisible(false);
        valor13.setVisible(false);
        valor23.setVisible(false);
        valor22.setVisible(false);
        valor21.setVisible(false);
        valor20.setVisible(false);
        separador1.setVisible(false);
        separador2.setVisible(false);
        separador3.setVisible(false);
        separador4.setVisible(false);
        separador5.setVisible(false);
        separador6.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label1.setText("+x2 =");
        label2.setText("+x2 =");
        // TODO add your handling code here:
    }//GEN-LAST:event_AMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/newpackage/videoplayback.wav"));
            sonido.play();
        A.setBackground(Color.gray);
        valor03.setVisible(true);
        valor13.setVisible(true);
        valor23.setVisible(true);
        valor22.setVisible(true);
        valor21.setVisible(true);
        valor20.setVisible(true);
        separador1.setVisible(true);
        separador2.setVisible(true);
        separador3.setVisible(true);
        separador4.setVisible(true);
        separador5.setVisible(true);
        separador6.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        label6.setVisible(true);
        label7.setVisible(true);
        label1.setText("x2+");
        label2.setText("x2+");
    }//GEN-LAST:event_BMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/newpackage/videoplayback.wav"));
            sonido.play();
            int Valor00 = Integer.parseInt(valor00.getText());
            m1.llenarmatriz00(Valor00);
            int Valor01 = Integer.parseInt(valor01.getText());
            m1.llenarmatriz01(Valor01);
            int Valor02 = Integer.parseInt(valor02.getText());
            m1.llenarmatriz02(Valor02);
            int Valor03 = Integer.parseInt(valor03.getText());
            m1.llenarmatriz03(Valor03);
            int Valor10 = Integer.parseInt(valor10.getText());
            m1.llenarmatriz10(Valor10);
            int Valor11 = Integer.parseInt(valor11.getText());
            m1.llenarmatriz11(Valor11);
            int Valor12 = Integer.parseInt(valor12.getText());
            m1.llenarmatriz12(Valor12);
            int Valor13 = Integer.parseInt(valor13.getText());
            m1.llenarmatriz13(Valor13);
            int Valor20 = Integer.parseInt(valor20.getText());
            m1.llenarmatriz20(Valor20);
            int Valor21 = Integer.parseInt(valor21.getText());
            m1.llenarmatriz21(Valor21);
            int Valor22 = Integer.parseInt(valor22.getText());
            m1.llenarmatriz22(Valor22);
            int Valor23 = Integer.parseInt(valor23.getText());
            m1.llenarmatriz23(Valor23);
            
        if(label7.isVisible()){
            if(m1.SePuedeResolver3x3()){
               respuesta1.setText("X1 = "+m1.X3x3());
               respuesta2.setText("X2 = "+m1.Y3x3());
               respuesta3.setText("X3 = "+m1.Z3x3());
               error.setText("");
            }else{
                respuesta2.setText("");
                respuesta1.setText("");
                respuesta3.setText("");
                error.setText("No tiene solucion o tiene infinitas soluciones");
                error.setForeground(Color.black);
            }
        }else{
            if(m1.SePuedeResolver2x2()){
                respuesta1.setText("X1 = "+m1.X2x2());
                respuesta2.setText("X2 = "+m1.Y2x2());
                respuesta3.setText("");
                error.setText("");
            }else{
                respuesta2.setText("");
                respuesta1.setText("");
                respuesta3.setText("");
                error.setText("No tiene solucion o tiene infinitas soluciones");
                error.setForeground(Color.black);
            }
             
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(Color.blue);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(Color.gray);
    }//GEN-LAST:event_jPanel1MouseExited

    private void AMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseEntered
        A.setBackground(Color.blue);
    }//GEN-LAST:event_AMouseEntered

    private void AMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseExited
        if(label7.isVisible()){
            A.setBackground(Color.gray);
        }
    }//GEN-LAST:event_AMouseExited

    private void BMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseEntered
        B.setBackground(Color.blue);
    }//GEN-LAST:event_BMouseEntered

    private void BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseExited
        if(label7.isVisible()==false){
            B.setBackground(Color.gray);
        }
    }//GEN-LAST:event_BMouseExited

    private void valor00MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor00MousePressed
        valor00.setText("");
        valor00.setForeground(Color.black);
    }//GEN-LAST:event_valor00MousePressed

    private void valor10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor10MousePressed
        valor10.setText("");
        valor10.setForeground(Color.black);
    }//GEN-LAST:event_valor10MousePressed

    private void valor20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor20MousePressed
        valor20.setText("");
        valor20.setForeground(Color.black);
    }//GEN-LAST:event_valor20MousePressed

    private void valor01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor01MousePressed
        valor01.setText("");
        valor01.setForeground(Color.black);
    }//GEN-LAST:event_valor01MousePressed

    private void valor11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor11MousePressed
        valor11.setText("");
        valor11.setForeground(Color.black);
    }//GEN-LAST:event_valor11MousePressed

    private void valor21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor21MousePressed
        valor21.setText("");
        valor21.setForeground(Color.black);
    }//GEN-LAST:event_valor21MousePressed

    private void valor02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor02MousePressed
       valor02.setText("");
       valor02.setForeground(Color.black);
    }//GEN-LAST:event_valor02MousePressed

    private void valor12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor12MousePressed
        valor12.setText("");
        valor12.setForeground(Color.black);
    }//GEN-LAST:event_valor12MousePressed

    private void valor22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor22MousePressed
        valor22.setText("");
        valor22.setForeground(Color.black);
    }//GEN-LAST:event_valor22MousePressed

    private void valor03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor03MousePressed
        valor03.setText("");
        valor03.setForeground(Color.black);
    }//GEN-LAST:event_valor03MousePressed

    private void valor13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor13MousePressed
        valor13.setText("");
        valor13.setForeground(Color.black);
    }//GEN-LAST:event_valor13MousePressed

    private void valor23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valor23MousePressed
        valor23.setText("");
        valor23.setForeground(Color.black);
    }//GEN-LAST:event_valor23MousePressed
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JPanel B;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barra;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel respuesta1;
    private javax.swing.JLabel respuesta2;
    private javax.swing.JLabel respuesta3;
    private javax.swing.JLabel salir;
    private javax.swing.JPanel salir1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JSeparator separador5;
    private javax.swing.JSeparator separador6;
    private javax.swing.JTextField valor00;
    private javax.swing.JTextField valor01;
    private javax.swing.JTextField valor02;
    private javax.swing.JTextField valor03;
    private javax.swing.JTextField valor10;
    private javax.swing.JTextField valor11;
    private javax.swing.JTextField valor12;
    private javax.swing.JTextField valor13;
    private javax.swing.JTextField valor20;
    private javax.swing.JTextField valor21;
    private javax.swing.JTextField valor22;
    private javax.swing.JTextField valor23;
    // End of variables declaration//GEN-END:variables
}
