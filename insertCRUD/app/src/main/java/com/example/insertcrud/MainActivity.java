package com.example.insertcrud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2,tid;
    TextView lbl, dataholder;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tid = findViewById(R.id.tid);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        lbl = findViewById(R.id.lbl);
        //dataholder = findViewById(R.id.dataholder);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String c1,c2,c3;
                c1 = tid.getText()+"";
                c2 = t1.getText()+"";
                c3 = t2.getText()+"";
                if (!(TextUtils.isEmpty(c1) && TextUtils.isEmpty(c2) && TextUtils.isEmpty(c3))){

                    AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                            AppDatabase.class, "room_db").allowMainThreadQueries().build();
                    UserDao userDao = db.userDao();
                    //Check if ID exist already in database, Boolean check and query from UserDao.java is there written.
                    Boolean check = userDao.is_exist(Integer.parseInt(tid.getText().toString()));
                    if (check == false) {
                        userDao.insertRecord(new User(Integer.parseInt(tid.getText().toString()), t1.getText().toString(), t2.getText().toString()));
                        tid.setText("");
                        t1.setText("");
                        t2.setText("");
                        tid.onEditorAction(EditorInfo.IME_ACTION_DONE);
                        t1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                        t2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                        //lbl.setText(" Data with id: " +tid.getText().toString() +" inserted");
                        Toast.makeText(MainActivity.this, "Data inserted", Toast.LENGTH_LONG).show();

                    } else {
                        //tid.setText("");
                        t1.setText("");
                        t2.setText("");
                        tid.onEditorAction(EditorInfo.IME_ACTION_DONE);
                        t1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                        t2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                        Toast.makeText(MainActivity.this, "Data with this ID exist already", Toast.LENGTH_LONG).show();
                        //lbl.setText("Already exist");
                    }


                }
                else {
                    tid.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    t1.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    t2.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    Toast.makeText(MainActivity.this, "Empty fields are not allowed", Toast.LENGTH_LONG).show();

                    }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),fetchdata.class));




//                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
//                        AppDatabase.class, "room_db").allowMainThreadQueries().build();
//                UserDao userDao = db.userDao();
//                List<User> users = userDao.getallusers();
//                String str = "";
//                for (User user : users)
//                    str = str +"\t   "+user.getUid()+" "+user.getFirstName()+" "+user.getLastName()+"\n\n";
//
//                dataholder.setText(str);

            }
        });

    }
}