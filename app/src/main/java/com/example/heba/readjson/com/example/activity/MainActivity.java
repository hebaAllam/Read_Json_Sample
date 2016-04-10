package com.example.heba.readjson.com.example.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.heba.readjson.R;
import com.example.heba.readjson.com.example.helper.Utils;
import com.example.heba.readjson.com.example.pojo.Employee;
import com.google.gson.Gson;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    EditText jsonTxt;
    Button readBtn;
    Utils myUtil;
    Employee emp;
    String gsonTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindComponents();
        intializeVariables();
        setListeners();
    }

    private void intializeVariables() {
        myUtil = new Utils();
        emp = new Employee();
        gsonTxt = jsonTxt.getText().toString();
    }

    private void setListeners() {
        readBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int itemID = v.getId();

        if(itemID == R.id.mainActivity_btnRead){
            parseJSON();
            String h = emp.toString();
            myUtil.showToast(h,getApplicationContext());
        }
    }

    private void parseJSON(){
        Gson gson = new Gson();
//        gsonTxt = "{\"fName\" : \"Heba\",\"lName\" : \"Allam\",\"num\" : \"2\"}";
        emp = gson.fromJson(gsonTxt,Employee.class);
        Log.i("0000000...." , emp.getfName());
    }

    private void bindComponents() {
        readBtn = (Button)findViewById(R.id.mainActivity_btnRead);
        jsonTxt = (EditText)findViewById(R.id.mainActivity_editTxt);
        jsonTxt.setText("{\"fName\" : \"Heba\",\"lName\" : \"Allam\",\"num\" : \"2\"}");
//        emp = new Employee();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
