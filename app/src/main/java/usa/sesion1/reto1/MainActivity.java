package usa.sesion1.reto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imgCassoulet;
    private ImageView imgGraten;
    private ImageView imgRatatouille;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgCassoulet = (ImageView) findViewById(R.id.imgCassoulet);
        imgGraten = (ImageView) findViewById(R.id.imgGraten);
        imgRatatouille = (ImageView) findViewById(R.id.imgRatatouille);

        imgCassoulet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cassoulet se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

        imgGraten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Gratén Delfinés se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

        imgRatatouille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ratatouille se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

    }

}