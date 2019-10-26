package mx.edu.utng.appeljefe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_creditos.*
import kotlinx.android.synthetic.main.activity_instal.*

class Creditos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creditos)
        imgbtn.setOnClickListener {
            var inicia= Intent(this, MainActivity::class.java)
            startActivity(inicia)
            finish()
        }
    }
}
