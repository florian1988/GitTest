public class A31 {
    public static void main(String args[])
    {

        //indexOf()
        String str = ("Coding is fun or fnu");

        System.out.print("Found u first at position: ");
        System.out.println(str.indexOf('u'));


        //startsWith()
        System.out.print("String starts with Coding: ");
        System.out.println(str.startsWith("Coding"));

        System.out.print("String starts with fun: ");
        System.out.println(str.startsWith("fun"));

        //compareTo()
        String str2 = ("Coding is amazing");
        int var = (str.compareTo(str2));
        System.out.println("Comparison of str and str2 = " +var);

        //trim()
        String str3 ="    Coding is fun   ";

        System.out.print("Whitespace is gone:" );
        System.out.println(str3.trim() );

        //replace()

        System.out.print("Replaces every i with e: ");
        System.out.println(str2.replace("in","e"));

        //replaceAll()

        System.out.print("Removes every whitespace: ");
        System.out.println(str2.replaceAll(" ", ""));

        //split()

        System.out.print("Separates a word: ");
        String[] arrOfString = (str2.split(" "));
        String new1 = arrOfString [1];
        System.out.print (new1);

/*
Found u first at position: 11
String starts with Coding: true
String starts with fun: false
Comparison of str and str2 = 5
Whitespace is gone:Coding is fun
Replaces every i with e: Codeg is amazeg
Removes every whitespace: Codingisamazing
Separates a word: is
Process finished with exit code 0
 */






    }
}