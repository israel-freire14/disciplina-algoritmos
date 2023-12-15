package freire.israel.atividades_livro.CAPITULO_04;
import javax.swing.JOptionPane;
public class EXER06 {

    /*6)Entrar com o ano e informar se o mesmo é bissexto ou não.
        Informe-se sobre como funciona o ano bisexto.*/

    public static void main(String[] args) {

        //declarar  variáveis
        int ano;
        //etnrada de dados
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        //mostrar dados para o usuário se um ano é bissexto ou não.
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            JOptionPane.showMessageDialog(null, ano + " é um ano bissexto.");
        } else {
            JOptionPane.showMessageDialog(null, ano + " não é um ano bissexto.");
        }
    }
}
