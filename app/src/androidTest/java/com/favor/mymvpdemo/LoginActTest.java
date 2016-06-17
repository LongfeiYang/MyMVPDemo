package com.favor.mymvpdemo;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Longfei Yang on 2016/6/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginActTest {

    @Rule
    public ActivityTestRule<LoginAct> activityTestRule
            = new ActivityTestRule<>(LoginAct.class);

    @Test
    public void testInputName(){
        inputName();
    }

    @Test
    public void testLogin(){
        inputName();
        onView(withId(R.id.btn_login_submit))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .perform(click());
        onView(withId(R.id.tv_main_name))
                .check(matches(isDisplayed()))
                .check(matches(withText("admin")));
    }

    /**
     * 输入用户名
     */
    public void inputName(){
        onView(withId(R.id.et_login_name))
                .check(matches(isDisplayed()))
                .perform(typeText("admin"));
    }

}
