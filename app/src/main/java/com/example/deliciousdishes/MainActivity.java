package com.example.deliciousdishes;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Parse.addParseNetworkInterceptor(new ParseLogInterceptor());

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("94BU2R4X6LNrs0jB6aQApdu82BMK2cPzDDOqZzxh\n")
                .server("")
                .clientKey("")
                .build()
        );
        Log.i("ME", "DONE onCreate");

        ParseObject testObject = new ParseObject("SomeObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                Log.v("MAIN", "PARSE ERROR:" + e);
            }
        });

    }
}

 */