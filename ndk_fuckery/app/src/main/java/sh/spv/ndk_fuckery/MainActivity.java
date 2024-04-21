package sh.spv.ndk_fuckery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import sh.spv.ndk_fuckery.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'ndk_fuckery' library on application startup.
    static {
        System.loadLibrary("ndk_fuckery");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;

        fuck_it_up();
    }

    /**
     * A native method that is implemented by the 'ndk_fuckery' native library,
     * which is packaged with this application.
     */
    public native String fuck_it_up();
}