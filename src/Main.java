import java.text.DecimalFormat;
import java.util.Scanner; //Librería para poder ingresae datos

public class Main {
    public static void main(String[] args) {
        //Ejercicio IMC
        Scanner readIn = new Scanner(System.in); //Variable para ingresar datos
        String name;
        float height, weigth;
        System.out.println("Ingrese su nombre");
        name = readIn.nextLine();
        System.out.println("Ingrese su peso");
        weigth = readIn.nextFloat();
        System.out.println("Ingrese su altura");
        height = readIn.nextFloat();
        System.out.println(name + " su IMC es: " + (weigth / (height*height)));

        //Ejercicio Interés compuesto
        double monto;
        double principal = 1000.0;
        double tasa = 0.05;
        System.out.printf("s%20s\n", "Año", "Monto en depósito");
        int year = 1;
        while (year<=10) {
            monto = principal * Math.pow(1.0 + tasa, year);
            System.out.printf("%4d%,20.2f\n", year, monto);
            year+=1;
        }
    }
}