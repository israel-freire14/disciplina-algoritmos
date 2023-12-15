package freire.israel.algoritmos_aulas.exercicios.aula;
import  javax.swing.JOptionPane;
public class EX01REC {
    /*1. Implemente uma função recursiva que, dados dois números inteiros x e n, calcula o valor de xn.
    Caso base: X = 1⁰
    3⁵= 3 x 3⁴
    3⁴ = 3 x 3³
    …
    3 = 1 ⁰
    matemática
    f(x,y) = x*x y-1
    computação
    exp(x,y) = x * exp(x,y-1)
     */

    public static int exp(int x, int y)
    {
        if(y > 0)
        {
            return  x * exp(x, y - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        //Declarar variaveis
        int x, y;

        //entrada de dados
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "primeiro número"));
        y = Integer.parseInt(JOptionPane.showInputDialog(null, "segundo número"));

        //saída de dados
        JOptionPane.showMessageDialog(null, exp(x, y));//chamar método exp();

    }
}
