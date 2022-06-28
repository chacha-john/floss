package com.chachaup.floss.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chachaup.floss.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.buttonBread) Button mBread;
    @BindView(R.id.buttonButter) Button mButter;
    @BindView(R.id.buttonCakes) Button mCakes;
    @BindView(R.id.buttonJuice) Button mJuice;
    @BindView(R.id.buttonYoghurt) Button mYoghurt;
    @BindView(R.id.buttonProceedToCheckout) Button mCheckout;
    @BindView(R.id.textViewItemBread) TextView mBreadQuantity;
    @BindView(R.id.textViewItemButter) TextView mButterQuantity;
    @BindView(R.id.textViewItemCakes) TextView mCakesQuantity;
    @BindView(R.id.textViewItemJuice) TextView mJuiceQuantity;
    @BindView(R.id.textViewItemYoghurt) TextView mYoghurtQuantity;
    @BindView(R.id.textViewTotal) TextView mTotalCheckout;

    private Integer mTotal;
    private Integer cBread = 0;
    private Integer cButter = 0;
    private Integer cCakes = 0;
    private Integer cJuice = 0;
    private Integer cYoghurt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBread.setOnClickListener(this);
        mButter.setOnClickListener(this);
        mCakes.setOnClickListener(this);
        mJuice.setOnClickListener(this);
        mYoghurt.setOnClickListener(this);
        mCheckout.setOnClickListener(this);
        mTotal = 0;
    }

    @Override
    public void onClick(View v) {
        if (v == mBread){
            mTotal += 50;
            cBread += 1;
            mBreadQuantity.setText(cBread.toString());
            mTotalCheckout.setText("Total amount: Ksh " + mTotal.toString());

        }
        if (v == mButter){
            mTotal += 80;
            cButter += 1;
            mButterQuantity.setText(cButter.toString());
            mTotalCheckout.setText("Total amount: Ksh " + mTotal.toString());
        }
        if (v == mCakes){
            mTotal += 100;
            cCakes += 1;
            mCakesQuantity.setText(cCakes.toString());
            mTotalCheckout.setText("Total amount: Ksh " + mTotal.toString());
        }
        if (v == mJuice){
            mTotal += 120;
            cJuice += 1;
            mJuiceQuantity.setText(cJuice.toString());
            mTotalCheckout.setText("Total amount: Ksh " + mTotal.toString());
        }
        if (v == mYoghurt){
            mTotal += 70;
            cYoghurt += 1;
            mYoghurtQuantity.setText(cYoghurt.toString());
            mTotalCheckout.setText("Total amount: Ksh " + mTotal.toString());
        }
        if (v == mCheckout){
            Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
            intent.putExtra("total", mTotal);
            intent.putExtra("bread",cBread);
            intent.putExtra("butter",cButter);
            intent.putExtra("cakes",cCakes);
            intent.putExtra("juice",cJuice);
            intent.putExtra("yoghurt",cYoghurt);
            startActivity(intent);
        }
    }
}