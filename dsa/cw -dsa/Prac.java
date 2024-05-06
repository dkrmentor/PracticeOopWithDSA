import java.util.*;

public class Prac {

    public static void main(String[] args) {

        // t1
        // String a = "abc";
        // String b = "abc";

        // space will also be counted
        // String check = a+" "+b;
        // System.out.println(check.length());

        // equals
        // if (a.equals(b)) {
        // System.out.println("equal");
        // } else {
        // System.out.println("false");
        // }

        // // t2 - wont work
        // if (new String("abc") == new String("abc")) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        // // will work when it comes to new object assigning compareTo works so its
        // better
        // // for string use compreTo
        // if (new String("abc").compareTo(new String("abc")) == 0) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }

        // //t3- substring
        // String a = "i am dhara";
        // String b = a.substring(5,a.length());
        // System.out.println(b);

        // String a = "hello";
        // System.out.println(a.length());
        // for(int i = a.length()-1 ; i >= 0 ; i-- ){
        // System.out.print(a.charAt(i));
        // }

        // /// String builder
        // StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));
        // // replace character
        // sb.setCharAt(0, 'i');
        // System.out.println(sb);
        // // replace range of character
        // sb.replace(0, 1, "ir");
        // System.out.println(sb);
        // // insert range of character
        // sb.insert(3, 'n');
        // System.out.println(sb);
        // // delete range of character
        // sb.delete(3, 4);
        // System.out.println(sb);
        // sb.append(" is ");
        // System.out.println(sb);
        // sb.append("p");
        // sb.append("o");
        // sb.append("w");
        // sb.append("e");
        // sb.append("r");
        // System.out.println(sb);
        // System.out.println(sb.length());

        // m1 -reverse
        // sb.reverse();
        // System.out.println(sb);
        // m2 -reverse
        // for (int i = sb.length() - 1; i >= 0; i--) {
        // System.out.print(sb.charAt(i));
        // }
        // OR
        // StringBuilder a = new StringBuilder("hello");
        // for (int i = 0; i <= a.length() / 2; i++) {
        // int start = i;
        // int end = a.length() - 1 - i;
        // char startChar = a.charAt(start);
        // char endChar = a.charAt(end);
        // a.setCharAt(start, endChar);
        // a.setCharAt(end, startChar);
        // }
        // System.out.print(a);

        // //Palindrome check
        // StringBuilder a = new StringBuilder("madam");
        // boolean check = true;
        // for (int i = 0 ; i <= a.length()/2; i++) {
        // int start = i;
        // int end = a.length() - 1 -i ;
        // if(a.charAt(end) != a.charAt(start)){
        // check = false;
        // }
        // }
        // System.out.println("palindrome? "+ check);

    }
}
