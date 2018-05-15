import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel jlb = new JLabel("華氏度:");
    private JLabel jlb1 = new JLabel("攝氏度:");
    private JLabel jlb2 = new JLabel();
    private JTextField jtf =new JTextField(0);
    private JButton jbt = new JButton("=");
    private JButton jbt1 =new JButton("exit");
    public MainFrame (){
        inti();
    }
    private void inti(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(1200,300);

        jlb.setBounds(150,100,100,30);
        this.add(jlb);

        jtf.setBounds(300,100,150,30);
        this.add(jtf);

        jbt.setBounds(450,100,150,30);
        this.add(jbt);

        jlb1.setBounds(600,100,150,30);
        this.add(jlb1);

        jlb2.setBounds(760,100,150,30);
        this.add(jlb2);


        jbt1.setBounds(450,150,100,30);
        this.add(jbt1);

        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb2.setText(jtf.getText());
                int x=Integer.parseInt(jlb2.getText());
                int y =(x-32)*5/9;
                jlb2.setText(String.valueOf(y));
            }
        });

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

