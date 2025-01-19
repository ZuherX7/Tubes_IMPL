import javax.swing.*;
import java.awt.*;

public class HeaderView {
    private JPanel panel;

    public HeaderView() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(0, 128, 128)); // Warna header

        JLabel titleLabel = new JLabel("Menu UTBK-SNBT", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        panel.add(titleLabel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}
