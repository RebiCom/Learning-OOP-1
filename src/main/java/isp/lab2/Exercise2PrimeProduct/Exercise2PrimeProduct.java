package isp.lab2.Exercise2PrimeProduct;

import java.util.Scanner;

public class Exercise2PrimeProduct {

    /**
     * This method should return the product of the first n prime numbers
     * @param n
     * @param m
     * @return
     */

    public static long getPrimeProduct(int n, int m)
    {
        long p=1;
        for( int i = n; i <= m; i++)
        {
            int div=0;
            for(int j = 2; j <= i/2; j++)
                if(i % j == 0)
                    div++;
            //chiar daca ia si 1 ca fiind nr prim, nu imi influenteaza rezultatul 1*div=div
            if( div == 0)
                p = p * i;
        }
        return p;
    }


    /**
     * This method should read from the console a number
     * @return the number read from the console
     */
    public static int readfromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The product of the first 10 prime numbers is: " + getPrimeProduct(1, 10));
        System.out.println("The product of prime numbers between m and n: " + getPrimeProduct(readfromConsoleInt(), readfromConsoleInt()));
    }

}
