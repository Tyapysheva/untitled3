import java.util.ArrayList;
import java.util.List;

public class MarksCard implements Gradable {
    private List<Gradable> listMarks = new ArrayList<>();

    public MarksCard(List<Gradable> listMarks){
        this.listMarks=listMarks;
    }

    @Override
    public int sum() {
        int res=0;
        for (Gradable gradable:listMarks){
            res=res+ gradable.sum();
        }
        return res;
    }
    @Override
    public int max() {
        int max = listMarks.get(0).max();
        for (Gradable gradable:listMarks){

            if ((max <= gradable.max())) {
                max = gradable.max();
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = listMarks.get(0).min();
        for (Gradable gradable:listMarks){

            if ((min > gradable.min())) {
                min = gradable.min();
            }
        }
        return min;
    }

    @Override
    public double avg() {
            double res=0;
            int count=0;
            for (Gradable gradable:listMarks){
                count++;
                res=res+ gradable.avg();
            }
            return res/count;
        }
}
