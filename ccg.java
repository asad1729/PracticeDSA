import java.util.Scanner;
class Employee {
    private int empNo;
    private String empName;
    private int empSal;
    //setter methods
    public void setEmpNo(int n) {
        this.empNo =n;
    }
    public void setEmpName(String s) {
        this.empName =s;
    }
    public void setEmpSal(int n) {
        this.empSal =n;
    }
    //getter methods
    public int getEmpNo() {
        return empNo;
    }
    public String getEmpName() {
        return empName;
    }
    public int getEmpSal() {
        return empSal;
    }
}
class EmployeeData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee obj=new Employee();
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter empNo of Employ "+(i+1)+" : ");
            obj.setEmpNo(sc.nextInt());
            System.out.println("Enter empName of Employ "+(i+1)+" : ");
            obj.setEmpName(sc.nextLine());
            sc.nextLine();
            System.out.println("Details of Employee "+i+" : ");
            System.out.println("EmpNo. "+obj.getEmpNo());
            System.out.println("EmpName "+obj.getEmpName());
            System.out.println("EmpSal "+obj.getEmpSal());
        }

    }

}