import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int userChoise = scan.nextInt();

        while (!(userChoise > 100 && userChoise < 200 && userChoise % 3 == 0)) {

            if (userChoise < 100) {
                System.out.println("Twoja liczba jest za mała");
                System.out.println("Podaj liczbę");
                userChoise = scan.nextInt();

            } else if (userChoise > 200) {
                System.out.println("Twoja liczba jest za duża");
                System.out.println("Podaj liczbę");
                userChoise = scan.nextInt();

            } else if (userChoise % 3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę");
                userChoise = scan.nextInt();

            } else if (userChoise % 3 == 0) {


            }

        }

        System.out.println("Twoja liczba jest ok");
    }
}





