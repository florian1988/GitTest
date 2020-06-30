public class FAdvString {
    static void AdvancedMethod(){
       String FirstN = "John";
       String f = "";
       String LastN = "Doe";
       String l = "";

       String FirstL = f += FirstN.charAt(0);
       String LastL = l += LastN.charAt(0);
       System.out.println(FirstL + " " + LastL);
    }

    public static void main(String[] args) {
        AdvancedMethod();
    }
}

//outcome:
// J D
//
//Process finished with exit code 0