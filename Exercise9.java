/*
UCF COP3330 FALL 2021 ASSIGNMENT 9 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int gallon = 350;
        int ceiling;
        float paint;

        int length, width;
        System.out.println("What is the length of the ceiling?");
        length = scan.nextInt();

        System.out.println("What is the width of the ceiling?");
        width = scan.nextInt();

        ceiling = length * width;

        paint = ceiling / gallon;
        if(ceiling % gallon != 0){
            paint++;
        }
        System.out.println("You will need to purchase " + paint + " gallons of paint to cover " + ceiling + "square feet");

    }
}
