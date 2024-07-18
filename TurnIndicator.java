import javax.swing.*;
import java.awt.*;

public class TurnIndicator extends JLabel {
    TurnIndicator() {
        this.setBackground(new Color(25, 25, 25));
        this.setForeground(new Color(25, 100, 0));
        this.setFont(new Font("Ink Free", Font.BOLD, 35));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setText("Tic Tac Toe");
        this.setOpaque(true);
    }
}
