package com.mycompany.exercise.kontoverwaltungmv;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class KontoBenutzer implements Runnable {

    private String name;
    private Konto k;
    private JTextArea log;
    JLabel label = new JLabel();

    public KontoBenutzer(String name, Konto k, JTextArea log, JLabel label) {
        this.name = name;
        this.k = k;
        this.log = log;
        this.label = label;
    }

    public String toString() {
        return name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            Random r = new Random();
            Boolean überweisen = r.nextBoolean();

            int geld = r.nextInt(50 - 10 + 1) + 10;
            if (überweisen) {
                k.überweisen(geld);

                log.append(String.format("%s: überweist %d€ ---> %.0f€ \n", name, geld, k.getSaldo()));
                // System.out.println(name+": "+"Geld überweisen!"+k.getSaldo());

            } else if (k.getSaldo() - geld >= 0) {
                try {
                    k.abheben(geld);
                } catch (NoMoneyException ex) {

                }
                log.append(String.format("%s: hebt ab %d€ ---> %.0f€ \n", name, geld, k.getSaldo()));
                // System.out.println(name+": "+"Geld abheben!"+k.getSaldo());
            } else {
                log.append(String.format("%s: wartet auf Geld zum Abheben \n", name));
                //   System.out.println(name+": "+"Zu wenig geld!"+k.getSaldo());
            }
            label.setText(k.getSaldo() + "€");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(KontoBenutzer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        log.append(String.format("%s: ist Fertig !\n", name));

    }

}
