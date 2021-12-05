package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends HomePage{
    By _firstName=By.id("FirstName");
    By _lastName=By.id("LastName");
    By _email=By.id("Email");
    By _password=By.id("Password");
    By _confirmPassword=By.id("ConfirmPassword");

    public void eneterRegitrationDetails() {
        sendKeyText(_firstName,"Bhupesh");
        //write user last name
        sendKeyText(_lastName, "Patel");
        //Write user date of birth
        Select selectday = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectday.selectByVisibleText("20");
        //write user date of birth month
        Select selectmonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectmonth.selectByValue("5");
        //write user date of birth year
        Select selectyear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectyear.selectByVisibleText("1988");
        //write user valid user email id
        sendKeyText(_email, "bupesh1710+" + currentTime() + "@gmail.com");
        // write user password
        sendKeyText(_password, "bhup12345");
        //Write user confirm password.
        sendKeyText(_confirmPassword, "bhup12345");
        //click on the register button.
        waitForClickable(By.name("register-button"), 125);
        // click on the register button
        click(By.id("register-button"));
    }

}
