/**
 * Created by Amence on 2016/12/22.
 */
public class HelloService {
    private String info;

    public HelloService() {
        System.out.println("构造方法");

    }

    public static HelloService getInstance() {
        System.out.println("静态方法");
        return new HelloService();

    }


}
