package com.mycompany.somamultipl;
import javax.swing.JOptionPane;
public class SomaMultipl {
    public static void main(String[] args) {
        int s = 0;
        long m = 0;
        JOptionPane.showMessageDialog(null, "Soma e multiplicação (sem contar o 0) dos numeros impares entre 0 e 30:");
        for(int n=0; n<=30; n++){
            if(n%2==1){
                s = s+n;
            }
            if(m==0){
                m=1;
            }
            else if(n%2==0){
                m=m*n;
            }
        }
        JOptionPane.showMessageDialog(null, "Soma: "+s+"\nMultiplicação: "+m);
    }
}
