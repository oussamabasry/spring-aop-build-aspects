import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.IService;

public class Application {
    public static void main(String[] args) {
        aspects.ApplicationContext.authenticateUser("root","1234",new String[]{"ADMIN"});
        org.springframework.context.ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        IService service= context.getBean(IService.class);
        service.process();
        System.out.println(service.compute());
    }
}