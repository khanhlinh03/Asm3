/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;


public class BangDiem {
    private int id;
    private String maSV;
    private float tiengAnh,tinHoc,Gdtc;

    public BangDiem(int id, String maSV, float tiengAnh, float tinHoc, float Gdtc) {
        this.id = id;
        this.maSV = maSV;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.Gdtc = Gdtc;
    }

    public BangDiem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getGdtc() {
        return Gdtc;
    }

    public void setGdtc(float Gdtc) {
        this.Gdtc = Gdtc;
    }
    
    
}
