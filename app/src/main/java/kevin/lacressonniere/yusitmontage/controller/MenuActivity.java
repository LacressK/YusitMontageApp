package kevin.lacressonniere.yusitmontage.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import kevin.lacressonniere.yusitmontage.R;

@EActivity(R.layout.activity_menu)
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Click(R.id.activity_menu_mediation1_imageButton)
    public void navigateToMediation1() {
        Intent intent = new Intent(MenuActivity.this, Mediation1Activity_.class);
        startActivity(intent);
    }

    @Click(R.id.activity_menu_insert1_imageButton)
    public void navigateToInsert1() {
        Intent intent = new Intent(MenuActivity.this, Insert1Activity_.class);
        startActivity(intent);
    }
}
