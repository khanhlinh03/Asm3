/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.ui;

import com.mycompany.dao.BangDiemDao;
import com.mycompany.dao.SinhVienDao;
import com.mycompany.helper.DataValidate;
import com.mycompany.helper.MessDialogHelper;
import com.mycompany.model.BangDiem;
import com.mycompany.model.SinhVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import service.impl.QLSVService;

/**
 *
 * @author MMC
 */
public class QLDiem1 extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private MainForm mainForm;
    //private List<BangDiem> listBD;
    //int current = 0;
    public QLDiem1() {
        initComponents();
        jTable1.setModel(dtm = new DefaultTableModel());
        //listBD = new ArrayList<>();

        String[] header = {"Ma SV", "Tieng Anh", "Tin Hoc", "GDTC", "Diem TB"};
        dtm.setColumnIdentifiers(header);
        //fakeData();
        LoadData();
        //fillData(current);
        
    }

    public void LoadData() {
        try {
            BangDiemDao dao = new BangDiemDao();
            List<BangDiem> list = dao.findTop(3);
            dtm.setRowCount(0);
            //thêm dữ liệu vào trong table model
            for (BangDiem bd : list) {
                dtm.addRow(new Object[]{
                    bd.getMaSV(), bd.getTiengAnh(), bd.getTinHoc(), bd.getGdtc(),
                    (bd.getTiengAnh() + bd.getTinHoc() + bd.getGdtc()) / 3
                });

            }
            dtm.fireTableDataChanged();//cập nhật lại dữ liệu đc hiển thị trong model
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }
    }
