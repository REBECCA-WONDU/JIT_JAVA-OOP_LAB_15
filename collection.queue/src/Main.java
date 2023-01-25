import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue <String> q1=new LinkedList<>();
        q1.offer("city");
        q1.offer("village");
        q1.offer("metropolitian");
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
       String home= q1.peek();
        System.out.println(home);
        String school= String.valueOf(q1.size());
        System.out.println(school);
    }
}