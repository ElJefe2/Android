package mx.edu.utng.appeljefe

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ejemplo.*
import kotlinx.android.synthetic.main.activity_instal.*

class Ejemplo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo)

        val preferencias = getSharedPreferences("agenda",
            Context.MODE_PRIVATE)
        btnGrabar.setOnClickListener {
            val editor= preferencias.edit()
            editor.putString(etxNombre.text.toString(),
                etxDatos.text.toString())
            editor.commit()

            Toast.makeText(this,"Datos grabados !!!",
                Toast.LENGTH_LONG).show()
            etxNombre.setText("")
            etxDatos.setText("")

        }

        btnRecuperar.setOnClickListener {
            val datos = preferencias.getString(etxNombre.text.toString(),"")
            if(datos.length==0){
                Toast.makeText(this,"No existe dicho " + "nombre en la agenda",
                    Toast.LENGTH_LONG).show()
            }else{
                etxDatos.setText(datos)
            }
        }
        imgRe.setOnClickListener {
            var inicia= Intent(this, MainActivity::class.java)
            startActivity(inicia)
            finish()
        }
    }
}
