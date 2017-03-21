package com.example.rigers.naruto;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class OpeningsActivity extends Activity {
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        private MediaPlayer mp = new MediaPlayer();

        @Override
        public void onClick(View v) {

            if (mp.isPlaying()) {
                mp.stop();
            }

            try {
                mp.reset();
                AssetFileDescriptor afd = null;

                switch (v.getId()) {
                    case R.id.shOp1:
                        afd = getAssets().openFd("shOp1.mp3");
                        break;
                    case R.id.shOp2:
                        afd = getAssets().openFd("shOp2.mp3");
                        break;
                    case R.id.shOp3:
                        afd = getAssets().openFd("shOp3.mp3");
                        break;
                    case R.id.shOp4:
                        afd = getAssets().openFd("shOp4.mp3");
                        break;
                    case R.id.shOp5:
                        afd = getAssets().openFd("shOp5.mp3");
                        break;
                    case R.id.shOp6:
                        afd = getAssets().openFd("shOp6.mp3");
                        break;
                    case R.id.shOp7:
                        afd = getAssets().openFd("shOp7.mp3");
                        break;
                    case R.id.shOp8:
                        afd = getAssets().openFd("shOp8.mp3");
                        break;
                    case R.id.shOp9:
                        afd = getAssets().openFd("shOp9.mp3");
                        break;
                    case R.id.shOp10:
                        afd = getAssets().openFd("shOp10.mp3");
                        break;
                    case R.id.shOp11:
                        afd = getAssets().openFd("shOp11.mp3");
                        break;
                    case R.id.shOp12:
                        afd = getAssets().openFd("shOp12.mp3");
                        break;
                    case R.id.shOp13:
                        afd = getAssets().openFd("shOp13.mp3");
                        break;
                    case R.id.shOp14:
                        afd = getAssets().openFd("shOp14.mp3");
                        break;
                    case R.id.shOp15:
                        afd = getAssets().openFd("shOp15.mp3");
                        break;
                    case R.id.shOp16:
                        afd = getAssets().openFd("shOp16.mp3");
                        break;
                    case R.id.shOp17:
                        afd = getAssets().openFd("shOp17.mp3");
                        break;
                    case R.id.shOp18:
                        afd = getAssets().openFd("shOp18.mp3");
                        break;
                    case R.id.shOp19:
                        afd = getAssets().openFd("shOp19.mp3");
                        break;
                    case R.id.shOp20:
                        afd = getAssets().openFd("shOp20.mp3");
                        break;
                }
                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mp.prepare();
                mp.start();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    // private MediaPlayer mp = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openings_layout);

        //mp = new MediaPlayer();

        findViewById(R.id.shOp1).setOnClickListener(onClickListener);
        findViewById(R.id.shOp2).setOnClickListener(onClickListener);
        findViewById(R.id.shOp3).setOnClickListener(onClickListener);
        findViewById(R.id.shOp4).setOnClickListener(onClickListener);
        findViewById(R.id.shOp5).setOnClickListener(onClickListener);
        findViewById(R.id.shOp6).setOnClickListener(onClickListener);
        findViewById(R.id.shOp7).setOnClickListener(onClickListener);
        findViewById(R.id.shOp8).setOnClickListener(onClickListener);
        findViewById(R.id.shOp9).setOnClickListener(onClickListener);
        findViewById(R.id.shOp10).setOnClickListener(onClickListener);
        findViewById(R.id.shOp11).setOnClickListener(onClickListener);
        findViewById(R.id.shOp12).setOnClickListener(onClickListener);
        findViewById(R.id.shOp13).setOnClickListener(onClickListener);
        findViewById(R.id.shOp14).setOnClickListener(onClickListener);
        findViewById(R.id.shOp15).setOnClickListener(onClickListener);
        findViewById(R.id.shOp16).setOnClickListener(onClickListener);
        findViewById(R.id.shOp17).setOnClickListener(onClickListener);
        findViewById(R.id.shOp18).setOnClickListener(onClickListener);
        findViewById(R.id.shOp19).setOnClickListener(onClickListener);
        findViewById(R.id.shOp20).setOnClickListener(onClickListener);
    }
}