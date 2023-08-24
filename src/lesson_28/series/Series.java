package lesson_28.series;

public interface Series {
    int getNext(); // возвращает следующий номер в последовательности

    void reset(); // сброс  значения
    void setStart(int a); // устанавливает начальное значение
}
