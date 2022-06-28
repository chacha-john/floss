package com.chachaup.floss.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.chachaup.floss.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ThankYouActivity extends AppCompatActivity {
    @BindView(R.id.textViewTY)
    TextView mTY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        ButterKnife.bind(this);
    }
}