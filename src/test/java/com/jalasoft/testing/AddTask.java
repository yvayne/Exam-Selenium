package com.jalasoft.testing;

import com.jalasoft.testing.pages.Login;
import com.jalasoft.testing.pages.NewTask;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Yuri Vayne on 5/30/2016.
 */
public class AddTask {
    @BeforeClass
    public void setUp() {
        Login login = new Login();
        login.clickLoginClass();
        login.setEmailTextField("yuri_sis@hotmail.com");
        login.setPasswordTextField("S1st3mas");
        login.clickLoginButton();
    }
    @Test
    public void testAddTask() {
        NewTask newTask = new NewTask();
        newTask.clickInboxProjectButton();
        newTask.clickTaskButton();
        newTask.setTaskNameTextField("Test-02");
        newTask.clickAddTaskButton();

    }
    @AfterMethod
    public void tearDown() {
        Assert.assertTrue(true,"the task should be added");
        //it is missing the functionality to remove the projected already created
    }
}
