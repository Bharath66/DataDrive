package org.test.task;

import java.io.IOException;


public class Sample extends Base{
	public static void main(String[] args) throws IOException {
		driver = getDriver();
		loadUrl("https://www.facebook.com/");
		LoginPage page = new LoginPage();
		type(page.getTxtUserName(), getData(0, 0));
		type(page.getTxtPwd(), getData(0, 2));
		btnClick(page.getLoginBtn());
		quitBrowser();
		
	}

}
