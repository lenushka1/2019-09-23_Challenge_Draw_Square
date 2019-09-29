public class Drawing {
    public static void main (String [] args) {
        top();
        bottom();
        blank();
        middle();
        blank();
        top();
        bottom();
        blank();
        middle();
        bottom();
        blank();
        top();
        middle();
        bottom();
    }
    static void top() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    static void bottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    static void middle() {
        System.out.println("-\"-'-\"-'-\"-");
    }
    static void blank() {
        System.out.println("");
    }
}
