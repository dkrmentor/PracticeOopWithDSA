public class Test {

    public static void main(String[] args) {
       String str = "madam";
       String reverseStr = "";
       for(int i = str.length()-1;i>=0;i--){
        reverseStr= reverseStr+str.charAt(i);        
       }  
       System.out.println("is palindrome? " + str.equals(reverseStr));

    }
}
