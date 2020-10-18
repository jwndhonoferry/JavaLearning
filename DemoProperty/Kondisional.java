package DemoPropertyCilsy;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class Kondisional {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        System.out.println("Masukkan Gelar terakhir anda : ");
        System.out.println("Masukkan Jenis Suhu : ");
        String gelar = inp.nextLine();
        String cat = new Kondisional().getCategory(gelar);
        System.out.println("Masukkan Suhu anda : ");
        int suhu = inp.nextInt();

        if(suhu <= 0 || suhu >= 20){
            switch (Integer.parseInt(cat)){
                case 1:
                    System.out.println("Beku suhu dibawah 0 derajat");
                    break;
                case 2:
                    System.out.println("Dingin suhu 1 - 10 derajat");
                    break;
                case 3:
                    System.out.println("Sejuk suhu 11 - 20 derajat");
                    break;
            }
        } else if(suhu >= 100 ) {
            switch (Integer.parseInt(cat)) {
                case 1:
                    System.out.println("Sedang suhu 21 -25");
                    break;
            }
        } else {
            System.out.println("Suhu tidak ada");
        }
    }
    private String getCategory(String gelar) {
        if(gelar.equals("Beku")){
            return "1";
        } else if(gelar.equals("Dingin")){
            return "2";
        } else if(gelar.equals("Sejuk")){
            return "3";
        } else if(gelar.equals("Sedang")) {
            return "1";
        } else if(gelar.equals("Panas")) {
            return "2";
        } else if(gelar.equals("Mendidih")) {
            return "3";
        } else {
            return "tidak";
        }
    }
    //        switch(Integer.parseInt(cat)){
//            case 1:
//                System.out.println("Anda berusia sekitar 6 - 12 tahun");
//                break;
//            case 2:
//                System.out.println("Anda berusia sekitar 12 - 15 tahun");
//                break;
//            case 3:
//                System.out.println("Anda berusia sekitar 15 - 18 tahun");
//                break;
//            case 4:
//                System.out.println("Anda berusia sekitar 18 - 25 tahun");
//                break;
//        }
//    private String getCategory(String gelar) {
//        if(gelar.equals("Beku")){
//            return "1";
//        } else if(gelar.equals("Dingin")){
//            return "2";
//        } else if(gelar.equals("Sejuk")){
//            return "3";
//        } else if(gelar.equals("SARJANA")) {
//            return "4";
//        } else{
//            return "invalis";
//        }
//    }
}
//    if(gelar.equals("SD")){
//            System.out.println("Anda berusia sekitar 6 - 12 tahun");
//            } else if(gelar.equals("SMP")){
//            System.out.println("Anda berusia sekitar 12 - 15 tahun");
//            } else if(gelar.equals("SMA")){
//            System.out.println("Anda berusia sekitar 15 - 18 tahun");
//            } else if(gelar.equals("SARJANA")) {
//            System.out.println("Anda berusia sekitar 18 - 25");
//            }

//        int a  = 1;
//        int b = 1;
//        int c = 2;
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println("Ini equals");
//        System.out.println(Integer.toString(a).equals(Integer.toString(b)));