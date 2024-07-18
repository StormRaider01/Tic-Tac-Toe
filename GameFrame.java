import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        // this.pack();
       // this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // changing the picture of the JFrame
        ImageIcon image = new ImageIcon("appPicture.jpg");
        setIconImage(image.getImage());

        // Tic Tac Toe panel
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0, 0, 800, 100);

        TurnIndicator header = new TurnIndicator();
        titlePanel.add(header);

        this.add(titlePanel, BorderLayout.NORTH);
        this.revalidate();
        this.repaint();
    }
}
