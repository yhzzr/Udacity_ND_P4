package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

/**
 * Created by Heng on 3/11/16.
 */
public class AndroidTest extends AndroidTestCase {

    public void testFetchTask(){
        new FetchJokeTask().execute(new Pair<Context, String>(getContext(), "Joke"));
    }
}
