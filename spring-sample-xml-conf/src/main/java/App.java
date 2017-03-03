import com.gilmour.service.ICustomerService;
import com.gilmour.service.IItemService;
import com.gilmour.service.IPlaceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alicana on 03/03/2017.
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICustomerService customerService = applicationContext.getBean("customerService", ICustomerService.class);
		IPlaceService placeService = applicationContext.getBean("placeService", IPlaceService.class);
		IItemService itemService = applicationContext.getBean("itemService", IItemService.class);

		System.out.println(customerService.findAll().get(0).getFirstName());
		System.out.println(placeService.listAllPlaces().get(0).getAddress());
		System.out.println(itemService.getItemByID(0).getDescription());

	}
}
