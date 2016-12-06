package ru.samsung.itschool.game18;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class StartActivity extends Activity implements Toaster{


    private AlertDialog.Builder ad;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void choiceType(View v) {

        context = StartActivity.this;
        String title = getString(R.string.type);
        String[] types = getResources().getStringArray(R.array.types);

        ad = new AlertDialog.Builder(this);
        ad.setTitle(title);
        ad.setItems(types, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("type", item);
                startActivity(intent);
                finish();
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                showToast(getString(R.string.notype));
            }
        });
        ad.show();

    }
    @Override
    public void showToast(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, LONG);
        toast.setGravity(BOTTOM, 0, 0);
        toast.show();
    }
}
