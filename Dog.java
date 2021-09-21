public class Dog
{
    private String breed;
    private String size;
    private String color;
    private String name;
    private int age;
    public String getBreed()
    {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void Eat() {
        System.out.println(getName() + " eating!");
    }
    public void Run() {
        System.out.println(getName() + " running!");
    }
    public void Sleep() {
        System.out.println(getName() + " sleeping!");
    }
    public void Name() {
        System.out.println("This "+ breed+"'s "+"name is "+ name);
    }

}
class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.setBreed("Bulldog");
        dog1.setSize("Large");
        dog1.setAge(5);
        dog2.setBreed("Beagle");
        dog2.setSize("Large");
        dog2.setAge(6);
        dog3.setBreed("German Shepherd");
        dog3.setSize("Large");
        dog3.setAge(6);
        dog1.setName("Diesel");
        dog2.setName("Parker");
        dog3.setName("Bella");
        dog1.Eat();
        dog1.Name();
        dog2.Name();
    }
}