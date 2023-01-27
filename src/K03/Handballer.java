package K03;


public class Handballer { //Handball Class
    private String name;
    private String geschlecht;
    private String haarfarbe;  //private String zu jeder Frage
    private String augenfarbe;
    private int grosse;
    private int gewicht;
    private String position;
    private String verein;

    public void setName(String name)  { // Public Methode
        this.name = name;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    /**
     * Setzt Atribut haarfarbe
     * @param haarfarbe haarfarbe
     */
    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public void setAugenfarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }

    public void setGrosse(int grosse) {
        this.grosse = grosse;
    }

    public void setGewicht(int gewicht) throws Exception {
        this.gewicht = gewicht;
        if (gewicht <= 0){
            throw new Exception("Gewicht iunghültihg");
        }
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setVerein(String verein) {
        this.verein = verein;
    }


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

