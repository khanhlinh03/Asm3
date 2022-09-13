/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helper;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author MMC
 */
public class ImageHelper4 {
    public static Image resize(Image originalImane, int targerWidth, int targerHeight){
        Image rsImage = originalImane.getScaledInstance(targerWidth, targerHeight, Image.SCALE_SMOOTH);
        return rsImage;
    }
    public static byte[] toByteArray(Image img, String type) throws IOException{
        BufferedImage biImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = biImage.createGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(biImage, type, baos);
        byte[] imageInByte = baos.toByteArray();
        
        return imageInByte;
    }
    public static Image createImage(byte[] data, String type) throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bImage2 = ImageIO.read(bis);
        
        Image img = bImage2.getScaledInstance(bImage2.getWidth(), bImage2.getHeight(), Image.SCALE_SMOOTH);
        return img;
    }
}
