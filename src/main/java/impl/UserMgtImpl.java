package impl;

import pages.UserMgtPage;
import utils.WebDriverUtils;

public class UserMgtImpl {
    private UserMgtPage page;

    public UserMgtPage getPage() {
        if(page == null){
            page = new UserMgtPage();
        }
        return page;
    }
    public void openLinkInNewWindowAndSwitch(String linkText) {
        switch (linkText) {
            case "Access DB" : getPage().accessDbBtn.click();
            break;
            case "LOGIN" : getPage().loginBtn.click();
            break;
            default : System.out.println("Invalid link text");
        }
        for (String eachWindow : WebDriverUtils.getDriver().getWindowHandles()) {
            if (!eachWindow.equals(WebDriverUtils.getDriver().getWindowHandle())) {
                WebDriverUtils.getDriver().switchTo().window(eachWindow);
            }
        }
    }
}
