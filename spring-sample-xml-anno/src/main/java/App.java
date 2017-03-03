import com.gilmour.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alicana on 02/03/2017.
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICustomerService customerService = applicationContext.getBean("customerService", ICustomerService.class);

		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
