package K03;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static void scanner() {
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("Handballer: " + scannerVariable.nextLine());
    }
    //private String checkinput;
    public void haupt() throws Exception{
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

    private int checkInt(){
        int input = 0;
        while(true){
            try {
                Scanner scannerVariable = new Scanner(System.in);
                input = scannerVariable.nextInt();
                return input;
            } catch(Exception e) {
                System.out.println("Da gab es einen Fehler");
            }
        }
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
