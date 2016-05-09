package edu.oregonstate.ridefinder;

/**
 * Created by camtuvo on 4/29/16.
 */

import com.firebase.client.Firebase;

public class RideFinder extends android.app.Application {
    /* Set up android context to work with firebase */
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
