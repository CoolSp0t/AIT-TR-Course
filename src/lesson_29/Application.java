package lesson_29;

public class Application {

    /*
    1.Создать класс Car, содержащий общие характеристики машин:
    model, manufacturer, year, colour
    2.Создать дочерние классы PassengerCar и Truck, расширающие Car
    3.Создать интерфейс Movable содержащий методы move и stop
    4.Также создать класс Kangaroo
    5.Общее поведение классов должно характеризоваться метода move и stop
    6.Класс Truck должен иметь также свои дополнительные характерискити и поведение, важное для грузовика
      а именно: макс. грузоподъемность, объем топливного бака. Поведение грузовика:
      - должен уметь загружаться (load) и при этом сообщать если превышена его остающаяся грузоподъемность, а также сообщать
      сколько еще можно загрузить груза
      -должен уметь разгружаться и при этом сообщать в случае если пытаются разругрузить больше чем его имеющийся груз
      или число отрицательное а также сообщать о весе остающегося на борту груза
      -в случае отсутствия топлива или отсутвисвия груза на борту сообщать о невозможности ехать
      -уметь дозаправлятся
     */

    public static void main(String[] args) {
        Truck truck = new Truck("FC","MAN",2021,"white",1000,1000);
        truck.setFuelTankCapacity(500);
        truck.load(100);
        truck.move();
        System.out.println(truck);
        Movable passengerCarMov = new PassengerCar("car", "Mercedes", 2021,"red", 100);
        Car passengerCar = new PassengerCar("car1", "Mercedes1", 2021,"red", 5);
        passengerCarMov.move();
        passengerCarMov.stop();


    }

}
