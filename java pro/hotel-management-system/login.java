 import javax.swing.*;

import java.awt.*;
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
 
 class login extends JFrame implements ActionListener {
    JTextField T1;
    JPasswordField T2;
    JButton b1,b2;
    login(){

    JLabel l1= new JLabel("USERNAME");
    l1.setBounds(40,30,100,50);
    l1.setFont(new Font("Tomaha",Font.BOLD,15));
    l1.setForeground(Color.WHITE);
    add(l1);
    JLabel l2= new JLabel("PASSWORD");
    l2.setBounds(40,80,100,50);
    l2.setFont(new Font("Tomaha",Font.BOLD,15));
    l2.setForeground(Color.WHITE);
    add(l2);
     T1= new JTextField();
    T1.setBounds(150,45,100,20);
    T1.setFont(new Font("Tomaha",Font.BOLD,15));
    T1.setForeground(Color.BLACK);
    add(T1);
   T2= new JPasswordField();
    T2.setBounds(150,95,100,20);
    T2.setFont(new Font("Tomaha",Font.PLAIN,15));
    T2.setForeground(Color.BLACK);
    add(T2);
     b1= new JButton("LOGIN");
    b1.setBounds(90,200,100,30);
    b1.setFont(new Font("Tomaha",Font.BOLD,15));
    b1.setForeground(Color.BLACK);
    b1.setBackground(Color.white);
    b1.addActionListener(this);
    add(b1);
    b2= new JButton("CANCEL");
    b2.setBounds(230,200,100,30);
    b2.setFont(new Font("Tomaha",Font.BOLD,15));
    b2.setForeground(Color.BLACK);
    b2.setBackground(Color.white);
    b2.addActionListener(this);
    add(b2);
    ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("hotel-logo.png"));
    JLabel img1=new JLabel(image);
 
    img1.setBounds(270,40,300,200);
    add(img1);
    setLayout(null);
    setSize(600, 400);
    setLocation(300,150);
    setVisible(true);
    getContentPane().setBackground(new Color(3,45,78));
    
}
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1){
        try {
            con c = new con();
            String user = T1.getText();
            String pass = T2.getText();

            String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
            ResultSet resultSet = c.statement.executeQuery(q);
            if (resultSet.next()){
                new dashboard();
                setVisible(false);
            }else {
                JOptionPane.showMessageDialog(null,"Invalid");
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }else {
        System.exit(102);
    }
}
public static void main(String[] args) {
    new login();
}
 }