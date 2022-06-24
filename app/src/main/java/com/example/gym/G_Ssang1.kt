package com.example.gym

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.g_ssang1.*

class G_Ssang1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.g_ssang1)

        val G_img = intent.getIntExtra("G_img",0)
        val G_title = intent.getStringExtra("G_title")
        val G_name = intent.getStringExtra("G_name")
        val G_script = intent.getStringExtra("G_script")
        val G_phone = intent.getStringExtra("G_phone")

        g_img.setImageResource(G_img)
        g_title.setText("$G_title")
        g_name.setText("$G_name")
        g_script.setText("$G_script")

        g_btn.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$G_phone"))
            startActivity(intent)
        }
    }
}
