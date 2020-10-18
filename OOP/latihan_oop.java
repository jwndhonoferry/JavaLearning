package OOP_Cilsy;

import java.util.*;
import java.util.stream.Collectors;

public class latihan_oop {

    public static  int[] nilai = {8,3,7,7,7,-7,5,8,-5, 7,8,5};
    public static void main(String[] args) {

        getset2 gs = new getset2();
        gs.setZ(nilai);
        System.out.println(gs.getZ());
    }
}

class search_freq{
    public static HashMap<Integer, Integer> cari(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(arr);
        int i = 1;
        for(int r : arr){
            int prev = 0;
            if(hm.get(r) != null){
                prev = hm.get(r);
            }
            hm.put(r, prev + 1);
        }
        //delete non-duplicate
        hm.values().removeAll(Collections.singleton(1));
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        // Search for maximum value
        int max = (int) Collections.max(hm.values());
        hm.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(max);
        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }
        System.out.println(keys);
        return hm;
    }

}
class getset2{
    public int[] z;

    public void setZ(int[] soal){
        this.z = soal;
    }
    public HashMap<Integer, Integer> getZ(){
        search_freq src = new search_freq();
        return src.cari(this.z);
    }
}
