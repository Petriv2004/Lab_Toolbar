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

public class EventoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        ImageView rightIcon2 = findViewById(R.id.right_icon_2);
        Button btnGuardarAgenda = findViewById(R.id.guardarAgenda);
        rightIcon.setVisibility(View.GONE);
        leftIcon.setVisibility(View.VISIBLE);
        rightIcon2.setVisibility(View.GONE);
        TextView title = findViewById(R.id.title);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(EventoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnGuardarAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EventoActivity.this, "Evento guardado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EventoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

       title.setText("Evento");

    }
}