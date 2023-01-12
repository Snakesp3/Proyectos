package Sanke;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelSnake extends JPanel {

    //Color del fondo del panel
    Color colorFondo = Color.gray;
    Color comidaS = Color.red;
    //Tamaño del panel, tamaño de los cuadrados y cantidad
    int tamanoMax, tamanoC, cantidadC, resto;

    public PanelSnake(int tamanoMax, int cantidadC) {

        this.tamanoMax = tamanoMax;
        this.cantidadC = cantidadC;
        this.tamanoC = tamanoMax / cantidadC;
        // compensa e iguala los margenes del cuadrado
        this.resto = tamanoMax % cantidadC;

    }

    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(colorFondo);
        //dibujamos los cuadrados usando bucle for anidado

        for (int i = 0; i < cantidadC; i++) {
            for (int j = 0; j < cantidadC; j++) {
                pintor.fillRect(resto / 2 + i * tamanoC, resto / 2 + j * tamanoC, tamanoC - 1, tamanoC - 1);
            }
        }

    }

}
