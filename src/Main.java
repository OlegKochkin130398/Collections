import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String total;
        ArrayList<String>strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");

        for(String str: strings){
            System.out.println(str);
        }

        strings.remove(2);
        System.out.println("После удаления выглядит так:");

        for (String str: strings){
            System.out.println(str);
        }

        LinkedList<String> strings1 = new LinkedList<>();
        strings1.add("1");
        strings1.add("2");
        strings1.add("3");
        strings1.add("4");
        strings1.add("5");

        for (String str :strings1){
            System.out.println(str);
        }
        strings1.remove(3);

        for (String str: strings1){
            System.out.println(str);
        }


        ArrayList<Summers>summer = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            Summers sum = new Summers();
            sum.Summa= i*2;
            System.out.print(""+sum.Summa+"\n");
            System.out.print("");
        }

        LinkedList<String> xyz = new LinkedList<String>();
        for (int i = 1; i < 20; i++) {
            xyz.add(""+i);
            System.out.println(xyz);

        }
    }
}
