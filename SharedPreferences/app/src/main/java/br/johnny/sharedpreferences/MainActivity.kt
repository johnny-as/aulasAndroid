package br.johnny.sharedpreferences

import android.R
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        val sharedPref = MainActivity?. (
            getString(R.string.autofill, Context.MODE_PRIVATE)

        Toast.makeText(applicationContext, "Como vai querido Usuário", Toast.LENGTH_SHORT)

    }
}