public class Intern extends Employee{
    private String university;
    private boolean isFullTime;

    public Intern(String name, int employeeId, double baseSalary, String department, String university, boolean isFullTime){
        super(name, employeeId, baseSalary, department);
        this.university = university;
        this.isFullTime = isFullTime;

        System.out.println("intern " + name + "from " + university + "has started");
    }

    public double calculateSalary(){
        return baseSalary * 0.5;
    }

    public void work(){
        System.out.println(name + "is learning and assisting with task");
    }
}
