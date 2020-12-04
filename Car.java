
     import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

    public class Car {
        JFrame f;
        JTextField tf;
        JButton cnt,  nt;
        String[] a = new String[6];
        String[] split=new String[9];
        int s;
        JCheckBox[] b = new JCheckBox[6];
        JTextArea tf1;



        public Car() {
            f = new JFrame("Car show");


            f.setLayout(new BorderLayout());
            f.setSize(600, 300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            tf = new JTextField(15);
            tf.setBounds(63,240,462,20);
            tf.setBackground(Color.orange);

            tf1 = new JTextArea();

           tf1.setBackground(Color.green);
           tf1.setEditable(false);
            tf.setVisible(false);
            tf.setEditable(false);
            b[0] = new JCheckBox("Ford");
            b[1] = new JCheckBox("BMW");
            b[2] = new JCheckBox("Jeep");
            b[3] = new JCheckBox("Honda");
            b[4] = new JCheckBox("Audi");
            b[5]= new JCheckBox("Volvo");

              JPanel p=new JPanel();
              for(int i=0;i<b.length;i++){
                  p.add(b[i]);
              }

               a[0] = " Name: Ford ,Price: 100000 ,Id: 12345 ,Colour: RED , BLack ,features: Passenger Airbag";
            a[1] = " Name: BMW  ,Price: 150000 ,Id: 4567  ,Colour: white ,pink,features: Fog Lights-Front";
            a[2] = " Name: Jeep ,Price: 140000 ,Id: 0987  ,Colour: gray,features: Alloy Wheels ";
            a[3] = " Name: Honda ,Price: 180000 ,Id: 32476 ,Colour: Black , white,features: Power Windows Front";
            a[4] = " Name: Audi ,Price: 120000 ,Id: 26789 ,Colour: Red ,pink,features: Anti Lock Braking System";
            a[5] = " Name: Volvo ,Price: 100000 ,Id: 8973  ,Colour: yellow,features: Power Steering";

            cnt = new JButton("show");

            nt = new JButton("Book");
            f.add(p,BorderLayout.NORTH);
           f.add(tf,BorderLayout.SOUTH);
            f.add(nt,BorderLayout.EAST);
            f.add(cnt,BorderLayout.WEST);
            f.add(tf1,BorderLayout.CENTER);
            nt.addActionListener(new CounterAction4());
            cnt.addActionListener(new CounterAction1());

            f.setVisible(true);
        }

        public static void main(String[] args) {
            new Car();
        }

        public class CounterAction1 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object ob = actionEvent.getSource();
                if (ob == cnt) {
                    if (b[0].isSelected()) {

                                tf1.append(a[0]+"\n");
                    }
                    if (b[1].isSelected()) {
                                tf1.append(a[1]+"\n");
                    }
                    if (b[2].isSelected()) {
                                    tf1.append(a[2]+"\n");

                    }
                    if (b[3].isSelected()) {
                                    tf1.append(a[3]+"\n");


                    }
                    if (b[4].isSelected()) {
                                    tf1.append(a[4]+"\n");
                    }
                    if (b[5].isSelected()) {
                                    tf1.append(a[5]+"\n");
                    }
                    }
                }
            }


        public class CounterAction4 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object ob = actionEvent.getSource();
          tf.setVisible(true);
                if (ob == nt) {

                    tf.setVisible(true);
                    int h=0;
                    if (b[0].isSelected()) {

                                 split = a[0].split(",");
                                 String[]s4=split[1].split(":");



                           s= Integer.parseInt(s4[1].trim());

                                h=h+s;
                    }
                    if (b[1].isSelected()) {

                                split = a[1].split(" ,");
                        String[]s4=split[1].split(":");
                        s= Integer.parseInt(s4[1].trim());
                                h=h+s;
                            }
                    if (b[2].isSelected()) {

                                 split = a[2].split(" ,");
                        String[]s4=split[1].split(":");

                        s= Integer.parseInt(s4[1].trim());
                                h=h+s;
                    }
                    if (b[3].isSelected()) {

                                 split = a[3].split(" ,");
                        String[]s4=split[1].split(":");

                        s= Integer.parseInt(s4[1].trim());
                                h=h+s;
                    }
                    if (b[4].isSelected()) {

                                split = a[4].split(" ,");
                        String[]s4=split[1].split(":");

                        s= Integer.parseInt(s4[1].trim());
                                h=h+s;
                    }
                    if (b[5].isSelected()) {

                                 split = a[5].split(" ,");
                        String[]s4=split[1].split(":");

                        s= Integer.parseInt(s4[1].trim());
                                h=h+s;
                    }
                    tf.setText("Total amount of due :"+String.valueOf(h));
                }
                    }

                }
            }








