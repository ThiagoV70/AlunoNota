import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
   Notas notas = new Notas();
    Locale.setDefault(Locale.US);
        System.out.print("Digite o nome do aluno: ");
        notas.name = sc.nextLine();
        notas.nota1 = sc.nextInt();
        notas.nota2 = sc.nextInt();
        notas.nota3 = sc.nextInt();

        System.out.print("FINAL GRADE: " + String.format("%.2f",notas.media()));

        if (notas.finalgrade() >= 60.00){
            System.out.println();
            System.out.print("PASS");
        }else{
            System.out.println();
            System.out.print("FAILED");
            System.out.println();
            System.out.println("MISSING " + String.format("%.2f",notas.finalgrade()) + " POINTS");
        }
    }
}