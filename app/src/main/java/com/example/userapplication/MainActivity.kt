package com.example.userapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.userapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvamountsdisplay.layoutManager = LinearLayoutManager(this)
        amountDisplay()


    }
    fun amountDisplay(){
        val wallet1 =User_list ("sallary", "40,000", "1st july 2022")
        val wallet2 =User_list ("sallary", "80,000", "2st july 2022")
        val wallet3 =User_list ("sallary", "5,000", "1st august 2022")
        val wallet4 =User_list ("sallary", "15,000", "1st september 2022")
        val wallet5 =User_list ("sallary", "17,000", "1st december 2022")
        val wallet6 =User_list ("sallary", "30,000", "1st January 2022")
        val wallet7 =User_list ("sallary", "15,000", "1st september 2022")
        val wallet8 =User_list ("sallary", "15,000", "1st september 2022")
        val wallet9 =User_list ("sallary", "15,000", "1st september 2022")
        val wallet10 =User_list ("sallary", "15,000", "1st september 2022")
        val wallet11 =User_list ("sallary", "15,000", "1st september 2022")
        val wallet12 =User_list ("sallary", "15,000", "1st september 2022")








        val mywallet = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8,wallet10,wallet11,wallet12)
        val mywalletadapter = Adapter(mywallet)
        binding.rvamountsdisplay.adapter = mywalletadapter



    }
}