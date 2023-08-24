package lesson_28;

public interface InterfaceDefault {
    int getUserID(); //обычный метод в интерфейсе

    default  int getAdminID(){ // default method создается с помощью ключевого слова default
        return 25;
    }


}
