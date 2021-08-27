package ua.sergeylevchenko.a31_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), Fragment1.OnSelectedButtonListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onButtonSelected(buttonIndex: Int) {
        // подключаем FragmentManager
        val fragmentManager = supportFragmentManager

        // Получаем ссылку на второй фрагмент по ID
        val fragment2 = fragmentManager.findFragmentById(R.id.fragment2) as Fragment2?
        fragment2?.setDescription(buttonIndex)
    }

}



