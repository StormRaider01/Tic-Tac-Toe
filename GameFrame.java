import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(false);
        this.setVisible(true);

        // changing the picture of the JFrame
        ImageIcon image = new ImageIcon("appPicture.jpg");
        setIconImage(image.getImage());
    }
}
