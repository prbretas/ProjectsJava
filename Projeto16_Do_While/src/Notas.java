import java.util.Scanner;

public class Notas {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        double nota, soma = 0;
        do {
            System.out.println(" **** Digite uma nota ****");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) soma += nota;

        } while (nota >= 0  && nota <= 10);
        System.out.println("A soma das notas é: " + soma);
        entrada.close();
       } // fim do metodo main
} // fim da classe notas
