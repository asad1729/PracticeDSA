import java.io.*;
import java.util.Scanner;
class person
{
    private int id;
    private String name;
    private int age;
    private String city;
    private String gender;
    public void setId(int id)
    {
        this.id=id;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void eat()
    {
        System.out.println(name+" is eating his food");
    }
    public void sleep()
    {
        System.out.println(name+" is taking his nap");
    }
    public void play()
    {
        System.out.println(name+" is playing cricket");
    }
    public void work()
    {
        System.out.println(name+" is working for his project");
    }
    public int getId()
    {
        return id;
    }
    public int getage()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }
    public String getGender()
    {
        return gender;
    }
}
class PersonDemo
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("enter name");
            String name1 = in.nextLine();
            System.out.println("enter city");
            String city1 = in.nextLine();
            System.out.println("enter gender");
            String gender1 = in.nextLine();
            System.out.println("enter id");
            int id1 = in.nextInt();
            System.out.println("enter age");
            int age1 = in.nextInt();
            person obj = new person();
            obj.setAge(age1);
            obj.setId(id1);
            obj.setName(name1);
            obj.setCity(city1);
            obj.setGender(gender1);
            obj.eat();
            obj.play();
            obj.play();
        }
    }
}
