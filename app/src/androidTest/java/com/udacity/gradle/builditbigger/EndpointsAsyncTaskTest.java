package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * EndpointsAsyncTask relies on GCM module backend to be running for successful test
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    private final CountDownLatch latch = new CountDownLatch(1);
    private String mResult;
    private Context mContext = InstrumentationRegistry.getTargetContext();

    @Test
    public void getJokeFromEndPointAsyncTask() throws Throwable {

        new TestAsyncTask().execute(mContext);
        latch.await();
        assertThat(mResult.equals(""), is(false));
    }

    private class TestAsyncTask extends EndpointsAsyncTask {

        @Override
        protected void onPostExecute(String result) {
            mResult = result;
            latch.countDown();
        }
    }
}