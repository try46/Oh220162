/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author try
 */
public class Kadai01_2 {
    public static void main(String[] args) {
        ArrayList<String> out11List=new ArrayList<>();
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("out11.txt")));
            while (true) {                
                String line=br.readLine();
                if (line==null) {
                    break;
                }else{
                    out11List.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<String> nameList=new ArrayList<>();
        int priceSum=0;
        int lineCount=1;
        for (String line : out11List) {
            if (lineCount%2!=0) {
                nameList.add(line);
                
            }else{
                priceSum+=Integer.parseInt(line);
                
            }
            lineCount++;
            
        }
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File("out12.txt")));
            bw.write("野菜リスト: ");
            for (String yasaitable : nameList) {
                bw.write(yasaitable+"/");
                
            }
            bw.newLine();
                  bw.write("合計の値段"+priceSum);
                  bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
