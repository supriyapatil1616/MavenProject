package FailedTC;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerExample implements IRetryAnalyzer {
    private static int maxRetryCount=3;
    private static int retryCount=0;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount< maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
