package com.mehmetcanyildiz.yakalabeni;

import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void start(View View){

        Intent intent = new Intent(getApplicationContext(),Main2Activity.class) ;

        startActivity(intent) ;
        MainActivity.this.finish();



    }
}
