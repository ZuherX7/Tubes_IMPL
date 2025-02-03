import java.awt.*;
import javax.swing.*;

public class ProfileView {
    private JPanel panel;

    public ProfileView() {
        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("Profile Mahasiswa", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel(new GridLayout(7, 1, 10, 10));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        infoPanel.add(new JLabel("Nama: Andhika"));
        infoPanel.add(new JLabel("NIM: 12345678"));
        infoPanel.add(new JLabel("Tanggal Lahir: 01 Januari 2000"));
        infoPanel.add(new JLabel("Fakultas: Teknik"));
        infoPanel.add(new JLabel("Program Studi: Informatika"));
        infoPanel.add(new JLabel("Alamat: Jl. Merdeka No. 123"));
        infoPanel.add(new JLabel("Email: Andhika12@example.com"));

        panel.add(infoPanel, BorderLayout.WEST);
    }

    public JPanel getPanel() {
        return panel;
    }
}