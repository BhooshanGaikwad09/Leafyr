package bg;

import java.util.Scanner;

public class Leafyr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y, r;

        // y - denotes the year

        System.out.println ("----Enter the year----");
        y = in.nextInt();

        r = y % 400 == 0 || y % 100 == 0 || y % 4 == 0 ? 1 : 0;

        switch (r) {
            case 1:
                System.out.println ("\n" + y+ " is the leap year.");
                break;

            case 0:
                System.out.println ("\n" + y + " is not the leap year.");
                break;

            default:
                System.out.println ("\n" + y + " is not the leap year.");
        }
    }
}


