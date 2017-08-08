/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author try
 */
public class kg2 {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\c0116103\\Documents\\NetBeansProjects\\Oh220162\\src\\1.txt")));
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File("C:\\Users\\c0116103\\Documents\\NetBeansProjects\\Oh220162\\src\\2.txt")));
            String line;
            while ((line=br.readLine())!=null) {                
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("読み込み完了");
        } catch (IOException e) {
            System.out.println("読み込みに失敗");
        }
    }
}
