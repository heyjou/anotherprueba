import java.util.Scanner;

public class testa {

    public static void main (String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Pulsa una opción:");
        System.out.println(" 1. sumar");
        System.out.println(" 2. restar");
        System.out.println(" 3. multiplicar:");
        System.out.println(" 4. dividir");
        System.out.println(" 5. salir");

        int respuesta = sc.nextInt();

        switch (respuesta){
            case 1:
                System.out.println(" dame un numero 1:");
                num1 = sc.nextInt();
                System.out.println(" dame un numero 2:");
                num2 = sc.nextInt();
                int suma = num1+num2;
                System.out.println(" la suma es " +suma);
                break;

            case 2:
                System.out.println(" dame un numero 1:");
                num1 = sc.nextInt();
                System.out.println(" dame un numero 2:");
                num2 = sc.nextInt();
                int resta = num1-num2;
                System.out.println(" la suma es " +resta);
                break;

            case 3:
                System.out.println(" dame un numero 1:");
                num1 = sc.nextInt();
                System.out.println(" dame un numero 2:");
                num2 = sc.nextInt();
                int multiplicacion = num1*num2;
                System.out.println(" la suma es " +multiplicacion);
                break;

            case 4:
                System.out.println(" dame un numero 1:");
                num1 = sc.nextInt();
                System.out.println(" dame un numero 2:");
                num2 = sc.nextInt();
                int division = num1/num2;
                System.out.println(" la suma es " +division);
                break;

            default:
                break;
        }


    }

}
