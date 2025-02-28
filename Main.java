import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractStack<String> stack;
        
        System.out.println("Seleccione la implementación de la pila:");
        System.out.println("1. ArrayListStack");
        System.out.println("2. VectorStack");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        if (choice == 1) {
            stack = new ArrayListStack<>();
        } else {
            stack = new VectorStack<>();
        }
        
        boolean running = true;
        while (running) {
            System.out.println("\nOperaciones disponibles:");
            System.out.println("1. Push (Agregar elemento)");
            System.out.println("2. Pop (Eliminar elemento)");
            System.out.println("3. Peek (Ver elemento superior)");
            System.out.println("4. Verificar si está vacía");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1:
                    System.out.print("Ingrese un elemento: ");
                    String item = scanner.nextLine();
                    stack.push(item);
                    System.out.println("Elemento agregado.");
                    break;
                case 2:
                    String removed = stack.pop();
                    if (removed != null) {
                        System.out.println("Elemento eliminado: " + removed);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 3:
                    String top = stack.peek();
                    if (top != null) {
                        System.out.println("Elemento superior: " + top);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 4:
                    System.out.println(stack.isEmpty() ? "La pila está vacía." : "La pila no está vacía.");
                    break;
                case 5:
                    running = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}
