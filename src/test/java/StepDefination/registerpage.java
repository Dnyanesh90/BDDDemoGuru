package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class registerpage extends BaseClass {
	private RegisterPage registerpage;
	
	@Given("user is on register page")
	public void user_is_on_register_page() {
			BaseClass.initilization();
	}
	@When("enter valid user {string} and {string}")
	public void enter_valid_user_and(String fname, String lname) {
		registerpage =new RegisterPage();
		registerpage.typefirstName(fname);
		registerpage.typelastName(lname);
	}
	@When("enter valid user {string} and {string}")
	public void enter_valid_user_and1(String mobNo, String uname) {
		registerpage.typephone(mobNo);
		registerpage.typeuserName(uname);
		
	}


}
