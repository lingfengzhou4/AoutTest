package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupInMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试方法1111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试方法1111111");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试方法2222222");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法2222222");
    }
    @BeforeGroups("server")
    public void beforeGroupInServer(){
        System.out.println("BeforeGroups：这是服务端组之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupInServer(){
        System.out.println("AfterGroups：这是服务端组之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupInClient(){
        System.out.println("BeforeGroups：这是服务端组之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupInClient(){
        System.out.println("AfterGroups：这是服务端组之后运行的方法");
    }
}
