import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
class splash extends JFrame{
    splash(){
      JPanel panel2 = new JPanel();
      panel2.setLayout(null);
      panel2.setBounds(0,0,800,100);
      panel2.setBackground(Color.darkGray);;
      add(panel2);
       ImageIcon image2=new ImageIcon(ClassLoader.getSystemResource("hotel-logo.png"));
          JLabel img2=new JLabel(image2);
       
          img2.setBounds(20,0,100,100);
          panel2.add(img2);
          JLabel l1= new JLabel("COMFORT JUST LIKE HOME");
          l1.setBounds(170,30,600,50);
          l1.setFont(new Font("serif",Font.BOLD,18));
          l1.setForeground(Color.black);
          panel2.add(l1);
    ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("hotel.gif"));
    JLabel label=new JLabel(image);
   
    label.setBounds(-10,20,800,680);
    add(label);
 
setLayout(null);
setLocation(300,80);
setSize(800,650);
setVisible(true);
try {
    Thread.sleep(10000);
    new login();
    setVisible(false);
} catch (Exception e) {
   e.printStackTrace();
}
}
public static void main (String[]args){
  new splash();

}}