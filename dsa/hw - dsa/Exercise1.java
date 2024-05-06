import java.util.Scanner;

public class Exercise1 {

    // Question 1
    // // Enter 3 numbers from the user & make a function to print their average.
    // public static void printAverage(int n1, int n2,int n3){
    // System.out.println("THE AVG IS : "+ (n1+n2+n3)/3);
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // int num1 = inp.nextInt();
    // int num2 = inp.nextInt();
    // int num3 = inp.nextInt();
    // printAverage(num1,num2,num3);
    // }

    // // Question 2
    // // Write a function to print the sum of all odd numbers from 1 to n.
    // public static void sumOddNum(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + i;
    // }
    // }
    // System.out.println("sum of all odd num "+sum);
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // int n = inp.nextInt();
    // sumOddNum(n);
    // }

    // // Question 3
    // // Write a function which takes in 2 numbers and returns the greater of those
    // two.
    // public static int greater(int num1, int num2) {
    // if (num1 > num2) {
    // return num1;
    // } else if (num1 < num2) {
    // return num2;
    // } else {
    // return -1;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // int n1 = inp.nextInt();
    // int n2 = inp.nextInt();
    // int result = greater(n1, n2);
    // if (result == -1) {
    // System.out.println("The numbers are equal.");
    // } else {
    // System.out.println("The greater number is: " + result);
    // }
    // }

    // // Question 4
    // // Write a function that takes in the radius as input and returns the
    // circumference of a circle.
    // public static float circumference(int r){
    // return 2*3.14f*r;
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // System.out.println("Enter radius : ");
    // int radius = inp.nextInt();
    // System.out.println("Circumference of circle is : "+ circumference(radius));
    // }

    // // Question 5
    // // Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.
    // public static void eligibleCheck(int age) {
    // if (age >= 18) {
    // System.out.println("Eligible");
    // } else {
    // System.out.println("not eligible");
    // }
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // System.out.println("enter age");
    // int age = inp.nextInt();
    // eligibleCheck(age);
    // }

    // // Question 6
    // // Write an infinite loop using do while condition.
    // public static void main(String[] args) {
    // int i = 1;
    // do {
    // System.out.println("infiniteloop");
    // i++;
    // } while (i >= 1);
    // }

    // // Question 7
    // // Write a program to enter the numbers till the user wants and at the end it
    // should display the count of positive, negative and zeros entered.
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // int choice = 0;
    // int p = 0, n = 0, z = 0;
    // do {
    // System.out.println("Enter 1 to continue");
    // choice = inp.nextInt();
    // if (choice == 1) {
    // System.out.println("enter number");
    // int num = inp.nextInt();
    // if (num > 0) {
    // System.out.println("positive");
    // p++;
    // } else if (num < 0) {
    // System.out.println("negative");
    // n++;
    // } else {
    // System.out.println(0);
    // z++;
    // }
    // } else {
    // System.out.println("terminate");
    // break;
    // }
    // } while (choice == 1);
    // System.out.println("number of positive integers are : " + p);
    // System.out.println("number of negative integers are : " + n);
    // System.out.println("number of zero integers are : " + z);
    // }

    // // Question 8
    // // Two numbers are entered by the user, x and n. Write a function to find the
    // // value of one number raised to the power of another i.e. xn.
    // public static void power(int x, int n) {
    // double result = Math.pow(x, n);
    // System.out.println(result);
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // System.out.println("enter num");
    // int x = inp.nextInt();
    // System.out.println("enter exp");
    // int n = inp.nextInt();
    // power(x, n);
    // }

    // // Question 9
    // // Write a function that calculates the Greatest Common Divisor of 2 numbers.
    // public static void divisor(int n1, int n2) {
    // int num, result, store = 0;
    // if (n1 < n2) {
    // num = n1;
    // } else {
    // num = n2;
    // }
    // for (int i = 1; i <= num; i++) {
    // if (n1 % i == 0 && n2 % i == 0) {
    // store = i;
    // }
    // }
    // result = store;
    // System.out.println(result);
    // }
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // int n1 = inp.nextInt();
    // int n2 = inp.nextInt();
    // divisor(n1, n2);
    // }

    // // Question 10
    // // Write a program to print Fibonacci series of n terms where n is input by
    // user
    // // 0 1 1 2 3 5 8 13 21 .....
    // public static void main(String[] args) {
    // Scanner inp = new Scanner(System.in);
    // int n = inp.nextInt();
    // int result = 0, n1 = 1, n2 = 1;
    // for (int i = 1; i <= n; i++) {
    // System.out.print(result);
    // n1 = n2;
    // n2 = result;
    // result = n1 + n2;
    // }
    // }

}
