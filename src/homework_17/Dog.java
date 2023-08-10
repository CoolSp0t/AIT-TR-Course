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
        System.out.println("Я собака " + name + " я прыгаю, " + jumpHeight + " см ");
    }

    void jump(int height){
        System.out.println("Я перепрыгиваю барьер " +  height + "см");
    }

    void training(){
        System.out.println("Начал тренировку");
        // jump [0...90] -> if
        if(jumpHeight + jumpUpgrade <= maxJump){
            System.out.println("Я тренируюсь");
            jumpHeight += jumpUpgrade;
        } //  -> [91...infinity]
        // [         100 - [91..] < 10 ==> будет true при значениях [91-99]
        else if (maxJump - jumpHeight < jumpUpgrade) {
            System.out.println("Small training start: jump= " + jumpHeight + "; max = " +maxJump);
            jumpHeight = maxJump;
        }else {
            System.out.println("Больше не могу тренироваться");
        }


        System.out.println("Закончил тренировку. Теперь прыгаю " + jumpHeight + " см");
    }


    boolean getBarrier(int barrierHeight){
        //  100 <= 106 --> true  &&  98 < 100
        if(barrierHeight <= maxJump && jumpHeight < barrierHeight){
            // 98 < 100 --> true -> бесконечный цикл
            while (jumpHeight < barrierHeight){
                training();
            }
        }
        boolean result;
        if(jumpHeight >= barrierHeight){
            jump(barrierHeight);
            result = true;
        }else{
            System.out.println("Я не могу перепрыгнуть барьер высотой " + barrierHeight);
            result =false;
        }
        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
        return result;
    }





}
