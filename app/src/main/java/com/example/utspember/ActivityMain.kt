package com.example.utspember

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityMain : AppCompatActivity() {

    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: DataAdapter
    lateinit var listData: ArrayList<StringData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        recycle = findViewById(R.id.idrcycler)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = DataAdapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(StringData("Kevin De Bruyne", "180441100007", "31 Tahun", R.drawable.foto1))
        listData.add(StringData("Sergio Kun Aguer", "160441100043", "34 tahun", R.drawable.foto2))
        listData.add(StringData("Alvaro Negredo", "150441100044", "20 tahun", R.drawable.foto3))
        listData.add(StringData("Lionel Messi", "150441100010", "34 tahun", R.drawable.foto4))
        listData.add(StringData("Mario Gomez", "130441100010", "20 tahun", R.drawable.foto5))
        listData.add(StringData("Erling Haaland", "210441100067", "22 tahun", R.drawable.foto6))
        listData.add(StringData("Yaya Toure", "180441100043", "33 tahun", R.drawable.foto7))
        listData.add(StringData("Ruben Diaz", "200441100014", "24 tahun", R.drawable.foto8))
        listData.add(StringData("Cristiano Ronaldo", "140441100007", "20 tahun", R.drawable.foto9))
        listData.add(StringData("lewandoski", "140441100007", "20 tahun", R.drawable.foto10))
        listData.add(StringData("Mario Gomez", "130441100010", "20 tahun", R.drawable.foto11))
        listData.add(StringData("Erling Haaland", "210441100067", "22 tahun", R.drawable.foto12))
        listData.add(StringData("Yaya Toure", "180441100043", "33 tahun", R.drawable.foto13))
        listData.add(StringData("Ruben Diaz", "200441100014", "24 tahun", R.drawable.foto15))
        listData.add(StringData("Cristiano Ronaldo", "140441100007", "20 tahun", R.drawable.foto16))
        listData.add(StringData("lewandoski", "140441100007", "20 tahun", R.drawable.foto14))
        listData.add(StringData("Lionel Messi", "150441100010", "34 tahun", R.drawable.foto17))
        listData.add(StringData("Mario Gomez", "130441100010", "20 tahun", R.drawable.foto18))
        listData.add(StringData("Erling Haaland", "210441100067", "22 tahun", R.drawable.foto19))
        listData.add(StringData("Yaya Toure", "180441100043", "33 tahun", R.drawable.foto20))

        }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_list -> {
                // Intent untuk membuka aktivitas ListActivity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.action_grid -> {
                // Intent untuk membuka aktivitas GridActivity
                val intent = Intent(this, ActivityMain::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

