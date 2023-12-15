package freire.israel.atividades_livro.CAPITULO_05;
import javax.swing.JOptionPane;
public class EXER06 {
    /*6)Modifique o algoritmo anterior para imprimir o valor de um número X elado a uma potencia Y*/
    public static void main(String[] args) {
        //declarar variáveis
        double base, resultado;
        int expoente;

        // Eentrada de dados
        base =Double.parseDouble(JOptionPane.showInputDialog("Digite a base (X):"));//base x
        expoente =Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente (Y):"));//expoente y

        // Calcular a potência de X elevado a Y
        resultado = Math.pow(base, expoente);


        // Exibir o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é: " + resultado);
    }
}

