package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER04 {

        /*
            4)Uma máquina virtual recebe um valor e exibe o seu quadrado quando ele é par, e o seu    cubo quando ele é impar.
             Faça o algoritmo para esta máquina
        */

    public static void main(String[] args) {
        //declarar variáveis
        double valor;

        //entrada de dados

        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));

        //mostrar dados para o usuário
        if (valor % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O quadrado do valor é: " + Math.pow(valor, 2));
        } else {
            JOptionPane.showMessageDialog(null, "O cubo do valor é: " + Math.pow(valor, 3));
        }
    }
}