package tech.othlo.android.othloeventsample

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object {
        const val PREF_NAME = "settings"
    }

    private lateinit var settings: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        settings = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = settings.getString("text", "DEFAULT!")

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        button.setOnClickListener { _ ->
            val inputText = editText.text.toString()
            textView.text = inputText
            settings.edit()
                .putString("text", inputText)
                .apply()
        }

        val secondButton = findViewById<Button>(R.id.secondButton)
        secondButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", "Yohei Murayama")
            startActivity(intent)
        }
    }
}
