package DemoPropertyCilsy;
import java.util.HashMap;
import java.util.Map;


public class Hasmap_buku {
    public static void main(String[] args) {
        HashMap<String, Buku> books = new HashMap<String, Buku>();

        Buku bukuJava = new Buku("Tutorial Java","Ferry");
        Buku bukuKotlin = new Buku("Tutorial Kotlin","Ferry");
        Buku bukuAndroid = new Buku("Tutorial Android","Ferry");
        Buku bukuFlutter = new Buku("Tutorial Flutter","Ferry");
        Buku bukuPHP = new Buku("Tutorial PHP","Ferry");
        Buku bukuRuby = new Buku("Tutorial Ruby","Ferry");
        Buku bukuDocker = new Buku("Tutorial Docker","Ferry");
        Buku bukuKubernetes = new Buku("Tutorial Kubernetes","Ferry");
        Buku bukuGCP = new Buku("Tutorial GCP","Ferry");
        Buku bukuAWS = new Buku("Tutorial AWS","Ferry");

        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);
        books.put("flutter", bukuFlutter);
        books.put("php", bukuPHP);
        books.put("ruby", bukuRuby);
        books.put("docker", bukuDocker);
        books.put("kubernetes", bukuKubernetes);
        books.put("gcp", bukuGCP);
        books.put("aws", bukuAWS);

        for(Map.Entry b: books.entrySet()){
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + ": " + buku.getTitle());
        }
    }
}

class Buku{
    private String title;
    private String author;

    public Buku(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}