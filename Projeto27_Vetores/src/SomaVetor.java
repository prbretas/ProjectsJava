public class SomaVetor {

    public static void main(String [] args){
        int [] array = {  87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        //adiciona o valor de cada elemento ao total

        for (int counter = 0; counter < array.length; counter++)
            total += array [counter];

        System.out.printf("A soma dos elementos do array é: %d%n", total);
    }
} // fim da classe SomaArray