
package Calculadora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Calculadora extends javax.swing.JFrame {

    /*Creando variables*/
   
    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    
    public Calculadora() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);

        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jButtonC = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jButtonSiete = new javax.swing.JButton();
        jButtonOcho = new javax.swing.JButton();
        jButtonNueve = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonCuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonRestar = new javax.swing.JButton();
        jButtonUno = new javax.swing.JButton();
        jButtonDos = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonSumar = new javax.swing.JButton();
        jButtonMasMenos = new javax.swing.JButton();
        jButtonCero = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new java.awt.GridLayout(5, 4));

        jButtonC.setBackground(new java.awt.Color(51, 204, 255));
        jButtonC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        Panel.add(jButtonC);

        jButtonRaiz.setBackground(new java.awt.Color(51, 204, 255));
        jButtonRaiz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonRaiz.setText("√");
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });
        Panel.add(jButtonRaiz);

        jButtonDivision.setBackground(new java.awt.Color(51, 204, 255));
        jButtonDivision.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });
        Panel.add(jButtonDivision);

        jButtonCE.setBackground(new java.awt.Color(204, 153, 0));
        jButtonCE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonCE.setText("CE");
        jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCEActionPerformed(evt);
            }
        });
        Panel.add(jButtonCE);

        jButtonSiete.setBackground(new java.awt.Color(51, 204, 255));
        jButtonSiete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonSiete.setText("7");
        jButtonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSieteActionPerformed(evt);
            }
        });
        Panel.add(jButtonSiete);

        jButtonOcho.setBackground(new java.awt.Color(51, 204, 255));
        jButtonOcho.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonOcho.setText("8");
        jButtonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOchoActionPerformed(evt);
            }
        });
        Panel.add(jButtonOcho);

        jButtonNueve.setBackground(new java.awt.Color(51, 204, 255));
        jButtonNueve.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonNueve.setText("9");
        jButtonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNueveActionPerformed(evt);
            }
        });
        Panel.add(jButtonNueve);

        jButtonMultiplicar.setBackground(new java.awt.Color(204, 153, 0));
        jButtonMultiplicar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonMultiplicar.setText("X");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });
        Panel.add(jButtonMultiplicar);

        jButtonCuatro.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCuatro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonCuatro.setText("4");
        jButtonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCuatroActionPerformed(evt);
            }
        });
        Panel.add(jButtonCuatro);

        jButtonCinco.setBackground(new java.awt.Color(255, 204, 51));
        jButtonCinco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });
        Panel.add(jButtonCinco);

        jButtonSeis.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSeis.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });
        Panel.add(jButtonSeis);

        jButtonRestar.setBackground(new java.awt.Color(204, 153, 0));
        jButtonRestar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonRestar.setText("-");
        jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestarActionPerformed(evt);
            }
        });
        Panel.add(jButtonRestar);

        jButtonUno.setBackground(new java.awt.Color(51, 204, 255));
        jButtonUno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonUno.setText("1");
        jButtonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnoActionPerformed(evt);
            }
        });
        Panel.add(jButtonUno);

        jButtonDos.setBackground(new java.awt.Color(51, 204, 255));
        jButtonDos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonDos.setText("2");
        jButtonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDosActionPerformed(evt);
            }
        });
        Panel.add(jButtonDos);

        jButtonTres.setBackground(new java.awt.Color(51, 204, 255));
        jButtonTres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });
        Panel.add(jButtonTres);

        jButtonSumar.setBackground(new java.awt.Color(204, 153, 0));
        jButtonSumar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonSumar.setText("+");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });
        Panel.add(jButtonSumar);

        jButtonMasMenos.setBackground(new java.awt.Color(51, 204, 255));
        jButtonMasMenos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonMasMenos.setText("+/-");
        jButtonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMasMenosActionPerformed(evt);
            }
        });
        Panel.add(jButtonMasMenos);

        jButtonCero.setBackground(new java.awt.Color(51, 204, 255));
        jButtonCero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonCero.setText("0");
        jButtonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCeroActionPerformed(evt);
            }
        });
        Panel.add(jButtonCero);

        jButtonPunto.setBackground(new java.awt.Color(51, 204, 255));
        jButtonPunto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonPunto.setText(".");
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });
        Panel.add(jButtonPunto);

        jButtonIgual.setBackground(new java.awt.Color(204, 153, 0));
        jButtonIgual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        Panel.add(jButtonIgual);

        etiquetaNumeros.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        etiquetaMuestra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
       
        etiquetaMuestra.setText("");
        etiquetaMuestra.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
                
        
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSieteActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //Voy a usar la calculadora
    }//GEN-LAST:event_jButtonSieteActionPerformed

    private void jButtonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCeroActionPerformed

        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonCeroActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOchoActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonOchoActionPerformed

    private void jButtonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNueveActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonNueveActionPerformed

    private void jButtonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCuatroActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonCuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnoActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonUnoActionPerformed

    private void jButtonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDosActionPerformed

        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButtonDosActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed

        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            activado = false;
            punto = true;

        }
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed

        double segundoNumero;
        if (operacion.equals("nula")) {
            etiquetaNumeros.setText(cadenaNumeros);

        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                etiquetaNumeros.setText("NoSeDividePorCero");
            } else {
                resultado = primerNumero / segundoNumero;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
        }

        etiquetaMuestra.setText("");
        activado = true;
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed

        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            activado = false;
            punto = true;

        }

    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            activado = false;
            punto = true;

        }
    }//GEN-LAST:event_jButtonRestarActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            activado = false;
            punto = true;

        }
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
       
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt(" + cadenaNumeros+")");
        resultado = Math.sqrt(primerNumero);
        etiquetaNumeros.setText(String.format("% .2f",resultado));
        cadenaNumeros = String.valueOf(resultado); // Se convierte el valor a cadena
        punto = true;
        
        
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        if (punto == true) {
            if (cadenaNumeros.equals("")) {
                cadenaNumeros = "0.";
            }else{
             
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = true;
        }
       
        
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void jButtonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMasMenosActionPerformed
        
        if (cadenaNumeros.charAt(0)!= '-') {
            cadenaNumeros = "-" + cadenaNumeros;
            
        }else{
            cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
        }      
        etiquetaNumeros.setText(cadenaNumeros);
        
        
    }//GEN-LAST:event_jButtonMasMenosActionPerformed

    private void jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCEActionPerformed
        int tamaño = cadenaNumeros.length();
        if (tamaño > 0) {
            if (tamaño == 1) {
                cadenaNumeros = "0";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length()-1);
                
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_jButtonCEActionPerformed

    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                    new Calculadora().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonCero;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonCuatro;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonDos;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMasMenos;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonNueve;
    private javax.swing.JButton jButtonOcho;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonRestar;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSiete;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUno;
    // End of variables declaration//GEN-END:variables
}
