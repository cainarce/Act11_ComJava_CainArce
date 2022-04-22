import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        int op = 0;

        System.out.println("-----------------------------");
        System.out.println("----APLICACION DE FIGURAS----");
        System.out.println("-----------------------------");
        do {
            try {
                showMenu();

                Scanner leer = new Scanner(System.in);
                op = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Opción no válida.");
            }

            switch (op) {
                case 0:
                    System.out.println("Exit success");
                    break;
                case 1:
                    System.out.println("Seleccionaste el círculo");
                    circle.getArea();
                    circle.getPerimeter();
                    break;
                case 2:
                    System.out.println("Seleccionaste el cuadrado");
                    square.getArea();
                    square.getPerimeter();
                    break;
                case 3:
                    System.out.println("Seleccionaste el triángulo");
                    triangle.getArea();
                    triangle.getPerimeter();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (op != 0);

    }

    public static void showMenu() throws Exception {
        System.out.println("0 - Salir");
        System.out.println("1 - Círculo");
        System.out.println("2 - Cuadrado");
        System.out.println("3 - Triángulo");
        System.out.println("4 - Reiniciar juego");
    }
}