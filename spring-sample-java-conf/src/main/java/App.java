import com.gilmour.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by alicana on 02/03/2017.
 */
public class App {

	public static void main(String[] args) {

//		ICustomerService service = new CustomerServiceImpl();

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		ICustomerService customerService = appContext.getBean("customerService", ICustomerService.class);

		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
