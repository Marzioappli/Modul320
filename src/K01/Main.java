package K01;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                boolean userStopp = false;
                System.out.println("\nWelcome to Handball Premium!");
                do {

                        System.out.println("Do you want to know more about the Champions League Handball Teams? (y/n)");
                        Scanner scanner = new Scanner(System.in);

                        String userAnswer = scanner.nextLine();
                        if (userAnswer.equals("y")) {
                                userStopp = true;
                                System.out.println("This are the Teams: \n" +
                                        "Group A:\n 1. Telekom Veszprem\n 2. Paris Saint-Germain\n 3. SC Magdeburg" +
                                        "\n 4. GOG Svendborg Gudme\n 5. Dinamo București\n 6. Orlen Wisla Płock\n" +
                                        " 7. RK Zagreb\n 8. FC Porto\n");
                                System.out.println("Group B:\n 1. FC Barcelona\n 2. KS Kielce\n 3. HBC Nantes" +
                                        "\n 4. Aalborg Håndbold\n 5. THW Kiel\n 6. RK Celje\n 7. SC Pick Szeged\n" +
                                        " 8. Elverum Håndball");
                        } else if (userAnswer.equals("n")) {
                                userStopp = false;
                                System.out.println("You closed the Programm!");
                                break;
                        }
                        System.out.println("\n\nType the Name of the Club from Group A to receiv the Informations!");
                        Scanner scanner2 = new Scanner(System.in);

                        String userAnswer2 = scanner2.nextLine();
                        switch (userAnswer2) {
                                case "Telekom Veszprem" -> {
                                        userStopp = false;
                                        infos("""
                                                Founded 1977; 45 years ago
                                                Arena\tVeszprém Aréna, Veszprém
                                                Capacity\t5,096
                                                President\tJános Szabó
                                                Head coach\tMomir Ilić
                                                Captain\tRasmus Lauge Schmidt
                                                League\tNemzeti Bajnokság I""");
                                }
                                case "Paris Saint-Germain" -> {
                                        userStopp = false;
                                        infos("""
                                                Shortcut	PSG
                                                Founded 	1941
                                                Club colours 	rot/blau
                                                Hall 	Stade Pierre de Coubertin
                                                Places 	4.016 Plätze
                                                President 	Nasser Al-Khelaifi
                                                Coach 	Raúl González
                                                League 	Ligue Nationale de Handball
                                                """);
                                }
                                case "SC Magdeburg" -> {
                                        userStopp = false;
                                        infos("""
                                                Shortcut 	SCM
                                                Founded 	1. März 1955
                                                Club colours 	grün, rot
                                                Hall 	GETEC Arena, Magdeburg
                                                Places 	7.071
                                                President 	Dirk Roswandowicz
                                                Coach 	Bennet Wiegert
                                                League 	Handball-Bundesliga
                                                """);
                                }
                                case "GOG Svendborg Gudme" -> {
                                        userStopp = false;
                                        infos("""
                                                Founded 	1973
                                                Club colours 	gelb/rot
                                                Hall 	Gudmehallerne
                                                Places 	1.642 Plätze
                                                President 	Hemming Van
                                                Coach 	Nicolej Krickau
                                                League 	Håndboldligaen
                                                """);
                                }
                                case "Dinamo București" -> {
                                        userStopp = false;
                                        infos("""
                                                Shortcut 	Câinii Roşii (dt. die roten Hunde)
                                                Founded 	1953
                                                Club colours 	rot/weiß
                                                Hall 	Sala Polivalentă Dinamo
                                                Places 	2538
                                                President 	Daniel Georgescu
                                                Coach 	Spanien Xavier Pascual Fuertes
                                                League 	Liga Națională
                                                """);
                                }
                                case "Orlen Wisla Płock" -> {
                                        userStopp = false;
                                        infos("""
                                                Shortcut	Nafciarze
                                                Founded	1964
                                                Arena	Orlen Arena
                                                Places	5,492
                                                President	Robert Czwartek
                                                Head coach	Xavi Sabaté
                                                Captain	Michał Daszek
                                                League	Polish Superliga
                                                """);
                                }
                                case "RK Zagreb" -> {
                                        userStopp = false;
                                        infos("""
                                                Founded 	1922
                                                Club colours 	weiß / blau
                                                Hall 	Arena Zagreb
                                                Places 	15.200 Plätze
                                                President 	Zoran Gobac
                                                Coach 	Slavko Goluža
                                                League 	Premijer Liga
                                                """);
                                }
                                case "FC Porto" -> {
                                        userStopp = false;
                                        infos("""
                                                Founded	1932
                                                Arena	Dragão Arena
                                                Places	2,200
                                                President	Jorge Nuno Pinto da Costa
                                                Head coach	Magnus Andersson
                                                League	Andebol 1

                                                """);
                                }
                                case "No" -> {
                                        userStopp = false;
                                        infos("You closed the Programm!");
                                }

                        }

                }  while (userStopp) ;

        }public static void infos(String infos){
        System.out.println(infos);
        }
}


