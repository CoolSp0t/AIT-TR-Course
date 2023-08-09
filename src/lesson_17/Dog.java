package lesson_17;

public class Dog {
    String name;
    int jumpHeight;
    int maxJumpHeight;

    public Dog(String name, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
        maxJumpHeight = jumpHeight*2;
    }

    void jump(){
        System.out.println("Я прыгаю");

    }


    void jump(int height){
        System.out.println("Я перепрыгиваю барьер " + height + " см" );
    }





    void training(){
        System.out.println("Start training");
        if(jumpHeight + 10 <= maxJumpHeight  ){// 50 --> 100 --> x <= 100- 10 (90)
            jumpHeight += 10;
            System.out.println("Я потренировался.");
            iAm();
        }else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
        }


    void getBarrier(int barrierHeight){
        if(barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight){
            while(jumpHeight< barrierHeight){
                training();
            }
        }

        if(jumpHeight >= barrierHeight){
            jump(barrierHeight);
        }else {
            System.out.println("Я не могу перепрыгнуть барьер высотой " + barrierHeight);
        }
        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);

    }


    void iAm(){
        System.out.println("Я собака: " + name + " я прыгаю " + jumpHeight + " см ");
    }

}
