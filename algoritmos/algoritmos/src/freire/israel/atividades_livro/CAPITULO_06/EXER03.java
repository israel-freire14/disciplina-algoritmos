package freire.israel.atividades_livro.CAPITULO_06;
import javax.swing.JOptionPane;
public class EXER03 {

    /*
        3) Escreva um algoritmo que leia uma série de 20 saldos de clientes de um banco e armazene em uma
        estrutura do tipo vetor. Imprimir depois aqueles saldos com centavos
    */

    public static void main(String[] args) {
        //declarar variáveis e vetores
        double[] saldos = new double[20];

        // Lê os saldos do usuário
        for (int i = 0; i < saldos.length; i++) {
            saldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo do cliente " + (i + 1)));
        }

        // Imprime os saldos com centavos
        for (double saldo : saldos) {
            JOptionPane.showMessageDialog(null, "Saldo: " + String.format("%.2f", saldo));
        }
    }
}
