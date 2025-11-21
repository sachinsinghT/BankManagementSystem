package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUpTwo extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    JButton b;
    JRadioButton r1, r2, r3, r4;
    JTextField t1, t2;
    JComboBox c1, c2, c3, c4, c5;
    String formno;

    JPanel panel;  // SCROLL PANEL

    SignUpTwo(String formno) {

        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(850, 900)); // Scroll area size
        panel.setBackground(Color.WHITE);

        // ---------- LOGO ----------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        panel.add(l14);

        // ---------- ORIGINAL COMPONENTS ----------
        l1 = new JLabel("Page 2: Additonal Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 30, 600, 40);
        panel.add(l1);

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));
        l12.setBounds(700, 10, 60, 30);
        panel.add(l12);

        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));
        l13.setBounds(760, 10, 60, 30);
        panel.add(l13);

        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        l2.setBounds(100, 120, 100, 30);
        panel.add(l2);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        c1 = new JComboBox(religion);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(350, 120, 320, 30);
        panel.add(c1);

        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 170, 100, 30);
        panel.add(l3);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        c2 = new JComboBox(category);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(350, 170, 320, 30);
        panel.add(c2);

        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 220, 100, 30);
        panel.add(l4);

        String income[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(350, 220, 320, 30);
        panel.add(c3);

        l5 = new JLabel("Educational");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 270, 150, 30);
        panel.add(l5);

        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 290, 150, 30);
        panel.add(l11);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        c4 = new JComboBox(education);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(350, 270, 320, 30);
        panel.add(c4);

        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 340, 150, 30);
        panel.add(l6);

        String occupation[] = {"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"};
        c5 = new JComboBox(occupation);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(350, 340, 320, 30);
        panel.add(c5);

        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 390, 150, 30);
        panel.add(l7);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t1.setBounds(350, 390, 320, 30);
        panel.add(t1);

        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 440, 180, 30);
        panel.add(l8);

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t2.setBounds(350, 440, 320, 30);
        panel.add(t2);

        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 490, 150, 30);
        panel.add(l9);

        r1 = new JRadioButton("Yes");
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(350, 490, 100, 30);
        panel.add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(460, 490, 100, 30);
        panel.add(r2);

        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 540, 180, 30);
        panel.add(l10);

        r3 = new JRadioButton("Yes");
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(350, 540, 100, 30);
        panel.add(r3);

        r4 = new JRadioButton("No");
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(460, 540, 100, 30);
        panel.add(r4);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(570, 640, 100, 30);
        b.addActionListener(this);
        panel.add(b);

        // ---------- SCROLLPANE ----------
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scroll);

        setSize(900, 700);
        setLocation(450, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        new SignUpThree(formno).setVisible(true);
        setVisible(false);
    }


}
