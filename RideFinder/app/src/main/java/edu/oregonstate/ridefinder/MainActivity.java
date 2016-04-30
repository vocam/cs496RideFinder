package edu.oregonstate.ridefinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.authentication.Constants;
import com.firebase.client.FirebaseError;

public class MainActivity extends AppCompatActivity {

    /* Create a reference to the database */
    Firebase firebaseRef = new Firebase(Shortcuts.FIREBASE_URL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* display login page */
        setContentView(R.layout.activity_main);

        /* Must initialize all UI elements on login page */
        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        final Button buttonRegister = (Button) findViewById(R.id.buttonLogin);
        final TextView registerLink = (TextView) findViewById(R.id.textViewRegister);

/* NOTE: This part still needs fixing to authenticate users in Firebase
        Authentication with email & password using Firebase and handle errors
        firebaseRef.authWithPassword(editTextEmail.toString(), editTextPassword.toString(), new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) { //Successful login }
            @Override
            public void onAuthenticationError(FirebaseError error) {
                // Something went wrong go through different cases
                switch (error.getCode()) {
                    case FirebaseError.USER_DOES_NOT_EXIST:
                        System.out.println("Invalid email");
                        // handle a non existing user
                        break;
                    case FirebaseError.INVALID_PASSWORD:
                        System.out.println("Invalid password");
                        // handle an invalid password
                        break;
                    default:
                        // handle other errors
                        break;
                }
            }

        }); */

        /* Set up a listener for when user select "Register Here" textView */
        registerLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /* Create an intent to open a new page
                 * Pass in current page and destination
                 */
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                /* Tells he current activity to perform the intent */
                MainActivity.this.startActivity(registerIntent);

            }
        });
    }

}
