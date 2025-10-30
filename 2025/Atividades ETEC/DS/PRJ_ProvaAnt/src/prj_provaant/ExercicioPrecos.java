package prj_provaant;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class ExercicioPrecos {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        String produto;
        double preco1, preco2, preco3, preco4, media, maior, menor;
        JOptionPane.showMessageDialog(null, "Analizador de preços");
        produto = JOptionPane.showInputDialog("Digite o nome do produto");
        preco1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º preço para este produto"));
        preco2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º preço para este produto"));
        preco3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º preço para este produto"));
        preco4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4º preço para este produto"));
        media = media(preco1, preco2, preco3, preco4);
        maior = maior(preco1, preco2, preco3, preco4);
        menor = menor(preco1, preco2, preco3, preco4);
        JOptionPane.showMessageDialog(null, "O preço médio de "+produto+" é R$"+deci.format(media));
        JOptionPane.showMessageDialog(null, "O maior preço é R$"+deci.format(maior));
        JOptionPane.showMessageDialog(null, "O menor preço é R$"+deci.format(menor));
    }
    static double media(double p1, double p2, double p3, double p4){
        double m;
        m = (p1 + p2 + p3 + p4) / 4;
        return m;
    }
    static double maior(double p1, double p2, double p3, double p4){
        double ma;
        if(p1>=p2 && p1>=p3 && p1>=p4){
            ma = p1;
            return ma;
        }
        else if(p2>=p3 && p2>=p4){
            ma = p2;
            return ma;
        }
        else if(p3>=p4){
            ma = p3;
            return ma;
        }
        else{
            ma = p4;
            return ma;
        }
    }
    static double menor(double p1, double p2, double p3, double p4){
        double me;
        if(p4<=p3 && p4<=p2 && p4<=p1){
            me = p4;
            return me;
        }
        else if(p3<=p2 && p3<=p1){
            me = p3;
            return me;
        }
        else if(p2<=p1){
            me = p2;
            return me;
        }
        else{
            me = p1;
            return me;
        }
    }
}