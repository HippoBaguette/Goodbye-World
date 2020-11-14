package Java;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Goodbye my friend. It's been real, world");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);

        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
    }
}
