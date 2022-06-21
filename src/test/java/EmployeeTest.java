import org.junit.jupiter.api.*;

public class EmployeeTest {

    Employee TestObject1;
    Employee TestObject2;
    Employee TestObject3;


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
    }

    @Test
    public void checkGetUniqueID() {
        int actual2 = TestObject2.getUniqueID();

        int expected1 = actual2-1;
        int expected3 = actual2+1;

        int actual1 = TestObject1.getUniqueID();
        int actual3 = TestObject3.getUniqueID();

        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void checkGetFnameTest() {
        String expected = "Jakob";

        String actual = TestObject1.getFname();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void checkSetFnameTest(){
        String expected = "Göran";

        TestObject1.setFname(expected);

        String actual =TestObject1.getFname();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkGetEnameTest(){
        String expected = "Nilsson";

        String actual = TestObject1.getEname();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSetEnameTest(){
        String expected = "davidsson";

        TestObject1.setEname(expected);

        String actual = TestObject1.getEname();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void checkGetAgeTest(){
        int expected = 23;

        int actual = TestObject1.getAge();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void checkSetAgeTest(){
        int expected = 34;

        TestObject1.setAge(expected);

        int actual = TestObject1.getAge();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkGetSaloryTest(){
        double expected = 30500.00;

        double actual = TestObject1.getSalory();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkSetSaloryTest(){
        double expected = 40600.00;

        TestObject1.setSalory(expected);

        double actual = TestObject1.getSalory();

        Assertions.assertEquals(expected,actual);

    }
}
