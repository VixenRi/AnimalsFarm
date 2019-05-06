public class Cat extends Animal {
    public Cat(String name){
        this.name=name;
    }
    public void selectname(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("кот "+name+" катится клубком ");
    }
    public void eat() {
        System.out.println("кот "+name+" ест рыбу ");
    }
    public void sleep() {
        System.out.println("кот "+name+" спит на диване");
    }
}