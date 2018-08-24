package api.framework;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//import org.apache.commons.lang.ArrayUtils;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class ApiDataProvider {
	//how to use in test
//	@Test(dataProvider = "createCFTopUPPercentageDODP",priority=0)
	
	/*
	@DataProvider
	public Object[][] createCFTopUPPercentageDODP(ITestContext testContext) throws IOException, InterruptedException {
		String categoryManager = "kk_cm@kk.com";
		String discountFundingType = "EOSS";
		String styleId = getOneStyleID();
		String categoryFundedTD = String.format("%.2f", (double) randomNumber());
		String vendorFundedTD = String.format("%.2f", (double) randomNumber());

		Object[] arr1 = { startTime, endTime, categoryManager, discountFundingType, styleId, categoryFundedTD,
				vendorFundedTD,false };
		Object[] arr2 = { startTime, endTime, categoryManager, discountFundingType, styleId, categoryFundedTD,
				vendorFundedTD,true };
		Object[][] dataSet = new Object[][] { arr1,arr2 };
		return Toolbox.returnReducedDataSet(dataSet, testContext.getIncludedGroups(), 2, 2);

	}
	*/
	
}
