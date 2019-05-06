public class Dog extends Animal {
    public Dog(String name){
        this.name=name;
    }
    public void selectname(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("собака "+name+" бежит за кошкой");
    }
    public void eat() {
        System.out.println("собака "+name+" ест кости от кошки ");
    }
    public void sleep() {
        System.out.println("собака "+name+" спит в сарае");
    }
}