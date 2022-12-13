package K03;

import java.util.Scanner;

public class Handballer { //Handball Class
    private String name;
    private String geschlecht;
    private String haarfarbe;  //private String zu jeder Frage
    private String augenfarbe;
    private String grosse;
    private String gewicht;
    private String position;
    private String verein;

    public void setName(String name) { // Public Methode
        this.name = name;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public void setAugenfarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }

    public void setGrosse(String grosse) {
        this.grosse = grosse;
    }

    public void setGewicht(String gewicht) {
        this.gewicht = gewicht;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setVerein(String verein) {
        this.verein = verein;
    }
    public void spieleranzeigen(){ //Ausgabe von jeder Methode
        System.out.println("Name:" +this.name);
        System.out.println("Geschlecht:\n" +this.geschlecht);
        System.out.println("Haarfarbe:\n" +this.haarfarbe);
        System.out.println("Augenfarbe:\n" +this.augenfarbe);
        System.out.println("Grösse:\n" +this.grosse);
        System.out.println("Gewicht:\n" +this.gewicht);
        System.out.println("Position:\n" +this.position);
        System.out.println("Verein:\n" +this.verein);
    }
}

