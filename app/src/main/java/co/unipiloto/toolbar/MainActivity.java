package co.unipiloto.toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private EditText etNombre;
    private EditText etRaza;
    private EditText etDescripcion;
    private EditText etEdad;
    private RadioGroup rgSexo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.et_nombre);
        etRaza = findViewById(R.id.et_raza);
        etDescripcion = findViewById(R.id.et_descripcion);
        etEdad = findViewById(R.id.et_edad);
        rgSexo = findViewById(R.id.rg_sexo);

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        ImageView rightIcon2 = findViewById(R.id.right_icon_2);
        leftIcon.setVisibility(View.GONE);
        rightIcon.setVisibility(View.VISIBLE);
        rightIcon2.setVisibility(View.VISIBLE);
        TextView title = findViewById(R.id.title);

        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, EventoActivity.class);
                startActivity(intent);
            }
        });

        rightIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SintomasActivity.class);
                startActivity(intent);
            }
        });


        title.setText("Registro Mascota");


    }


    public void RegistrarMascota(View view) {
        String nombre = etNombre.getText().toString().trim();
        String raza = etRaza.getText().toString().trim();
        String descripcion = etDescripcion.getText().toString().trim();

        String edadStr = etEdad.getText().toString().trim();
        if (edadStr.isEmpty()) {
            Toast.makeText(this, "Por favor, ingresa la edad de la mascota", Toast.LENGTH_SHORT).show();
            return;
        }
        int edad = Integer.parseInt(edadStr);

        int sexoId = rgSexo.getCheckedRadioButtonId();
        if (sexoId == -1) {
            Toast.makeText(this, "Por favor, selecciona el sexo de la mascota", Toast.LENGTH_SHORT).show();
            return;
        }
        String sexoString = (sexoId == R.id.rb_macho) ? "M" : "F";

        SharedPreferences sharedPreferences = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        int idUsuario = sharedPreferences.getInt("idUsuario", -1);

        if (idUsuario == -1) {
            Toast.makeText(this, "Debes iniciar sesión primero", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}