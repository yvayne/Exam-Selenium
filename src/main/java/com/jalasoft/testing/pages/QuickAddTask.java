package com.jalasoft.testing.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Yuri Vayne on 5/30/2016.
 */
public class QuickAddTask  extends AbstractBasePage {

    @FindBy(id = "icon_add_task")
    private WebElement showAddTaskFormButton;

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement taskNameTextField;

    @FindBy(css = "")
    private WebElement priorityButton;

    @FindBy(xpath = ".//*[@id='quick_add_task']/form/table[1]/tbody/tr/td/div/a")
    private WebElement projectDropDownList;

    @FindBy(xpath = ".//*[@id='GB_window']/div/div[2]/div/div/div/div/input")
    private WebElement projectTextField;

    @FindBy(css = "a.amibutton.amibutton_red.submit_btn")
    private WebElement addTaskButton;

    public void clickShowAddTaskButton() {
        wait.until(ExpectedConditions.visibilityOf(showAddTaskFormButton));
        showAddTaskFormButton.click();

    }
    public void clickShowProject() {
        wait.until(ExpectedConditions.visibilityOf(projectDropDownList));
        projectDropDownList.click();
    }

    public void setProjectTextField(String projectName) {
        wait.until(ExpectedConditions.visibilityOf(projectTextField));
        projectTextField.clear();
        projectTextField.sendKeys(projectName);
        projectTextField.sendKeys(Keys.ENTER);
    }
    public void setTaskNameTextField(String taskName) {
        wait.until(ExpectedConditions.visibilityOf(taskNameTextField));
        taskNameTextField.clear();
        taskNameTextField.sendKeys(taskName);
    }

    public void clickAddTaskButton() {
        wait.until(ExpectedConditions.visibilityOf(addTaskButton));
        addTaskButton.click();
    }
}
