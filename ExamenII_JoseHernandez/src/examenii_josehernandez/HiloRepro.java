/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii_josehernandez;

import javax.swing.JProgressBar;

/**
 *
 * @author jrdjh
 */
public class HiloRepro extends Thread{
    private JProgressBar barra;
    private int tiempo;

    public HiloRepro() {
    }

    public HiloRepro(JProgressBar barra, int tiempo) {
        this.barra = barra;
        this.tiempo = tiempo;
    }

   

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        barra.setValue(tiempo + 1);
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
        }
        
    }
    
}
