package com.example.rigers.naruto;


import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.io.IOException;

import static android.R.attr.button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

        final MediaPlayer mp = new MediaPlayer();
        Button a = (Button) findViewById(R.id.shikaB);
        Button b = (Button) findViewById(R.id.painB);
        Button c = (Button) findViewById(R.id.itachiB);
        Button d = (Button) findViewById(R.id.kakashiB);

        a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(mp.isPlaying())
                {
                    mp.stop();
                }

                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("shika.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(mp.isPlaying())
                {
                    mp.stop();
                }

                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("pain.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(mp.isPlaying())
                {
                    mp.stop();
                }

                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("senya.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(mp.isPlaying())
                {
                    mp.stop();
                    System.out.print("halt mal an!");
                }

                try {
                    mp.reset();
                    AssetFileDescriptor afd;
                    afd = getAssets().openFd("kakashi.mp3");
                    mp.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                    mp.prepare();
                    mp.start();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }

    public void addListenerOnButton() {

        final Context context = this;

        Button button = (Button) findViewById(R.id.openings);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, OpeningsActivity.class);
                startActivity(intent);

            }

        });

    }

    public void hello() {
        Toast.makeText(this, "Pain's theme", Toast.LENGTH_SHORT).show();
    }
}
