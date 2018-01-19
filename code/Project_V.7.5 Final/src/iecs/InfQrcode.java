package iecs;

import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class InfQrcode {
  String Filename;
  BufferedImage image;
  JFrame jf;

  public InfQrcode() {
    LoadFile();
    SetTable();
  }

  public void LoadFile() {
    Filename = "chart.PNG";// �]�w�ɦW
    try {
      image = ImageIO.read(new File(Filename));// Ū���ɮ�
    } catch (Exception e) {
      javax.swing.JOptionPane.showMessageDialog(null, "���J���ɿ��~: " + Filename);
      image = null;// �p�G���~������ܿ��~�T��
    }
  }

  public void SetTable()// �]�w����
  {
    jf = new JFrame("");
    JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));// ��Image��ilabel��
    jf.getContentPane().add(scrollPane);
    jf.pack();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setTitle("�n��QRcode");
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);
  }
}
