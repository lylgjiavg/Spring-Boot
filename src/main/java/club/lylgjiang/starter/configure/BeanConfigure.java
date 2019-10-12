package club.lylgjiang.starter.configure;

import club.lylgjiang.starter.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname BeanConfigure
 * @Description 
 * @Date 2019/10/11 23:54
 * @Created by Jiavg
 */

/**
 * SpringBoot推荐给容器中添加组件的方式；推荐使用全注解的方式
 *      1、配置类@Configuration------>Spring配置文件
 *      2、使用@Bean给容器中添加组件
 */
@Configuration
public class BeanConfigure {
    
    // 将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
    
}
