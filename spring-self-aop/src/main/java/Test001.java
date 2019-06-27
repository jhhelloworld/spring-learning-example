import com.ginkgo.proxy.UserServiceProxy;
import com.ginkgo.service.UserService;
import com.ginkgo.service.impl.UserServiceImpl;

public class Test001 {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		// userService.add();
		UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
		userServiceProxy.add();
	}

}
