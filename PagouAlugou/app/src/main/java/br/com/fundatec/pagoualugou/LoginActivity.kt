package br.com.fundatec.pagoualugou

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val database = FirebaseDatabase.getInstance()
    val usuario = database.getReference("usuario")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Pega a referência de todas as views
        var user_name = findViewById(R.id.user_name) as inputNomeUsuario
        var password = findViewById(R.id.password) as inputSenha
        var user_email = findViewById(R.id.user_email) as inputEmail

        botaoLimpar.setOnClickListener{
            //Limpa os campos nome, email e senha.
            user_name.setText(" ")
            user_email.setText(" ")
            password.setText(" ")
        }

        botaoCadastrar.setOnClickListener{
            val nomeUsuario = user_name.text;
            val senha = password.text;
            val email = user_email.text;

            var usuarioBD = Usuario("????", "????", "????")
            usuario.setValue(usuarioBD)

            Toast.makeText(this@LoginActivity, nomeUsuario, Toast.LENGTH_LONG).show()
        }
    }
}
