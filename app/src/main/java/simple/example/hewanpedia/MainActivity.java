package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Intent pindah;
    ImageButton btnUlar,btnIkan,btnBurung,tombol;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    @SuppressLint("WrongViewCast")
    private void inisialisasiView() {
        btnUlar = findViewById(R.id.btn_buka_ras_Ular);
        btnIkan = findViewById(R.id.btn_buka_ras_Ikan);
        btnBurung = findViewById(R.id.btn_buka_ras_Burung);
        tombol = (ImageButton) findViewById(R.id.btn_buka_profile);
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
        btnBurung.setOnClickListener(view -> bukaGaleri("Burung"));
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pindah);
            }
        });
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}