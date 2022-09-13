/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helper;

import java.awt.Component;
import javax.swing.JOptionPane;

//phương thức để hiển thị ra ứng dụng.
public class MessDialogHelper {
    public static void showMessDialog(Component parent, String connent, String title){
        JOptionPane.showMessageDialog(parent, connent, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorDialog(Component parent, String connent, String title){
        JOptionPane.showMessageDialog(parent,  connent, title, JOptionPane.ERROR_MESSAGE);
    }
    public static int showConfirmDialog(Component parent, String connent, String title){
      int chon = JOptionPane.showConfirmDialog(parent,  connent, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
      return chon;
    }
}
