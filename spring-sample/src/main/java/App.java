import com.gilmour.service.CustomerServiceImpl;
import com.gilmour.service.ICustomerService;

/**
 * Created by alicana on 02/03/2017.
 */
public class App {

	public static void main(String[] args) {

		ICustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
