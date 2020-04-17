package kevin.lacressonniere.yusitmontage.controller;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import kevin.lacressonniere.yusitmontage.R;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CameraFragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    protected void onDestroy() {
        Log.d("CamCam-chan", "CameraActivity is Destroyed");
        super.onDestroy();
    }
}
