import com.amence.spring.eighth.BeanConfig;
import com.amence.spring.eighth.BookDao;
import com.amence.spring.eighth.UserDao;
import com.amence.spring.fifth.Web;
import com.amence.spring.forth.Dao;
import com.amence.spring.seventh.Book;
import com.amence.spring.third.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Amence on 2016/12/22.
 */
public class TestDemo {


    @Test
    public void test1() {
        String path = "spring/bean.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        HelloService service = (HelloService) context.getBean("helloService");
        System.out.println(service.toString());
        HelloService service2 = (HelloService) context.getBean("helloService");
        System.out.println(service2.toString());

    }

    @Test
    public void test3() {
        String path = "spring/third.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        User user = (User) context.getBean("user");
        context.close();
    }

    @Test
    public void test4() {
        String path = "spring/forth.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        Dao dao = (Dao) context.getBean("dao");
        System.out.println(dao.getBeanId());
        System.out.println(dao.getDB());
    }

    @Test
    public void test5() {
        String path = "spring/fifth.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        Web web = (Web) context.getBean("myweb");
        web.save();
    }

    @Test
    public void test6() {
        String path = "spring/six.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        com.amence.spring.sixth.Book book = (com.amence.spring.sixth.Book) context.getBean("book");
        context.close();
    }

    @Test
    public void test7() {
        String path = "spring/seven.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        Book book = (Book) context.getBean("book");
        System.out.println(book.toString());
        Book book1 = (Book) context.getBean("book");
        System.out.println(book1.toString());
        context.close();
    }

    @Test
    public void test8(){
        //用于加载使用@Configuration配置注解工厂类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //用于向注解上下文对象 添加一个配置类
        context.register(BeanConfig.class);
        //刷新容器以应用这些注册的配置类
        context.refresh();

        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println(userDao);

        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);


    }

}
