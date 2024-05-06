import java.util.*;

public class Main {
    public static void main(String[] args) {

        // // task1
        // System.out.print("hello world \n\nfrom \nTech");
        // System.out.println("hello");
        // System.out.print("hello world");

        // // task2
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        // // task 3
        // int a = 10;
        // int b = 25;
        // int sum = a + b;
        // System.out.print(sum);

        // // task 4
        // Scanner sc = new Scanner(System.in);
        // String word = sc.next(); //for a single word
        // System.out.print(word);
        // // String sentence = sc.nextLine(); //for a sentence
        // // System.out.print(sentence);

        // //task 5
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);

        // // task 6
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        // System.out.println("Adult");
        // }
        // else{
        // System.out.println("Not Adult");
        // }

        // // task7
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num%2==0){
        // System.out.println("even");
        // }
        // else{
        // System.out.println("odd");
        // }

        // // task8
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("a is greater");
        // } else if (b > a) {
        // System.out.println("b is greater");
        // } else {
        // System.out.println("equal");
        // }

        // // task9
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // if (x == 1) {
        // System.out.println("Hello");
        // } else if (x == 2) {
        // System.out.println("Namaste");
        // } else if (x == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("wrong input");
        // }

        // // task10
        // Scanner sc = new Scanner(System.in);
        // int y = sc.nextInt();
        // switch (y) {
        // case 1:
        // System.out.println("Hello");
        // break;
        // case 2:
        // System.out.println("Namaste");
        // break;
        // case 3:
        // System.out.println("Bonjour");
        // break;
        // default:
        // System.out.println("Wrong Input");
        // }

        // // task11
        // for(int i = 0 ; i < 100 ; i++){
        // System.out.println(i);
        // System.out.println("Hello World");
        // }

        // // task12
        // int i = 0;
        // while (i < 100) {
        // System.out.println(i);
        // System.out.println("Hello World");
        // i++;
        // }

        // // task12
        // int i = 0;
        // do {
        // System.out.println(i);
        // System.out.println("Hello World");
        // i++;
        // } while (i < 100);

        // // task13
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= num; i++) {
        // sum = sum + i;

        // }
        // System.out.println(sum);

        // // task13
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int table = 0;
        // for (int i = 1; i <= 10; i++) {
        // table = num * i;
        // System.out.println(num + " * " + i + " = " + table);
        // }

        // task 14
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // // task 15
        // int n = 4, m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || i == n || j == 1 || j == m) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // task15 -m1
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (i == n || j == 1 || (j == 2 && (i == 2 || i == 3) || (i == 3 & j == 3)))
        // {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // task15 -m2
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {

        // System.out.print(" * ");

        // }
        // System.out.println();
        // }

        // // task16 - m1
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j <= n; j++) { //reverse

        // System.out.print(" * ");

        // }
        // System.out.println();
        // }

        // // task16 - m2
        // int n = 4;
        // for (int i = n; i >= 1; i--) { //reverse
        // for (int j = 1; j <= i; j++) {

        // System.out.print(" * ");

        // }
        // System.out.println();
        // }

        // // task17 m1
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (j == (4 - i) || j == (3 - i) || j == (2 - i)) {
        // System.out.print(" ");
        // } else {

        // System.out.print("*");
        // }
        // }
        // System.out.println();
        // }

        // // task 17-m2
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // // task 17-m3
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n-i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // task18
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // task18 -m1
        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // task18 -m2
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 6 - i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // task 19 - floyds triangle
        // int num = 0;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // num = num + 1;
        // System.out.print(num + " ");
        // }
        // System.out.println();
        // }

        // // task20 - 01 triangle -m1
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i % 2 == 0 && j%2==1) || (j%2==0 && i%2==1)) {
        // System.out.print(" 0 ");
        // } else {
        // System.out.print(" 1 ");
        // }
        // }
        // System.out.println();
        // }

        // // task20 - 01 triangle - m2
        // int num = 0;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // num = i+j;
        // if (num%2==0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }

        // task 21
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // for (int j = 1; j <= 2 * (5 - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // for (int j = 1; j <= 2 * (5 - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // // task22
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // task 23
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // task 24
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= (5-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= (i*2)-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }
        //     for (int i = 5; i >= 1; i--) {
        //     for (int j = 1; j <= (5-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= (i*2)-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }



        
    }
}