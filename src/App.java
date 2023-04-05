import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double grau;
        double resultado;
        
     Scanner teclado = new Scanner(System.in);

     System.out.print("Coloque a temperatura em graus fahrenheit °F: ");
     grau=teclado.nextDouble();
     teclado.close();

     resultado =  5 * ((grau-32) / 9);

     System.out.printf("\nO resultado em graus celsius foi: %.1f °C",resultado);
     
    }
}
