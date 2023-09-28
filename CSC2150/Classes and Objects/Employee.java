public class Employee
{
    private String name;
    private int id;

    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public Employee()
    {
        this.name = "";
        this.id = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return (name);
    }

    public int getId()
    {
        return (id);
    }

    public static void main(String[] args)
    {
        Employee employee1 = new Employee("John", 1234);
        System.out.println("Employee 1 name: " + employee1.getName());
        System.out.println("Employee 1 id: " + employee1.getId());

        Employee employee2 = new Employee();
        System.out.println("Employee 1 name: " + employee2.getName());
        System.out.println("Employee 1 id: " + employee2.getId());
    }
}
