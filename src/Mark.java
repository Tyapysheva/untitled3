public class Mark<T> implements Gradable<T> {
    T mark;


    public Mark(T mark){
        this.mark=mark;
    }

    @Override
    public T sum() {
        return mark;
    }

    @Override
    public T max() {
        return mark;
    }

    @Override
    public T min() {
        return mark;
    }

//    @Override
//    public T avg() {
//        return mark;
//    }

}
