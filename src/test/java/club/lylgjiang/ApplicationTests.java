package club.lylgjiang;

import club.lylgjiang.starter.pojo.Person;
import club.lylgjiang.starter.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    Person person;
    
    @Autowired
    HelloService service;

    @Test
    public void testService() {

        System.out.println(service);
    }
    
    @Test
    public void contextLoads() {

        System.out.println(person);
        List<Object> tools = person.getTools();

//        for (Object tool : tools) {
//            System.out.println(tool);
//        }


    }

}
