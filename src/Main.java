import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

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
        BinaryOperator<Integer> sum = (n1, n2) ->
        {
            if (n1 == null) {n1 = 0;
            if (n2 == null) n2 = 0;}
            return n1 + n2;

        };
        MarksCard marksCard = new MarksCard(list, sum);
        List<Gradable> list2 = new ArrayList<>();
        list2.add(marksCard);
        list2.add(marksCard);
        // MarksCard marksCard2 = new MarksCard(list2);


        System.out.println(marksCard.sum());
    }


}
