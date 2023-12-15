package freire.israel.algoritmos_aulas.quartalista;
import javax.swing.JOptionPane;
public class EXER01VET {
    public static void main(String[] args) {
        /*
            1. Faça um programa que leia 10 valores reais e os apresente na ordem inversa de entrada.
         */

        //Utilizando String e um vetor (Unidimensional)

        double[] v1 = new double[10];

        String resultado = "";

        //Prencher o primeiro vetor
        for (int i = 0; i < 10; i++) {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o " + (i + 1) +
                    "° valor: "));
        }

        //Quardar valores em uma String invertendo a ordem deles
        for (int j = 9; j >= 0; j--) {

            resultado = resultado + v1[j] + "\n";

        }

        //Mostrar Resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

    }
}