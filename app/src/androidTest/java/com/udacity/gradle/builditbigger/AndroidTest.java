package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import java.util.concurrent.TimeUnit;

/**
 * Created by Heng on 3/11/16.
 */
public class AndroidTest extends AndroidTestCase {

    public void testFetchTask(){
        try {
            FetchJokeTask jokeTask = new FetchJokeTask();
            jokeTask.execute(new Pair<Context, String>(getContext(), "Joke"));
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e){
            fail("Timed out");
        }
    }
}
