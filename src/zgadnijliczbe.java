import java.util.Scanner;

public class zgadnijliczbe {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Witaj w grze Zgadnij Liczbę!");

        long random = Math.round(Math.random()*100+1);

        // kontrolka
        // System.out.println(random);

        System.out.println("Pomyślałem o liczbe z przedziału od 1 do 100, czy umiesz ją zgadnąć?");
        int proba = 1;
        System.out.println("To twoja " + proba + " próba: ");
        int strzal = input.nextInt();
        while (strzal != random)
        {
            if (strzal > random)
            {
                System.out.println("Za dużo");
            }
            else if (strzal < random)
            {
                System.out.println("Za mało");
            }
            else
            {
                System.out.println("Nie znany błąd");
            }
            proba++;
            System.out.println("To twoja " + proba + " próba: ");
            strzal = input.nextInt();
        }
        System.out.println("Brawo! Udało Ci się zgadnąć liczbę " + random + " w " + proba + " próbie!");
    }
}
