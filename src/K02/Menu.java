package K02;

import java.util.Scanner;

public class Menu {
    public static void scanner() {
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("Handballer: " + scannerVariable.nextLine());
    }
    public void haupt() {
        Handballer handballer = new Handballer();
        System.out.println("Namen des Spielers!");
        Scanner scannerVariable = new Scanner(System.in);
        handballer.setName(scannerVariable.nextLine());
        System.out.println("Welches Geschlecht soll der Handballer*in haben?");
        handballer.setGeschlecht(scannerVariable.nextLine());
        System.out.println("Welche Haarfarbe soll er/sie haben?");
        handballer.setHaarfarbe(scannerVariable.nextLine());
        System.out.println("Welche Augenfarbe hat er/sie?");
        handballer.setAugenfarbe(scannerVariable.nextLine());
        System.out.println("Grösse des Spielers");
        handballer.setGrosse(scannerVariable.nextLine());
        System.out.println("Gewicht des Spielers");
        handballer.setGewicht(scannerVariable.nextLine());
        System.out.println("Position des Spielers");
        handballer.setPosition(scannerVariable.nextLine());
        System.out.println("Verein des Spielers");
        handballer.setVerein(scannerVariable.nextLine());
        handballer.spieleranzeigen();
    }



}