import java.util.Scanner;

public class Triangle implements Shape{

    double base;
    double height;
    double sideLength;

    Scanner leer = new Scanner(System.in);

    public void getArea() {
        System.out.println("--ÁREA--");
        System.out.println("Valor de la base:");
        base = leer.nextDouble();
        System.out.println("Valor de la altura:");
        height = leer.nextDouble();

        System.out.println("El área del círculo = " + ((base*height)/2));
    }

    public void getPerimeter() {
        System.out.println("--PERÍMETRO--");
        System.out.println("Valor de un lado superior:");
        sideLength = leer.nextDouble();

        System.out.println("El perímetro del círculo = " + ((2*sideLength) + base));
    }
}
