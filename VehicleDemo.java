import java.util.*;
class Vehicle
{
    private String Brand_Name;
    private int No_of_wheels;
    private String color;
    private int price;
    public void setWheels(int no_of_wheels)
    {
        No_of_wheels = no_of_wheels;
    }
    public void setBrand(String brand_Name)
    {
        Brand_Name = brand_Name;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getWheels()
    {
        return No_of_wheels;
    }
    public String getBrand()
    {
        return Brand_Name;
    }
    public String getColor()
    {
        return color;
    }
    public int getPrice()
    {
        return price;
    }
    public void Run()
    {
        System.out.println("Brand Name : "+getBrand());
        System.out.println("colour : "+getColor());
        System.out.println("Price : "+getPrice());
        System.out.println("no of wheels :"+getWheels());
        System.out.println("Vehicle is running");
    }
}
class VehicleDemo
{
    public static void main(String[] args)throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter vehicle's brand");
        String n=in.nextLine();
        in.nextLine();
        System.out.println("Enter vehicle's colour");
        String col=in.nextLine();
        in.nextLine();
        System.out.println("Enter no of wheels");
        int nw=in.nextInt();
        System.out.println("Enter Price");
        int pc=in.nextInt();
        Vehicle cycle = new Vehicle();
        cycle.setPrice(pc);
        cycle.setColor(col);
        cycle.setBrand(n);
        cycle.setWheels(nw);
        cycle.Run();

    }

}