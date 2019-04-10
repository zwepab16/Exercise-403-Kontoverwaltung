package com.mycompany.exercise.kontoverwaltungmv;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Konto extends javax.swing.AbstractListModel {

    private double saldo;
    private String name;
    private ArrayList<KontoBenutzer> users = new ArrayList();

    public Konto(double saldo, String name) {
        this.saldo = saldo;
        this.name = name;
    }

    public void addUser(KontoBenutzer user) {
        this.users.add(user);
        fireIntervalAdded(this, users.size() - 1, users.size() - 1);
        for (KontoBenutzer user1 : users) {
            System.out.println(user1.toString());
        }
    }

    @Override
    public int getSize() {
        return users.size();
    }

    @Override
    public Object getElementAt(int i) {
        return users.get(i).toString();
    }

    public String toString() {
        return name;
    }

    public void überweisen(int geld) {
        this.saldo += geld;

    }

    public void abheben(int geld) throws NoMoneyException{
        this.saldo -= geld;
    }

    public void startTest(int[]benutzer) {

        for (int i=0;i<benutzer.length;i++) {
            
            Thread d = new Thread(users.get(benutzer[i]));
           
            d.start();

        }
    }

    public double getSaldo() {
        return saldo;
    }

}
