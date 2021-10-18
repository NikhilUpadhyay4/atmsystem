/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asimulatorsystem;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Nikhil
 */
public class Login extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    Login(){
          setFont(new Font("System", Font.BOLD, 22));
          Font f = getFont();
          FontMetrics fm = getFontMetrics(f);
          int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
          int y = fm.stringWidth(" ");
          int z = getWidth()-x;
          int w = z/y;
          String pad ="";
          pad = String.format("%"+w+"s", pad);
          setTitle(pad+"AUTOMATED TELLER MACHINE");
          
          
          l1= new JLabel("WELCOME TO ATM");
          l1.setFont(new Font("Osward", Font.BOLD, 38));
         
          l2= new JLabel("CARD NO:");
          l2.setFont(new Font("Raleway", Font.BOLD, 28));
            
          
          l3= new JLabel("PIN:");
          l3.setFont(new Font("Raleway", Font.BOLD, 28));
          
          t1 = new JTextField(15);
          pf2 = new JPasswordField(15);
          
          b1 = new JButton("SIGN IN");
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.white);
          
          b2 = new JButton("CLEAR");
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.white);
          
          b3 = new JButton("SIGH UP");
          b3.setBackground(Color.BLACK);
          b3.setForeground(Color.white);
          
          
          setLayout(null);
          
          l1.setBounds(175,50,450,200);
          add(l1);
          
          l2.setBounds(125,150,375,200);
          add(l2);
          
          l3.setBounds(125,225,375,200);
          add(l3);
          
          t1.setFont(new Font ("Arial", Font.BOLD,14));
          t1.setBounds(300,235,230,30);
          add(t1);
          
          pf2.setFont(new Font ("Arial", Font.BOLD,14));
          pf2.setBounds(300,310,230,30);
          add(pf2);
          
          b1.setFont(new Font ("Arial", Font.BOLD,14));
          b1.setBounds(300,400,100,30);
          add(b1);
          
          b2.setFont(new Font ("Arial", Font.BOLD,14));
          b2.setBounds(430,400,100,30);
          add(b2);
          
          b3.setFont(new Font ("Arial", Font.BOLD,14));
          b3.setBounds(300,450,230,30);
          add(b3);
          
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          
          getContentPane().setBackground(Color.white);
          setSize(750,750);
          setLocation(500,200);
          setVisible(true);
          
          
    }

    public void actionPerformed(ActionEvent ae){
        try{
          connect c1 = new connect();
          String a= t1.getText();
            char[] x = pf2.getPassword();
            String b = String.valueOf(x);
            String q = "select * from login where cardno='"+a+"' and pin='"+b+"'";
            ResultSet rs = c1.s.executeQuery(q);
            if(ae.getSource()==b1){
                if(rs.next()){
                     new Transcations().setVisible(true);
             setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "INCORRECT CARD NO OR PASSWORD");
                
                }
                
            }else if(ae.getSource()==b2){
                t1.setText("");
                pf2.setText("");
            }else if(ae.getSource()==b3){
                new Signup().setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception ex){
            ex.printStackTrace(); 
            System.out.print("Error:"+ex);
        }
    }
    public static void main(String[] args){
        new Login().setVisible(true);
    }
}
