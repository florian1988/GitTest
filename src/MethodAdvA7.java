public class MethodAdvA7 {
    static String meanCalculator(int nr1, int nr2, int nr3){ // the 3 int Parameters

        int average = (nr1+nr2+nr3) / 3; //calculation mean

        return "The average value is: " + average; // returns text and mean
    }

    public static void main(String[] args) {       //using the method with the needed values
        System.out.print(meanCalculator(25,45,65));
    }
}
//The average value is: 45
//Process finished with exit code 0
