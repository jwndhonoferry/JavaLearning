package OOP_Cilsy;
import java.util.Arrays;
import java.util.Scanner;

public class oop1 {

    public static void main(String[] args) {
        String a = "aaabbbcccc";
        String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))" ;
        long count = a.chars().filter(ch -> ch == 'a').count();
        long count2 = a.codePoints().filter(ch -> ch == 'b').count();
        long count3 = a.codePoints().filter(ch -> ch == 'c').count();

        System.out.println("aaa"+count+"bbb"+count2+"cccc"+count3);
        System.out.println(Arrays.asList(a.split(regex)));
    }
}
