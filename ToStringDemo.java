// переопределение метода toString()
public class ToStringDemo {
    public static void main(String[] args) {
        Box box1 = new Box(20.3, 20.0, 10.5);
        Box box2 = new Box(30.5, 30.5, 30.5);
        System.out.println(box1);
        System.out.println(box2);
    }
}
class Box{
    double width;
    double height;
    double depth;
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public String toString(){
        return "Размер коробки: " + width + " на " + height + " на " + depth;
    }
}
/*
Размер коробки: 20.3 на 20.0 на 10.5
Размер коробки: 30.5 на 30.5 на 30.5
 */