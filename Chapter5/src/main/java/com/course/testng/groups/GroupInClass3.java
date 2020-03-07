package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupInClass3 {
    public void teacher1(){
        System.out.println("GroupInClass3中的teacher111运行了");
    }
    public void teacher2(){
        System.out.println("GroupInClass3中的teacher222运行了");
    }


}
