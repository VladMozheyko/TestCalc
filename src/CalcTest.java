

import org.junit.After;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calculator calculator = new Calculator();

    @BeforeAll
    public static void startTesting(){
        System.out.println("Начинаем тестирование");
    }

    @BeforeEach
    public void beforeTest(){
        System.out.println("Тест начался");
    }

    @Test
    public void testAdd(){
        Assertions.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSub(){
        Assertions.assertEquals(0, calculator.sub(2,2));
    }

    @AfterEach
    public void afterTest(){
        System.out.println("Тест закончился");
    }

    @AfterAll
    public static void endTesting(){
        System.out.println("Заканчиваем тестирование");
    }


}
