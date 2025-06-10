

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Department extends JFrame {
    Department(){
 
        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3,45,78));
        panel.setLayout(null);
        add(panel);
        JLabel L2= new JLabel("DEPARTMENT");
        L2.setBounds(260,20,600,50);
        L2.setFont(new Font("serif",Font.BOLD,24));
        L2.setForeground(Color.WHITE);
        panel.add(L2);

        JTable table = new JTable();
        table.setBounds(50,100,600,330);
        table.setBackground(new Color(4,45,78));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            con c = new con();
            String departmentInfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(370,530,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("Department");
        label1.setBounds(145,70,105,20);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Budget");
        label2.setBounds(431,70,105,20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(label2);



        setUndecorated(true);
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Department();
    }
}