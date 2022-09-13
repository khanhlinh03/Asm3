/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.ui;

import com.mycompany.dao.SinhVienDao;
import com.mycompany.helper.DataValidate;
import com.mycompany.helper.ImageHelper4;
import com.mycompany.helper.MessDialogHelper;
import com.mycompany.model.SinhVien;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MMC
 */
public class QLSV1 extends javax.swing.JPanel {

    private MainForm mainForm;
    private DefaultTableModel dtm;
    private byte[] mainImage;

    public QLSV1() {
        initComponents();
        jTable3.setModel(dtm = new DefaultTableModel());
        //       listSV = new ArrayList<>();
        String[] header = {"Ma SV", "Ho Ten", "Email", "SDT", "Gioi tinh", "Dia chi"};
        dtm.setColumnIdentifiers(header);
        loadData();

    }

    private void loadData() {
        try {
            SinhVienDao dao = new SinhVienDao();
            List<SinhVien> list = dao.findAll();
//            dtm.setRowCount(0);
//            for (SinhVien sv : list) {
//                dtm.addRow(new Object[]{
//                    sv.getMaSV(),sv.getHoTen(),sv.getEmail(),sv.getSoDT(),sv.isGioiTinh() == true ? "Nữ" : "Nam",sv.getDiaChi()
//                });
//            }
            showData(list);
            dtm.fireTableDataChanged();//cập nhật lại hiển thị dữ liệu trong bảng
        } catch (Exception e) {
        }
    }

