package com.example.dzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // property kosong sementara dan kegunaan lateinit untuk agar dia bisa mengizinkan sebuah property atau sebuah variabel
    private lateinit var llsunnahQauliyahShalat: LinearLayout
    private lateinit var lldzikirSetiapSaat: LinearLayout
    private lateinit var lldzikirDoaHarian: LinearLayout
    private lateinit var lldzikirPagiPetang: LinearLayout // Property berisi view kosong dan dipanggil di dalam function

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // R disini adalah dia bersingkatan dari rsource dan untuk memakainya kita harus membuat ID baru di xml viewnya
        llsunnahQauliyahShalat = findViewById(R.id.ll_sunnah_qauliyah)
        lldzikirSetiapSaat = findViewById(R.id.ll_dzikir_setiap_saat)
        lldzikirDoaHarian = findViewById(R.id.ll_dzikir_doa_harian)
        lldzikirPagiPetang = findViewById(R.id.ll_dzikir_pagi_petang)

        llsunnahQauliyahShalat.setOnClickListener(this) // this membutuhkan sebuah interface
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.ll_sunnah_qauliyah) {
            startActivity(
                Intent(
                    this,
                    QauliyahShalatActivity::class.java // Setiap ada activity dia harus ada ::class.java
                )
            )
        } else if (view?.id == R.id.ll_dzikir_setiap_saat) {
            startActivity(
                Intent(
                    this, SetiapSaatDzikirActivity::class.java
                )
            )
        } else if (view?.id == R.id.ll_dzikir_doa_harian) {
            startActivity(
                Intent(
                    this, HarianDzikirDoaActivity::class.java
                )
            )
        } else if (view?.id == R.id.ll_dzikir_pagi_petang) {
            startActivity(
                Intent(
                    this, PagiPetangDzikirActivity::class.java
                )
            )
        } else {

        }


    }
}