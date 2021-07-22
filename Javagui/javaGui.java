import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class javaGui  implements ActionListener {

    private static JTextField txt1 ,txt2;
    private static JLabel label3 , label4;

    public static void setframe(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(550,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        //ประกาศประเภทที่ใส่
        JLabel label = new JLabel("Higth  :  ");
        //จัดวาง
        label.setBounds(20,25,100,45);
        //addเข้าไปใน pannel
        panel.add(label);

        txt1 = new JTextField();
        txt1.setBounds(100,25,180,40);
        panel.add(txt1);

        JLabel label2 = new JLabel("Weight :  ");
        label2.setBounds(20,85,100,45);
        panel.add(label2);

        txt2 = new JTextField();
        txt2.setBounds(100,85,180,40);
        panel.add(txt2);

        JButton btn = new JButton("Calculate");
        btn.setBounds(282,145,150,40);
        btn.addActionListener(new javaGui());
        panel.add(btn);

        label3 = new JLabel(" ");
        label3.setBounds(20,140,180,45);
        panel.add(label3);
        
        label4 = new JLabel(" ");
        label4.setBounds(100,140,180,45);
        panel.add(label4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String  h = txt1.getText();
        String w = txt2.getText();
        
        bmi b = new bmi();
        b.calbmi(Integer.parseInt(h),Float.parseFloat(w));

        String calbmi = b.getbmi();

        label3.setText("Bmi = " + calbmi);

    }

    public static void main(String[] args) {
        setframe();
    }
}