import java.util.Scanner;

public class LeerPalabra {
    Scanner scanner= new Scanner(System.in);
    Cifrar cifrar= new Cifrar();
    String [] palabra;
    public void ingresaPalabra(){
        System.out.println("____________________________________________");
        System.out.println("\t\t\t\t BIENVENIDO ");
        System.out.println("____________________________________________");
        System.out.println("[1].-Cifra tu mensaje");
        System.out.println("[2].-Desifra tu mensaje");
        int op= scanner.nextInt();
        System.out.println("Ingrese la palabra: ");
        String palabraCifrada= scanner.next();
        palabra= cifrar.cifrandoRot13(palabraCifrada);
        cifrar.muestra(palabra,op);
    }
}
