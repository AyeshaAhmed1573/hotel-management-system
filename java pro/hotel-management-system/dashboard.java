import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame implements ActionListener {
    JButton b1,b2;
    dashboard() {
         b1 = new JButton("RECEPTION");
        b1.setBounds(150, 400, 200, 40);
        b1.setFont(new Font("Tomaha", Font.BOLD, 18));
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(3, 45, 78));
        b1.addActionListener((ActionListener) this);
        add(b1);

        b2 = new JButton("ADMIN");
        b2.setBounds(450, 400, 200, 40);
        b2.setFont(new Font("Tomaha", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(3, 45, 78));
        b2.addActionListener( this);
        add(b2);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("recep.png"));
        JLabel label2 = new JLabel(image1);
        label2.setBounds(150, 200, 200, 200);
        add(label2);
        ImageIcon image2 = new ImageIcon(ClassLoader.getSystemResource("admin.png"));
        JLabel label3 = new JLabel(image2);
        label3.setBounds(450, 200, 200, 200);
        
        add(label3);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("Dashboard.gif"));
        

        JLabel label = new JLabel(image);
        label.setBounds(0, 0, 800, 600);
        add(label);

        setLayout(null);
        setLocation(300, 80);
        setSize(800, 600);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new reception();
            setVisible(false);
        }else {
            new Login2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new dashboard();
    }

}
