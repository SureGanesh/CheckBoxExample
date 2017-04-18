package com.example.kvana.checkboxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;
import static com.example.kvana.checkboxexample.R.id.btn_done;
import static com.example.kvana.checkboxexample.R.id.final_result;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_text = (TextView) findViewById(final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.fruit_apple:
                if (checked) {
                    selection.add("apple");
                } else {
                    selection.remove("apple");
                }
                break;
            case R.id.fruit_orange:
                if (checked) {
                    selection.add("orange");
                } else {
                    selection.remove("orange");
                }
                break;
            case R.id.fruit_mango:
                if (checked) {
                    selection.add("mango");
                } else {
                    selection.remove("mango");
                }
                break;
        }
    }

    public void finalSelection(View view) {
        String final_fruit_selection = "";
        for (String Selections : selection) {
            final_fruit_selection = final_fruit_selection + Selections + "\n";
            final_text.setText(final_fruit_selection);
            final_text.setEnabled(true);
        }
    }
}

