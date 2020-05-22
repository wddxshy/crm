import com.shy.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: WeiDongDong
 * @Date 2020/5/19 19:47
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:SpringConfig/Spring.xml")
public class ssss {

    @Resource
    CustomerService customerService;

    @Test
    public void test1(){
//        List<CustomerCustom> customerListByPage = customerService.getCustomerListByPage();
//        customerListByPage.forEach(System.out::println);
    }
}
