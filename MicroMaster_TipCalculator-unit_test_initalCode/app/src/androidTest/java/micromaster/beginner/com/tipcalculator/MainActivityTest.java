package micromaster.beginner.com.tipcalculator;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Byron on 2/15/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    private static final String BILL_AMOUNT = "100";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tipTotalAmount15percent(){
        onView(withId(R.id.input_billAmount)).perform(typeText(BILL_AMOUNT), closeSoftKeyboard());

        onView(withText("15% Tip")).perform(click());

        String expectedText = "115.0";
        onView(withId(R.id.totalAmount)).check(matches(withText(expectedText)));
    }
}