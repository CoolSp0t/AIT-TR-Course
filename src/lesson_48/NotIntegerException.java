package lesson_48;

public class NotIntegerException  extends  Exception{

    int n ;
    int d;

    public NotIntegerException(int n, int d){
        this.n = n;
        this.d = d;
    }

    public String toString(){
        return "result of " + n  + " / " + d + " is not an integer";
    }
}
