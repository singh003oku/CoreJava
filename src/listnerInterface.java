package Demopkg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IListenersAnnotation;
import org.testng.internal.annotations.IListeners;

public class listnerInterface implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("On Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("On Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On test Fail");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("On Test failed");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("On Finish");
	}

}
