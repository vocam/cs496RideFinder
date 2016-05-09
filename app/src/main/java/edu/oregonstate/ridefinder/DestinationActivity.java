package edu.oregonstate.ridefinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import com.firebase.client.Firebase;
import android.widget.TextView;
import android.widget.ListView;
/**
 * Created by camtuvo on 5/3/16.
 */
public class DestinationActivity extends AppCompatActivity {

    /* Create a reference to the database */
    Firebase firebaseRef = new Firebase(Shortcuts.FIREBASE_URL + "Location");

    // UI
    ListView listViewDestination = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* display login page */
        setContentView(R.layout.destination);


    }
}
