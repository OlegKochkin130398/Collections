import java.util.ArrayList;

public class MyArrayList {

    public String Summ(){
        ArrayList<Summers>summer = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Summers sum = new Summers();
            sum.Summa= i*2;
        }
        return summer.toString();
    }
}
