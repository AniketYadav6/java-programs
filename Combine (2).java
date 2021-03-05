package gui;
import java.awt.*;
import java.awt.event.*;
public class Combine extends Frame implements ActionListener{

Button b1,b2;
Label l1,l2,l3;
TextField r1,r2,r3;

Combine(String s){
 super(s);
 this.setVisible(true);
 this.setSize(500,500);
 this.setBackground(Color.yellow);

 b1=new Button("add");
  b2=new Button("sub");
  l1=new Label("Enter first no.");
  l2=new Label("Enter second no.");
  l3=new Label("result");
  r1=new TextField();
  r2=new TextField();
  r3=new TextField();

  FlowLayout f=new FlowLayout(); 
  this.setLayout(f);
 
  
//l1.setBounds(170,40,75,25); 
 // r1.setBounds(80,90,100,500);
  
b2.addActionListener(this);
  this.add(l1);
  this.add(r1);
  this.add(l2);
  this.add(r2);
  this.add(l3);
  this.add(r3);
  this.add(b1);
  this.add(b2);
}
 public void actionPerformed(ActionEvent e){
  r1.setText("hwllo");
}


 public static void main(String args[]){
  Combine h=new Combine("App");     
 }
}