public class BaseFigura {
    int x;
    int y;

    public BaseFigura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void area(int x, int y){
        System.out.println("Площадь фигуры: " + x * y);
    }
}
