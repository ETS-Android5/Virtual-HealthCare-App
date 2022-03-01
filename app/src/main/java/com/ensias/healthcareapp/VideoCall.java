package com.ensias.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class VideoCall extends AppCompatActivity {

    EditText id_room;
    Button btn_join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_call);

        id_room = findViewById(R.id.id_room);
        btn_join = findViewById(R.id.btn_join);

        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (id_room.getText().toString().isEmpty()){
                    Toast.makeText(VideoCall.this,"Please Enter Room ID", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()
                                .setServerURL(new URL("https://meet.jit.si"))
                                .setRoom(id_room.getText().toString())
                                .setAudioMuted(false)
                                .setVideoMuted(false)
                                .setAudioOnly(false)
                                .setWelcomePageEnabled(false)
                                .setConfigOverride("requireDisplayName", true)
                                .build();

                        JitsiMeetActivity.launch(VideoCall.this,options);

                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }
}