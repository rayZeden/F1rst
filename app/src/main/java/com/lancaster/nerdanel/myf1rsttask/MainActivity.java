package com.lancaster.nerdanel.myf1rsttask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mInputText;
    private Button mShowButton;

    private View.OnClickListener mOnShowButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String tmpInpText = mInputText.getText().toString();
            if (!(tmpInpText.isEmpty())) {
                showMessage(tmpInpText);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInputText = findViewById(R.id.inputText);
        mShowButton = findViewById(R.id.showButton);
        mShowButton.setOnClickListener(mOnShowButtonClickListener);
    }

    private void showMessage(String message)    {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