    public void showData(List<SinhVien> list) {
        dtm.setRowCount(0);
        for (SinhVien sinhVien : list) {
            dtm.addRow(sinhVien.toRowData());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtMa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        btnDetele = new javax.swing.JButton();
        btnUpDate = new javax.swing.JButton();
        txtSdt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblHinhAnh = new javax.swing.JLabel();

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        jLabel3.setText("Họ Tên");

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDetele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnDetele.setText("Delete");
        btnDetele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeteleActionPerformed(evt);
            }
        });

        btnUpDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnUpDate.setText("UpDate");
        btnUpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpDateActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jLabel6.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel2.setText("Mã SV");

        jLabel7.setText("Địa Chỉ");

        jLabel4.setText("Email");

        jLabel5.setText("SDT");

        lblHinhAnh.setText("Hinh Anh");
        lblHinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDetele, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnUpDate)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rdoNam)
                            .addGap(18, 18, 18)
                            .addComponent(rdoNu))
                        .addComponent(txtMa)
                        .addComponent(txtHoten)
                        .addComponent(txtEmail)
                        .addComponent(txtSdt)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                    .addContainerGap(290, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDetele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpDate)
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rdoNam)
                        .addComponent(rdoNu))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(219, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpDateActionPerformed
//        int sua = jTable3.getSelectedRow();
//        listSV.set(sua, ql());
//        showData(listSV);
//        JOptionPane.showMessageDialog(this, "UpDate thành công");
        StringBuilder sb = new StringBuilder();
        DataValidate.validateEmpty(txtMa, sb, "Mã sv không được để trống");
        DataValidate.validateEmpty(txtHoten, sb, "Tên sinh viên không đc để trống");
        DataValidate.validateEmpty(txtEmail, sb, "Email k đc để trống");
        if (sb.length() > 0) {
            MessDialogHelper.showErrorDialog(mainForm, sb.toString(), "Lỗi");
            return;
        }
        if (MessDialogHelper.showConfirmDialog(mainForm, "Bạn có muốn cập nhật sinh viên không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            SinhVien sv = new SinhVien();
            sv.setMaSV(txtMa.getText());
            sv.setHoTen(txtHoten.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtSdt.getText());
            sv.setDiaChi(txtDiaChi.getText());
            sv.setGioiTinh(rdoNam.isSelected());
            //sv.setHinh(mainImage);
            SinhVienDao dao = new SinhVienDao();
            if (dao.update(sv)) {
                MessDialogHelper.showMessDialog(mainForm, "Sinh viên đã được cập nhật", "Thông báo");
                loadData();
            } else {
                MessDialogHelper.showConfirmDialog(mainForm, "Sinh viên không được cập nhật do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }

    }//GEN-LAST:event_btnUpDateActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
//        int chon = jTable3.getSelectedRow();
//        fillData(chon);
        try {
            int row = jTable3.getSelectedRow();
            if (row >= 0) {
                String id = (String) jTable3.getValueAt(row, 0);
                SinhVienDao dao = new SinhVienDao();
                SinhVien sv = dao.findByID(id);

                if (sv != null) {
                    txtMa.setText(sv.getMaSV());
                    txtHoten.setText(sv.getHoTen());
                    txtEmail.setText(sv.getEmail());
                    txtSdt.setText(sv.getSoDT());
                    txtDiaChi.setText(sv.getDiaChi());
                    //rdoNam.setSelected(sv.isGioiTinh() == true ? "Nữ" : "Nam");
                    boolean gioiTinh = sv.isGioiTinh();
                    if (gioiTinh == true) {
                        rdoNam.setSelected(true);
                    } else {
                        rdoNu.setSelected(true);
                    }
//                    if (sv.getHinh() != null) {
//                        Image img = ImageHelper4.createImage(sv.getHinh(), "jpg");
//                        lblHinhAnh.setIcon(new ImageIcon(img));
//                        mainImage = sv.getHinh();
//                    } else {
//                        mainImage = sv.getHinh();
//                        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Add.png"));//hình ảnh ngầm định khi k chọn
//                        lblHinhAnh.setIcon(icon);
//                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtDiaChi.setText("");
        txtHoten.setText("");
        txtEmail.setText("");
        txtMa.setText("");
        txtSdt.setText("");
        buttonGroup1.clearSelection();
        mainImage = null;
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/Add.png"));//hình ảnh ngầm định khi k chọn
        lblHinhAnh.setIcon(icon);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeteleActionPerformed
//        int xoa = jTable3.getSelectedRow();
//        listSV.remove(xoa);
//        showData(listSV);
//        JOptionPane.showMessageDialog(this, "Xóa Thành Công");s
        StringBuilder sb = new StringBuilder();
        DataValidate.validateEmpty(txtMa, sb, "Mã sv không được để trống");

        if (sb.length() > 0) {
            MessDialogHelper.showErrorDialog(mainForm, sb.toString(), "Lỗi");
            return;
        }
        if (MessDialogHelper.showConfirmDialog(mainForm, "Bạn có muốn xóa sinh viên không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            SinhVienDao dao = new SinhVienDao();
            if (dao.delete(txtMa.getText())) {
                MessDialogHelper.showMessDialog(mainForm, "Sinh viên đã được xóa", "Thông báo");
                btnNewActionPerformed(evt);
                loadData();
            } else {
                MessDialogHelper.showConfirmDialog(mainForm, "Sinh viên không được xóa do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeteleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        StringBuilder sb = new StringBuilder();
        DataValidate.validateEmpty(txtMa, sb, "Mã sv không được để trống");
        DataValidate.validateEmpty(txtHoten, sb, "Tên sinh viên không đc để trống");
        DataValidate.validateEmpty(txtEmail, sb, "Email k đc để trống");
        if (sb.length() > 0) {
            MessDialogHelper.showErrorDialog(mainForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            SinhVien sv = new SinhVien();
            sv.setMaSV(txtMa.getText());
            sv.setHoTen(txtHoten.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtSdt.getText());
            sv.setDiaChi(txtDiaChi.getText());
            sv.setGioiTinh(rdoNam.isSelected());
            //sv.setHinh(mainImage);
            SinhVienDao dao = new SinhVienDao();
            if (dao.insert(sv)) {
                MessDialogHelper.showMessDialog(mainForm, "Sinh viên đã được lưu", "Thông báo");
                loadData();
            } else {
                MessDialogHelper.showConfirmDialog(mainForm, "Sinh viên không được lưu do lỗi", "Cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked

//        try {
//            JFileChooser jfc = new JFileChooser("E:\\JAVA3\\BAITAP\\Asm_GD1");
//            jfc.showOpenDialog(null);
//            File file = jfc.getSelectedFile();
//            Image img = ImageIO.read(file);
//            lblHinhAnh.setText("");
//            int width = lblHinhAnh.getWidth();
//            int height = lblHinhAnh.getHeight();
//            lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
//        } catch (IOException ex) {
//            System.out.println("Error:" + ex.toString());
//        }
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".jpg");
                }
            }

            @Override
            public String getDescription() {
                return "Image file (*.jpg)";
            }
        });
        if (jfc.showOpenDialog(mainForm) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File file = jfc.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = ImageHelper4.resize(icon.getImage(), 140, 160);
            ImageIcon reImageIcon = new ImageIcon(img);
            lblHinhAnh.setIcon(reImageIcon);
            mainImage = ImageHelper4.toByteArray(img, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showMessDialog(mainForm, e.getMessage(), "Lỗi");
        }


    }//GEN-LAST:event_lblHinhAnhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetele;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSdt;
    // End of variables declaration//GEN-END:variables
}
