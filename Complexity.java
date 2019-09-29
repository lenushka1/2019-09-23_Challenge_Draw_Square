public class Complexity {
    public static void main (String [] args) {
        callCallPrint4x();
    }
    static void print4x() {
        System.out.println ("Controlling complexity is the essence of programming!");
        System.out.println ("Controlling complexity is the essence of programming!");
        System.out.println ("Controlling complexity is the essence of programming!");
        System.out.println ("Controlling complexity is the essence of programming!");
    }
    static void callPrint4x() {
        print4x();
        print4x();
        print4x();
        print4x();
    }
    static void callCallPrint4x() {
        callPrint4x();
        callPrint4x();
        callPrint4x();
        callPrint4x();
    }
}
