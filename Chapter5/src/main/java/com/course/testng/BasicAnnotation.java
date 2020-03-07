package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //這是最基本的註解，用來把方法標記為測試的一部分
    @Test
    public  void  testCase1(){
        System.out.println("Test：這是測試用例1");
    }

    @Test
    public  void  testCase2(){
        System.out.println("Test：這是測試用例2");
    }

    @BeforeMethod
    public  void  beforeMethod1(){
        System.out.println("BeforeMethod：這是在測試方法之前運行的");
    }

    @AfterMethod
    public  void  afterMethod(){
        System.out.println("AfterMethod：這是在測試方法之後運行的");
    }

    @BeforeClass
    public  void  beforeClass(){
        System.out.println("BeforeClass：這是在類運行之前執行的方法");
    }

    @AfterClass
    public  void  afterClass(){
        System.out.println("AfterClass：這是在類運行之後執行的方法");
    }

    @BeforeSuite
    public  void  beforeSuite(){
        System.out.println("BeforeSuite：测试套件");
    }
    @AfterSuite
    public  void  afterSuite(){
        System.out.println("AfterSuite：测试套件");
    }


}
