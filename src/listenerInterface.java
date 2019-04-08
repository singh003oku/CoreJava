import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerInterface implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Start Method");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("onFinish");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("we are here onTestFailure");

	}

}
