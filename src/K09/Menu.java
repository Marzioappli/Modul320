package K09;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Marzio
 * @version 2.0
 * @since 1.0
 */


public class Menu {
    public static void scanner() {
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("Handballer: " + scannerVariable.nextLine());
    }
    //private String checkinput;
    public void haupt() {
        Handballer handballer = new Handballer();
        //System.out.println("Namen des Spielers!");
        //Scanner scannerVariable = new Scanner(System.in);
        //handballer.setName(scannerVariable.nextLine());
        //System.out.println("Welches Geschlecht soll der Handballer*in haben?");
        //handballer.setGeschlecht(scannerVariable.nextLine());
        //System.out.println("Welche Haarfarbe soll er/sie haben?");
        //handballer.setHaarfarbe(scannerVariable.nextLine());
        //System.out.println("Welche Augenfarbe hat er/sie?");
        //handballer.setAugenfarbe(scannerVariable.nextLine());
        //System.out.println("Grösse des Spielers");
        ////handballer.setGrosse(scannerVariable.nextInt());
        System.out.println("Gewicht des Spielers");
        int gewicht = checkInt();
        handballer.setGewicht(gewicht);
        //System.out.println("Position des Spielers");
        //handballer.setPosition(scannerVariable.nextLine());
        //System.out.println("Verein des Spielers");
        //handballer.setVerein(scannerVariable.nextLine());
        handballer.spieleranzeigen();
    }

    /**
     * Check ob Eingabe ein Integer ist, wenn ja gibt es eine Ausgabe, sonst eine Fehlermeldung
     * @return Input wird returnd
     */
    private int checkInt(){
        Scanner scannerVariable = new Scanner(System.in);
        int input = 0;
        try {
            input = scannerVariable.nextInt();
        } catch(Exception e) {
            System.out.println("Da gab es einen Fehler");

        }
        return input;
    }


/*
    public void checkinput(){
        String checkinput;
        Scanner scannerVariable = new Scanner(System.in);
        do{
            if(checkinput == null || checkinput.isEmpty()){
                try {
                    int input = scannerVariable.nextInt();
                } catch (Exception m) {
                    m.printStackTrace();
                }
            }
            else{
                checkinput = checkinput;
            }
        }
        while (true);
    } */
}
