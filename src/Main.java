public class Main {
    public static void main(String[] args) {

        Banana banana = new Banana("A,B,C");
        Orange orange=new Orange(10,"sweet","orange","Pakistanskiy",banana);
        System.out.println(orange);
        Apple apple=new Apple(5,"sour","red","apple",banana,"Green","aplle",banana);
        System.out.println(apple);



    }
}