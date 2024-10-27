import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());
        
        JLabel label = new JLabel();
        label.setFont(new Font("ds-digital", Font.PLAIN, 150));
        label.setBackground(Color.RED);
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        frame.add(label, BorderLayout.CENTER);
        
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());
                label.setText(time);
            }
        });
        timer.start();
        
        frame.setVisible(true);
    }
}
