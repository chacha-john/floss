package com.chachaup.floss.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chachaup.floss.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CheckoutActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.textViewGrand) TextView mGrandTotal;
    @BindView(R.id.textViewDiscount) TextView mDiscount;
    @BindView(R.id.textViewNet) TextView mNetTotal;
    @BindView(R.id.textViewBreadTotal) TextView mBreadTotalTV;
    @BindView(R.id.textViewButterTotal) TextView mButterTotalTV;
    @BindView(R.id.textViewJuiceTotal) TextView mJuiceTotalTV;
    @BindView(R.id.textViewCakeTotal) TextView mCakeTotalTV;
    @BindView(R.id.textViewYoghurtTotal) TextView mYoghurtTotalTV;
    @BindView(R.id.textViewItemBreadTotal) TextView mBreadTotal;
    @BindView(R.id.textViewItemButterTotal) TextView mButterTotal;
    @BindView(R.id.textViewItemJuiceTotal) TextView mJuiceTotal;
    @BindView(R.id.textViewItemCakesTotal) TextView mCakeTotal;
    @BindView(R.id.textViewItemYoghurtTotal) TextView mYoghurtTotal;

    @BindView(R.id.buttonCheckout) Button mCheckout;

    private Double discount;
    private Double netTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        int mTotal = intent.getIntExtra("total",0);
        mGrandTotal.setText("Grand total: Ksh " + mTotal);
        int bread = intent.getIntExtra("bread",0);
        mBreadTotal.setText(""+bread);
        mBreadTotalTV.setText("Ksh "+ 50*bread);
        int butter = intent.getIntExtra("butter",0);
        mButterTotal.setText(""+ butter);
        mButterTotalTV.setText("Ksh "+ 80*butter);
        int cakes = intent.getIntExtra("cakes",0);
        mCakeTotal.setText(""+ cakes);
        mCakeTotalTV.setText("Ksh "+ 100*cakes);
        int juice = intent.getIntExtra("juice",0);
        mJuiceTotal.setText(""+ juice);
        mJuiceTotalTV.setText("Ksh "+ 120*juice);
        int yoghurt = intent.getIntExtra("yoghurt",0);
        mYoghurtTotal.setText(""+ yoghurt);
        mYoghurtTotalTV.setText("Ksh "+ 70*yoghurt);

        discount = 0.15 * mTotal;
        mDiscount.setText("Discount: Ksh " + discount);

        netTotal = mTotal - discount;
        mNetTotal.setText("Net total: Ksh " + netTotal);

        mCheckout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mCheckout){
            Intent intent = new Intent(CheckoutActivity.this, ThankYouActivity.class);
            startActivity(intent);
        }
    }
}