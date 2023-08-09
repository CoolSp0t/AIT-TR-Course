package homework_17;

public class Dog {

    //Task 1 Повторить код класса Dog, написанного на уроке.
    //Создать массив из 10 препятствий.
    //Попросить объект класса собака перепрыгнуть все препятствия в массиве. Написать класс собака
    //Собака должна иметь имя, высоту прыжка
    //Должна уметь прыгать и должна уметь тренироваться. За каждую тренировку высота прыжка увеличивается на 10 сантиметров
    //Максимальная высота, которую может натренировать собака не может быть больше, чем 2раза высоту первоначального прыжка

    String name;
    int jumpHeight;
    int maxJump;
    int jumpUpgrade;

    public Dog (String name, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
        maxJump = jumpHeight*2;
        jumpUpgrade = 10;
    }

    void whoAmI(){
        System.out.println("Я собака " + name + " я прыгаю " + jumpHeight + " см ");
    }

    void jump(int height){
        System.out.println("Я перепрыгиваю барьер " +  height + "см");
    }

    void training(){
        System.out.println("Начал тренировку");
        if(jumpHeight + 10 <= maxJump){
            System.out.println("Я тренируюсь");
            jumpHeight += jumpUpgrade;
        }
        System.out.println("Закончил тренировку. Теперь прыгаю " + jumpHeight + " см");
    }


    boolean getBarrier(int barrierHeight){
        if(barrierHeight <= maxJump && jumpHeight < barrierHeight){
            while (jumpHeight < barrierHeight){
                training();
            }
        }
        if(jumpHeight >= barrierHeight){
            jump(barrierHeight);
            return true;
        }else{
            System.out.println("Я не могу перепрыгнуть барьер высотой " + barrierHeight);

        }
        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
        return false;
    }

}
