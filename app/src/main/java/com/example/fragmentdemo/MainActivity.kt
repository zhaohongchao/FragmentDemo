package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {


    private var str: Array<String> = arrayOf("1","2","3")
    private var f1 = Fragment1()
    private var f2 = Fragment2()
    private var f3 = Fragment3()
    private var f4 = Fragment4()

    private var listf = arrayListOf<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab1.setupWithViewPager(vp1)

        init()









    }

    private fun init() {
        listf.add(f1)
        listf.add(f2)
        listf.add(f3)
        listf.add(f4)
    }
}
