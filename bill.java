package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Nets
        extends JFrame
        implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel da;
    private JTextField date;
    private JLabel dob;

    private JTextField item;
    private JTextField quan;
    private JTextField price;
    private JTextArea tf;

    private JTextField item1;
    private JTextField quan1;
    private JTextField price1;
    private JTextArea tf1;

    private JTextField item2;
    private JTextField quan2;
    private JTextField price2;
    private JTextArea tf2;

    private JTextField item3;
    private JTextField quan3;
    private JTextField price3;
    private JTextArea tf3;

    private JTextField item4;
    private JTextField quan4;
    private JTextField price4;
    private JTextArea tf4;

    private JTextField item5;
    private JTextField quan5;
    private JTextField price5;
    private JTextArea tf6;

    private JTextField item6;
    private JTextField quan6;
    private JTextField price6;
    private JTextArea tf7;

    private JTextField item7;
    private JTextField quan7;
    private JTextField price7;
    private JTextArea tf8;

    private JTextArea tf5;
    private JButton sub;
    private JTextArea tout;
    private JButton print;
    private JLabel res;


    public Nets() {
        setTitle("Welcome to super market");
        setBounds(300, 90, 900, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Siri Ropes & Nets");
        title.setFont(new Font("Comic Sans MS", Font.PLAIN, 35));
        title.setSize(600, 70);
        title.setLocation(120, 17);
        c.add(title);

        name = new JLabel("Name  :");
        name.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        name.setSize(70, 20);
        name.setLocation(70, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(180, 100);
        c.add(tname);

        mno = new JLabel("Mobile :");
        mno.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(70, 130);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(180, 130);
        c.add(tmno);

        da = new JLabel("Date :");
        da.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        da.setSize(100, 20);
        da.setLocation(70, 160);
        c.add(da);

        date = new JTextField();
        date.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        date.setSize(150, 20);
        date.setLocation(180, 160);
        c.add(date);

        dob = new JLabel("Item      Quantity        Price       Total");
        dob.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        dob.setSize(500, 30);
        dob.setLocation(70, 200);
        c.add(dob);


        //1//

        item = new JTextField("");
        item.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item.setSize(100, 30);
        item.setLocation(50, 250);
        c.add(item);

        quan = new JTextField("0");
        quan.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan.setSize(80, 30);
        quan.setLocation(170, 250);
        c.add(quan);

        price = new JTextField("0");
        price.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price.setSize(80, 30);
        price.setLocation(270, 250);
        c.add(price);

        tf = new JTextArea();
        tf.setBounds(360, 250, 80, 30);
        c.add(tf);

        //2//

        item1 = new JTextField("");
        item1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item1.setSize(100, 30);
        item1.setLocation(50, 280);
        c.add(item1);

        quan1 = new JTextField("0");
        quan1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan1.setSize(80, 30);
        quan1.setLocation(170, 280);
        c.add(quan1);

        price1 = new JTextField("0");
        price1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price1.setSize(80, 30);
        price1.setLocation(270, 280);
        c.add(price1);

        tf1 = new JTextArea();
        tf1.setBounds(360, 280, 80, 30);
        c.add(tf1);
        //3//

        item2 = new JTextField("");
        item2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item2.setSize(100, 30);
        item2.setLocation(50, 310);
        c.add(item2);

        quan2 = new JTextField("0");
        quan2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan2.setSize(80, 30);
        quan2.setLocation(170, 310);
        c.add(quan2);

        price2 = new JTextField("0");
        price2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price2.setSize(80, 30);
        price2.setLocation(270, 310);
        c.add(price2);

        tf2 = new JTextArea();
        tf2.setBounds(360, 310, 80, 30);
        c.add(tf2);

        //4//

        item3 = new JTextField("");
        item3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item3.setSize(100, 30);
        item3.setLocation(50, 340);
        c.add(item3);

        quan3 = new JTextField("0");
        quan3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan3.setSize(80, 30);
        quan3.setLocation(170, 340);
        c.add(quan3);

        price3 = new JTextField("0");
        price3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price3.setSize(80, 30);
        price3.setLocation(270, 340);
        c.add(price3);

        tf3 = new JTextArea();
        tf3.setBounds(360, 340, 80, 30);
        c.add(tf3);

        //5//

        item4 = new JTextField("");
        item4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item4.setSize(100, 30);
        item4.setLocation(50, 370);
        c.add(item4);

        quan4 = new JTextField("0");
        quan4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan4.setSize(80, 30);
        quan4.setLocation(170, 370);
        c.add(quan4);

        price4 = new JTextField("0");
        price4.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price4.setSize(80, 30);
        price4.setLocation(270, 370);
        c.add(price4);

        tf4 = new JTextArea();
        tf4.setBounds(360, 370, 80, 30);
        c.add(tf4);

        //6//

        item5 = new JTextField("");
        item5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item5.setSize(100, 30);
        item5.setLocation(50, 400);
        c.add(item5);

        quan5 = new JTextField("0");
        quan5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan5.setSize(80, 30);
        quan5.setLocation(170, 400);
        c.add(quan5);

        price5 = new JTextField("0");
        price5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price5.setSize(80, 30);
        price5.setLocation(270, 400);
        c.add(price5);

        tf6 = new JTextArea();
        tf6.setBounds(360, 400, 80, 30);
        c.add(tf6);

        //7//

        item6 = new JTextField("");
        item6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item6.setSize(100, 30);
        item6.setLocation(50, 430);
        c.add(item6);

        quan6 = new JTextField("0");
        quan6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan6.setSize(80, 30);
        quan6.setLocation(170, 430);
        c.add(quan6);

        price6 = new JTextField("0");
        price6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price6.setSize(80, 30);
        price6.setLocation(270, 430);
        c.add(price6);

        tf7 = new JTextArea();
        tf7.setBounds(360, 430, 80, 30);
        c.add(tf7);

        //8//

        item7 = new JTextField("");
        item7.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        item7.setSize(100, 30);
        item7.setLocation(50, 460);
        c.add(item7);

        quan7 = new JTextField("0");
        quan7.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        quan7.setSize(80, 30);
        quan7.setLocation(170, 460);
        c.add(quan7);

        price7 = new JTextField("0");
        price7.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        price7.setSize(80, 30);
        price7.setLocation(270, 460);
        c.add(price7);

        tf8 = new JTextArea();
        tf8.setBounds(360, 460, 80, 30);
        c.add(tf8);


        tf5 = new JTextArea();
        tf5.setBounds(360, 500, 80, 30);
        c.add(tf5);


        sub = new JButton("Submit");
        sub.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 530);
        sub.addActionListener(this);
        c.add(sub);

        print = new JButton("Print");
        print.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        print.setSize(100, 20);
        print.setLocation(270, 530);
        print.addActionListener(this);
        c.add(print);


        res = new JLabel("");
        res.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 520);
        c.add(res);

        tout = new JTextArea();
        tout.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
        tout.setSize(350, 400);
        tout.setLocation(450, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        c.setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String i1 = item.getText();
            String q1 = quan.getText();
            float q11 = Float.parseFloat(q1);
            String p1 = price.getText();
            float p11 = Float.parseFloat(p1);
            int pr1 = (int) (q11 * p11);
            String pc1 = "" + Math.floor(pr1);
            tf.setText(pc1);
            int tot = (pr1);
            String total = "" + Math.floor(tot);
            tf5.setText(total);

            String i2 = item1.getText();
            String q2 = quan1.getText();
            float q22 = Float.parseFloat(q2);
            String p2 = price1.getText();
            float p22 = Float.parseFloat(p2);
            int pr2 = (int) (q22 * p22);
            String pc2 = "" + Math.floor(pr2);
            tf1.setText(pc2);
            int tot1 = 0;
            tot1 = (pr2);
            String total1 = "" + Math.floor(tot + tot1);
            tf5.setText(total1);

            String i3 = item2.getText();
            String q3 = quan2.getText();
            float q33 = Float.parseFloat(q3);
            String p3 = price2.getText();
            float p33 = Float.parseFloat(p3);
            int pr3 = (int) (q33 * p33);
            String pc3 = "" + Math.floor(pr3);
            tf2.setText(pc3);
            tf1.setText(pc2);
            int tot2 = 0;
            tot2 = (pr3);
            String total2 = "" + Math.floor(tot + tot1 + tot2);
            tf5.setText(total2);

            String i4 = item3.getText();
            String q4 = quan3.getText();
            float q44 = Float.parseFloat(q4);
            String p4 = price3.getText();
            float p44 = Float.parseFloat(p4);
            int pr4 = (int) (q44 * p44);
            String pc4 = "" + Math.floor(pr4);
            tf3.setText(pc4);
            int tot3 = 0;
            tot3 = (pr4);
            String total3 = "" + Math.floor(tot + tot1 + tot2 + tot3);
            tf5.setText(total3);

            String i5 = item4.getText();
            String q5 = quan4.getText();
            float q55 = Float.parseFloat(q5);
            String p5 = price4.getText();
            float p55 = Float.parseFloat(p5);
            int pr5 = (int) (q55 * p55);
            String pc5 = "" + Math.floor(pr5);
            tf4.setText(pc5);
            int tot4 = 0;
            tot4 = (pr4);
            String total4 = "" + Math.floor(tot + tot1 + tot2 + tot3+tot4);
            tf5.setText(total4);

            String i6 = item5.getText();
            String q6 = quan5.getText();
            float q66 = Float.parseFloat(q6);
            String p6 = price5.getText();
            float p66 = Float.parseFloat(p6);
            int pr6 = (int) (q66 * p66);
            String pc6 = "" + Math.floor(pr6);
            tf6.setText(pc6);
            int tot5 = 0;
            tot5 = (pr5);
            String total5 = "" + Math.floor(tot + tot1 + tot2 + tot3 + tot4 + tot5);
            tf5.setText(total5);

            String i7 = item6.getText();
            String q7 = quan6.getText();
            float q77 = Float.parseFloat(q7);
            String p7 = price6.getText();
            float p77 = Float.parseFloat(p7);
            int pr7 = (int) (q77 * p77);
            String pc7 = "" + Math.floor(pr7);
            tf7.setText(pc7);
            int tot6 = 0;
            tot6 = (pr6);
            String total6 = "" + Math.floor(tot + tot1 + tot2 + tot3 + tot4 + tot5 + tot6);
            tf5.setText(total6);

            String i8 = item7.getText();
            String q8 = quan7.getText();
            float q88 = Float.parseFloat(q8);
            String p8 = price7.getText();
            float p88 = Float.parseFloat(p8);
            int pr8 = (int) (q77 * p77);
            String pc8 = "" + Math.floor(pr8);
            tf8.setText(pc8);
            int tot7 = 0;
            tot7 = (pr7);
            //String total4 = "" + Math.floor(tot + tot1 + tot2 + tot3 + tot4);
            int total11 = (int) (tot + tot1 + tot2 + tot3 + tot4 + tot5 + tot6 + tot7);
            String total14 = "" + total11;
            tf5.setText(total4);

            String data =
                    "\tSIRI ROPES & NETS\n"
                            + "     #5-323,Alluri seetharamaraju Street,\n"
                            + "   Opp.Power Office, Kurnool Road ,ONGOLE-2\n"
                            + "     Contact : 9393909055,9393909044\n"
                            + "\t     Estimation" + "\n"
                            + "Name : "
                            + tname.getText() + "\n"
                            + "Mobile : "
                            + tmno.getText() + "\n"
                            + "Date : "
                            + date.getText() + "\n"
                            + "\n";

            String data2 = "Item\tQuantity\tPrice\tTotal" + "\n" + i1 + "\t" + q1 + "\t" + p1 + "\t" + pc1 + "\n"
                            +i2 + "\t" + q2 + "\t" + p2 + "\t" + pc2 + "\n"
                            +i3 + "\t" + q3 + "\t" + p3 + "\t" + pc3 + "\n";
            String data3 = i4 + "\t" + q4 + "\t" + p4 + "\t" + pc4 + "\n"
                            +i5 + "\t" + q5 + "\t" + p5 + "\t" + pc5 + "\n"
                            +i6 + "\t" + q6 + "\t" + p6 + "\t" + pc6 + "\n"
                            +i7 + "\t" + q7 + "\t" + p7 + "\t" + pc7 + "\n"
                            +i8 + "\t" + q8 + "\t" + p8 + "\t" + pc8 + "\n"
                            +"\n" + "" + "\t" + "" + "\t" + "" + "\t" + "Total : " + total14 + "\n";

            tout.setText(data + data2 + data3 );
            tout.setEditable(false);
        } else if (e.getSource() == print) {
            try {
                tout.print();
            } catch (PrinterException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
class shop {

    public static void main(String[] args) throws Exception
    {
        Nets f = new Nets();
    }
}
