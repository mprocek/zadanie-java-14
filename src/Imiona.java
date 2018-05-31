import java.util.Scanner;

public class Imiona {
    public static void main(String[] args) {
        String[] imiona = new String[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <imiona.length; i++) {
            System.out.printf("Podaj %d imie : ", (i+1));
            imiona[i]=scan.nextLine();
        }

        System.out.println();

        for (int i = imiona.length-1; i >=0 ; i--) {
            System.out.println("Część " + imiona[i]);
        }

    }
}
