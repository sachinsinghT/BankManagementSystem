package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;

        setLayout(null);

        // ===== SAME IMAGE SIZE AS Transactions =====
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img = i1.getImage().getScaledInstance(800, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(img);

        JLabel bg = new JLabel(i3);
        bg.setBounds(0, 0, 800, 700);  // EXACT SAME
        add(bg);

        // ===== SAME HEADING POSITION =====
        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(150, 220, 700, 35);  // MATCHED EXACT
        bg.add(l1);

        // ===== BUTTONS WITH SAME ALIGNMENT STYLE =====
        b1 = new JButton("Rs 100");
        b2 = new JButton("Rs 500");
        b3 = new JButton("Rs 1000");
        b4 = new JButton("Rs 2000");
        b5 = new JButton("Rs 5000");
        b6 = new JButton("Rs 10000");
        b7 = new JButton("BACK");

        // Left column buttons (same x = 140)
        b1.setBounds(140, 320, 150, 20);
        b3.setBounds(140, 350, 150, 20);
        b5.setBounds(140, 380, 150, 20);

        // Right column buttons (same x = 305)
        b2.setBounds(305, 320, 152, 20);
        b4.setBounds(305, 350, 152, 20);
        b6.setBounds(305, 380, 152, 20);
        b7.setBounds(305, 405, 152, 20);

        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        bg.add(b5);
        bg.add(b6);
        bg.add(b7);

        // Action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        // Frame settings — SAME AS Transactions
        setSize(900, 900);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton) ae.getSource()).getText().substring(3);

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '" + pin + "'");

            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }

            if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }

            if (ae.getSource() == b7) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            } else {
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");

                setVisible(false);
                new Transactions(pin).setVisible(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
}
