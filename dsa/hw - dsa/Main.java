import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // // QUESTION # 1

        // // Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        // // If the user enters 1 then keep taking input from the user for a student’s
        // // marks(out of 100).
        // // If they enter 0 then stop.
        // // If he/ she scores :
        // // Marks >=90 -> print “This is Good”
        // // 89 >= Marks >= 60 -> print “This is also Good”
        // // 59 >= Marks >= 0 -> print “This is Good as well”
        // // Because marks don’t matter but our effort does.1
        // // (Hint : use do-while loop but think & understand why)

        // Scanner inp = new Scanner(System.in);
        // int choice;
        // do {
        // System.out.println("Menu");
        // System.out.println("Enter 1 for inserting marks");
        // System.out.println("Enter 0 for Stop");
        // choice = inp.nextInt();
        // if (choice == 1) {
        // System.out.println("Enter Marks");
        // int marks = inp.nextInt();
        // System.out.println("you scored " + marks);
        // if (marks >= 90) {
        // System.out.println("This is Good");
        // } else if (marks <= 89 && marks >= 60) {
        // System.out.println("This is also Good");
        // } else if (marks <= 59 && marks >= 0) {
        // System.out.println("This is Good as well Because marks don’t matter but our
        // effort does.1");
        // }
        // } else if (choice == 0) {
        // System.out.println("Stop");
        // } else {
        // System.out.println("Wrong Input");
        // }
        // } while (choice != 0);
        // System.out.println("byebye");

        // QUESTION 2 -m1
        // Qs. Print if a number is prime or not (Input n from the user).
        // [In this problem you will learn how to check if a number is prime or not]

        // Scanner inp = new Scanner(System.in);
        // System.out.println("Enter your Number");
        // int num = inp.nextInt();
        // if( num == 2 || num ==3 ||( num %2 != 0 && num%3!= 0)){
        // System.out.println("Prime");
        // }
        // else{
        // System.out.println("not prime");
        // }

        // QUESTION 2 -m2
        // Qs. Print if a number is prime or not (Input n from the user).
        // [In this problem you will learn how to check if a number is prime or not]

        // Scanner inp = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = inp.nextInt();
        // System.out.println("your num is " + num);
        // int i;
        // int check = 0;
        // for (i = 2; i <= num/2; i++) {
        // if (num % i == 0) {
        // check= 1;
        // break;
        // }
        // }
        // if (check == 1) {
        // System.out.println(num + " not prime ");
        // } else {
        // System.out.println(num + " prime ");
        // }

        // // QUESTION 3
        // // Print a hollow Butterfly.
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int j = 1; j <= 2 * (5 - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");

        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // for (int j = 1; j <= 2 * (5 - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // if (j == 1 || j == i) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // QUESTION 4 Print a hollow Rhombus.
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 2 * (5 - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 5; j++) {
        // if (j == 1 || j == 5 || i == 1 || i == 5) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // //11 exp
        // for (int j = 0; j <= 5; j++) {
        // int pow = (int) Math.pow(11, j);
        // System.out.print(pow);
        // System.err.println();

        // }

        // // QUESTION 5 Print Pascal’s Triangle.
        // for (int i = 1; i <= 5; i++) {
        // int num = 1; // Initialize num to 1 for each row
        // for (int j = 1; j <= 6 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + num);
        // num = num * (i - j) / j; // Updated formula
        // }
        // System.out.println();
        // }


    }
}
