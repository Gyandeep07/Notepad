package notpad;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    About(){
     setBounds(400,100,600,500);
     setLayout(null);
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("notpad/windows.png"));
Image i2=i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel headerIcon=new JLabel(i3);
headerIcon.setBounds(70,40,400,80);
add(headerIcon);
ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("notpad/notepad.png"));
Image i5=i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
ImageIcon i6=new ImageIcon(i5);
JLabel Icon=new JLabel(i6);
Icon.setBounds(50,180,70,70);
add(Icon);
JLabel text=new JLabel("<html>GYANDEEP SINGH <br>0.1.0 (OS Build in java)<br>GYANDEEP SINGH . All rights reserved</html>");
text.setBounds(150,100,500,200);
text.setFont(new Font("SAN_SARIF",Font.PLAIN,16));

add(text);
JButton b1=new JButton("OK");
b1.setBounds(150,350,120,25);
b1.addActionListener(this);
add(b1);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
setVisible(false);
    }
    public static void main(String[] args) {
        new About();
    }
}
