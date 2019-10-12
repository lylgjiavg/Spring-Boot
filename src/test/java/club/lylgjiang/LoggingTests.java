package club.lylgjiang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname LoggingTests
 * @Description 测试类
 * @Date 2019/10/12 14:57
 * @Created by Jiavg
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggingTests {
    
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Test
    public void test01() {
        
        logger.trace("这是一个trace日志...");
        logger.debug("这是一个debug日志...");
        logger.info("这是一个info日志...");
        logger.warn("这是一个warn日志...");
        logger.error("这是一个error日志...");
        
    }
    
}
