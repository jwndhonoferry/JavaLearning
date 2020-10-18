package OOP_Cilsy;

public class oop2 {
    public static void main(String[] args) {
//        jawaban soal =  new jawaban();
        getset soall = new getset();
        soall.setX("aaaaaaaaaahhhhhhhhbbbbb");
//        soal.soal_1 = soall.getX();
        System.out.println("get == " + soall.getX());
//        soal.run2();
    }
}

class jawaban{
    public String soal_1;
    public String hitung(String soal_1){
        String res = "";
        Integer count = 0;
        for(int i  = 0; i < soal_1.length()-1; i += 1){
            if(soal_1.charAt(i) == soal_1.charAt(i+1)){
                count += 1;
            }
            if (soal_1.charAt(i) != soal_1.charAt(i+1)){
                count += 1;
                res += soal_1.charAt(i) + count.toString();
                count = 0;
            }
            if(i + 1 == soal_1.length() - 1){
                count += 1;
                res += soal_1.charAt(i + 1) + count.toString();
            }
        }
        return res;
    }

    public void run(String s) {
        System.out.println(hitung(s));
    }
    public void run2(){
        System.out.println(hitung(soal_1));
    }
}
class getset{
    public String x;
    jawaban jaw =  new jawaban();
    public void setX(String soal){
        this.x = soal;
    }
    public String getX(){
        return jaw.hitung(this.x);
    }
}
