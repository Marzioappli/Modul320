package K03;
/**
 * @author Marzio
 * @version 2.0
 * @since 1.0
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        try{
            menu.haupt();
        } catch(Exception e){
            System.out.println("Eingabe kann nicht ausgegeben werden, da der Handballer nicht 0kg wiegen kann!");
            System.exit(1);
        }
    }
}
