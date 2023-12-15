package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER07 {
    //7) Mostre o que será impresso pelo algoritimo abaixo:
    //Loop infinito: Passei por aqui!1, 13 e Ufa, cheguei aqui!
    public static void main(String[] args) {

        // Inicializar variáveis
        int i = 1;

        // Loop while
        while (i < 20) {
            // Incrementar i
            i += 2;

            // Mostrar mensagem
            JOptionPane.showMessageDialog(null, "Passei por aqui!");

            // Chamar função quad(1)
            quad(1);

            // Mostrar número 13
            JOptionPane.showMessageDialog(null, 13);

            // Mostrar mensagem
            JOptionPane.showMessageDialog(null, "Ufa, cheguei aqui!");
        }
    }

    public static void quad(int x) {
        // Calcular e mostrar o quadrado de x
        JOptionPane.showMessageDialog(null, x * x);
    }
}