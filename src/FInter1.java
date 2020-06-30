public class FInter1 {
    public static void main(String[] args) {
        String ApiTest = "   some strange things   ";

        System.out.println(ApiTest.toUpperCase());
        System.out.println(ApiTest.toLowerCase());
        System.out.println(ApiTest.indexOf("strange"));
        System.out.println(ApiTest.trim());
        System.out.println(ApiTest.replaceAll("some", "all"));




    }
}
//outcome:
//   SOME STRANGE THINGS
//   some strange things
//8
//some strange things
//   all strange things
