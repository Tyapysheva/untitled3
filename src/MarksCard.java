import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class MarksCard<T> implements Gradable<T> {
    private List<Gradable<T>> listMarks = new ArrayList<>();
    BinaryOperator<T> binaryOperator;

    public MarksCard(List<Gradable<T>> listMarks,BinaryOperator<T> b){

        this.listMarks=listMarks;
        binaryOperator=b;
    }

    @Override
    public T sum() {
        T res=null;
        for (Gradable gradable:listMarks){
            res=binaryOperator.apply(res, (T) gradable.sum());
        }
        return res;
    }
    @Override
    public T max() {
        T max = listMarks.get(0).max();
        for (Gradable gradable:listMarks){

            if (((Boolean) binaryOperator.apply(max, (T) gradable.max()))) {
                max = (T) gradable.max();
            }
        }
        return max;
    }

    @Override
    public T min() {
        T min = listMarks.get(0).min();
        for (Gradable gradable:listMarks){

            if (((Boolean) binaryOperator.apply(min, (T) gradable.max()))) {
                min = (T) gradable.min();
            }
        }
        return min;
    }

//    @Override
//    public T avg() {
//            T res=null;
//            T count=null;
//            for (Gradable gradable:listMarks){
//                binaryOperator.apply(count,)
//                res=binaryOperator.apply(res, (T) gradable.avg());
//            }
//            return res/count;
//        }
}
