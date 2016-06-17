package com.favor.mymvpdemo;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Longfei Yang on 2016/6/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActTest {

    @Rule
    public ActivityTestRule<MainAct> activityTestRule
            = new ActivityTestRule<>(MainAct.class);

    @Test
    public void testNameDisplay(){
        onView(withId(R.id.tv_main_name))
                .check(matches(isDisplayed()));
    }

}
