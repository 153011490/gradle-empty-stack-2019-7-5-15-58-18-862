/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        Iphone iphone = new Iphone("iPhone X","black","Apple");
        Andriod andriod=new Andriod("HUAWEI P30","blue","HUAWEI");

        Person person = new Person("Mike",iphone);

        iphone.getInfo();
        andriod.getInfo();

        person.call("456789");

        iPhoneRobot.call(iphone,"haha");
    }
}
