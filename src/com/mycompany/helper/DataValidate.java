/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MMC
 */
public class DataValidate {
    public static void validateEmpty( JTextField filed ,StringBuilder sb, String errorMess){
        if(filed.getText().equals("")){
            sb.append(errorMess).append("\n");
            filed.setBackground(Color.red);
            filed.requestFocus();
        }else{
            filed.setBackground(Color.white);
        }
    }
    public static void validateEmpty( JPasswordField filed ,StringBuilder sb, String errorMess){
        String pass = new String(filed.getPassword());
        if(pass.equals("")){
            sb.append(errorMess).append("\n");
            filed.setBackground(Color.red);
            filed.requestFocus();
        }else{
            filed.setBackground(Color.white);
        }
    }
}
