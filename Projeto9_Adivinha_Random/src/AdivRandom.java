import java.util.Scanner; // Import necessário para utilizar a classe Scanner
import java.util.Random; // Import necessário para utilizar a classe Random


public class AdivRandom {
public static void main (String [] args){
    //Instancia buffer utilizando a classe Scanner
    Scanner entrada = new Scanner(System.in);
    //Instancia utilizando a classe Random
    Random rand = new Random();
    int palpite, num = 0;
    num = rand.nextInt (10) + 1;
    System.out.println ("Digite seu palpite: ");
    palpite = entrada.nextInt();
    if(palpite == num) {
        System.out.println("Você acertou! O número era " + num);
    }
    else {
        if(palpite < num) {
            System.out.println ("Seu palpite está abaixo! O número era " + num );
        } else {
            System.out.println ("Seu palpite está acima. O número era " + num );
        }
    }
    entrada.close();
 } //fim do metodo main
} // fim da classe AdviRandom


