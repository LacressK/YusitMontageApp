package kevin.lacressonniere.yusitmontage.controller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import java.io.File;

import kevin.lacressonniere.yusitmontage.R;

@EActivity(R.layout.activity_insert1)
public class Insert1Activity extends AppCompatActivity {

    public static final int REQUEST_CODE = 101;
    public static final int RESULT_CODE = 102;
    public static final File EXTRA_CAPTURE_IMAGE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Click(R.id.activity_insert1_position1_imageButton)
    public void navigateToCamera() {
        Intent cameraActivity = new Intent(Insert1Activity.this, CameraActivity.class);
        startActivityForResult(cameraActivity, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_CODE) {
            //TODO...
        }
    }
}
