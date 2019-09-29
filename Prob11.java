public class Prob11 {
    public static void main (String [] args) {
        drawFigure();
    }
    
    static void drawFigure() {
        final int N = 5;
        final int MAXLEN = 16;
        final int STEP = 4;
        final int CORR = 1;
        final int DUP = 2;
        for (int line = 1; line <= N; line++) {
            for (int i = 1; i <= MAXLEN - STEP * (line - CORR); i++) {
                System.out.print("/");
            }
            for (int i = 1; i <= (MAXLEN / STEP) * (line - CORR) * DUP; i++){
                System.out.print("*");
            }
            for (int i = 1; i <= MAXLEN - STEP * (line - CORR); i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
