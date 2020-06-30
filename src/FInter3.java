public class FInter3 {
    static void FirstMethod(){
        String coding = "Coding is fun";
        String coding1 = "Coding is fnu";

        System.out.println("Coding is fun: ends with un? " + coding.endsWith("un"));
        System.out.println();
        System.out.print("Coding is fun: ends with un? " + coding1.endsWith("un"));

    }

    public static void main(String[] args) {
        FirstMethod();
    }
}

//outcome:
// Coding is fun: ends with un? true
//
//Coding is fun: ends with un? false
//Process finished with exit code 0