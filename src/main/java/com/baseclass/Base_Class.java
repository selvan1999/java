package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable;

public abstract class Base_Class {

	public static WebDriver driver;

	
	public static File file;

	protected static WebDriver launchBrowser(String browserName) {
		try {

			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("firfox")) {
				driver = new FirefoxDriver();
			}
			 else if (browserName.equalsIgnoreCase("edge")) {
					driver = new EdgeDriver();
				}

		} catch (Exception e) {
			Assert.fail("Erro: occur during browser launch");
		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("Erro: occur during launched the url");
		}
	}

	protected static  WebElement passInput(WebElement element, String input) {

		try {
			element.sendKeys(input);
		} catch (Exception e) {
			Assert.fail("Erro: occur during passing the input");
		}
		return element;
	}

	protected static void navigatePage(String url) {
		try {
			driver.navigate().to(url);

		} catch (Exception e) {
			Assert.fail("Erro: occur during navigated to the browser");
		}
	}

	protected static void terminateBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail("Erro: occur during quit the browser");
		}
	}

	protected static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			Assert.fail("Erro: occur during closed the browser");
		}
	}

	protected static void navigatePageforward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			Assert.fail("Erro: occur during forwarded");

		}
	}

	protected static void navigatePageBackward() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			Assert.fail("Erro: occur during navigate backward direction");
		}
	}

	protected static void refrespage() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			Assert.fail("Erro: occur during refresh the page");
		}
	}

	protected static Alert switchingtoalert() {

		Alert alert = driver.switchTo().alert();
		return alert;
	}

	protected static Actions callAction() {

		Actions action = new Actions(driver);
		return action;
	}

	protected static void dragAnddorpelement(WebElement element_1, WebElement element_2) {
		try {
			callAction().dragAndDrop(element_1, element_2);
		} catch (Exception e) {
			Assert.fail("Erro: occur during done the drag and drop operation");

		}
	}

	protected static void rightClick(WebElement element) {
		try {
			callAction().contextClick().perform();
		} catch (Exception e) {
			Assert.fail("Erro: occur during right operation done");
		}
	}

	protected static void hoverToElement(WebElement element) {
		try {
			callAction().moveToElement(element).perform();
		} catch (Exception e) {
			Assert.fail("Erro: occur during hover too the element");
		}
	}

	protected static void clickTwice() {
		try {
			callAction().doubleClick().perform();
		} catch (Exception e) {
			Assert.fail("Erro: occur during double click operation done");
		}
	}

	protected static void switchingFreambyindex(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			Assert.fail("Erro: occur during switch to the fream by index");
		}
	}

	protected static void switchingFreambyidorName(String id_or_name) {
		try {
			driver.switchTo().frame(id_or_name);
		} catch (Exception e) {
			Assert.fail("Erro: occur during switch to the fream by id or name");
		}
	}

	protected static void switching_FreamBy_element(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			Assert.fail("Erro: occur during switch to the fream by element");
		}
	}

	protected static void clickCheckBox_or_Radiobutton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			Assert.fail("Erro: occur during clicked the CheckBox_or_Radiobutton");
		}
	}

	protected static boolean verifytheElement_DisplayOrnot(WebElement element) {

		boolean display = element.isDisplayed();
		return display;

	}

	protected static boolean verifytheElement_EnabledOrnot(WebElement element) {
		boolean enable = element.isEnabled();
		return enable;
	}

	protected static boolean verifytheElement_selectedOrnot(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	protected static Select dropdownObject(WebElement element) {
		Select select = new Select(element);
		return select;
	}

	protected static void selectViaindex(WebElement element, int index) {
		try {
			dropdownObject(element).selectByIndex(index);
		} catch (Exception e) {
			Assert.fail("Erro: occur during drop down select through the index");
		}
	}

	protected static void selectViavalue(WebElement element, String value) {
		try {
			dropdownObject(element).selectByValue(value);
		} catch (Exception e) {
			Assert.fail("Erro: occur during drop down select through the value");
		}
	}
    protected static void selectViavisble_text(WebElement element,String text) {
    	try {
    		dropdownObject(element).selectByVisibleText(text);
     }catch(Exception e) {
     	Assert.fail("Erro: occur during drop down select through the value");
	
   }
}
    protected static void clearValue (WebElement element) {
     element.clear();
    }
    protected static void click_the_element(WebElement element) {
     element.click();
    
    }
    protected static void implicitWait(int seconds) {
    	try {
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    	} catch(Exception e) {
         	Assert.fail("The element is not visible as pre your required time");
        	
       }
    }
    protected static void getScreen(String filename) throws IOException {
    	TakesScreenshot sh= (TakesScreenshot)driver;
    	
    File sch = sh.getScreenshotAs(OutputType.FILE);

    File des = new File("C:\\Users\\stami\\eclipse-workspace\\Greens\\src\\test\\java\\com\\runner\\Screenshot\\Screen.png");

    FileHandler.copy(sch, des);
    }
     protected static void validation(String actual,String excepected) {
    	 try {
    		 Assert.assertEquals(actual, excepected);
    	 }catch (Exception e) {
    		 Assert.fail("Erro: occur during validation"); 
    	 }
     }
    	
    }
    
     
    
    
    
    
    
  
    
    
    
    
   
    
