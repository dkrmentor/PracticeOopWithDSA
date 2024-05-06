public class PracWork {

    public static void main(String[] args) {

        // // t1- length of strings of array
        // String a = "dhara";
        // String b = "kumari";
        // String c = "rajput";
        // int len = 0 ;
        // String array [] = {a,b,c};
        // for (int i = 0 ; i <array.length ; i++){
        //      len = array[i].length() + len ;
        // }
        // System.out.println(len);

        // //t2 -conversion
        // String a = "12";
        // int convertedToInt = Integer.parseInt(a);
        // System.out.println(convertedToInt);
        // String covertedToString = Integer.toString(convertedToInt);
        // System.out.println(covertedToString);

        // t3-Input a string from the user. Create a new string called ‘result’ in which
        // you will replace the letter ‘e’ in the original string with letter ‘i’.
        // Example :
        // original = “eabcdef’ ; result = “iabcdif”
        // Original = “xyz” ; result = “xyz”

        // String a= "eabcdef";
        // String result= a.replace("e", "i");
        // System.out.println(result);

        // t4- Input an email from the user. You have to create a username from the
        // email by deleting the part that comes after ‘@’. Display that username to the
        // user.
        // Example :
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        // String a = "dkrmentor@gmail.com";
        // String result = "";
        // for (int i = 0; i < a.length(); i++) {
        // if (a.charAt(i) == '@') {
        // result = a.substring(0, i);
        // break;
        // }
        // }
        // System.out.println(result);




        // // t1 USING STRING BUILDER
        // StringBuilder a = new StringBuilder("dhara");
        // StringBuilder b = new StringBuilder("kumari");
        // StringBuilder c = new StringBuilder("rajput");
        // int len = 0 ;
        // StringBuilder array [] = {a,b,c};
        // for (int i = 0 ; i <array.length ; i++){
        //      len = array[i].length() + len ;
        // }
        // System.out.println(len);


        //  // t2-Input a string from the user. Create a new string called ‘result’ in which
        // // you will replace the letter ‘e’ in the original string with letter ‘i’.
        // // Example :
        // // original = “eabcdef’ ; result = “iabcdif”
        // // Original = “xyz” ; result = “xyz”

        // StringBuilder a = new StringBuilder("eabcdef");
        // for(int i =0 ; i<a.length(); i++){
        //     if(a.charAt(i) == 'e'){
        //        a.setCharAt(i, 'i');
        //     }
        // }   
        // System.out.println(a);

        // t3- Input an email from the user. You have to create a username from the
        // email by deleting the part that comes after ‘@’. Display that username to the
        // user.
        // Example :
        // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        // email = “helloWorld123@gmail.com”; username = “helloWorld123”

        // StringBuilder a = new StringBuilder("dkrmentor@gmail.com");

        // String result = "";
        // for (int i = 0; i < a.length(); i++) {
        // if (a.charAt(i) == '@') {
        // result = a.substring(0, i);
        // break;
        // }
        // }
        // System.out.println(result);


    }
}