import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        // // task1
        // int marks[] = new int[3];
        // System.out.println(marks[0] +"" +marks[1] +""+marks[2]);
        // marks[0] = 22;
        // marks[1] = 21;
        // marks[2] = 98;
        // System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
        // for(int i =0 ; i<3;i++){
        // System.out.println("marks " +marks[i]);
        // }

        // // task2
        // int marks[] = {22,21,98};
        // System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
        // for(int i =0 ; i<3;i++){
        // System.out.println("marks " +marks[i]);
        // }

        // // task3
        // Scanner inp = new Scanner(System.in);
        // System.out.println("length");
        // int size = inp.nextInt();
        // int arr[] = new int[size];
        // for(int i =0; i<size ; i++){
        // System.out.println("value for "+ arr[i] + " index");
        // arr[i]=inp.nextInt();
        // }
        // for(int i =0; i<size ; i++){
        // System.out.println(arr[i]);
        // }

        // // task4
        // Scanner inp = new Scanner(System.in);
        // System.out.println("length");
        // int size = inp.nextInt();
        // int arr[] = new int[size];
        // for (int i = 0; i < size; i++) {
        // System.out.println("value for " + i + " index");
        // arr[i] = inp.nextInt();
        // }
        // System.out.println("values are");
        // for (int i = 0; i < size; i++) {

        // System.out.println(arr[i]);
        // }
        // System.out.println("search index by value");
        // int check = inp.nextInt();
        // // linear search
        // for (int i = 0; i < size; i++) {
        // if (arr[i] == check) {
        // System.out.println("index of " + check + " is " + i);
        // }
        // }

        // // 2d array
        // Scanner inp = new Scanner(System.in);
        // int row = inp.nextInt();
        // int col = inp.nextInt();
        // int matrix[][] = new int[row][col];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // matrix[i][j] = inp.nextInt();
        // }
        // }
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // int x = inp.nextInt();
        // if (x == matrix[i][j]) {
        // System.out.println(i + "," + j);
        // }

        // }
        // }

        // // sort
        // int a[] = { 3, 7, 1, 2, 5 };
        // // bubble sort
        // // for (int i = 0 ; i<a.length-1; i++){
        // // for(int j = 0 ; j<a.length-1-i;j++){
        // // if(a[j]>a[j+1]){
        // // //perform swap
        // // int temp = a[j+1];
        // // a[j+1] =a[j];
        // // a[j]= temp;
        // // }
        // // }
        // // }

        // //print sorted elements
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i]);
        // }

        // // sort
        // int a[] = { 3, 7, 1, 2, 5 };
        // // // selection sort
        // // for (int i = 0; i < a.length - 1; i++) {
        // //     int smallestIndex = i;
        // //     for (int j = i + 1; j < a.length; j++) {
        // //         if (a[smallestIndex] > a[j]) {
        // //             smallestIndex = j;
        // //         }
        // //     }
        // //     // perform swap
        // //     int temp = a[smallestIndex];
        // //     a[smallestIndex] = a[i];
        // //     a[i] = temp;
        // // }
        // // print sorted elements
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]);
        // }



        //  // sort
        // int a[] = { 3, 7, 1, 2, 5 };
        // // // insertion sort
        // for (int i = 0; i < a.length - 1; i++) {
        //     int smallestIndex = i;
        //     int sortedNumbers = i;
        //     for (int j = i + 1; j < a.length; j++) {
        //         if (a[smallestIndex] > a[j]) {
        //             smallestIndex = j;
        //         }
        //     }
        //     // perform swap
        //     int temp = a[smallestIndex];
        //     a[smallestIndex] = a[i];
        //     a[i] = temp;
        // }
        // // print sorted elements
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]);
        // }

    }

}
