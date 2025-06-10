
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class AddEmployee extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6;
    JComboBox cb1, cb2;
    JRadioButton rdm,rdf;
    JButton back,Add;
    AddEmployee() {
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 990, 100);
        panel2.setBackground(Color.darkGray);
        ;
        add(panel2);
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("hotel-logo.png"));
        JLabel img1 = new JLabel(image);

        img1.setBounds(20, 0, 100, 100);
        panel2.add(img1);
        JLabel l1 = new JLabel("COMFORT JUST LIKE HOME");
        l1.setBounds(170, 30, 600, 50);
        l1.setFont(new Font("serif", Font.BOLD, 18));
        l1.setForeground(Color.black);
        panel2.add(l1);
        JLabel l2 = new JLabel("ADD EMPLOYEE");
        l2.setBounds(300, 40, 500, 200);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif", Font.BOLD, 40));
        add(l2);
        JLabel l4 = new JLabel("NAME");
        l4.setBounds(50, 240, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 15));
        l4.setForeground(Color.WHITE);
        add(l4);
        t1 =new JTextField();
        t1.setBounds(200,240,156,25);
        t1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t1.setForeground(Color.black);
        add(t1);

        JLabel l5 = new JLabel("AGE");
        l5.setBounds(50, 300, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 15));
        l5.setForeground(Color.WHITE);
        add(l5);
        t2 =new JTextField();
        t2.setBounds(200,300,156,25);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.black);
        add(t2);

        JLabel l6 = new JLabel("GENDER");
        l6.setBounds(50, 360, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 15));
        l6.setForeground(Color.WHITE);
        add(l6);
        
         cb2 = new JComboBox(new String[]{"MALE", "FEMALE"});
        cb2.setBounds(200,360,156,25);
        cb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cb2.setForeground(Color.black);
        add(cb2);
     

        JLabel l7 = new JLabel("JOB");
        l7.setBounds(50, 420, 152, 22);
        l7.setFont(new Font("Tahoma", Font.BOLD, 15));
        l7.setForeground(Color.WHITE);
        add(l7);
        cb1 = new JComboBox(new String[]{"Front Desk", "Housekeeping", "Kitchen Staff","Room Service", "Manager", "Accountant","Chef"});
        cb1.setBounds(200,420,156,25);
        cb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cb1.setForeground(Color.black);
        add(cb1);
        JLabel L11= new JLabel("SALARY");
        L11.setBounds(50,480,152,22);
        L11.setFont(new Font("Tahoma", Font.BOLD, 15));
        L11.setForeground(Color.WHITE);
        add(L11);
        t3 =new JTextField();
        t3.setBounds(200,480,156,25);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.black);
        add(t3);
        JLabel l8= new JLabel("PHONE");
        l8.setBounds(50,540,152,22);
        l8.setFont(new Font("Tahoma", Font.BOLD, 15));
        l8.setForeground(Color.WHITE);
        add(l8);
        t4 =new JTextField();
        t4.setBounds(200,540,156,25);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.black);
        add(t4);
        JLabel l9= new JLabel("CNIC NO.");
        l9.setBounds(50,600,152,22);
        l9.setFont(new Font("Tahoma", Font.BOLD, 15));
        l9.setForeground(Color.WHITE);
        add(l9);
        t5 =new JTextField();
        t5.setBounds(200,600,156,25);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.black);
        add(t5);
        JLabel l10= new JLabel("EMAIL");
        l10.setBounds(50,660,152,22);
        l10.setFont(new Font("Tahoma", Font.BOLD, 15));
        l10.setForeground(Color.WHITE);
        add(l10);
        t6 =new JTextField();
        t6.setBounds(200,660,156,25);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t6.setForeground(Color.black);
        add(t6);
        Add = new JButton("Add");
        Add.setBounds(400,700,145,40);
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.addActionListener(this);
        add(Add);
       
        
        back = new JButton("Back");
        back.setBounds(600,700,145,40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        getContentPane().setBackground(new Color(3, 45, 78));
        setLayout(null);
        setLocation(300, 10);
        setSize(1000, 800);
        setVisible(true);
    }
   @Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == Add){
        try{
            con c = new con();
            String name = t1.getText();
            String age = t2.getText();
            String gender = (String)  cb2.getSelectedItem();
            String job = (String)  cb1.getSelectedItem();
            String salary = t3.getText();
            String phone = t4.getText();
            String cnic = t4.getText();
            String email = t6.getText();
            String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"', '"+cnic+"', '"+email+"')";
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
        new AddEmployee();
    }

}