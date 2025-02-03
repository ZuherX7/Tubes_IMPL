import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaftarView {
    private JPanel panel;

    public DaftarView() {
        panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel nameLabel = new JLabel("Nama:");
        JTextField nameField = new JTextField();
        
        JLabel nisnLabel = new JLabel("NISN:");
        JTextField nisnField = new JTextField();
        
        JLabel birthLabel = new JLabel("Tanggal Lahir:");
        JTextField birthField = new JTextField();
        
        JLabel schoolLabel = new JLabel("Asal Sekolah:");
        JTextField schoolField = new JTextField();
        
        JLabel genderLabel = new JLabel("Jenis Kelamin:");
        String[] genderOptions = {"Laki-Laki", "Perempuan"};
        JComboBox<String> genderBox = new JComboBox<>(genderOptions);
        
        JLabel addressLabel = new JLabel("Alamat:");
        JTextArea addressArea = new JTextArea(3, 20);
        JScrollPane addressScroll = new JScrollPane(addressArea);
        
        JButton submitButton = new JButton("Daftar");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pendaftaran Berhasil!\nNama: " + nameField.getText() +
                        "\nNISN: " + nisnField.getText() +
                        "\nTanggal Lahir: " + birthField.getText() +
                        "\nAsal Sekolah: " + schoolField.getText() +
                        "\nJenis Kelamin: " + genderBox.getSelectedItem() +
                        "\nAlamat: " + addressArea.getText());
            }
        });
        
        panel.add(nameLabel); panel.add(nameField);
        panel.add(nisnLabel); panel.add(nisnField);
        panel.add(birthLabel); panel.add(birthField);
        panel.add(schoolLabel); panel.add(schoolField);
        panel.add(genderLabel); panel.add(genderBox);
        panel.add(addressLabel); panel.add(addressScroll);
        panel.add(new JLabel()); panel.add(submitButton);
    }

    public JPanel getPanel() {
        return panel;
    }
}