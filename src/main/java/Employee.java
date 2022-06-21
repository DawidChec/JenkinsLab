public class Employee {

    private int ID;
    private static int counter;
    private String Fname;
    private String Ename;
    private int Age;
    private double Salory;

public Employee(String Fname, String Ename, int age, double Salary){

        counter = counter + 1;
        ID = counter;

        this.Fname = Fname;
        this.Ename = Ename;
        this.Age = age;
        this.Salory = Salary;
    }

    public int getUniqueID() {
        return ID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String newFname) {
        Fname = newFname;
    }

    public String getEname() {
        return Ename;
    }


    public void setEname(String newEname) {
        Ename = newEname;
    }

    public int getAge() {
        return Age;
    }


    public void setAge(int newAge) {
        Age = newAge;
    }

    public double getSalory() {
        return Salory;
    }

    public void setSalory(double newSalory) {
        Salory = newSalory;
    }


}
