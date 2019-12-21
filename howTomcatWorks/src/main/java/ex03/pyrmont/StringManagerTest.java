package ex03.pyrmont;

import org.apache.catalina.util.StringManager;

/**
 * @Author Twist
 * @Date Created in 18:17 2019/12/21
 * @Description
 */
public class StringManagerTest {

    public static void main(String[] args) {
        StringManager packageInstance = StringManager.getManager("ex03.pyrmont.connector.http");
        String info = packageInstance.getString("httpConnector.alreadyInitialized");
        System.out.println(info);
    }

}
