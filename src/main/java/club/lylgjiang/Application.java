package club.lylgjiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 * 
 *  @ImportResource：导入Spring的配置文件，让配置文件里面的内容生效；
 *      Spring Boot里面没有Spring的配置文件，我们自己编写的配置文件，也不能自动识别；
 *      想让Spring的配置文件生效，加载进来；@ImportResource标注在一个配置类上
 */
// @ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
