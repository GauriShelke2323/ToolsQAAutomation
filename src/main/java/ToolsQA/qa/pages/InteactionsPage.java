package ToolsQA.qa.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteactionsPage {
	 public WebDriver driver;
	
	public InteactionsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Interactions']")
	WebElement interactionsTab;
	
	@FindBy(xpath="//span[text()='Sortable']")
	WebElement sortableTab;
	
	@FindBy(xpath="//h1[text()='Sortable']")
	WebElement sortableHeaderText;
	
	@FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='One']")
	WebElement listOne;
	
	@FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Two']")
	WebElement listTwo;
	
	@FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Three']")
	WebElement listThree;
	
	@FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Four']")
	WebElement listFour;
	
	@FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Five']")
	WebElement listFive;
	
	@FindBy(xpath="//div[@id='demo-tabpane-list']//div[text()='Six']")
	WebElement listSix;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='One']")
	WebElement gridOne;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Two']")
	WebElement gridTwo;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Three']")
	WebElement gridThree;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Four']")
	WebElement gridFour;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Five']")
	WebElement gridFive;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Six']")
	WebElement gridSix;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Seven']")
	WebElement gridSeven;
	
	@FindBy(xpath="//div[@id='demo-tabpane-grid']//div[text()='Nine']")
	WebElement gridNine;
	
	@FindBy(xpath="//a[@id='demo-tab-grid']")
	WebElement grid;
	
	@FindBy(xpath="//span[text()='Selectable']")
	WebElement selectableTab;
	
	@FindBy(xpath="//h1[text()='Selectable']")
	WebElement selectableHeaderText;
	
	@FindBy(xpath="//ul[@id='verticalListContainer']")
	List<WebElement> multiSelectElements;
	
	@FindBy(xpath="//a[@id='demo-tab-grid']")
	WebElement elementsGrid;
	
	@FindBy(xpath="//div[@id='gridContainer']")
	WebElement multiSelectElementsGrid;
	
	@FindBy(xpath="//span[text()='Resizable']")
	WebElement resizableTab;
	
	@FindBy(xpath="//div[@id='resizableBoxWithRestriction']")
	WebElement resizableBox1;
	
	@FindBy(xpath="//div[@id='resizable']")
	WebElement resizableBox2;
	
	@FindBy(xpath="//span[text()='Droppable']")
	WebElement droppableTab;
	
	@FindBy(xpath="//h1[text()='Droppable']")
	WebElement droppableHeaderText;
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement draggableBox;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement droppableBox;
	
	@FindBy(xpath="//p[text()='Dropped!']")
	WebElement droppedText;
	
	@FindBy(xpath="//a[@id='droppableExample-tab-accept']")
	WebElement acceptTab;
	
	@FindBy(xpath="//div[@id='acceptable']")
	WebElement acceptable;
	
	@FindBy(xpath="//div[@id='notAcceptable']")
	WebElement nonAcceptable;
	
	@FindBy(xpath="//p[text()='Drop here']")
	WebElement dropHereText;
	
	@FindBy(xpath="//a[text()='Prevent Propogation']")
	WebElement preventPropagation;
	
	@FindBy(xpath="//div[@id='notGreedyInnerDropBox']")
	WebElement innerDropbox;
	
	@FindBy(xpath="//div[@id='notGreedyDropBox']")
	WebElement  outerDropBox;
	
	@FindBy(xpath="//div[@id='dragBox']")
	WebElement dragBox;
	
	public void clickOnInteractionsTab() {
		interactionsTab.click();
	}
	
	public void clickOnSortableTab() {
		sortableTab.click();
	}
	
	public String checkSortableHeaderText() {
		String str= sortableHeaderText.getText();
		return str;
	}
	
	public void switchListElements() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
		Actions action=new Actions(driver);
		//wait.until(ExpectedConditions.elementToBeSelected(listOne));
		//wait.until(ExpectedConditions.elementToBeSelected(listTwo));
		action.dragAndDrop(listOne, listTwo).perform();
		//wait.until(ExpectedConditions.elementToBeSelected(listThree));
		//wait.until(ExpectedConditions.elementToBeSelected(listFour));
		//Thread.sleep(3000)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		action.dragAndDrop(listThree, listFour).perform();
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeSelected(listFive));
		//wait.until(ExpectedConditions.elementToBeSelected(listSix));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		action.dragAndDrop(listFive, listSix).perform();
	}
	
	public void clickOnGrid() {
		grid.click();
	}
	
	public void switchGridElements() throws InterruptedException {
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(gridOne, gridTwo).perform();
		Thread.sleep(3000);
		action.dragAndDrop(gridThree, gridFour).perform();
		Thread.sleep(3000);
		action.dragAndDrop(gridFive, gridSix).perform();
		Thread.sleep(3000);
		action.dragAndDrop(gridSeven, gridNine).perform();
	}
	
	public void clickOnSelectableTab() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",selectableTab);
		selectableTab.click();
	}
	
	public String checkSelectableHeaderText() {
		String str= selectableHeaderText.getText();
		return str;
	}
	
	public void selectMultipleElementsList() throws InterruptedException {
		//Select multiSelect= new Select(multiSelectElements);
		//multiSelect.selectByVisibleText("Cras justo odio");
		//multiSelect.selectByVisibleText("Dapibus ac facilisis in");
		List<WebElement> multiSelect=driver.findElements(By.xpath("//ul[@id='verticalListContainer']"));
		for(WebElement element : multiSelect) {
			System.out.println("!!!!!!!!!@@@@@@@@Elements"+element.getText());
			//Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		}
	}
	
	public void clickOnSelectableGrid() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementsGrid);
		elementsGrid.click();
	}
	
	public void selectMultipleElementsGrid() {
		List<WebElement> multiSelect=driver.findElements(By.xpath("//div[@id='gridContainer']"));
		for(WebElement element : multiSelect) {
			System.out.println("!!!!!!!!!@@@@@@@@Elements"+element.getText());
			//Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		}
	}
	
	public void clickOnResizableTab() {
		resizableTab.click();
	}
	
	public void resizeBox1() {
		// resizableBox1;
		 ((JavascriptExecutor) driver).executeScript("arguments[0].style.width='200px';arguments[0].style.height='300px';", resizableBox1);
	}
	
	public void resizeBox2() {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.width='200px';arguments[0].style.height='300px';", resizableBox2);
	}
	
	public void clickOnDroppableTab() {
		droppableTab.click();
	}
	
	public String checkDroppableHeaderText() {
		String str= droppableHeaderText.getText();
		return str;
	}
	
	public void dragAndDropBox() {
		Actions action = new Actions(driver);
		action.dragAndDrop(draggableBox, droppableBox).release().perform();
		//action.clickAndHold(draggableBox).moveToElement(droppableBox).release(draggableBox).build();
	}
	
	public String checkDroppedText() {
		String str=droppedText.getText();
		return str;
	}
	
	public void clickOnAcceptTab() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",acceptTab);
		acceptTab.click();
	}
	
	public void dragAndDropAcceptable() throws InterruptedException {
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",acceptable);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",droppableBox);
		Actions action = new Actions(driver);
		action.dragAndDrop(acceptable,droppableBox).release().perform();
	}
	
	public String checkDropHereText() {
		String str=dropHereText.getText();
		return str;
	}
	
	public void dragAndDropNonAcceptable() {
		Actions action = new Actions(driver);
		action.dragAndDrop(nonAcceptable,droppableBox).release().perform();
	}
	
	public void clickOnPreventPropagation() {
		preventPropagation.click();
	}
	
	public void dragAndDropInnerDropBox() {
		Actions action = new Actions(driver);
		action.dragAndDrop(dragBox,innerDropbox).release().perform();
	}
}
