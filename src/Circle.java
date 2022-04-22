import java.util.Scanner;

public class Circle implements Shape{
    double pi = 3.1416;
    double radio;
    double diameter;

    Scanner leer = new Scanner(System.in);

    public void getArea() {
        System.out.println("--ÁREA--");
        System.out.println("Valor del radio:");
        radio = leer.nextDouble();

        System.out.println("El área del círculo = " + (pi * Math.pow(radio,2)));
    }

    public void getPerimeter() {
        diameter = radio*2;

        System.out.println("--PERÍMETRO--");
        System.out.println("Valor del diámetro:");
        System.out.println(diameter);

        System.out.println("El perímetro del círculo = " + (pi * diameter));
    }
}
