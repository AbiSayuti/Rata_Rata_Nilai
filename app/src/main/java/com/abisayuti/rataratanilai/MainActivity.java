package com.abisayuti.rataratanilai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNilaiIng, etNilaiIndo, etNilaikomp, etnilaiMtk;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilaiIndo = (EditText)findViewById(R.id.etNilaiBIndo);
        etNilaiIng = (EditText)findViewById(R.id.etNilaiBInggris);
        etnilaiMtk = (EditText)findViewById(R.id.etNilaiMTK);
        etNilaikomp = (EditText)findViewById(R.id.etNilaiMTK);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView) findViewById(R.id.txthasil);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String nIndo = etNilaiIndo.getText().toString();
                String nIngs = etNilaiIng.getText().toString();
                String nMtk = etnilaiMtk.getText().toString();
                String nKomp = etNilaikomp.getText().toString();


                if(nIndo.isEmpty() || nIngs.isEmpty() || nKomp.isEmpty() || nMtk.isEmpty()){
                    //memberikan Warning berupa error
                    etNilaiIndo.setError("Nilai tidak boleh kosong");


                }else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    int aIndo = Integer.parseInt(nIndo);
                    int aIngs = Integer.parseInt(nIngs);
                    int aMtk = Integer.parseInt(nMtk);
                    int aKomp = Integer.parseInt(nKomp);



                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasil = (aIndo + aIngs + aMtk + aKomp) / 4 ;
                    int total = aIndo + aIngs + aMtk + aKomp;


                    //menampilkan hasil hitung ke widget textview

                    txtHasil.setText("Rata Rata nilai anda adalah " + hasil + " dengan total " + total);
                }
            }
        });
    }
}