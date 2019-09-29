public class Pattern {
    final static int HEIGHT = 5;
    public static void main (String [] args) {
        for(int i = 0; i < HEIGHT; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for(int j = HEIGHT - i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
