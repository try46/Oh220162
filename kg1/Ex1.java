/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg1;

import java.io.File;

/**
 *
 * @author try
 */
public class Ex1 {
    public static void main(String[] args) {
        File f1=new File("1.txt");
        
        System.out.println("ファイル名"+f1.getName());
        System.out.println("絶対パス"+f1.getAbsolutePath());
        System.out.println("サイズ"+f1.length()+"バイト");
    }
}
