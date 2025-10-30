package com.mycompany.ex9;
import javax.swing.JOptionPane;
public class Ex9 {
    public static void main(String[] args) {
        String [][] tab = {
            {" ", "1", "2", "3"},
            {"1", " ", " ", " "},
            {"2", " ", " ", " "},
            {"3", " ", " ", " "},
        };//Criação do tabuleiro
        int l,c;
        for(l=0; l<tab.length; l++){
            for(c=0; c<tab[l].length; c++){
                System.out.print(tab[l][c]+" ");
            }
            System.out.print("\n");
        }//Construção do tabuleiro
        int t = 1;
        do{
            if(t%2!=0){
                JOptionPane.showMessageDialog(null, "Turno: X");
            }
            else{
                JOptionPane.showMessageDialog(null, "Turno: O");
            }//Declaração do turno
            do{
                System.out.println("\n");
                do{
                    l = Integer.parseInt(JOptionPane.showInputDialog("Insira a linha que deseja colocar o marcador."));
                    if(l<1 || l>3){
                        JOptionPane.showMessageDialog(null, "O número não pode ser menor que 1 ou maior que 3. Por favor, insira o valor novamente.");
                    }
                }while(l<1 || l>3);
                do{
                    c = Integer.parseInt(JOptionPane.showInputDialog("Insira a coluna que deseja colocar o marcador."));
                    if(c<1 || c>3){
                        JOptionPane.showMessageDialog(null, "O número não pode ser menor que 1 ou maior que 3. Por favor, insira o valor novamente.");
                    }            
                }while(c<1 || c>3);
                if(!" ".equals(tab[l][c])){
                    JOptionPane.showMessageDialog(null, "Este espaço já tem um marcador. Por favor, escolha outro espaço.");
                }
            }while(!" ".equals(tab[l][c]));//Posicionamento do marcador
            if(t%2!=0){
                tab[l][c] = "X";
            }
            else{
                tab[l][c] = "O";
            }
            for(l=0; l<tab.length; l++){
                for(c=0; c<tab[l].length; c++){
                    System.out.print(tab[l][c]+" ");
                }
                System.out.print("\n");
            }//Mostra onde o marcador foi posicionado
            if(
            ("X".equals(tab[1][1]) && "X".equals(tab[1][2]) && "X".equals(tab[1][3])) ||
            ("X".equals(tab[2][1]) && "X".equals(tab[2][2]) && "X".equals(tab[2][3])) ||
            ("X".equals(tab[3][1]) && "X".equals(tab[3][2]) && "X".equals(tab[3][3])) ||
            ("X".equals(tab[1][1]) && "X".equals(tab[2][1]) && "X".equals(tab[3][1])) ||
            ("X".equals(tab[1][2]) && "X".equals(tab[2][2]) && "X".equals(tab[3][2])) ||
            ("X".equals(tab[1][3]) && "X".equals(tab[2][3]) && "X".equals(tab[1][3])) ||
            ("X".equals(tab[1][1]) && "X".equals(tab[2][2]) && "X".equals(tab[3][3])) ||
            ("X".equals(tab[3][1]) && "X".equals(tab[2][2]) && "X".equals(tab[1][3]))
            ){
                JOptionPane.showMessageDialog(null, "Jogo encerrado. X ganhou.");
                t = 9;
            }
            else if(
            ("O".equals(tab[1][1]) && "O".equals(tab[1][2]) && "O".equals(tab[1][3])) ||
            ("O".equals(tab[2][1]) && "O".equals(tab[2][2]) && "O".equals(tab[2][3])) ||
            ("O".equals(tab[3][1]) && "O".equals(tab[3][2]) && "O".equals(tab[3][3])) ||
            ("O".equals(tab[1][1]) && "O".equals(tab[2][1]) && "O".equals(tab[3][1])) ||
            ("O".equals(tab[1][2]) && "O".equals(tab[2][2]) && "O".equals(tab[3][2])) ||
            ("O".equals(tab[1][3]) && "O".equals(tab[2][3]) && "O".equals(tab[1][3])) ||
            ("O".equals(tab[1][1]) && "O".equals(tab[2][2]) && "O".equals(tab[3][3])) ||
            ("O".equals(tab[3][1]) && "O".equals(tab[2][2]) && "O".equals(tab[1][3]))                    
            ){
                JOptionPane.showMessageDialog(null, "Jogo encerrado. O ganhou.");
                t = 9;                
            }//Situações possíveis de vitória de declaração do vencedor
            else if(t==9){
                JOptionPane.showMessageDialog(null, "Jogo encerrado. Empate.");
            }//Condição para o empate caso todos os espaços foram preenchidos sem um vencedor
            t = t+1;
        }while(t<=9);
    }
}