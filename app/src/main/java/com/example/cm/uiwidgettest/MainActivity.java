package com.example.cm.uiwidgettest;

import android.app.Activity;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button button;
    private Button button2;
    private EditText editText;
    private ProgressBar progressBar;
    private TextView textView;
    private String i = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.edit_text);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View V){
        switch (V.getId()){
            case R.id.button:
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                break;
            case R.id.button2:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public  void onClick(DialogInterface dialogInterface,int i){
                    }
                });
                dialog.show();
                textView.setText(i);
                String outText = textView.getText().toString();
                int x = Integer.parseInt(outText);
                x = x + 1;
                i = String.valueOf(x);
                break;
            default:
                break;
        }
    }

}

