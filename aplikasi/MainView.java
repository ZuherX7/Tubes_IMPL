import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class MainView {
    private final JFrame frame;
    private JPanel mainPanel;

    public MainView(JFrame frame) {
        this.frame = frame;
    }

    public void init() {
        frame.setLayout(new BorderLayout());

        // Header
        HeaderView headerView = new HeaderView();
        frame.add(headerView.getPanel(), BorderLayout.NORTH);

        // Background Panel
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(173, 216, 230)); // Warna toska
        backgroundPanel.setLayout(new GridBagLayout());
        frame.add(backgroundPanel, BorderLayout.CENTER);

        // White Border Panel
        JPanel navContainer = new JPanel();
        navContainer.setBackground(Color.WHITE);
        navContainer.setLayout(new BorderLayout());
        navContainer.setBorder(new LineBorder(Color.BLACK, 2));

        // Navigasi
        NavigationView navigationView = new NavigationView();
        JPanel navButtonsPanel = navigationView.getNavigationPanel();
        navContainer.add(navButtonsPanel, BorderLayout.NORTH);

        // Main Panel (Dynamic Content)
        mainPanel = new JPanel(new CardLayout());

        HomeView homeView = new HomeView();
        InformasiView informasiView = new InformasiView();
        DaftarView daftarView = new DaftarView();
        KartuPesertaView kartuPesertaView = new KartuPesertaView();
        PengumumanHasilView pengumumanHasilView = new PengumumanHasilView();
        ProfileView profileView = new ProfileView();

        mainPanel.add(homeView.getPanel(), "Home");
        mainPanel.add(informasiView.getPanel(), "Informasi");
        mainPanel.add(daftarView.getPanel(), "Daftar");
        mainPanel.add(kartuPesertaView.getPanel(), "Kartu Peserta");
        mainPanel.add(pengumumanHasilView.getPanel(), "Pengumuman Hasil");
        mainPanel.add(profileView.getPanel(), "Profile");

        navigationView.addNavigationListener("Home", e -> switchPanel("Home"));
        navigationView.addNavigationListener("Informasi", e -> switchPanel("Informasi"));
        navigationView.addNavigationListener("Daftar", e -> switchPanel("Daftar"));
        navigationView.addNavigationListener("Cetak Kartu", e -> switchPanel("Kartu Peserta"));
        navigationView.addNavigationListener("Pengumuman Hasil", e -> switchPanel("Pengumuman Hasil"));
        navigationView.addNavigationListener("Profile", e -> switchPanel("Profile"));

        navContainer.add(mainPanel, BorderLayout.CENTER);
        backgroundPanel.add(navContainer);
    }

    private void switchPanel(String panelName) {
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, panelName);
    }
}
