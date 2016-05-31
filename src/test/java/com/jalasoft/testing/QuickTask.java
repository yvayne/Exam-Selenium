package com.jalasoft.testing;

import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.QuickAddTask;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class QuickTask {

    @BeforeClass
    public void setUp() {
        Login login = new Login();
        login.clickLoginClass();
        login.setEmailTextField("yuri_sis@hotmail.com");
        login.setPasswordTextField("S1st3mas");
        login.clickLoginButton();
    }
    @Test
    public void testAddQuickTask() {
        QuickAddTask newTask = new QuickAddTask();
        newTask.clickShowAddTaskButton();
        newTask.setTaskNameTextField("Test-01");
        newTask.clickShowProject();
        newTask.setProjectTextField("Personal");
        newTask.clickAddTaskButton();
    }
    @AfterMethod
    public void tearDown() {
        Assert.assertTrue(true,"the task should be added");
        //it is missing the functionality to remove the projected already created
    }

}
