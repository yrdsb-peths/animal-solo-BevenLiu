import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        elephant elephant = new elephant();
        addObject(elephant, 300,200);
        Apple apple = new Apple();
        addObject(apple,300,0);
    }
}
