import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CoffeeShop {

JFrame f;

CoffeeShop(){

        //Criaรงรฃo da janela
        f=new JFrame("๐๐๐๐๐๐ ๐ฎโ๐๐");
        final JLabel label = new JLabel();
        f.setLocationRelativeTo(null);
        JLabel label1 = new JLabel();        
        label1.setText("๐ฌ๐ข๐๐ ๐ ๐๐ข ๐๐๐๐?");
        label1.setBounds(52,223,100,100);
        JLabel label2 = new JLabel();
        label2.setBounds(52,320,200,100);
        JTextField textField= new JTextField();
        textField.setBounds(152,260,130,30);

        label.setHorizontalAlignment(JLabel.CENTER);  
        label.setSize(400,100);  
        //Botรฃo finalizar compra
        JButton b=new JButton("Finalizar Compra");  
        b.setBounds(40,320,260,20);
        
        //Icones
        ImageIcon sacodecafe = new ImageIcon("https://cdn.discordapp.com/attachments/872262510701584454/872262634479710208/saco-de-cafe.png");
        ImageIcon cardapio = new ImageIcon("https://cdn.discordapp.com/attachments/872262510701584454/872262632365776906/cardapio.png");
        
        //Criaรงรฃo das caixas
        String[] expresso = {"Mocha", "Cappuccino", "Expresso", "Latte", "Vanilla Latte", "Coado", "Caramel Macchiato"};
        String[] quantexpresso= {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] doce ={"Croissant", "Macaron", "Torta de Maรงรฃ", "Cheesecake", "Cupcake de Hortelรฃ", "Bolo de Chocolate"};
        String[] quantdoce= {"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox jce = new JComboBox(expresso);
        JComboBox jcq1 = new JComboBox(quantexpresso);
        JComboBox jcd = new JComboBox(doce);
        JComboBox jcq2 = new JComboBox(quantdoce);
    
        //Criaรงรฃo do JOptionPane
        Object[] options = new Object[]{};
        JOptionPane jop = new JOptionPane("๐น๐รง๐ ๐ ๐๐ข ๐๐๐๐๐๐\n\n",JOptionPane.QUESTION_MESSAGE, JOptionPane.DEFAULT_OPTION, cardapio ,options, null);
    
        //Adicionando as caixas ao JOptionPane
        JLabel expressotext = new JLabel("๐ธ๐ฅ๐๐๐๐ ๐ ๐", JLabel.LEADING); //== LEFT);
        jop.add(expressotext);
        jop.add(jce);
        JLabel quanttext = new JLabel("๐ฌ๐ข๐๐๐ก๐๐๐๐๐ - ๐ธ๐ฅ๐๐๐๐ ๐ ๐", JLabel.LEADING); //== LEFT);
        jop.add(quanttext);
        jop.add(jcq1);
        JLabel docetext = new JLabel("๐๐๐๐๐ ", JLabel.LEADING); //== LEFT);
        jop.add(docetext);
        jop.add(jcd);
        JLabel quanttext2 = new JLabel("๐ฌ๐ข๐๐๐ก๐๐๐๐๐ - ๐๐๐๐๐ ", JLabel.LEADING); //== LEFT);
        jop.add(quanttext2);
        jop.add(jcq2);
        jop.setBounds(40,20,260,220);
        
        //Configurando a janela e adicionando o JOptionPane
        f.add(jop);
        f.add(label);
        f.add(b);
        f.add(label1);
        f.add(textField);
        f.setLayout(null);
        f.setSize(360,440);    
        f.setVisible(true);
        
        //Verificaรงรฃo se o botรฃo foi clicado
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String item = textField.getText();
                String item1 = jce.getSelectedItem().toString();
                String item2 = jcq1.getSelectedItem().toString();
                String item3 = jcd.getSelectedItem().toString();
                String item4 = jcq2.getSelectedItem().toString();

                String dados = "Seu pedido:\nExpresso: " + item1 + " - " + item2 + "\nDoce: " + item3 + " - " + item4 + "\nCliente: " + item;
                JOptionPane.showMessageDialog(null, dados, "Coffee Shop", JOptionPane.INFORMATION_MESSAGE, sacodecafe);
                System.exit(0);
            }
        });

    }
    public static void main(String[] args) {
        ImageIcon cafeteria = new ImageIcon("https://cdn.discordapp.com/attachments/872262510701584454/872262630239252480/cafeteria.png");
        JOptionPane.showMessageDialog(null, "๐ต๐๐-๐ฃ๐๐๐๐ ๐๐ ๐๐๐๐๐๐ ๐ฎโ๐๐", "๐๐๐๐๐๐ ๐ฎโ๐๐", JOptionPane.INFORMATION_MESSAGE, cafeteria);
        new CoffeeShop();
    }
}
