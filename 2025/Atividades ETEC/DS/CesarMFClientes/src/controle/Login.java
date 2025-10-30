package controle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends JFrame{
    
    Conexao con_cliente;
    
    JLabel tit, usu1, sen1;
    JTextField usu2;
    JPasswordField sen2;
    JButton ent, sai, senm;
    
    int erro = 0;
    boolean mostra = false;
    public Login(){
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        
        setTitle("Tabela");
        Container tela = getContentPane();
        setLayout(null);
        
        
        
        //declaração
        tit = new JLabel("Acesso ao Sistema");
        usu1 = new JLabel("Usuário");
        sen1 = new JLabel("Senha");
        
        usu2 = new JTextField();
        
        sen2 = new JPasswordField();
        
        ent = new JButton("Entrar");
        sai = new JButton("Sair");
        senm = new JButton("👁");
        
        //posição e tamanho
        tit.setBounds(0, 20, 450, 50);
        usu1.setBounds(50, 150, 100, 20);
        sen1.setBounds(50, 250, 100, 20);
        
        usu2.setBounds(50, 170, 350, 30);
        
        sen2.setBounds(50, 270, 290, 30);
        
        ent.setBounds(120, 400, 100, 60);
        sai.setBounds(225, 400, 100, 60);
        senm.setBounds(340, 270, 60, 29);
        
        //formatação
        tit.setFont(new Font("Times New Roman", Font.BOLD, 30));
        usu1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        sen1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        usu2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        
        sen2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        
        ent.setFont(new Font("Times New Roman", Font.BOLD, 20));
        sai.setFont(new Font("Times New Roman", Font.BOLD, 20));
        senm.setFont(new Font("", Font.BOLD, 20));
        
        //outro
        tit.setHorizontalAlignment(SwingConstants.CENTER);
        
        sen2.setEchoChar('*');
        
        senm.setBackground(Color.WHITE);
        
        //adicionando
        tela.add(tit);
        tela.add(usu1);
        tela.add(sen1);
        
        tela.add(usu2);
        
        tela.add(sen2);
        
        tela.add(ent);
        tela.add(sai);
        tela.add(senm);
        
        //ações
        ent.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String pesquisa = "select * from tblusuario where usuario like '" + usu2.getText() + "' && senha = " + sen2.getText() + "";
                    con_cliente.executaSQL(pesquisa);
                    
                    if(con_cliente.resultset.first()){
                        Controle mostra = new Controle();
                        mostra.setVisible(true);
                        mostra.preencherTabela();
                        mostra.posicionarRegistroFirst();
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "\n Usuário ou senha incorreto!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                        erro = erro + 1;
                        if(erro == 3){
                            JOptionPane.showMessageDialog(null, "\n Muitas tentativas, encerrando programa!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            con_cliente.desconecta();
                            System.exit(0);
                        }
                    }
                }catch(SQLException errosql){
                    JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        sai.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        senm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(mostra == false){
                    sen2.setEchoChar((char)0);
                    mostra = true;
                }
                else{
                    sen2.setEchoChar('*');
                    mostra = false;
                }
            }
        });
        
        
        
        setSize(450, 600);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Login pri = new Login();
        pri.setVisible(true);
        pri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}