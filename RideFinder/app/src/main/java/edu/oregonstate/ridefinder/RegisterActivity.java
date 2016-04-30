package edu.oregonstate.ridefinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.authentication.Constants;
import com.firebase.client.FirebaseError;

import java.util.Map;

/**
 * Created by camtuvo on 4/29/16.
 */
public class RegisterActivity extends AppCompatActivity {

    private static final int REQUEST_REGISTER = 0;

    Firebase firebaseRef = new Firebase(Shortcuts.FIREBASE_URL);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* display register page */
        setContentView(R.layout.activity_register);

        /* Final makes variable unique
         * Must cast type of UI elements */
        final EditText editTextName = (EditText) findViewById(R.id.editTextPersonName);
        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        final Button buttonRegister = (Button) findViewById(R.id.buttonRegister);
    }


}
