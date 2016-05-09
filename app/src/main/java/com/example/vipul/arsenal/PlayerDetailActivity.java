package com.example.vipul.arsenal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class PlayerDetailActivity extends ActionBarActivity
{
    int var;
    TextView playerName;
    ImageView playerPhoto;
    TextView playerDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        playerName = (TextView) findViewById(R.id.playerNameTextView);
        playerPhoto = (ImageView) findViewById(R.id.playerPhotoImageView);
        playerDescription = (TextView) findViewById(R.id.playerDescriptionTextView);

        Bundle playerBundle = null;
        playerBundle = this.getIntent().getExtras();
        String value1 = playerBundle.getString("value1");
        int value2 = playerBundle.getInt("value2");
        String value3 = playerBundle.getString("value3");

        playerName.setText(value1);
        playerPhoto.setImageResource(value2);
        playerDescription.setText(value3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_player_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.info)
        {
            Intent intent = new Intent(this, ArsenalInfoActivity.class);
            startActivity(intent);
        }
        else if(id==R.id.uninstall)
        {
            Intent uninstallIntent = new Intent(Intent.ACTION_DELETE);
            uninstallIntent.setData(Uri.parse("package:" + "com.example.vipul.arsenal"));
            startActivity(uninstallIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}