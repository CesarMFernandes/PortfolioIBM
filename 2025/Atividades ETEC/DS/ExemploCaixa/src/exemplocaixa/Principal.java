package exemplocaixa;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Principal {
    public static void main(String[] args) {
        Caixa cx1 = new Caixa();
        DecimalFormat deci = new DecimalFormat("0.00");
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1- Entrada\n2- Retirada\n3- Consultar saldo\n0- Sair"));
            switch(op){
                case 1:
                    cx1.entrar();
                    break;
                case 2:
                    cx1.retirar();
                    break;
                case 3:
                    if(cx1.getSaldo()>=0){
                        JOptionPane.showMessageDialog(null, "Saldo atual: R$"+deci.format(cx1.getSaldo()));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Saldo atual: -R$"+deci.format(cx1.getSaldo()*(-1)));
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando programa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
        }while(op != 0);
    }
}
