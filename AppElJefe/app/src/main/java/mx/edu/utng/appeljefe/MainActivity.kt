package mx.edu.utng.appeljefe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgSalir.setOnClickListener {
            finish()
        }
        btnIntal.setOnClickListener {
            var inicia= Intent(this, Instal::class.java)
            startActivity(inicia)
            finish()
        }
        btncrear.setOnClickListener {
            var inicia= Intent(this, Crear::class.java)
            startActivity(inicia)
            finish()
        }
        btnEjemplo.setOnClickListener {
            var inicia= Intent(this, Ejemplo::class.java)
            startActivity(inicia)
            finish()
        }
        btnCreditos.setOnClickListener {
            var inicia= Intent(this, Creditos::class.java)
            startActivity(inicia)
            finish()
        }

    }
}
