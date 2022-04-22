import java.util.Scanner;

public class Square implements Shape{

    double sideLength;

    Scanner leer = new Scanner(System.in);

    public void getArea() {
        System.out.println("--ÁREA--");
        System.out.println("Valor del lado:");
        sideLength = leer.nextDouble();

        System.out.println("El área del cuadrado = " + Math.pow(sideLength,2));
    }

    public void getPerimeter() {
        System.out.println("--PERÍMETRO--");
        System.out.println("El perímetro del cuadrado = " + (sideLength*4));
    }
}
