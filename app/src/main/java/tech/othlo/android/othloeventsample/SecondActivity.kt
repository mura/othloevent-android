package tech.othlo.android.othloeventsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val months = listOf("1月","2月","3月","4月","5月","6月",
            "7月","8月","9月","10月","11月","12月")
        //val months = (1..12).map { "${it}月" }
        //val months = (2004..2018).flatMap { y -> (1..12).map { m -> "${y}年${m}月"} }
        recyclerView.adapter = MonthRecyclerViewAdapter(months)
    }
}
