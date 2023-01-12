package Sanke;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelS extends JPanel {

    //Color del fondo del panel
    Color colorS = Color.green;
    //Color de la comida del Snake
    Color comidaS = Color.red;
    //Tamaño del panel, tamaño de los cuadrados y cantidad
    int tamanoMax, tamanoC, cantidadC, resto;
    //Coordenadas de donde va a estar Snake
    List<int[]> snake = new ArrayList();
    // Arreglo de donde va a estar nuestra comida para la Snake 
    int[] comida = new int[2];
    //direccion hacia donde queremos que valla la snake
    String direccion = "de";
    String otraDire = "de";

    Thread hilo;
    direccionales camino;

    public PanelS(int tamanoMax, int cantidadC) {
        this.tamanoMax = tamanoMax;
        this.cantidadC = cantidadC;
        this.tamanoC = tamanoMax / cantidadC;
        // compensa e iguala los margenes del cuadrado
        this.resto = tamanoMax % cantidadC;
        int[] a = {cantidadC / 2 - 1, cantidadC / 2 - 1};
        int[] b = {cantidadC / 2, cantidadC / 2 - 1};
        snake.add(a);
        snake.add(b);
        generarComida();

        // ubicacion de la comida para probar si sumaba un cuadrado la snake
        // comida[0] = 25;
        // comida[1] = 14;
        camino = new direccionales(this);
        hilo = new Thread(camino);
        hilo.start();
    }

    @Override
    public void paint(Graphics pintor) {
        super.paint(pintor);
        pintor.setColor(colorS);

//        for (int i = 0; i < snake.size(); i++) {
//            pintor.fillRect(resto / 2 + snake.get(i)[0] * tamanoC, resto / 2 + snake.get(i)[1] * tamanoC, tamanoC - 1, tamanoC - 1);
//        }
//Pintamos nuestra Snake 
        for (int[] par : snake) {
            pintor.fillRect(resto / 2 + par[0] * tamanoC, resto / 2 + par[1] * tamanoC, tamanoC - 1, tamanoC - 1);
        }

        //Pintando la comida de la Snake
        pintor.setColor(comidaS);
        pintor.fillRect(resto / 2 + comida[0] * tamanoC, resto / 2 + comida[1] * tamanoC, tamanoC - 1, tamanoC - 1);

    }

    public void avanzar() {

        igualarDireccion();

        int[] ultimo = snake.get(snake.size() - 1);
        //direccion x e y
        int direccionX = 0;
        int direccionY = 0;

        switch (direccion) {
            case "de":
                direccionX = 1;
                break;
            case "iz":
                direccionX = -1;
                break;
            case "ar":
                direccionX = -1;
                break;
            case "ba":
                direccionX = 1;
                break;
        }
        int[] nuevo = {Math.floorMod(ultimo[0] + direccionX, cantidadC), Math.floorMod(ultimo[1] + direccionY, cantidadC)};
        boolean existe = false;
        for (int i = 0; i < snake.size(); i++) {
            if (nuevo[0] == snake.get(i)[0] && nuevo[1] == snake.get(i)[1]) {
                existe = true;
                break;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(this, "PERDISTE!");

        } else {

            if (nuevo[0] == comida[0] && nuevo[1] == comida[1]) {
                snake.add(nuevo);
                generarComida();
            } else {
                snake.add(nuevo);
                snake.remove(0);
            }
        }

    }

    //generador de comida aleatorio
    public void generarComida() {
        boolean existe = false;
        //casteamos
        int a = (int) (Math.random() * cantidadC);
        int b = (int) (Math.random() * cantidadC);
        for (int[] par : snake) {
            if (par[0] == a && par[1] == b) {
                existe = true;
                generarComida();
                break;
            }

        }
        if (!existe) {
            this.comida[0] = a;
            this.comida[1] = b;
        }

    }
//Se utiliza para determinar si no es una direccion va a ser la otra
    public void otraDireccion(String dire) {
         this.direccion = this.otraDire;
      if ((this.direccion.equals("de") || this.direccion.equals("iz")) && (dire.equals("ar") || dire.equals("ab"))) {
           this.otraDire = dire;
      }
         if ((this.direccion.equals("ar") || this.direccion.equals("ab")) && (dire.equals("iz") || dire.equals("de"))) {
           this.otraDire = dire;
     }

    }

    public void igualarDireccion() {

        this.direccion = this.otraDire;

    }

}
