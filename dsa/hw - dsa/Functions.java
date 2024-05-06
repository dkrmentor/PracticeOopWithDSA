// public class Functions {
//     // Make a function to check if a number is prime or not.
//     public static void checkPrime(int num) {
//         int c = 0;
//         for (int i = 2; i <= num / 2; i++) {
//             if (num % i == 0) { // 25/5== 0 => not prime || 13/5 == 1 = > prime
//                 c = 1;
//                 break; 
//             }
//         }
//         if (c == 1) {
//             System.out.println("not Prime");
//         } else {
//             System.out.println("prime");
//         }
//         return;
//     }

//     // Make a function to check if a given number n is even or not.
//     public static void checkEven(int num) {
//         int c = 0;
//         if (num % 2 == 0) {
//             c = 1;
//         }
//         if (c == 1) {
//             System.out.println("even");
//         } else {
//             System.out.println("not even");
//         }
//         return;
//     }

//     // Make a function to print the table of a given number n.
//     public static void printTable(int num) {

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " * " + i + " = " + num * i);
//         }
//         return;
//     }

//     public static void main(String[] args) {
//         checkPrime(71);
//         checkEven(20);
//         printTable(5);

//     }

// }
