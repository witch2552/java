class Shape{
    public void display(){
        System.out.println("display");
    }
}

class Rectangle extends Shape{
    public void area(){
        System.out.println("area");

    }
}

public class NewShape{
    public static void main(String args[]){
        Shape s1 = new Shape();
        s1.display();
        //s1.area();
    }
    

}