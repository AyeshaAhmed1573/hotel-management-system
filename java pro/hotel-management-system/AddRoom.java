import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
public class AddRoom extends JFrame implements ActionListener {
    JTextField t2, t3;
    JComboBox t4,t5,t6;
    JButton Add ,back;
AddRoom(){
    JPanel panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0,0,990,100);
    panel2.setBackground(Color.darkGray);;
    add(panel2);
     ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("hotel-logo.png"));
        JLabel img1=new JLabel(image);
     
        img1.setBounds(20,0,100,100);
        panel2.add(img1);
        JLabel l1= new JLabel("COMFORT JUST LIKE HOME");
        l1.setBounds(170,30,600,50);
        l1.setFont(new Font("serif",Font.BOLD,18));
        l1.setForeground(Color.black);
        panel2.add(l1);
        JLabel l2= new JLabel("ADD ROOM");
    l2.setBounds(300, 40, 500, 200);
    l2.setForeground(Color.WHITE);
    l2.setFont(new Font("serif",Font.BOLD,40));
    add(l2);
    JLabel l3= new JLabel("Room Number");
    l3.setBounds(50,180,152,22);
    l3.setFont(new Font("Tahoma", Font.BOLD, 15));
    l3.setForeground(Color.WHITE);
    add(l3);
    t2 =new JTextField();
    t2.setBounds(200,180,156,25);
    t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
    t2.setForeground(Color.black);
   
    add(t2);

    JLabel l4= new JLabel("Avaibility");
    l4.setBounds(50,240,152,22);
    l4.setFont(new Font("Tahoma", Font.BOLD, 15));
    l4.setForeground(Color.WHITE);
    add(l4);
    t4= new JComboBox(new String[]{"Available","Occupied"});
    t4.setBounds(200,240,156,25);
    t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
    t4.setForeground(Color.black);
   
    add(t4);


    JLabel l5= new JLabel("Price");
    l5.setBounds(50,300,152,22);
    l5.setFont(new Font("Tahoma", Font.BOLD, 15));
    l5.setForeground(Color.WHITE);
    add(l5);
    t3 =new JTextField();
    t3.setBounds(200,300,156,25);
    t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
    t3.setForeground(Color.black);
   
    add(t3);


     JLabel l6= new JLabel("Cleaning Status");
    l6.setBounds(50,360,152,22);
    l6.setFont(new Font("Tahoma", Font.BOLD, 15));
    l6.setForeground(Color.WHITE);
    add(l6);
    t5= new JComboBox(new String[]{"Cleaned","Dirty"});
    t5.setBounds(200, 360 ,156, 25);
    t5.setForeground(Color.BLACK);
   t5. setBackground(Color.WHITE);
   setFont(new Font("Tahoma", Font.PLAIN, 14));
    add(t5);
    JLabel l7= new JLabel("Bed Type");
    l7.setBounds(50,420,152,22);
    l7.setFont(new Font("Tahoma", Font.BOLD, 15));
    l7.setForeground(Color.WHITE);
    add(l7);
    t6= new JComboBox(new String[]{"Single Bed","Double Bed"});
    t6.setBounds(200, 420 ,156, 25);
    t6.setForeground(Color.BLACK);
   t6. setBackground(Color.WHITE);
   setFont(new Font("Tahoma", Font.PLAIN, 14));
    add(t6);
    Add = new JButton("Add");
    Add.setBounds(400,500,145,40);
    Add.setBackground(Color.BLACK);
    Add.setForeground(Color.WHITE);
    Add.addActionListener(this);
    add(Add);
   
    
    back = new JButton("Back");
    back.setBounds(600,500,145,40);
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    add(back);
        getContentPane().setBackground(new Color(3, 45, 78));
        setLayout(null);
        setLocation(300,80);
        setSize(1000,600);
        setVisible(true);

}
@Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == Add){
        try{
            con c = new con();
            String room = t2.getText();
            String ava = (String) t4.getSelectedItem();
            String status = (String)  t5.getSelectedItem();
            String price = t3.getText();
            String type =  (String) t6.getSelectedItem();

            String q = "insert into room values('"+room+"', '"+ava+"', '"+status+"', '"+price+"', '"+type+"')";
            c.statement.executeUpdate(q);

            JOptionPane.showMessageDialog(null,"Room Successfully Added");
            setVisible(false);

        }catch (Exception E){
            E.printStackTrace();
        }
    }else {
        setVisible(false);
    }

}

public static void main(String[] args) {
    new AddRoom();
}
}

