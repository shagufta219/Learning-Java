package ex_19_oops_Single_inheritence;

public class Lab181_real_si {
    public static void main(String[] args) {
        Testcase1 t1 = new Testcase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        Testcase1 t3 = new Testcase1();
        CommonToAll c2 = new CommonToAll(); // Dynamic Dispatch (extends)
//        TestCase1 t4 = new CommonToAll();

        // Webdriver driver = new ChromeDriver();

    }
}
