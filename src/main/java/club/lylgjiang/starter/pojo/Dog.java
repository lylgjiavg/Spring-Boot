package club.lylgjiang.starter.pojo;

/**
 * @Classname Dog
 * @Description 
 * @Date 2019/10/11 10:14
 * @Created by Jiavg
 */
public class Dog {
    
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
