public abstract class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public Mobile() {
    }

    public abstract void call(String message);

    public void getInfo() {
        System.out.println("name:["+name+"],color:["+color+"],brand:["+brand+"]");
    }
}
