package ex03.pyrmont.connector.http;

import org.apache.tomcat.util.res.StringManager;

import java.util.Locale;

/**
 * @Author Twist
 * @Date Created in 13:34 2019/12/21
 * @Description
 */
public class StringManagerTest {

    public static void main(String[] args) {
        //毫无疑问 如果 /target 下面没有LocalStrings.properties 我们就获取不到.
        StringManager localPackageInstance = StringManager.getManager("ex03.pyrmont.connector.http", Locale.ENGLISH);
        String fakeMsg = localPackageInstance.getString("httpConnector.alreadyInitialized");
        System.out.println(fakeMsg);
    }

}
