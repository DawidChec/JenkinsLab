import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class TestEmployeeSystem {
    Employee TestObject1;
    Employee TestObject2;
    Employee TestObject3;
    EmployeeSystem TestObjectSystem;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Testsvit påbörjad");
    }

    @AfterAll
    public static void aferAll() {
        System.out.println("testsvit avslutad");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Slut: ");
    }

    @BeforeEach
    public void beforEach() {
        System.out.println("start: ");

        TestObject1 = new Employee("Jakob", "Nilsson", 23, 30500.00);
        TestObject2 = new Employee("Marcus", "Davidsson", 33, 30500.00);
        TestObject3 = new Employee("Anki", "Pham", 24, 30500.00);
        TestObjectSystem = new EmployeeSystem();
    }

    @Test
    public void checkGetEmployeeListTest() {
        int expected = 3;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees = TestObjectSystem.getEmployeeList();

        int actual = employees.size();

    }

    @Test
    public void checkAddEmployeeTest() {
        int expected = 3;
        ArrayList<Employee> employees = new ArrayList<Employee>();

        TestObjectSystem.addEmployee(TestObject1);
        TestObjectSystem.addEmployee(TestObject2);
        TestObjectSystem.addEmployee(TestObject3);

        employees = TestObjectSystem.getEmployeeList();

        int actual = employees.size();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void checkRemoveEmployeeTest() {
        int expected = 2;

        ArrayList<Employee> employees = new ArrayList<Employee>();

        TestObjectSystem.addEmployee(TestObject1);
        TestObjectSystem.addEmployee(TestObject2);
        TestObjectSystem.addEmployee(TestObject3);

        TestObjectSystem.removeEmloyee(TestObject1);

        employees = TestObjectSystem.getEmployeeList();

        int actual = employees.size();

        Assertions.assertEquals(expected, actual);

    }

}
