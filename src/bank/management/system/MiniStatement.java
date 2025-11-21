/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {
    
    JButton b1;
    JLabel l1;
    
    MiniStatement(String pin){
        super("Mini Statement");
        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);
        
        // Statement Label (inside scroll pane)
        l1 = new JLabel();
        l1.setVerticalAlignment(SwingConstants.TOP);
        
        JScrollPane scrollPane = new JScrollPane(l1);
        scrollPane.setBounds(20, 140, 340, 300);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        JLabel l2 = new JLabel("Indian Bank");
        l2.setBounds(150, 20, 200, 20);
        add(l2);
        
        JLabel l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
        add(l3);
        
        JLabel l4 = new JLabel();
        l4.setBounds(20, 460, 300, 20);
        add(l4);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pin+"'");
            while(rs.next()){
                l3.setText("Card Number: " + 
                    rs.getString("cardno").substring(0, 4) + 
                    "XXXXXXXX" + 
                    rs.getString("cardno").substring(12)
                );
            }
        } catch(Exception e){}
        
        try{
            int balance = 0;
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            
            StringBuilder sb = new StringBuilder("<html>");
            
            while(rs.next()){
                sb.append(rs.getString("date"))
                  .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                  .append(rs.getString("type"))
                  .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                  .append(rs.getString("amount"))
                  .append("<br><br>");
                
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            sb.append("</html>");
            l1.setText(sb.toString());
            
            l4.setText("Your total Balance is Rs " + balance);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        b1 = new JButton("Exit");
        b1.setBounds(20, 520, 100, 25);
        b1.addActionListener(this);
        add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    
   
}
