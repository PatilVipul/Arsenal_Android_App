package com.example.vipul.arsenal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;


public class ArsenalInfoActivity extends ActionBarActivity implements View.OnClickListener
{
    Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsenal_info);

        callButton = (Button) findViewById(R.id.button);
        callButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_arsenal_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id==R.id.uninstall)
        {
            Intent uninstallIntent = new Intent(Intent.ACTION_DELETE);
            uninstallIntent.setData(Uri.parse("package:" + "com.example.vipul.arsenal"));
            startActivity(uninstallIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v)
    {
        String myData = "tel:98765-43210";
        Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(myData));
        startActivity(callIntent);
    }
}