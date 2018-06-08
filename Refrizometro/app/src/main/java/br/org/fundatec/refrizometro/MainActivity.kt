package br.org.fundatec.refrizometro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botaoCalcular.setOnClickListener { calcular() }
    }

    private fun calcular() {
        val valor : Double? = inputValor.text.toString().toDoubleOrNull();
        val mls : Double? = inputMLS.text.toString().toDoubleOrNull();

        if(valor != null && mls != null){
            val valorPorLitro : Double = valor / mls * 1000;
            mensagem.text = valorPorLitro.toString() + " por litro"
        }else{
            if(valor == null) inputValor.error = "Preencha um valor"
            if(mls == null) inputMLS.error = "Preencha o mls"
            //Toast.makeText( this, "Preemcha os valores", Toast.LENGTH_LONG).show()
        }
    }
}
