package co.unipiloto.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SintomasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);

        Button btnEnviarReporte = findViewById(R.id.btnEnviarReporte);
        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        ImageView rightIcon2 = findViewById(R.id.right_icon_2);
        leftIcon.setVisibility(View.VISIBLE);
        rightIcon.setVisibility(View.GONE);
        rightIcon2.setVisibility(View.GONE);
        TextView title = findViewById(R.id.title);

        title.setText("Sintomas de la Mascota");

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(SintomasActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnEnviarReporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(SintomasActivity.this, "Reporte enviado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SintomasActivity.this, MainActivity.class);
                startActivity(intent);
           }
        });

    }

}