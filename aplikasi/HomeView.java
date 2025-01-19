import javax.swing.*;
import java.awt.*;

public class HomeView {
    private JPanel panel;

    public HomeView() {
        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("Home");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setHorizontalAlignment(SwingConstants.LEFT);

        JTextArea textArea = new JTextArea(
                "Selamat datang di portal UTBK-SNBT!\nSilakan pilih menu untuk melanjutkan."
        );
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(title, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}
