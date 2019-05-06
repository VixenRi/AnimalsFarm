public class Horse extends Animal {
    public Horse(String name){
        this.name=name;
    }
    public void selectname(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("пони  "+name+" бегает по кругу");
    }
    public void eat() {
        System.out.println("пони "+name+" ест морковь");
    }
    public void sleep() {
        System.out.println("пони "+name+" спит стоя");
    }
}
