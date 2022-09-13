package com.mycompany.dao;

import com.mycompany.helper.DataHelper;
import com.mycompany.model.BangDiem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BangDiemDao {

    public boolean insert(BangDiem bd) throws Exception {

        String sql = "INSERT INTO [dbo].[BangDiem]([MaSV],[TiengAnh],[TinHoc],[GDTC]) VALUES (?,?,?,?)";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, bd.getMaSV());
            ps.setFloat(2, bd.getTiengAnh());
            ps.setFloat(3, bd.getTinHoc());
            ps.setFloat(4, bd.getGdtc());

            return ps.executeUpdate() > 0;

        }

    }

    public boolean update(BangDiem bd) throws Exception {

        String sql = "UPDATE [dbo].[BangDiem]"
                + "SET [MaSV] = ?,[TiengAnh] = ?,[TinHoc] = ?,[GDTC] = ? "
                + "WHERE [MaSV] = ?";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(4, bd.getMaSV());
            ps.setFloat(1, bd.getTiengAnh());
            ps.setFloat(2, bd.getTinHoc());
            ps.setFloat(3, bd.getGdtc());

            return ps.executeUpdate() > 0;//gọi để thực hiện câu lệnh

        }

    }

    public boolean deleteById(String maSV) throws Exception {

        String sql = "DELETE FROM [dbo].[BangDiem]\n" +
"      WHERE MaSV = ?";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, maSV);

            return ps.executeUpdate() > 0;//gọi để thực hiện câu lệnh

        }

    }

    public BangDiem findById(String maSV) throws Exception {

        String sql = "select * from BangDiem Where [MaSV] = ?";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, maSV);

            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    BangDiem bd = createBangDiem(rs);

                    return bd;
                }
            }
        }
        return null;
    }

    public List<BangDiem> findAll(String maSV) throws Exception {

        String sql = "select * from BangDiem";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            try (ResultSet rs = ps.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {  //duyệt tất cả các dữ liệu có                  
                    BangDiem bd = createBangDiem(rs);
                    list.add(bd);
                }
                return list;
            }
        }
    }

    private BangDiem createBangDiem(final ResultSet rs) throws SQLException {
        //duyệt tất cả các dữ liệu có
        BangDiem bd = new BangDiem();
        bd.setId(rs.getInt("Ma"));
        bd.setMaSV(rs.getString("MaSV"));
        bd.setTiengAnh(rs.getFloat("TiengAnh"));
        bd.setTinHoc(rs.getFloat("TinHoc"));
        bd.setGdtc(rs.getFloat("GDTC"));
        return bd;
    }
    ///
    public List<BangDiem> findTop(int top) throws Exception {

        String sql = "select top 3"+ top +" *, (TiengAnh + TinHoc + GDTC)/3 as ĐTB " +
            " from BangDiem order by đtb desc ";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            try (ResultSet rs = ps.executeQuery();) {
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {//duyệt tất cả các dữ liệu có
                    BangDiem bd = createBangDiem(rs);
                    list.add(bd);
                }
                return list;
            }
        }
    }
}
