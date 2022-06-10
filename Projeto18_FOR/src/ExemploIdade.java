import java.util.Scanner ;


public class ExemploIdade {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, acumuladorIdades = 0; // acumulador
        int contador ; //declara o contador

        for (contador = 0; contador < 5; contador++) {
            System.out.println("Digite a sua idade ");
            idade = entrada.nextInt();
            acumuladorIdades += idade; //acumula as idades
        }

        System.out.println("A soma das idades é " + acumuladorIdades);
        entrada.close();
       } // fim do metodo main
} // fim da classe ExemploIdade
