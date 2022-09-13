package com.mycompany.dao;

import com.mycompany.helper.DataHelper;
import com.mycompany.model.NguoiDung;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NguoiDungDao {

    public NguoiDung checkLogin(String tenDangNhap, String matKhau) throws Exception {
        String sql = "Select tenDangNhap, matKhau, vaiTro from NguoiDung "
                + "where tenDangNhap = ? and matKhau = ? ";
        try (
                Connection conn = DataHelper.opConnection();
                PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);
            
            try (ResultSet rs = ps.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setMatKhau(matKhau);
                    nd.setVaiTro(rs.getString("VaiTro"));
                    return nd;
                }
            }

        }
        return null;//trả về giá trị null cho bt đăng nhập fail
    }
}
