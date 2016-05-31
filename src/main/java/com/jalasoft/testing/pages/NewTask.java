package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Win7-VM-01 on 29/05/2016.
 */
public class NewTask extends AbstractBasePage {

    @FindBy(id = "filter_inbox")
    private WebElement inboxProjectButton;

    @FindBy(xpath = ".//*[@id='editor']/div/div[2]/a")
    private WebElement TaskButton;

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement taskNameTextField;


    @FindBy(css = "a.amibutton.amibutton_red.submit_btn")
    private WebElement addTaskButton;

    public void clickInboxProjectButton() {
        wait.until(ExpectedConditions.visibilityOf(inboxProjectButton));
        inboxProjectButton.click();

    }

    public void clickTaskButton() {
        wait.until(ExpectedConditions.visibilityOf(TaskButton));
        TaskButton.click();

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
