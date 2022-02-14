package com.example.rifkauas
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class HalamanUtama : AppCompatActivity() {

    private lateinit var container : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanutama)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://foto.kontan.co.id/WEBb9JxzPIjtWuAnp5E3tjFbMXY=/smart/2021/10/22/1478200116p.jpg","Makanan & Minuman"))
        imageList.add(SlideModel("https://foto.kontan.co.id/drsUB9KdoHEVVzGoyLl_uiCcK4g=/smart/2020/12/14/1927274394p.jpg","Rumah & Dapur"))
        imageList.add(SlideModel("https://images.tokopedia.net/img/cache/700/VqbcmM/2021/3/13/9065d42a-4a0c-47e5-ba2c-b4d28877067a.png","Ibu & Anak"))
        imageList.add(SlideModel("https://cdn1.productnation.co/stg/sites/5/5fa3ae8c46591.jpeg","Kesehatan & Kecantikan"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        setSupportActionBar(findViewById(R.id.toolbar))
        container = findViewById(R.id.container)
        container.setOnClickListener {
            val intent = Intent(this, PindahActivity::class.java)
            startActivity(intent)
        }
    }
}