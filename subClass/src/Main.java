import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("Y = " );
        int y = scanner.nextInt();

        BaseFigura.area(x, y);
        TringleFigera.area(x, y);
        CircleFigura.area(x, y);
    }

}