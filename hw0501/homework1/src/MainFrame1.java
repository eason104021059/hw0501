import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame {
    private JButton jbtnAdd = new JButton("<--");
    private JButton jbtn = new JButton("-->");
    private JButton jbt =new JButton("Exit");
    private JButton jba =new JButton("Back");
    private JLabel jlb = new JLabel(">_<");
    private JTextField jtf = new JTextField();
    private int x =50;
    public MainFrame1 (){
        inti();
    }
    private void inti(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(500,50);
        this.setSize(800,600);

        jlb.setBounds( x ,100,120,30);
        this.add(jlb);

        jbtnAdd.setLocation(100,300);
        jbtnAdd.setSize(120,30);
        this.add(jbtnAdd);

        jbtn.setLocation(250,300);
        jbtn.setSize(120,30);
        this.add(jbtn);

        jba.setLocation(400,300);
        jba.setSize(120,30);
        this.add(jba);

        jbt.setLocation(550,300);
        jbt.setSize(120,30);
        this.add(jbt);

        jtf.setLocation(300,400);
        jtf.setSize(120,30);
        this.add(jtf);

        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=Integer.parseInt(jtf.getText());
                switch (x%40){
                    case 0 :
                        jlb.setText("=_=");
                        break;
                    case 10 :
                        jlb.setText("~_~");
                        break;
                    case 20 :
                        jlb.setText("$_$");
                        break;
                    case 30 :
                        jlb.setText("%_%");
                        break;
                }
                jlb.setLocation(x,100);

                MainFrame1.this.setTitle(Integer.toString(x));
            }
        });
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                x+=Integer.parseInt(jtf.getText());
                switch (x%40){
                    case 0 :
                        jlb.setText("=_=");
                        break;
                    case 10 :
                        jlb.setText("~_~");
                        break;
                    case 20 :
                        jlb.setText("$_$");
                        break;
                    case 30 :
                        jlb.setText("%_%");
                        break;
                }
                jlb.setLocation(x,100);
                MainFrame1.this.setTitle(Integer.toString(x));
            }
        });
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(">_<");
            }
        });





    }
}

