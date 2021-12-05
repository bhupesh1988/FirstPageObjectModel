package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewsCommentAddSuccessfully extends NewsCommentsPage {
    public void newsCommentsSuccessfullyAdded(){
        String actualNewsComment=getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        String expectedNewsComment="News comment is successfully added.";
        Assert.assertTrue(actualNewsComment.equals(expectedNewsComment),"News comment is successfully added.");
    }

    }

