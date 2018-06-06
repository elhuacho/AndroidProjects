package pe.com.mobileconsulting.viewcontrollers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import pe.com.mobileconsulting.R;
import pe.com.mobileconsulting.viewcontrollers.entities.Service;
import pe.com.mobileconsulting.viewcontrollers.entities.ServiceCollection;

public class IconActivity extends AppCompatActivity {
    TextView nameTextView;
    TextView descriptionTextView;
    TextView brandTextView;
    ImageView pictureImageView;
 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        brandTextView = (TextView) findViewById(R.id.brandTextView);
        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        ServiceCollection serviceCollection = new ServiceCollection(this);
        Service service = serviceCollection.getService().get(getIntent().getExtras().getInt("currentPosition"));
        nameTextView.setText(service.getName());
        descriptionTextView.setText(service.getDescription());
        brandTextView.setText(service.getBrand());
        pictureImageView.setImageResource(service.getPictureId());

    }

}
