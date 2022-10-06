import javax.swing.*;

public class KryptoView extends JFrame {
    private JTextField textField1;
    private JTextArea textArea1;

    KryptoView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        this.add(calcPanel);
    }
}
