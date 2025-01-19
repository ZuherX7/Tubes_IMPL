import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionListener;

public class NavigationView {
    private JPanel panel;
    private Map<String, JButton> buttons;

    public NavigationView() {
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttons = new HashMap<>();

        // Membuat tombol navigasi
        addButton("Home");
        addButton("Daftar");
        addButton("Cetak Kartu");
        addButton("Informasi");
        addButton("Pengumuman Hasil");
        addButton("Profile");
    }

    private void addButton(String name) {
        JButton button = new JButton(name);
        buttons.put(name, button);
        panel.add(button);
    }

    public JPanel getNavigationPanel() {
        return panel;
    }

    public void addNavigationListener(String name, ActionListener listener) {
        JButton button = buttons.get(name);
        if (button != null) {
            button.addActionListener(listener);
        }
    }
}
