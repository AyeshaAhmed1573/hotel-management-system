

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {

    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back;

    SearchRoom(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,78));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);


        JLabel SearchForRooms = new JLabel("Search For Room");
        SearchForRooms.setBounds(250,11,186,31);
        SearchForRooms.setFont(new Font("Tahoma",Font.BOLD,20));
        SearchForRooms.setForeground(Color.WHITE);
        panel.add(SearchForRooms);

        JLabel rbt = new JLabel("Room Bed Type :");
        rbt.setBounds(50,73,120,20);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        rbt.setForeground(Color.WHITE);
        panel.add(rbt);


        JLabel rn = new JLabel("Room Number :");
        rn.setBounds(23,162,150,20);
        rn.setFont(new Font("Tahoma",Font.BOLD,14));
        rn.setForeground(Color.WHITE);
        panel.add(rn);

        JLabel available = new JLabel("Availability :");
        available.setBounds(175,162,150,20);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        available.setForeground(Color.WHITE);
        panel.add(available);

        JLabel price = new JLabel("Price :");
        price.setBounds(458,162,150,20);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        price.setForeground(Color.WHITE);
        panel.add(price);

        JLabel BT = new JLabel("Bed Type :");
        BT.setBounds(580,162,150,20);
        BT.setFont(new Font("Tahoma",Font.BOLD,14));
        BT.setForeground(Color.WHITE);
        panel.add(BT);

        JLabel SS = new JLabel("Clean Status:");
        SS.setBounds(306,162,150,20);
        SS.setFont(new Font("Tahoma",Font.BOLD,14));
        SS.setForeground(Color.WHITE);
        panel.add(SS);


        checkBox = new JCheckBox("Only Display Availabe");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,78));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170,70,120,20);
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,187,700,150);
        table.setBackground(new Color(3,45,78));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
              con c = new con();
              String q = "select * from room";
              ResultSet resultSet = c.statement.executeQuery(q);
              table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        add = new JButton("SEARCH");
        add.setBounds(200,400,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(380,400,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(500,200);
        setSize(700,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==add){
            String Q = "select * from room where bedtype = '"+choice.getSelectedItem()+"'";
            String Q1 = "select * from room where avaibility = 'Available' and bedtype ='"+choice.getSelectedItem()+"'";
            try {
                con c = new con();
                ResultSet resultSet = c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if (checkBox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }

            }catch (Exception E) {
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String []args){
        new SearchRoom();
    }
}
