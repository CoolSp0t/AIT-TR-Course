package lesson_38.test_performance;

import java.util.List;

public interface ListOperationStrategy {

    void append(int nTimes);

    List getFilledList(int length);

    void get( int nTimes, List list);
}
