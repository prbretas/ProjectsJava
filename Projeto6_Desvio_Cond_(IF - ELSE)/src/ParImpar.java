import java.util.Scanner; // Import necessario para utilizar a classe

public class ParImpar {
    public static void main (String[] args){
        //Instancia do objeto buffer utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        int numero ;
        System.out.println ("Digite um numero inteiro: ");
        numero = entrada.nextInt();

        //Verifica se o numero é par
        if((numero % 2) == 0) {
            System.out.println("O número " + numero + " é par");

        }
        else {
            System.out.println("O número " + numero + " é ímpar");
        }
        entrada.close();
    } // fim do metodo main
}// fim da classe ParImpar







