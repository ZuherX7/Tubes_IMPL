import javax.swing.*;
import java.awt.*;

public class InformasiView {
    private JPanel panel;

    public InformasiView() {
        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("Informasi");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setHorizontalAlignment(SwingConstants.LEFT);

        JPanel contentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        JLabel profilePic = new JLabel("☺");
        profilePic.setFont(new Font("Arial", Font.BOLD, 50));

        JTextArea textArea = new JTextArea(
                "Update Syarat Masuk Universitas Harvart\n" +
                "Pelaksanaan Dimulai !!!\n" +
                "Daftar Universitas Terbaik Se Wakanda"
        );
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        textArea.setEditable(false);

        contentPanel.add(profilePic);
        contentPanel.add(textArea);

        panel.add(title, BorderLayout.NORTH);
        panel.add(contentPanel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}
