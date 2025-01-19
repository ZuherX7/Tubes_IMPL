// import com.itextpdf.text.*;
// import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class KartuPesertaView {
    private JPanel panel;

    public KartuPesertaView() {
        panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("Kartu Peserta", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));

        // Bagian isi kartu peserta
        JPanel cardPanel = new JPanel(new GridLayout(7, 1, 5, 5));
        cardPanel.setBorder(new LineBorder(Color.BLACK, 2));
        cardPanel.setBackground(Color.WHITE);

        // Contoh informasi peserta
        cardPanel.add(new JLabel("Nomor Peserta: *****"));
        cardPanel.add(new JLabel("Nama Peserta: *****"));
        cardPanel.add(new JLabel("Tanggal Lahir: *****"));
        cardPanel.add(new JLabel("NISN: *****"));
        cardPanel.add(new JLabel("Jadwal UTBK: *****"));
        cardPanel.add(new JLabel("Lokasi UTBK: *****"));
        cardPanel.add(new JLabel("Pilihan Prodi: Pilihan 1, Pilihan 2"));

        // Logo dan judul di atas kartu
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);

        JLabel logoLabel = new JLabel(new ImageIcon("logo.png")); // Ganti dengan path logo
        JLabel snpnbLabel = new JLabel("<html><center>SNPB<br>Kartu Tanda Peserta<br>UTBK-SNBT<br>Tahun 20XX</center></html>");
        snpnbLabel.setHorizontalAlignment(SwingConstants.CENTER);
        snpnbLabel.setFont(new Font("Arial", Font.BOLD, 14));

        topPanel.add(logoLabel, BorderLayout.WEST);
        topPanel.add(snpnbLabel, BorderLayout.CENTER);

        // Gabungkan topPanel dan kartu
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(topPanel, BorderLayout.NORTH);
        contentPanel.add(cardPanel, BorderLayout.CENTER);

        // Tombol cetak
        JButton printButton = new JButton("Cetak");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // saveAsPdf();
            }
        });

        // Menambahkan ke panel utama
        panel.add(title, BorderLayout.NORTH);
        panel.add(contentPanel, BorderLayout.CENTER);
        panel.add(printButton, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return panel;
    }

    // private void saveAsPdf() {
    //     try {
    //         // Membuat dokumen PDF
    //         Document document = new Document();
    //         PdfWriter.getInstance(document, new FileOutputStream("Kartu_Peserta_UTBK.pdf"));
    //         document.open();

    //         // Menambahkan konten ke PDF
    //         document.add(new Paragraph("Kartu Tanda Peserta"));
    //         document.add(new Paragraph("UTBK-SNBT Tahun 20XX\n\n"));
    //         document.add(new Paragraph("Nomor Peserta: *****"));
    //         document.add(new Paragraph("Nama Peserta: *****"));
    //         document.add(new Paragraph("Tanggal Lahir: *****"));
    //         document.add(new Paragraph("NISN: *****"));
    //         document.add(new Paragraph("Jadwal UTBK: *****"));
    //         document.add(new Paragraph("Lokasi UTBK: *****"));
    //         document.add(new Paragraph("Pilihan Prodi: Pilihan 1, Pilihan 2"));

    //         document.close();

    //         JOptionPane.showMessageDialog(null, "File PDF berhasil dibuat!");
    //     } catch (Exception e) {
    //         JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencetak PDF: " + e.getMessage());
    //     }
    // }
}
