package com.example.earosb.chaticcc

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.login_layout.*
import java.util.*

class LoginActivity : AppCompatActivity() ,View.OnClickListener, TextWatcher {

    private var user : EditText? = null
    private var name : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        user = findViewById(R.id.et_user)
        user!!.addTextChangedListener(this)
        user!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
        }

    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btn_login -> {
                if (et_user.text.toString() == "Jorge" && et_pass.text.toString() == "12") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    Toast.makeText(this,  R.string.welcome , Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "Nombre de usuario y/o contraseña incorrecto(s) ", Toast.LENGTH_LONG).show()
                }
            }
            R.id.btnRegistro -> {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Ventana de registro",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    override fun afterTextChanged(p0: Editable?) {
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        name = et_user?.text.toString()
        if (name?.equals("") ?: ("" === null)) {
            user!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
        }else{
            user!!.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_NORMAL

        }
    }



}





