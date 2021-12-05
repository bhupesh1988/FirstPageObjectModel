package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage =new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    ResgisterResultPage resgisterResultPage =new ResgisterResultPage();
    NewsCommentsPage newsCommentsPage = new NewsCommentsPage();
    NewsCommentAddSuccessfully newsCommentAddSuccessfully = new NewsCommentAddSuccessfully();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailAFriendPage emailAFriendPage= new EmailAFriendPage();
    EmailAFriendResultPage emailAFriendResultPage =new EmailAFriendResultPage();
    ComputersPage computersPage =new ComputersPage();

    NavigateToDestops navigateToDestops= new NavigateToDestops();

    @Test
    public void userShouldBeAbleRegisterSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.eneterRegitrationDetails();
        resgisterResultPage.registrationResult();
    }
    @Test
    public void userShouldAbleToAddNewsCommentsSuccessFully(){
        homePage.clickOnNewsComments();
        newsCommentsPage.enterNewsCommentsDetails();
        newsCommentAddSuccessfully.newsCommentsSuccessfullyAdded();
    }
    @Test
    public void userIsAbleToNavigateToDestop(){
        homePage.clickOnComputersButton();
        computersPage.selectDesktops();
        navigateToDestops.navigateToDestopSuccessFull();
    }
    @Test
    public void verifyRegisteredUserShouldBeAbleTOReferAProductToFriend(){
        userShouldBeAbleRegisterSuccessfully();
        resgisterResultPage.clcikonContinueInTheRegistrationPage();
        homePage.clickOnBuildOnOwnComputerPicture();
        buildYourOwnComputerPage.clickOnTheEmailAFriendOnBuildYourOwnComputerPage();
        emailAFriendPage.enterEmailAFriendDetails();
        emailAFriendResultPage.resultEmailAFriend();


}}
