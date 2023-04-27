package TP1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Créer une instance de la classe Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        Calcul randomCalcul = new Calcul();

        do{

            randomCalcul = new Calcul();

            System.out.println(randomCalcul.getNbrX() + "*" + randomCalcul.getNbrY());


            String userInput = scanner.nextLine();
            String userStop = userInput.toLowerCase();

            if (userStop.equals("stop") ) {
                break;
            }

            try {
                int userInputInt = Integer.parseInt(userInput) ;
    
                if (userInputInt == randomCalcul.getResult()) {
                    System.out.println("Correct");
                }else{
                    System.out.println("Incorrect");
                }
            } catch (Exception e) {
                System.out.println("Incorrect");
            }
        }while(true);
    }
}