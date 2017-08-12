package com.quangnguyen.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.quangnguyen.manga.doraemon.Doraemon;
import com.quangnguyen.manga.doraemon.Nobita;

public class MainActivity extends AppCompatActivity {

  private Doraemon doraemon;
  private Nobita nobita;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Our cute characters
    doraemon = new Doraemon();
    nobita = new Nobita();

    // initialize views
    populateViews();
  }

  private void populateViews() {
    ImageView doraemonImage = findViewById(R.id.image_doraemon);
    ImageView nobitaImage = findViewById(R.id.image_nobita);

    // Set images
    doraemonImage.setBackgroundResource(doraemon.getImage());
    nobitaImage.setBackgroundResource(nobita.getImage());
  }

  public void onClick(View v) {
    String name = "";
    if (v.getId() == R.id.image_doraemon) {
      name = doraemon.getName();
    } else if (v.getId() == R.id.image_nobita) {
      name = nobita.getName();
    }
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
  }
}
