package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuire(){
        System.out.println("before suite 运行啦");
    }

    @AfterSuite
    public void afterSuire(){
        System.out.println("after Suire 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest:执行了");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest:执行了");
    }

}
