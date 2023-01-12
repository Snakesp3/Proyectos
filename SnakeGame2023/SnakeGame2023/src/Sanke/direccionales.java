package Sanke;

import java.util.logging.Level;
import java.util.logging.Logger;

public class direccionales implements Runnable {

    PanelS panel;

    public direccionales(PanelS panel) {
        this.panel = panel;

    }

    @Override
    public void run() {
        
        while (true) {

            panel.avanzar();
            panel.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(direccionales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
