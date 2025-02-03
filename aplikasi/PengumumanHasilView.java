import java.awt.*;
import javax.swing.*;

public class PengumumanHasilView {
    private JPanel panel;

    public PengumumanHasilView() {
        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("Pengumuman Hasil", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(title, BorderLayout.NORTH);

        JPanel contentPanel = new JPanel(new GridLayout(6, 1, 10, 10));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel statusLabel = new JLabel("Status Kelulusan: Lulus", SwingConstants.CENTER);
        JLabel nomorPesertaLabel = new JLabel("Nomor Peserta: 123456789", SwingConstants.CENTER);
        JLabel namaPesertaLabel = new JLabel("Nama Peserta: Andhika", SwingConstants.CENTER);
        JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir: 01 Januari 2000", SwingConstants.CENTER);
        JLabel namaPTNLabel = new JLabel("Nama PTN: Universitas Indonesia", SwingConstants.CENTER);
        JLabel namaProdiLabel = new JLabel("Nama Prodi: Teknik Informatika", SwingConstants.CENTER);

        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        nomorPesertaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        namaPesertaLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        tanggalLahirLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        namaPTNLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        namaProdiLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        contentPanel.add(statusLabel);
        contentPanel.add(nomorPesertaLabel);
        contentPanel.add(namaPesertaLabel);
        contentPanel.add(tanggalLahirLabel);
        contentPanel.add(namaPTNLabel);
        contentPanel.add(namaProdiLabel);

        panel.add(contentPanel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}