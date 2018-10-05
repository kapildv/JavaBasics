package junit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MyArrayObjectEqualsTest {


    Object[] expectedEmps = new Object[3];

    @BeforeClass
    public static void getName() {
        System.out.println(MyArrayObjectEqualsTest.class.getName());
    }

    @Before
    public void initInputs() {
        expectedEmps[0] = new Employee(1, "Nats", 15000);
        expectedEmps[1] = new Employee(2, "Kalid", 25000);
        expectedEmps[2] = new Employee(3, "Krish", 5000);
    }

    @Test
    public void compareEmployees() {
        /**
         * convert List of objects to array of objects
         */
        System.out.println("compareEmployees");
        Object[] testOutput = Employee.getEmpList().toArray();
        assertArrayEquals(expectedEmps, testOutput);
    }

    @Test
    public void compareEmployees1() {
        /**
         * convert List of objects to array of objects
         */
        System.out.println("compareEmployees1");
        Object[] testOutput = Employee.getEmpList().toArray();
        assertArrayEquals(expectedEmps, testOutput);
    }



}
