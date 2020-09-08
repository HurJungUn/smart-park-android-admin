package smartpark.com.admin.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import smartpark.com.admin.R;

public class SignInActivity extends AppCompatActivity {

    EditText inputPhoneNumber;
    Button btnSmartPark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();
    }

    public void init() {
        inputPhoneNumber = (EditText) findViewById(R.id.inputPhoneNumber);
        btnSmartPark = (Button) findViewById(R.id.btnSmartPark);

        inputPhoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (inputPhoneNumber.getText().toString().replaceAll(" ","").equals("")) {
                    btnSmartPark.setBackgroundResource(R.drawable.xml_button_selector_smartpark);
                } else {
                    btnSmartPark.setBackgroundResource(R.drawable.xml_button_selector_smartpark_select);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnSmartPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}