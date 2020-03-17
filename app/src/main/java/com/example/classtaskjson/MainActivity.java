package com.example.classtaskjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car myCar=new Car("Toyota Corolla",2018);

        Gson myGson=new Gson();
        String responseJson=myGson.toJson(myGson);

        String myJson="{\"nameOfCar\":\"Toyota Corolla\",\"modelOfCar\":2018}";
        MyJsonClass myJsonClass=myGson.fromJson(myJson,MyJsonClass.class);

        Toast.makeText(this, myJsonClass.getName(), Toast.LENGTH_SHORT).show();

    }
}
