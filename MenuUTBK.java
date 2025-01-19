import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MenuUTBK {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Menu UTBK-SNBT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLayout(new BorderLayout());

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(0, 128, 128)); // Toska cerah untuk header

        JLabel titleLabel = new JLabel("Menu UTBK-SNBT", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Logo
        JLabel logoLabel = new JLabel("SN BT", SwingConstants.LEFT);
        logoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        logoLabel.setForeground(Color.WHITE);

        headerPanel.add(logoLabel, BorderLayout.WEST);
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        frame.add(headerPanel, BorderLayout.NORTH);

        // Main background panel (outer background color)
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(173, 216, 230)); // Toska cerah sesuai dengan gambar
        backgroundPanel.setLayout(new GridBagLayout()); // Used to center the white panel
        frame.add(backgroundPanel, BorderLayout.CENTER);

        // Navigation panel with border
        JPanel navContainer = new JPanel();
        navContainer.setBackground(Color.WHITE); // White background for the navigation
        navContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        navContainer.setBorder(new LineBorder(Color.BLACK, 2)); // Black outline border

        JButton homeButton = new JButton("Home");
        JButton daftarButton = new JButton("Daftar");
        JButton cetakKartuButton = new JButton("Cetak Kartu");
        JButton informasiButton = new JButton("Informasi");
        JButton hasilButton = new JButton("Pengumuman Hasil");
        JButton profileButton = new JButton("Profile");

        // Add buttons to the navigation container
        navContainer.add(homeButton);
        navContainer.add(daftarButton);
        navContainer.add(cetakKartuButton);
        navContainer.add(informasiButton);
        navContainer.add(hasilButton);
        navContainer.add(profileButton);

        // Centered panel wrapper for navigation
        JPanel navPanelWrapper = new JPanel();
        navPanelWrapper.setBackground(Color.WHITE);
        navPanelWrapper.setLayout(new BorderLayout());
        navPanelWrapper.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        navPanelWrapper.add(navContainer, BorderLayout.CENTER);

        // Add the wrapper panel to the background panel
        backgroundPanel.add(navPanelWrapper);

        // Footer (optional if needed in design)
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(0, 128, 128)); // Matching the header color
        JLabel footerLabel = new JLabel("Hak Cipta © 2025 Manajemen SNBT");
        footerLabel.setForeground(Color.WHITE);
        footerPanel.add(footerLabel);
        frame.add(footerPanel, BorderLayout.SOUTH);

        // Make frame visible
        frame.setVisible(true);
    }
}
