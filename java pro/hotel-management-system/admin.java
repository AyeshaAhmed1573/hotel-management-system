
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
public class admin extends JFrame  implements ActionListener{
    JButton b1,b2,b3,back,logout;

admin(){
    JPanel panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(5,0,1550,150);
    panel2.setBackground(Color.darkGray);;
    add(panel2);
     ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("hotel-logo.png"));
        JLabel img1=new JLabel(image);
     
        img1.setBounds(20,0,150,150);
        panel2.add(img1);
        JLabel l1= new JLabel("COMFORT JUST LIKE HOME");
        l1.setBounds(200,50,600,50);
        l1.setFont(new Font("serif",Font.BOLD,22));
        l1.setForeground(Color.black);
        panel2.add(l1);
        JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(210,105,1328,820);
    panel.setBackground(new Color(3,45,78));
    add(panel);
    JLabel l3= new JLabel("ADMIN");
    l3.setBounds(490, 30, 200, 200);
    l3.setForeground(Color.WHITE);
    l3.setFont(new Font("serif",Font.BOLD,40));
    panel.add(l3);
    ImageIcon image2=new ImageIcon(ClassLoader.getSystemResource("employee.png"));
        JLabel img2=new JLabel(image2);
     
        img2.setBounds(200,90,300,300);
        panel.add(img2);
        ImageIcon image3=new ImageIcon(ClassLoader.getSystemResource("room.png"));
        JLabel img3=new JLabel(image3);
        img3.setBounds(700,80,300,300);
        panel.add(img3);
        ImageIcon image4=new ImageIcon(ClassLoader.getSystemResource("driver.png"));
        JLabel img4=new JLabel(image4);
        img4.setBounds(420,370,300,300);
        panel.add(img4);
         b1 = new JButton("ADD EMPLOYEE");
        b1.setBounds(240, 340, 200, 40);
        b1.setFont(new Font("Tomaha", Font.BOLD, 18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(3, 45, 78));
        b1.addActionListener((ActionListener) this);
        panel.add(b1);
         b2 = new JButton("ADD ROOM");
        b2.setBounds(750, 350, 200, 40);
        b2.setFont(new Font("Tomaha", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(3, 45, 78));
        b2.addActionListener((ActionListener) this);
        panel.add(b2);
        b3 = new JButton("ADD DRIVER");
        b3.setBounds(470, 650, 200, 40);
        b3.setFont(new Font("Tomaha", Font.BOLD, 18));
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(3, 45, 78));
        b3.addActionListener((ActionListener) this);
        panel.add(b3);
    JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,105,200,820);
        panel1.setBackground(new Color(4,69,101));
        add(panel1);
       
         logout = new JButton("Logout");
        logout.setBounds(30,530,145,40);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        panel1.add(logout);
       
        
        back = new JButton("Back");
        back.setBounds(30,580,145,40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel1.add(back);
        

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1800,1090);
        setVisible(true);}
    
        @Override
        public void actionPerformed(ActionEvent e) {
         
        if (e.getSource() == b1){
            new AddEmployee();
        } else if (e.getSource() ==b2) {
            new AddRoom();
        } else if (e.getSource() == b3) {
            new addDriver();
        } else if (e.getSource() ==logout){
            System.exit(102);
        } else if (e.getSource() ==back) {
            new dashboard();
            setVisible(false);
        }

}
 public static void main(String[] args) {
    new admin();
 }  
}
