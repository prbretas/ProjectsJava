import java.util.Scanner; // import necessario para utilizar a classe


public class Media {

    public static void main (String[] args){
        //Instância  do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        //Declaração de variáveis
        String aluno;
        double nota1, nota2, media;
        System.out.println("Digite seu nome: ");
        aluno = entrada.nextLine(); //Recebe o nome do aluno

        System.out.println("Digite duas notas");
        nota1 = entrada.nextDouble(); //Recebe a primeira nota
        nota2 = entrada.nextDouble(); //Recebe a segunda nota

        media = ( nota1 + nota2) / 2; //Calcula a media das notas

        System.out.println(aluno + " a sua média é: " + media); //Exibe a média final

        entrada.close(); //Encerra a instância
    } // fim do método main
} // fim da classe Media


