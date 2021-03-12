import javax.swing.*;    
import java.awt.*;  
public class JButtonExample {  

   JButtonExample(){
   JFrame f=new JFrame("JButton example");
    JButton b1=new JButton("svvv");
    JButton b2=new JButton("I.T");
    f.setLayout(new FlowLayout());
    f.add(b1);
   f.add(b2);
   f.setSize(500,500);
   f.setVisible(true);
 }
public static void main(String[] args) {  
   JButtonExample j=new JButtonExample();
}  
}  