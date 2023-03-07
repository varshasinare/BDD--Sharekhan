package com.edusol.stepDefination;

import com.edusol.base.CommonMethods;
import com.edusol.pom.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefination extends CommonMethods {

	HomePage homepage=new HomePage();
	@Given("User is on ShareKhan Homepage")
	public void user_is_on_share_khan_homepage() {
		homepage.homepagecheck();
	}
	
	@When("Title of Home page contains {string} and display contents MARKET,NEW TO MARKET,SUPER INVESTOR,ACTIVE TRADER,MUTUAL FUNDS,RESEARCH,EDUCATION FIRST,PRODUCTS AND SERVICES,LOGIN\\/TRADE button")
	public void title_of_home_page_contains_and_display_contents(String string) {
		homepage.contentCheck(string);
	}
	
	
	@Then("Close browser after verification")
	public void close_browser_after_verification() {
	    System.out.println("Done with Verification");
	}
	
	@When("User click on Main Menu")
	public void user_click_on_main_menu() {
		homepage.mainMenu();
	    
	}

	@Then("Main menu popup is displayed on right side")
	public void main_menu_popup_is_displayed_on_right_side() {
	   homepage.menuPopUp();
	}
	
	@When("User hover over Menu link")
	public void user_hover_over_menu_link() {
	    homepage.menu_link_hover();
	}

	@Then("Respective page or popup box is launched")
	public void respective_page_or_popup_box_is_launched() {
	   
	}


}
