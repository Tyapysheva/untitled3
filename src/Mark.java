public class Mark implements Gradable {
    int mark;


    public Mark(int mark){
        this.mark=mark;
    }

    @Override
    public int sum() {
        return mark;
    }

    @Override
    public int max() {
        return mark;
    }

    @Override
    public int min() {
        return mark;
    }

    @Override
    public double avg() {
        return mark;
    }

}
