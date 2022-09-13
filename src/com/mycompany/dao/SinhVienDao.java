/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.helper.DataHelper;
import com.mycompany.model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDao {

    public boolean insert(SinhVien sv) throws Exception {
        String sql = "INSERT INTO [dbo].[SinhVien] ([MaSV],[HoTen],[Email],[SDT],[GioiTinh],[DiaChi])"
                + "values (?,?,?,?,?,?)";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getSoDT());
            ps.setBoolean(5, sv.isGioiTinh());
            ps.setString(6, sv.getDiaChi());
//            if (sv.getHinh() != null) {
//                Blob hinh = new SerialBlob(sv.getHinh());
//                ps.setBlob(7, hinh);
//            } else {
//                Blob hinh = null;
//                ps.setBlob(7, hinh);
//            }
            return ps.executeUpdate() > 0;

        }

    }

    public boolean update(SinhVien sv) throws Exception {

        String sql = "UPDATE [dbo].[SinhVien]" + "SET [HoTen] = ?,[Email] = ?,[SDT] = ?,[GioiTinh] = ?,[DiaChi] = ?"
                + " WHERE [MaSV] = ?";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(6, sv.getMaSV());
            ps.setString(1, sv.getHoTen());
            ps.setString(2, sv.getEmail());
            ps.setString(3, sv.getSoDT());
            ps.setBoolean(4, sv.isGioiTinh());
            ps.setString(5, sv.getDiaChi());
//            if (sv.getHinh() != null) {
//                Blob hinh = new 
//                ps.setBlob(7, hinh);
//            } else {
//                Blob hinh = null;
//                ps.setBlob(7, hinh);
//            }
            return ps.executeUpdate() > 0;

        }
    }
    public boolean delete(String maSV) throws Exception {

        String sql = "delete from SinhVien"
                + " WHERE [MaSV] = ?";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, maSV);
            return ps.executeUpdate() > 0;

        }
    }
    public SinhVien findByID(String maSV) throws Exception {

        String sql = "select * from SinhVien"
                + " WHERE [MaSV] = ?";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, maSV);
            try(ResultSet rs = ps.executeQuery();){
                if(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    return sv;
                }
            }

        }
        return null;
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSV(rs.getString(1));
        sv.setHoTen(rs.getString(2));
        sv.setEmail(rs.getString(3));
        sv.setSoDT(rs.getString(4));
        sv.setGioiTinh(rs.getBoolean(5));
        sv.setDiaChi(rs.getString(6));
//        Blob blob = rs.getBlob("Hinh");
//        if(blob != null)
//            sv.setHinh(blob.getBytes(0, (int) blob.length()));
        return sv;
    }
    public List<SinhVien> findAll() throws Exception {

        String sql = "select * from SinhVien";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            try(ResultSet rs = ps.executeQuery();){
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    list.add(sv);
                }
                return list;
            }

        }
    }
}
