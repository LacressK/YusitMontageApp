package kevin.lacressonniere.yusitmontage.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import kevin.lacressonniere.yusitmontage.R;

@EActivity(R.layout.activity_insert1)
public class Insert1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Click(R.id.activity_insert1_position1_imageButton)
    public void navigateToCamera() {
        Intent intent = new Intent(Insert1Activity.this, CameraActivity.class);
        startActivity(intent);
    }
}
