package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JunitPage1 {


	WebDriver driver;
	String addListItem="Junit";
	String enteredList;
	//Element Library
//	WebElement TOGGLE_ALL = driver.findElement(By.xpath("/html/body/div[3]/input[3]"));

/*Test 1: Validate when the toggle all check box is CHECKED, all check boxes for 
	list items are also CHECKED ON.*/
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")	WebElement TOGGLE_ALL;
	/*Test 2: Validate that a single list item could be removed 
	using the remove button when a single checkbox is selected.*/
			
	@FindBy(how= How.XPATH, using = "//input[@name=\"data\"]" )	WebElement CLICK_LIST_BOX;
	@FindBy(how= How.XPATH, using = "//input[@value=\"Add\"]" )	WebElement ADD_ITEM_LIST;
//	@FindBy(how= How.XPATH, using = "li[style='font-size: 16px" )List<WebElement> CLICK_SINGLE_LIST;
	@FindBy(how= How.XPATH, using = "//input[@name=\"todo[5]\"]" )	WebElement CLICK_SINGLE_LISTS;
	@FindBy(how= How.XPATH, using = "//input[@name=\"submit\" ][@value=\"Remove\"]" )	WebElement REMOVE_SINGLE_LIST;
	@FindBy(how = How.XPATH,using = "//div[@id='todos-content']/child::*[@action='todo.php']/child::*[@style][@style]/child::*[1]/child::*[@name]") WebElement single_list_selected;
	
	

	
	public void clickonToggleAll() {
		TOGGLE_ALL.click();
	
	}
	
	
	public int randomNumber(int No) {
		Random rnd= new Random();
		int rndNo = rnd.nextInt(No);
		return rndNo;
		
	}
	
	public String getListName() {
		
		return enteredList;
	} 
	
	
	public void addListItem(String CategoryName) throws Exception {
		enteredList= addListItem + randomNumber(999);
		CLICK_LIST_BOX.sendKeys(enteredList);
		ADD_ITEM_LIST.click();
		Thread.sleep(2000);
//		CLICK_LIST_BOX.sendKeys(enteredList);
//		ADD_ITEM_LIST.click();
		
	}
	
	
	public void clickonSingleListNremove() {
		single_list_selected.click();
		
	}
	
		public void removeList() {
			REMOVE_SINGLE_LIST.click();
			
			System.out.println("List are/is deleted");
			}
	

	
	
	
	
		
	
	
}