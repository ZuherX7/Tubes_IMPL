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

        KartuPesertaView kartuPesertaView = new KartuPesertaView();
        mainPanel.add(kartuPesertaView.getPanel(), "Kartu Peserta");
        navigationView.addNavigationListener("Cetak Kartu", e -> switchPanel("Kartu Peserta"));
        navContainer.add(mainPanel, BorderLayout.CENTER);
        backgroundPanel.add(navContainer);

        // Menambahkan panel-panel utama
        HomeView homeView = new HomeView();
        InformasiView informasiView = new InformasiView();

        mainPanel.add(homeView.getPanel(), "Home");
        mainPanel.add(informasiView.getPanel(), "Informasi");

        // Mengatur action button navigasi
        navigationView.addNavigationListener("Home", e -> switchPanel("Home"));
        navigationView.addNavigationListener("Informasi", e -> switchPanel("Informasi"));
    }

    private void switchPanel(String panelName) {
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, panelName);
    }
}
