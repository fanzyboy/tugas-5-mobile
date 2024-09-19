package com.login.tugas5mobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pdiskon : AppCompatActivity() {

    private lateinit var inpt : EditText
    private lateinit var btn : Button
    private lateinit var hsl : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pdiskon)

        inpt = findViewById(R.id.input)
        btn = findViewById(R.id.btn)
        hsl = findViewById(R.id.hasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        btn.setOnClickListener() {
            val nilai = inpt.text.toString().toInt()

            if (nilai >=0 && nilai <100000) {
                hsl.setText("kamu tidak mendapatan diskon, maka total belanja"+nilai)
            }
            else if (nilai >= 100000 && nilai < 500000) {
                val ttl = nilai - (nilai * 0.1)
                hsl.setText("kamu mendapatkan diskon 10%, maka total belanja = " + ttl)
            }
            else if (nilai >= 500000 && nilai <= 1000000) {
                val ttl = nilai - (nilai * 0.2)
                hsl.setText("kamu mendapatkan diskon 20%, maka total belanja = " + ttl)
            }
            else {
                val ttl = nilai - (nilai * 0.3)
                hsl.setText("kamu mendapatkan diskon 30%,maka total belanja = " + ttl)
            }
        }

    }
}