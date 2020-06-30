public class Day2 {
    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did";

//A1
        System.out.println (hannah.length());

        System.out.println (hannah.charAt(12));

        System.out.println (hannah.indexOf('b'));

        String original = "Java is great!";

        System.out.println("The character at position 1 is: " + original.charAt(1));
        System.out.println("The character at  position 3 is: " + original.charAt(3));
//A2
        String str = "Was it a car or a cat i saw";
        System.out.println (str.substring(9, 12));

    }
}

//test