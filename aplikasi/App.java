import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Membuat frame utama
            JFrame frame = new JFrame("Menu UTBK-SNBT");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);

            // Menginisialisasi MainView untuk navigasi antar menu
            MainView mainView = new MainView(frame);
            mainView.init();

            // Menampilkan frame
            frame.setVisible(true);
        });
    }
}
