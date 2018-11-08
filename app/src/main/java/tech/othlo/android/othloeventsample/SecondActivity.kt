package tech.othlo.android.othloeventsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val name: String? = intent.getStringExtra("name")

        nameTextView.text = name
    }
}
