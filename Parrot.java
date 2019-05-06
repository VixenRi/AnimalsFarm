public class Parrot extends Animal {
    public Parrot(String name){
        this.name=name;
    }
    public void selectname(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("попугай "+name+" летит домой");
    }
    public void eat() {
        System.out.println("попугай "+name+" ест  семечки ");
    }
    public void sleep() {
        System.out.println("попугай  "+name+" спит в  клетке");
    }
}