package elementActions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class Validate
        extends BasePage {


    public Validate(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isElementPresent(By by) {
        try {
            getElement(by).getText();
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isElementPresent(By by, int index) {
        try {
            ((WebElement) getAllElements(by).get(index)).getText();
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textEquals(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textEquals(By by, int index, String expectedValue) {
        isElementPresent(by, index);
        try {
            String actualValue = ((WebElement) getAllElements(by).get(index)).getText();
            Assert.assertEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotEquals(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertNotEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotEquals(By by, int index, String expectedValue) {
        isElementPresent(by, index);
        try {
            String actualValue = ((WebElement) getAllElements(by).get(index)).getText();
            Assert.assertNotEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textContains(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertTrue(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textContains(By by, int index, String expectedValue) {
        isElementPresent(by, index);
        try {
            String actualValue = ((WebElement) getAllElements(by).get(index)).getText();
            Assert.assertTrue(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotContains(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertFalse(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotContains(By by, int index, String expectedValue) {
        isElementPresent(by, index);
        try {
            String actualValue = ((WebElement) getAllElements(by).get(index)).getText();
            Assert.assertFalse(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textEquals(String expectedValue, String actualValue) {
        try {
            Assert.assertEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textEquals(int expectedValue, int actualValue) {
        try {
            Assert.assertEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotEquals(String expectedValue, String actualValue) {
        try {
            Assert.assertNotEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotEquals(int expectedValue, int actualValue) {
        try {
            Assert.assertNotEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textContains(String expectedValue, String actualValue) {
        try {
            Assert.assertTrue(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean textNotContains(String expectedValue, String actualValue) {
        try {
            Assert.assertFalse(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isChecked(By by) {
        try {
            getElement(by).isSelected();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isChecked(By by, int index) {
        try {
            ((WebElement) getAllElements(by).get(index)).isSelected();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isNotChecked(By by) {
        try {
            if (!getElement(by).isSelected()) {
                return false;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean isNotChecked(By by, int index) {
        try {
            if (!((WebElement) getAllElements(by).get(index)).isSelected()) {
                return false;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean elementSize(By by, int expectedElementSize) {
        try {
            int countElementSize = getAllElements(by).size();
            Assert.assertEquals(expectedElementSize, countElementSize);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isAlertPresent() {
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (Exception e) {
        }
        return false;
    }
}