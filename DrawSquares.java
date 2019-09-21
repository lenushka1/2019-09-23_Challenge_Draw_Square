public class DrawSquares {
    public static void main(String []args){
        for(int j=0; j<6;j++){
            drawH();
            for (int i=0;i<5;i++){
                drawV();
            }
            drawH();
        }
    }
    public static void drawH(){
        System.out.println("+------------+");
    }
    public static void drawV(){
        System.out.println("|            |");
    }
}
