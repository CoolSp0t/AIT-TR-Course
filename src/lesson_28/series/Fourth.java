package lesson_28.series;

public class Fourth implements Series{

    int start;
    int value;

    public Fourth(){
        start = 0;
        value = 0;
    }


    @Override
    public int getNext() {
        return value += 4;
    }

    @Override
    public void reset() {
        value = start;
    }

    @Override
    public void setStart(int a) {
        start = a;
    }
}
