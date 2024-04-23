import com.github.kubrabal.model.Person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    Person person = new Person("John", "Doe");
    int paymentPerDay = 300;

    @Test
    public void calculate() {
        int daysWorked = 23;

        person.updateNumberOfDaysWorked(daysWorked);
        person.calculateSalary();

        double salary = calculateSalary(daysWorked);
        System.out.println(person.getSalary() + " - " + salary);
        assertEquals(person.getSalary(), salary);
    }

    private double calculateSalary(int daysWorked) {
        double salary = 0.0;

        if (daysWorked > 22) {
            salary = 22 * paymentPerDay + ((daysWorked - 22) * 1000);
        } else {
            salary = daysWorked * paymentPerDay;
        }

        return salary;
    }

}
