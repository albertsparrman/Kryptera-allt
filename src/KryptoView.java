import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class KryptoView{
    private JTextField fortniteTextField;
    private JTextArea TextArea;
    private JPanel Beda;




    public static void main(String[] args) {
        JFrame frame = new JFrame();

        //create the font

        Font customFont = null;
        try {
            //create the font to use. Specify the size!
            customFont = Font.createFont(Font.TRUETYPE_FONT, new File("fortnite.otf")).deriveFont(12f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //register the font
            ge.registerFont(customFont);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }

//use the font
        frame.setFont(customFont);

        frame.setContentPane(new KryptoView().Beda);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
