package DemoPropertyCilsy;

public class DemoProperty {
    private String text;
    private int number;

    //get
    public String getText(){
        return text;
    }
    //set
    public void setText(String text){
        this.text = text;
    }
    public double rectangle(int a, int b){
        double c = 0.5;
        double rumus;
        rumus = c * a * b;
        return rumus;
    }
    public int getNumber(){

        return number;
    }
    public void setNumber(int value1, int value2){
        this.number = value1;
        this.number = value2;
    }

    public static void main(String[] args) {
        System.out.println("=== Percobaan Halaman 25 ===");
        DemoProperty dp = new DemoProperty();
        dp.setText("Ini berisi text");
        System.out.println("Text dari method GetText : " + dp.getText());
        System.out.println(dp.rectangle(4,4));

        dp.setNumber(4,4);

        int v1 = 1;
        int v2 = 2;
        System.out.println(v1 + v2);
        System.out.println(v1 - v2);
        System.out.println(v1 * v2);
        System.out.println(v1 / v2);
        System.out.println(v1 % v2);
        System.out.println(v1 ^ v2);

        System.out.println("Increment dan Decrement");
        System.out.println(v1);
        System.out.println(v1++);
        System.out.println(v1++);
        System.out.println(++v1);
        System.out.println("Decrement");
        System.out.println(v1--);
        System.out.println(--v1);
        System.out.println(" Operators Perbandingan ");
//        System.out.println(v1 =+ v2);
//        System.out.println(v1 += v2);
//        System.out.println(v1 -= v2);
//        System.out.println(v1 =- v2);
        for(int i = 0; i < 10; i++){
            System.out.println("INi increment" + i);
        }

    }
}
