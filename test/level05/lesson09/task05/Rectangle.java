package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и
 высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    //напишите тут ваш код
    private int left;
    private int top;
    private int wight;
    private int height;

    public Rectangle(int left, int top, int wight, int height) {
        this.left = left;
        this.top = top;
        this.wight = wight;
        this.height = height;
    }
    public Rectangle(int left, int top, int wight) {
        this.left = left;
        this.top = top;
        this.wight = wight;
        this.height = wight;
    }
    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.wight = 0;
        this.height = 0;
    }
    public Rectangle(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.wight = rectangle.wight;
        this.height = rectangle.height;
    }
}
