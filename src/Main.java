import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gradable m1 = new Mark(6);
        Gradable m2 = new Mark(5);
        Gradable m3 = new Mark(1);
        Gradable m4 = new Mark(5);

        List<Gradable> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        MarksCard marksCard = new MarksCard(list);
        List<Gradable> list2 = new ArrayList<>();
        list2.add(marksCard);
        list2.add(marksCard);
        MarksCard marksCard2 = new MarksCard(list2);



        System.out.println(marksCard2.avg());
    }


}
