package K05;

public class Schueler {
    public final String name;
    public final int alter;
    public final String geschlecht;

    public Schueler(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    public String sayHi(){
        return "Hallo";
    }
    public String greet(String name){
        return sayHi() + name;
    }
}
