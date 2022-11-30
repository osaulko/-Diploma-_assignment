package First_Test;

import pageObjects.baseObjects.BaseTest;

public class test extends BaseTest {

    public void test(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("env"));
    }
}
