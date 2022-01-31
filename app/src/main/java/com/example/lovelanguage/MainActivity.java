package com.example.lovelanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Dialog dialog;
    TextView t_dialog_msg;
    RelativeLayout dialog_background;
    StringsClass stringsClass = new StringsClass();
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_popup);
        t_dialog_msg = dialog.findViewById(R.id.dialog_message);
        dialog_background = dialog.findViewById(R.id.dialog_background);
    }

    public void OpenFamDialog(View view) {
        t_dialog_msg.setText(stringsClass.family_text[r.nextInt(stringsClass.family_text.length)]); //ADD MESSAGE
        dialog_background.setBackgroundResource(R.drawable.cardxxxhdpi);
        dialog.create();
        dialog.show();
    }

    public void openIndivualDialog(View view) {
        t_dialog_msg.setText(stringsClass.individual_text[r.nextInt(stringsClass.individual_text.length)]); //ADD MESSAGE
        dialog_background.setBackgroundResource(R.drawable.indixxxhdpi);
        dialog.create();
        dialog.show();
    }

    public void openCoupleDialog(View view) {
        t_dialog_msg.setText(stringsClass.couple[r.nextInt(stringsClass.couple.length)]); //ADD MESSAGE
        dialog_background.setBackgroundResource(R.drawable.couplexxxhdpi);
        dialog.create();
        dialog.show();
    }

    public void openpandfdialog(View view) {
        t_dialog_msg.setText(stringsClass.Past_future[r.nextInt(stringsClass.Past_future.length)]); //ADD MESSAGE
        dialog_background.setBackgroundResource(R.drawable.card_pastxxxhdpi);
        dialog.create();
        dialog.show();
    }

    public void openSexAndIntimacy(View view) {
        t_dialog_msg.setText(stringsClass.sex_and_intimacy[r.nextInt(stringsClass.sex_and_intimacy.length)]); //ADD MESSAGE

        dialog.create();
        dialog.show();
    }

}