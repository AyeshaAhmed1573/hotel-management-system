

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {

    CustomerInfo(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,78));
        panel.setBounds(5,5,890,590);
        panel.setLayout(null);
        add(panel);


        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(3,45,78));
        table.setForeground(Color.WHITE);
        panel.add(table);


        try{
            con c = new con();
            String q = "select * from customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

        JLabel Number = new JLabel("Number");
        Number.setBounds(150,11,100,14);
        Number.setForeground(Color.WHITE);
        Number.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Number);

        JLabel Name = new JLabel("Name");
        Name.setBounds(270,11,100,14);
        Name.setForeground(Color.WHITE);
        Name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Name);

        JLabel Gender = new JLabel("Gender");
        Gender.setBounds(360,11,100,14);
        Gender.setForeground(Color.WHITE);
        Gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Gender);

        JLabel Country = new JLabel("Country");
        Country.setBounds(480,11,100,25);
        Country.setForeground(Color.WHITE);
        Country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Country);

        JLabel Room = new JLabel("Room");
        Room.setBounds(600,11,100,14);
        Room.setForeground(Color.WHITE);
        Room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Room);

        JLabel time = new JLabel("CI Time");
        time.setBounds(680,11,100,14);
        time.setForeground(Color.WHITE);
        time.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(time);

        JLabel Deposit = new JLabel("Deposit");
        Deposit.setBounds(800,11,100,25);
        Deposit.setForeground(Color.WHITE);
        Deposit.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Deposit);

        JButton back = new JButton("BACK");
        back.setBounds(450,510,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
    }

    public static void main(String []args){
        new CustomerInfo();
    }
}