//    public void fillData(int i){
//        BangDiem diem = listBD.get(i);
//        txtMa.setText(diem.getMaSV());
//        //txtHoTen.setText(diem.getHoTen());
//        txtTiengAnh.setText(String.valueOf(diem.getTiengAnh()));
//        txtTinHoc.setText(String.valueOf(diem.getTinHoc()));
//        txtGDTC.setText(String.valueOf(diem.getGdtc()));
//        //diemtb.setText(String.valueOf(diem.diemTB()));
//        
//               
//    }
//    public void fakeData(){
//        listDiem.add(new QLDiem_Class("SV01", "tuan", 8, 10, 9));
//        listDiem.add(new QLDiem_Class("SV02", "linh", 10, 10, 10));
//        listDiem.add(new QLDiem_Class("SV03", "lam", 8, 8, 8));
//        fillData(0);
//        showData(listDiem);
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTiengAnh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTinHoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtGDTC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbldiem = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDetele = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnUpDate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTimMa = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Họ Tên");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Mã SV");

        txtMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaFocusLost(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tiếng Anh");

        txtTiengAnh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTiengAnhFocusLost(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Tin Học");

        txtTinHoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTinHocFocusLost(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("GD Thể Chất");

        txtGDTC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTinHocFocusLost(evt);
            }
        });

        jLabel9.setText("Điểm TB");

        lbldiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbldiem.setText("9.5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTen)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTinHoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTiengAnh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbldiem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lbldiem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ ĐIỂM SINH VIÊN");

        btnUpDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnUpDate.setText("UpDate");
        btnUpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpDateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tìm kiếm");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Mã SV");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtTimMa, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(btnSearch)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("3 sinh viên có điểm cao nhất:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addComponent(jSeparator2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDetele, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUpDate)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetele)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpDate))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int chon = jTable1.getSelectedRow();
        //fillData(chon);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtGDTC.setText("");
        txtHoTen.setText("");
        txtMa.setText("");
        txtTiengAnh.setText("");
        txtTinHoc.setText("");
        lbldiem.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidate.validateEmpty(txtMa, sb, "Mã sinh viên k đc để trống");
        DataValidate.validateEmpty(txtTiengAnh, sb, "Điểm tiếng anh cần phải nhập");
        if (sb.length() > 0) {
            MessDialogHelper.showErrorDialog(mainForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            BangDiem bd = new BangDiem();
            bd.setMaSV(txtMa.getText());
            bd.setTiengAnh(Float.parseFloat(txtTiengAnh.getText()));
            bd.setTinHoc(Float.parseFloat(txtTinHoc.getText()));
            bd.setGdtc(Float.parseFloat(txtGDTC.getText()));

            BangDiemDao dao = new BangDiemDao();
            //kiểm tra tồn tại của mã sv
            if (dao.findById(txtMa.getText()) != null) {
                if (MessDialogHelper.showConfirmDialog(mainForm, "Bạn có muốn cập nhật điểm không?", "Hỏi") == JOptionPane.NO_OPTION) {
                    return;
                }
                if (dao.update(bd)) {
                    MessDialogHelper.showMessDialog(mainForm, "Bảng điểm đã được cập nhật", "Thông báo");

                } else {
                    MessDialogHelper.showMessDialog(mainForm, "Bảng điểm chưa được cập nhật", "Thông báo");

                }
            } else {
                if (dao.insert(bd)) {
                    MessDialogHelper.showMessDialog(mainForm, "Bảng điểm đã được lưu", "Thông báo");
                    LoadData();
                } else {
                    MessDialogHelper.showMessDialog(mainForm, "Bảng điểm chưa được lưu", "Thông báo");

                }
            }
            LoadData();
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeteleActionPerformed
        try {
            if (txtMa.getText().equals("")) {
                MessDialogHelper.showMessDialog(mainForm, "Mã sinh viên cần phải nhập", "Lỗi");
                return;
            }
            BangDiemDao dao = new BangDiemDao();
            BangDiem bd = dao.findById(txtMa.getText());
            if (bd == null) {
                MessDialogHelper.showMessDialog(mainForm, "Mã sinh viên không tồn tại", "Thông báo");
                return;
            }
            if (MessDialogHelper.showConfirmDialog(mainForm, "Bạn coa muốn xóa điểm sinh viên này không?", "Hỏi") == JOptionPane.NO_OPTION) {
                return;
            }
            if (dao.deleteById(txtMa.getText())) {
                MessDialogHelper.showMessDialog(mainForm, "Điểm của sinh viên đã được xóa", "Thông báo");
            }
            LoadData();
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeteleActionPerformed

    private void btnUpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpDateActionPerformed
        btnSaveActionPerformed(evt);

    }//GEN-LAST:event_btnUpDateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            BangDiemDao dao = new BangDiemDao();
            BangDiem bd = dao.findById(txtTimMa.getText());

            if (bd != null) {
                txtMa.setText(bd.getMaSV());
                txtTiengAnh.setText(String.format("%.2f", bd.getTiengAnh()));
                txtTinHoc.setText(String.format("%.2f", bd.getTinHoc()));
                txtGDTC.setText(String.format("%.2f", bd.getGdtc()));

                txtMaFocusLost(null);
                txtTiengAnhFocusLost(null);
            } else {
                MessDialogHelper.showMessDialog(mainForm, "Không tìm thấy sv có mã theo yêu cầu", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessDialogHelper.showErrorDialog(mainForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        try {
            SinhVienDao dao = new SinhVienDao();
            SinhVien sv = dao.findByID(txtMa.getText());
            if (sv != null) {
                txtHoTen.setText(sv.getHoTen());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtMaFocusLost

    private void txtTiengAnhFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTiengAnhFocusLost

        if (txtTiengAnh.getText().equals("")
                || txtTinHoc.getText().equals("")
                || txtGDTC.getText().equals("")) {
            return;

        }
        float ta = Float.parseFloat(txtTiengAnh.getText());
        float it = Float.parseFloat(txtTinHoc.getText());
        float pt = Float.parseFloat(txtGDTC.getText());

        float dtb = (ta + it + pt) / 3;

        String st = String.format("%.2f", dtb);
        lbldiem.setText(st);
    }//GEN-LAST:event_txtTiengAnhFocusLost

    private void txtTinHocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTinHocFocusLost
        if (txtTiengAnh.getText().equals("")
                || txtTinHoc.getText().equals("")
                || txtGDTC.getText().equals("")) {
            return;

        }
        float ta = Float.parseFloat(txtTiengAnh.getText());
        float it = Float.parseFloat(txtTinHoc.getText());
        float pt = Float.parseFloat(txtGDTC.getText());

        float dtb = (ta + it + pt) / 3;

        String st = String.format("%.2f", dtb);
        lbldiem.setText(st);
    }//GEN-LAST:event_txtTinHocFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetele;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbldiem;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTiengAnh;
    private javax.swing.JTextField txtTimMa;
    private javax.swing.JTextField txtTinHoc;
    // End of variables declaration//GEN-END:variables
}
