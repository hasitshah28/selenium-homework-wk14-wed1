package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "job search")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow, Greater London","5 miles","30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow"},
                {"Automation Tester","Liverpool","35 miles","30000", "60000", "Per annum", "Permanent", "Permanent Automation Tester jobs in Liverpool"},
                {"Test Analyst","Manchester","50 miles","40000","75000","Per annum","Permanent","Permanent Test Analyst jobs in Manchester"},
                {"Test Engineer","Merseyside","25 miles","30000","65000","Per annum","Permanent","Permanent Test Engineer jobs in Merseyside"},
                {"Automation Engineer","Birmingham","50 miles","30000","55000","Per annum","Permanent","Permanent Automation Engineer jobs in Birmingham"},
                {"Test Analyst","Manchester","50 miles","40000","75000","Per annum","Permanent","Permanent Test Analyst jobs in Manchester"},
                {"Test Development Engineer","Cheshire","35 miles","30000","55000","Per annum","Permanent","Permanent Test Development Engineer jobs in Cheshire"},


        };
        return data;
    }
}
