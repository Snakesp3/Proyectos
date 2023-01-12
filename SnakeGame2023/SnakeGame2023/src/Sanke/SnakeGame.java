package Sanke;

import java.awt.event.KeyEvent;

public class SnakeGame extends javax.swing.JFrame {
    // URL https://www.youtube.com/watch?v=Fh5fFE5h8tw
    //Tiempo 26.58
    //revisar todo porque no estarian funcando las teclas

    //Variable general 
    PanelS snake;

    public SnakeGame() {
        initComponents();
// Agregando fondo y dimensiones
        this.setLocationRelativeTo(null);
        snake = new PanelS(800, 30);
        this.add(snake);
        snake.setBounds(10, 10, 800, 800);
        snake.setOpaque(false);

        PanelSnake fondoP = new PanelSnake(800, 30);
        this.add(fondoP);
        fondoP.setBounds(10, 10, 800, 800);
        
        this.requestFocus(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                snake.otraDireccion("iz");
                break;
            case KeyEvent.VK_RIGHT:
                snake.otraDireccion("de");
                break;
            case KeyEvent.VK_UP:
                snake.otraDireccion("ar");
                break;
            case KeyEvent.VK_DOWN:
                snake.otraDireccion("ab");
                break;
            default:
                break;
        }
        


    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SnakeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
