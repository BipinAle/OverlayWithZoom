package com.circulardraw;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import uk.co.senab.photoview.PhotoView;

public class MainActivity extends AppCompatActivity {
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeLayoutSquare();
        photoView = (PhotoView) findViewById(R.id.iv_photo);
        Picasso.with(this)
                .load(R.mipmap.ic_launcher)
                .into(photoView);

    }

    public void makeLayoutSquare() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, width);
        findViewById(R.id.relativeImage).setLayoutParams(params);
    }


}