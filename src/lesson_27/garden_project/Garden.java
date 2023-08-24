package lesson_27.garden_project;

public class Garden {

    /*
    Садовод-Любитель.
    Выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики:
    name, height, age . Каждый из них вырастает на разную высоту за сезон, причем эта высота одинаковая для всех деревьев
    и всех цветов.
    Каждый год состоит их четырех времен года, во вермя которых поведение деревьев и цветов может отличаться:
    Цветы:
    год начинается весной и они растут
    летом они не растут, а цветут
    осенью их срезают
    зимой не растут


    Деревья:
    сезон начинается весной и они растут
    летом деревья растут
    осенью деревья не растут
    зимой деревья не растут


    В классе Garden создать метод growPlants в котором должен быть отражен процесс роста нескольких растений
    в течении нескольких лет . Что происходит зимой , летом, весной осенью в каждый сезон и какого роста и возраста
    в конце

    пример:
    Pine tree has grown in Spring - 100
    Pine tree has grown in Summer - 115
    Pine tree has not grown in Autumn - 115
    Pine tree has not grown in Winter - 115
    Tulip has grown in Spring - 24
    --------
    Pine tree has height 250 and is 5 years old


    Алгоритм решения:
    1. создать родительский класс Plant
    2. создать дочерние классы Flower and Tree
    3. создать в этих классах методы , характеризуещие поведение цветов и деревьев
    в соответствующий период (лето , весна, осень , зима)
    doSpring()
    doSummer()
    doWinter()
    doAutumn()


        в родительском классе должны быть поля
        name height age



       в дочернем классе цветов поле роста = 2
       в дочернем классе деревьев поле роста = 5
     4. метод growPlants должен происводить над массивом объектов типа Plant

     */

    public static void main(String[] args) {
        Tree tree = new Tree("Pine", 100, 1);
        Flower flower = new Flower("Tulip", 20, 1);


        Plant[] plants = new Plant[2];
        plants[0] = tree;
        plants[1] = flower;

        growPlants(plants, 2);



//        for (Plant plant : plants){
//            plant.growPlants(2);
//        }
    }


    public static void growPlants(Plant[] plants,int years){
        System.out.println("Growing plants for " + years + " years");
        for (int i = 0; i < years; i++) {
            for (Plant plant: plants){
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }

        for (Plant plant : plants){
            System.out.println(plant.getName() + " has height: " + plant.getHeight() + " and is " + plant.getAge() + " years old");
        }



    }



}




