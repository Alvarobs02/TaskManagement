package com.taskManagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.taskManagement.model.TaskModel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<TaskModel> taskList;
    private final String USER_AGENT = "Mozilla/5.0";
    private final String GET_URL = "http://localhost:8080";
    private final String ENDPOINT = "/task/email/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.listView_task);

        ArrayAdapter<TaskModel> adapter = new ArrayAdapter<TaskModel>(this, android.R.layout.activity_list_item, taskList);

        listView.setAdapter(adapter);

        String email = getIntent().getStringExtra("messageEmail");

        try {
            URL url = new URL(GET_URL + ENDPOINT + email);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", USER_AGENT);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}