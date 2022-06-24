public class CircleFigura extends BaseFigura {
    public CircleFigura(int x, int y) {
        super(x, y);
    }
    public static void area(int x, int y){
        int d = x + y;
        System.out.println("Площадь круга: " + (d * d) / (4 * 3.14));
    }
}
