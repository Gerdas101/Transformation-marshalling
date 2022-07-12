package lt.viko.eif.GJ;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    private Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee();
        System.out.println("Running setUp()");
    }


    @Test
    void getName() {
        employee.setName("employee_name");
        assertNotNull(employee);
        assertEquals("employee_name", employee.getName());
        assertTrue(employee.toString().contains("employee_name"));
    }

    @Test
    void setName() {
        employee.setName("Geras");
        assertNotNull(employee);
        assertEquals("Geras", employee.getName());
    }

    @Test
    void getSurname() {
        employee.setSurname("employee_surname");
        assertNotNull(employee);
        assertEquals("employee_surname", employee.getSurname());
        assertTrue(employee.toString().contains("employee_surname"));
    }

    @Test
    void setSurname() {
        employee.setSurname("Geras");
        assertNotNull(employee);
        assertEquals("Geras", employee.getSurname());
    }

    @Test
    void getGender() {
        employee.setGender("employee_gender");
        assertNotNull(employee);
        assertEquals("employee_gender", employee.getGender());
        assertTrue(employee.toString().contains("employee_gender"));
    }

    @Test
    void setGender() {
        employee.setGender("male");
        assertNotNull(employee);
        assertEquals("male", employee.getGender());
    }

    @Test
    void getAge() {
        employee.setAge(50);
        assertNotNull(employee);
        assertEquals(50, employee.getAge());
        assertTrue(employee.toString().contains("50"));
    }

    @Test
    void setAge() {
        employee.setAge(90);
        assertNotNull(employee);
        assertEquals(90, employee.getAge());
    }
}