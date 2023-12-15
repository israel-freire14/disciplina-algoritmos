package freire.israel.algoritmos_aulas.exercicios.aula;
import javax.swing.JOptionPane;

public class EXER04 {
    public static void main(String[] args) {
        // Declara o vetor
        int[] valores = new int[10];
        int j = 0;
        int contar = 0;
        int[] divisiveis = new int[10];


        // Lê os valores do usuário
        for (int i = 0; i < valores.length; i++) {
            String valor = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor: ");
            valores[i] = Integer.parseInt(valor);
        }

        // Solicita o valor de referência
        String valorRef = JOptionPane.showInputDialog("Digite o valor de referência: ");
        int refe = Integer.parseInt(valorRef);

        // Conta quantas vezes o valor de referência aparece no vetor

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == refe) {
                contar++;
            }
        }

        // Armazena todos os números divisiveis pelo valor de referência em um vetor

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % refe == 0) {
                divisiveis[j] = valores[i];
                j++;
            }
        }

        // Mostra o resultado
        JOptionPane.showMessageDialog(null, "O valor de referência aparece " + contar + " vezes no vetor.");
        JOptionPane.showMessageDialog(null, "Os números divisiveis pelo valor de referência são: " + divisiveis[j]);
    }
}

