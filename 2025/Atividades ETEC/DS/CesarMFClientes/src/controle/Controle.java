package controle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.text.MaskFormatter;
import javax.swing.table.DefaultTableModel;
import conexao.Conexao;
import java.sql.*;

public class Controle extends JFrame{
    Conexao con_cliente;
    JLabel cod, nom, dat, tel, ema, rot;
    JTextField cod2, nom2, ema2, pes2;
    JFormattedTextField dat2, tel2;
    MaskFormatter dat3, tel3;
    JTable tblClientes;
    JScrollPane scp_tabela;
    JButton ant, pro, pri, ult, nov, gra, alt, exc, pes, sai;
    public Controle(){
        setTitle("Tabela");
        Container tela = getContentPane();
        setLayout(null);
        
        
        
        //declaração
        cod = new JLabel("Código");
        nom = new JLabel("Nome");
        dat = new JLabel("Data");
        tel = new JLabel("Telefone");
        ema = new JLabel("Email");
        rot = new JLabel("Desenvolvido por: Cesar Moreno Fernandes 2º AMS");
        
        cod2 = new JTextField();
        nom2 = new JTextField();
        ema2 = new JTextField();
        pes2 = new JTextField("pesquisar por nome");
        
        try{
            dat3 = new MaskFormatter("##/##/####");
            tel3 = new MaskFormatter("(##)####-####");
        }catch(ParseException a){}
        
        dat2 = new JFormattedTextField(dat3);
        tel2 = new JFormattedTextField(tel3);
        
        tblClientes = new JTable();
        scp_tabela = new JScrollPane();
        
        ant = new JButton("Anterior");
        pro = new JButton("Próximo");
        pri = new JButton("Primeiro");
        ult = new JButton("Último");
        nov = new JButton("Limpar");
        gra = new JButton("Gravar");
        alt = new JButton("Alterar");
        exc = new JButton("Excluir");
        pes = new JButton("Pesquisar");
        sai = new JButton("Sair");
        
        //posição e tamanho
        cod.setBounds(50, 25, 100, 35);
        nom.setBounds(50, 60, 100, 35);
        dat.setBounds(50, 95, 100, 35);
        tel.setBounds(50, 130, 100, 35);
        ema.setBounds(50, 165, 100, 35);
        rot.setBounds(50, 590, 500, 30);
        
        cod2.setBounds(150, 25, 500, 30);
        nom2.setBounds(150, 60, 500, 30);
        ema2.setBounds(150, 165, 500, 30);
        pes2.setBounds(150, 200, 500, 30);
        
        dat2.setBounds(150, 95, 500, 30);
        tel2.setBounds(150, 130, 500, 30);
        
        tblClientes.setBounds(50, 250, 800, 300);
        scp_tabela.setBounds(50, 250, 800, 300);
        
        ant.setBounds(675, 25, 90, 50);
        pro.setBounds(770, 25, 90, 50);
        pri.setBounds(675, 80, 90, 50);
        ult.setBounds(770, 80, 90, 50);
        nov.setBounds(675, 135, 90, 50);
        gra.setBounds(770, 135, 90, 50);
        alt.setBounds(675, 190, 90, 50);
        exc.setBounds(770, 190, 90, 50);
        pes.setBounds(50, 200, 95, 30);
        sai.setBounds(750, 590, 95, 30);
        
        //formatação
        cod.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        nom.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        dat.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        tel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        ema.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rot.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        
        cod2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        nom2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ema2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        pes2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        
        dat2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tel2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        
        ant.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pro.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pri.setFont(new Font("Times New Roman", Font.BOLD, 14));
        ult.setFont(new Font("Times New Roman", Font.BOLD, 14));
        nov.setFont(new Font("Times New Roman", Font.BOLD, 14));
        gra.setFont(new Font("Times New Roman", Font.BOLD, 14));
        alt.setFont(new Font("Times New Roman", Font.BOLD, 14));
        exc.setFont(new Font("Times New Roman", Font.BOLD, 14));
        pes.setFont(new Font("Times New Roman", Font.BOLD, 14));
        sai.setFont(new Font("Times New Roman", Font.BOLD, 14));
        
        //outro    
        dat3.setPlaceholderCharacter('_');
        tel3.setPlaceholderCharacter('_');
        
        tela.add(tblClientes);
        tela.add(scp_tabela);
        
        tblClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        tblClientes.setFont(new java.awt.Font("Arial", 1, 12));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][]{
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String[]{"Código", "Nome", "Data Nascimento", "Telefone", "Email"})
        {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };
            
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        });        
        scp_tabela.setViewportView(tblClientes);
        
        tblClientes.setAutoCreateRowSorter(true);
        
        //adicionando
        tela.add(cod);
        tela.add(nom);
        tela.add(dat);
        tela.add(tel);
        tela.add(ema);
        tela.add(rot);
        
        tela.add(cod2);
        tela.add(nom2);
        tela.add(ema2);
        tela.add(pes2);
        
        tela.add(dat2);
        tela.add(tel2);
        
        tela.add(ant);
        tela.add(pro);
        tela.add(pri);
        tela.add(ult);
        tela.add(nov);
        tela.add(gra);
        tela.add(alt);
        tela.add(exc);
        tela.add(pes);
        tela.add(sai);
        
        //ações
        ant.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                posicionarRegistroPrevious();
            }
        });
        
        pro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                posicionarRegistroNext();
            }
        });
        
        pri.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                posicionarRegistroFirst();
            }
        });
        
        ult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                posicionarRegistroLast();
            }
        });
        
        nov.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cod2.setText("");
                nom2.setText("");
                dat2.setText("");
                tel2.setText("");
                ema2.setText("");
                cod2.requestFocus();
            }
        });
        
        gra.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nome = nom2.getText();
                String data = dat2.getText();
                String tele = tel2.getText();
                String email = ema2.getText();
                
                try{
                    String insert_sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + tele + "','" + email + "','" + data + "')";
                    con_cliente.statement.executeUpdate(insert_sql);
                    JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    preencherTabela();
                }catch(SQLException errosql){
                    JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        alt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nome = nom2.getText();
                String data = dat2.getText();
                String tele = tel2.getText();
                String email = ema2.getText();
                String sql;
                String msg;
                
                try{
                    if(cod2.getText().equals("")){
                        sql="insert into tbclientes (nome,telefone, email, dt_nasc) values ('" + nome + "','" + tele + "','" + email + "','" + data + "')";
                        msg="Gravação de um novo registro";
                    }else{
                        sql="update tbclientes set nome='" + nome + "',telefone='" + tele + "', email='" + email + "',dt_nasc='" + data + "' where cod = " + cod2.getText();
                        msg="Alteração de registro";
                    }
                    
                    con_cliente.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, msg, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    preencherTabela();
                }catch(SQLException errosql){
                    JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);                    
                }
            }
        });
        
        exc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String sql;
                
                try{
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION, 3);
                    if(resposta==0){
                        sql="delete from tbclientes where cod = "+cod2.getText();
                        int excluir = con_cliente.statement.executeUpdate(sql);
                        if(excluir==1){
                            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                            con_cliente.executaSQL("select * from tbclientes order by cod");
                            con_cliente.resultset.first();
                            preencherTabela();
                            posicionarRegistroFirst();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(SQLException excecao){
                    JOptionPane.showMessageDialog(null, "\n Erro na exclusão :\n "+excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);                    
                }
            }
        });
        
        pes.addActionListener(new ActionListener(){
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e){
                try{
                    String pesquisa = "select * from tbclientes where nome like '%" + pes2.getText() + "%'";
                    con_cliente.executaSQL(pesquisa);
                    
                    if(con_cliente.resultset.first()){
                        preencherTabela();
                    }else{
                        JOptionPane.showMessageDialog(null, "\n Não existe dados com este parâmetro!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(SQLException excecao){
                    JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n "+excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);                    
                }
            }
        });
        
        sai.addActionListener(new ActionListener(){
            @SuppressWarnings("override")
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        
        
        setSize(900, 675);
        setResizable(false);
        setLocationRelativeTo(null);
        
        con_cliente = new Conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tbclientes order by cod");
        
    }
    
    public void preencherTabela(){
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(11);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(14);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try{
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("cod"), con_cliente.resultset.getString("nome"), con_cliente.resultset.getString("dt_nasc"), con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistroNext(){
        try{
            if(con_cliente.resultset.next() == false){
                posicionarRegistroFirst();;
            }
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no próximo registro:"+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistroPrevious(){
        try{
            if(con_cliente.resultset.previous() == false){
                posicionarRegistroLast();
            }
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no registro anterior:"+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistroFirst(){
        try{
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro:"+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void posicionarRegistroLast(){
        try{
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro:"+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados(){
        try{
            cod2.setText(con_cliente.resultset.getString("cod"));
            nom2.setText(con_cliente.resultset.getString("nome"));
            dat2.setText(con_cliente.resultset.getString("dt_nasc"));
            tel2.setText(con_cliente.resultset.getString("telefone"));
            ema2.setText(con_cliente.resultset.getString("email"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
