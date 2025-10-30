package exemplocaixa;
import javax.swing.JOptionPane;
public class Caixa {
    //Atributo
    private double saldo;
    
    //Construtor
    public Caixa(){
        this(0);
    }
    public Caixa(double saldo) {
        this.saldo = saldo;
    }
    
    //getter
    public double getSaldo() {
        return saldo;
    }
    
    //setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //métodos
    public void entrar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada:"));
        this.setSaldo(this.saldo + valor);
    }
    public void retirar(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de retirada:"));
        this.setSaldo(this.saldo - valor);
    }
}
