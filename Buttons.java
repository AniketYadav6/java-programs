package gui;
import java.awt.*;
import java.awt.event.*;

public class Buttons implements ActionListener{

   Button bn1,bn2;
   TextField tx;
 Buttons(String s){
   Frame f=new Frame(s);
   f.setVisible(true);
   f.setSize(200,200);
   f.setBackground(Color.yellow);
   bn1=new Button("add");
    bn2=new Button("sub");
   tx=new TextField();
  f.setLayout(new FlowLayout());
   f.add(bn1);
   f.add(bn2); 
   f.add(tx);
  bn1.addActionListener(this);
  bn2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e){
     Button btn=(Button)e.getSource();
    if(bn1==btn){
 tx.setText("hello");}
 else {
   tx.setText("hi ");}
}
public static void main(String args[]){
  Buttons b=new Buttons("App");
 }
}