package mx.edu.tesoem.tsdmh_252_hml_7s21_p1e3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {

    Button btnp2, btnp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnp2 = findViewById(R.id.btnp2);
        btnp3 = findViewById(R.id.btnp3);

        btnp3.setOnClickListener(v -> {

            Intent intent = new Intent(this, TerceraActivity.class);
            startActivity(intent);

        });

    }

    public void vp2(View v) {
        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);


    }
}