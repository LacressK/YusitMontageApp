package kevin.lacressonniere.yusitmontage.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import kevin.lacressonniere.yusitmontage.R;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Click(R.id.activity_main_splashscreen_imageButton)
    public void navigateToMenu() {
        Intent intent = new Intent(MainActivity.this, MenuActivity_.class);
        startActivity(intent);
    }

}
