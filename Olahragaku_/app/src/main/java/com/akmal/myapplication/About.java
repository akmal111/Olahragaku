package com.akmal.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageButton ig = findViewById(R.id.imageButton);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToig();
            }

            private void goToig() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/okvnfa/"));

                startActivity(browserIntent);

            }
        });

        ImageButton Email = findViewById(R.id.imageButton2);
        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:akmalfauzi903@gmail.com"));
                startActivity(intent);
            }
        });
    }
}
