package DemoPropertyCilsy;

import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[][] nama = {
                {"Dodi", "12"},
                {"DIdit", "99"},
                {"Duduk","2000"}
        };
        for(int i = 0; i < nama.length; i += 1){
            for(int j = 0; j < nama[i].length; j += 1){
                System.out.println(nama[j+1][i]);
            }
        }

        System.out.println("\n");
        System.out.println("Ini 3d");
        String[][][] nama2 = {
                {
                    {"Dodi", "12"},
                    {"DIdit", "99"},
                    {"Duduk","2000"}
                },
                {
                    {"Bento", "65747"},
                    {"Binti", "1634"},
                    {"Bunto","9876"}
                },
                {
                    {"Cici", "j431"},
                    {"Cece", "s321"},
                    {"CUcu","z1z1"}
                },
        };
        for(int i = 0; i < nama2.length; i += 1){
            for(int j = 0; j < nama2[i].length; j += 1){
                for(int k = 0; k < nama2[j].length; k++){
                    System.out.println(nama2[2][1][0]);
                }
            }
        }
    }
}
