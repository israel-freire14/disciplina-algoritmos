package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER01 {

     /*
        1) A partir do saldo bancário inicial, um cliente teve débitos e créditos ao longo do mês.
        Faça um algoritmo para ler o saldo inicial, o total de débitos e o total de créditos,e depois
        escrever o saldo final do cliente através da mensagem "Saldo positivo em R$xx" ou Saldo negativo em R$xx" ou "Saudo zero".
     */

    public static void main(String[] args) {

        //declarar variáveis
        double saldoInicial, debitos, creditos, saldoFinal;

        //entrada de dados
        saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial(R$):"));
        debitos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de débitos(R$):"));
        creditos = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de créditos(R$):"));

        // Calcula o saldo final
        saldoFinal = saldoInicial - debitos + creditos;

        //Mostrar dados para o usuário
        if (saldoFinal > 0) {
            JOptionPane.showMessageDialog(null, "Saldo positivo em R$" + saldoFinal);
        } else if (saldoFinal < 0) {
            JOptionPane.showMessageDialog(null, "Saldo negativo em R$" + saldoFinal);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo zero.");
        }
    }
}


