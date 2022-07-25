import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
                 *
                ***
               *****
              *******
             *********
              *******
               *****
                ***
                 *
        */

        //Degiskenler tanimlandi.
        int sayi, i, k, j;

        //Kullanicidan satir sayisi alinarak elmas yapildi.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        sayi = scan.nextInt();

        for (i = 1; i <= sayi; i++)
        {
            for (k = 1; k <= (sayi-i); k++)
            {
                System.out.print(" ");
            }

            for (j = 1; j <= ((2*i) - 1); j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        for (i = 1; i <= sayi; i++)
        {
            for (k = 1; k <= i; k++)
            {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * sayi - ((2*i) + 1) ); j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
