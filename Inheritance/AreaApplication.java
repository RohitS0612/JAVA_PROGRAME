
abstract class Area{
    abstract void showArea();
}

class Circle extends Area{
    int radius;

    void setRadius(int rad){
        radius = rad;
    }

    @Override
    void showArea(){
        float area =(float) (3.142 * radius * radius);
        System.out.println("Area of circle is : "+area);
    }
}

class Rectangel extends Area{
    int rect;
    void setLengthWidth(int len, int wid){
        rect =  len * wid; 
    }
    @Override
    void showArea(){
        System.out.println("Rectangle : "+ rect);
    }
}

public class AreaApplication {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        c.showArea();
        
        Rectangel r = new Rectangel();
        r.setLengthWidth(5, 6);
        r.showArea();
    }
}
