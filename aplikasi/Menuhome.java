import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Menuhome {

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
        navContainer.setLayout(new BorderLayout());
        navContainer.setBorder(new LineBorder(Color.BLACK, 2)); // Black outline border

        // Top section with navigation buttons
        JPanel navButtonsPanel = new JPanel();
        navButtonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton homeButton = new JButton("Home");
        JButton daftarButton = new JButton("Daftar");
        JButton cetakKartuButton = new JButton("Cetak Kartu");
        JButton informasiButton = new JButton("Informasi");
        JButton hasilButton = new JButton("Pengumuman Hasil");
        JButton profileButton = new JButton("Profile");
        navButtonsPanel.add(homeButton);
        navButtonsPanel.add(daftarButton);
        navButtonsPanel.add(cetakKartuButton);
        navButtonsPanel.add(informasiButton);
        navButtonsPanel.add(hasilButton);
        navButtonsPanel.add(profileButton);

        // Add navigation buttons to the container
        navContainer.add(navButtonsPanel, BorderLayout.NORTH);

        // Center section with content
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(Color.WHITE);

        // "Home" title and description text
        JLabel homeTitle = new JLabel("Home");
        homeTitle.setFont(new Font("Arial", Font.BOLD, 20));
        homeTitle.setHorizontalAlignment(SwingConstants.LEFT);
        contentPanel.add(homeTitle, BorderLayout.NORTH);

        JTextArea descriptionText = new JTextArea(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        );
        descriptionText.setFont(new Font("Arial", Font.PLAIN, 14));
        descriptionText.setLineWrap(true);
        descriptionText.setWrapStyleWord(true);
        descriptionText.setEditable(false);
        descriptionText.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPanel.add(descriptionText, BorderLayout.CENTER);

        // Add sticky note on the right
        JPanel stickyNote = new JPanel();
        stickyNote.setBackground(new Color(255, 228, 181)); // Sticky note background color
        stickyNote.setPreferredSize(new Dimension(150, 150));
        stickyNote.setLayout(new BorderLayout());

        JLabel stickyNoteLabel = new JLabel("Selamat", SwingConstants.CENTER);
        stickyNoteLabel.setFont(new Font("Arial", Font.BOLD, 18));
        stickyNote.add(stickyNoteLabel, BorderLayout.CENTER);

        contentPanel.add(stickyNote, BorderLayout.EAST);

        // Add content panel to navigation container
        navContainer.add(contentPanel, BorderLayout.CENTER);

        // Add the navigation container to the background panel
        backgroundPanel.add(navContainer);

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
