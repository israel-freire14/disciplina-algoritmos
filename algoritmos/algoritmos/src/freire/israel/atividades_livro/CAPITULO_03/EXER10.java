package freire.israel.atividades_livro.CAPITULO_03;
import javax.swing.JOptionPane;
public class EXER10 {
    /*
        10) Construa um algoritmo para calcular a distância entre dois pontos de plano carteseabi.
        Cada ponto é um par ordenado (x,y)
    */

    public static void main(String[] args) {

        //declarar variáveis
        double x1, y1, x2, y2, dist;

        //entrada de dados
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do primeiro ponto:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do primeiro ponto:"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do segundo ponto:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do segundo ponto:"));

        //calcular a distância
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        //mostra dados para o usuário
        JOptionPane.showMessageDialog(null, "A distância entre os pontos é: " + dist);
    }
}
