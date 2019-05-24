package com.example.fedor.joke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick (View view){
        Intent intent =new Intent(this,DelayedMassageService.class);
        intent.putExtra(DelayedMassageService.EXTRA_MASSAGE,
                getResources().getString(R.string.responce));
        startService(intent);

    }
}
