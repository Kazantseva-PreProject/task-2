import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.javamentor.Cat;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ru.javamentor.AppConfig.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        ru.javamentor.HelloWorld tree =
                applicationContext.getBean(ru.javamentor.HelloWorld.class);
        ru.javamentor.HelloWorld leaf =
                applicationContext.getBean(ru.javamentor.HelloWorld.class);

        Cat one = applicationContext.getBean(Cat.class);
       Cat two = applicationContext.getBean(Cat.class);

        Assert.assertSame("Тест провален, не корректная настройка бина ru.javamentor.HelloWorld", tree, leaf);
        Assert.assertNotSame("Тест провален, не корректная настройка бина Cat", one, two);
   }
}
