package kevin.lacressonniere.yusitmontage.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import kevin.lacressonniere.yusitmontage.R;

@EActivity(R.layout.activity_mediation1)
public class Mediation1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Click(R.id.activity_mediation1_back_button_imageButton)
    public void backToPrevious() {
        finish();
    }
}
