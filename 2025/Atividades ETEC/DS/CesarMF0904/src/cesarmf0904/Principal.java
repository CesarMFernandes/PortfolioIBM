package cesarmf0904;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); // calc is short for calculator, I'm just using slang guys
        int op;
        JOptionPane.showMessageDialog(null, "Calculadora");
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu de opções:\n1- Adição\n2- Subtração\n3- Multiplicação\n4- Divisão\n0- Sair"));
            switch(op){
                case 1: 
                    calc.somar();
                    break;
                case 2: 
                    calc.setN1(Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor")));
                    calc.setN2(Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor")));
                    calc.subtrair(calc.getN1(), calc.getN2());
                    break;
                case 3:
                    calc.setR(calc.multiplicar());
                    JOptionPane.showMessageDialog(null, "A multiplicação dos números é: "+calc.getR());
                    break;
                case 4:
                    calc.setN1(Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor")));
                    do{
                        calc.setN2(Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor")));
                        if(calc.getN2() == 0){
                            JOptionPane.showMessageDialog(null, "Divisor não pode ser igual a 0");
                        }
                    }while(calc.getN2() == 0);    
                    calc.setR(calc.dividir(calc.getN1(), calc.getN2()));
                    JOptionPane.showMessageDialog(null, "A divisão dos números é: "+calc.getR());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
            }
        }while(op!=0);
    }
}