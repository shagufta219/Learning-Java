package ex_19_oops_Single_inheritence;


import ex_18_constructor.CommonToAll;

public class Testcase1 extends CommonToAll{

    void runningTC1() {
        startBrowser();
        System.out.println("TC1 is running");
        closeBrowser();
    }
}
