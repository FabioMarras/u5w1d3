package fabiomarras.u5w1d2;

import fabiomarras.u5w1d2.entities.Drinks;
import fabiomarras.u5w1d2.entities.Pizzas;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestPizzas {

    @Autowired
    private Pizzas pizza;


    @Autowired
    private Drinks water;

    @Autowired
    private Drinks lemonade;

    @BeforeAll
    static void beforeAll(){
        System.out.println("BEFORE ALL");
    }

    @Test
    public void testPrice() {
        System.out.println("TestPrice");

        //assertNotNull(pizza);
        assertTrue(pizza.getPrice() > 0.00);
    }

    @Test
    public void drink0Calories(){
        System.out.println("drink0Calories");
        assertEquals(water.getCalories(), 0.00);
    }

    @Test
    public void lemondeIsPresence(){
        System.out.println("lemondeIsPresence");
        assertEquals("lemonade", lemonade.getName());
    }
}