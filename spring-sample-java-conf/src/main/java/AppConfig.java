import com.gilmour.repository.HibernateCustomerRepositoryImpl;
import com.gilmour.repository.ICustomerRepository;
import com.gilmour.service.CustomerServiceImpl;
import com.gilmour.service.ICustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.gilmour"})
public class AppConfig {

	@Bean(name = "customerService")
	public ICustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		//		customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}

	// =====================
	// Setter injection
	// =====================
	//	@Bean(name = "CustomerService")
	//	public ICustomerService getCustomerService() {
	//		CustomerServiceImpl customerService = new CustomerServiceImpl();
	//		customerService.setCustomerRepository(getCustomerRepository());
	//		return customerService;
	//	}

	@Bean(name = "customerRepository")
	public ICustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}

}
