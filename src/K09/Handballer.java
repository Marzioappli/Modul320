package K09;
/**
 * @author Marzio
 * @version 2.0
 * @since 1.0
 */

public class Handballer { //Handball Class
    private String name;
    private String geschlecht;
    private String haarfarbe;  //private String zu jeder Frage
    private String augenfarbe;
    private int grosse;
    private int gewicht;
    private String position;
    private String verein;

    /**
     * Setzt Attribut name
     * @param name Name of Handballer
     */
    public void setName(String name) { // Public Methode
        this.name = name;
    }

    /**
     * Setzt Attribut geschlecht
     * @param geschlecht Geschlecht of Handballer
     */
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    /**
     * Setzt Atribut haarfarbe
     * @param haarfarbe Haarfarbe of Handballer
     */
    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    /**
     * Setzt Attribut augenfarbe
     * @param augenfarbe Augenfarbe of Handballer
     */
    public void setAugenfarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }

    /**
     * Setzt Atribut grosse
     * @param grosse Grösse of Handballer
     */
    public void setGrosse(int grosse) {
        this.grosse = grosse;
    }

    /**
     * Setzt Attribut gewicht
     * @param gewicht Gewicht of Handballer
     */
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    /**
     * Setzt Attribut position
     * @param position Position of Handballer
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Setzt Attribut verein
     * @param verein Verein of Handballer
     */
    public void setVerein(String verein) {
        this.verein = verein;
    }

    /**
     * Methode, um alles auszugebenfcsd
     */
    public void spieleranzeigen(){
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

