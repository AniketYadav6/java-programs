import java.awt.*;  
  
public class MyCanvas extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("memory.png");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        MyCanvas m=new MyCanvas();  
        Frame f=new Frame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  