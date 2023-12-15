package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER02 {

    /*2)Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras*/

    public static void main(String[] args) {

        //declare variáveis
        int  qtdCavalos, qtdFerraduras;

        //entrada de dados
        qtdCavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de cavalos:"));

       //calcular qtd de ferraduras
        qtdFerraduras = qtdCavalos * 4;

        //mostrar dados para o usuário
        JOptionPane.showMessageDialog(null, "São necessárias " + qtdFerraduras + " ferraduras.");




    }
}
