package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER08 {

    /*
        8) Faça um algoritmo para ler um ponto (x,y) do plano cartesiano e exibir uma mensagem se está acima, abaixo ou pertence á parábola x² -3x + 1 = 0.
     */

    public static void main(String[] args) {

        //declarar variáveis
        double x, y, parabola;

        //entrada de dados
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y:"));

        //calcular a parábola
        parabola = x * x - 3 * x + 1;

        //mostra dados para o usuário se o ponto está acima, abaixo ou pertence à parábola
        if (y > parabola) {
            JOptionPane.showMessageDialog(null, "O ponto está acima da parábola.");
        } else if (y < parabola) {
            JOptionPane.showMessageDialog(null, "O ponto está abaixo da parábola.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto pertence à parábola.");
        }
    }
}
