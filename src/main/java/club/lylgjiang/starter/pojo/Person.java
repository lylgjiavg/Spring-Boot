package club.lylgjiang.starter.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Classname Person
 * @Description 
 * @Date 2019/10/11 10:12
 * @Created by Jiavg
 */

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 *   @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *     prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *    只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 * 
 * 如果说，我们只是在某个业务逻辑中需要获取一下配置文件中的某项值，使用@Value；
 * 如果说，我们专门编写了一个javaBean来和配置文件进行映射，我们就直接使用@ConfigurationProperties；
 */
@Component

// @PropertySource：加载指定的配置文件；
//@PropertySource({"classpath:person.properties"})

@ConfigurationProperties(prefix = "person")
// 配置文件注入值数据校验
@Validated
public class Person {

    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量${key}从环境变量、配置文件中获取值#{SpEL}"></property>
     * <bean/>
     */
    // @Value("${person.name}")
    private String name;
    
    // @Value("${person.age}")
    private Integer age;
    
    // @Value("${person.birthday}")
    private Date birthday;
    
    // @Email 该注解不能配合@Value使用,可以配合@ConfigurationProperties使用
    // @Value("${person.name}")
    private String email;
    
    private List<Object> tools;
    private Map<String, Object> friends;
    
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Object> getTools() {
        return tools;
    }

    public void setTools(List<Object> tools) {
        this.tools = tools;
    }

    public Map<String, Object> getFriends() {
        return friends;
    }

    public void setFriends(Map<String, Object> friends) {
        this.friends = friends;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", tools=" + tools +
                ", friends=" + friends +
                ", dog=" + dog +
                '}';
    }
}
