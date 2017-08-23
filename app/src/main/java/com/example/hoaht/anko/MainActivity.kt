package com.example.hoaht.anko

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.makeCall
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHello.setOnClickListener {
            makeCall("01649791091")
            toast("click here")
        }

        countsTouch()
        1.also {

        }

        tvHello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

            }

        })

        var aa: AA = AA()
        aa.setInterface(object : MainFragment.BB {
            override fun abc(i: Int) {

            }

        })

        aaaa { i, s ->
            i
        }

        (0..10).filterIndexed { _, _ -> false }


        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {

            }

        })
    }

    private val TAG = MainActivity::class.java.name

    fun countsTouch() {
        var count = 0
        viewPager.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                count++
                return false
            }
        })
    }

    fun aaaa(body: (Int, String) -> Int) {
        print("aaaaaaaaaaaaaaa: $body")
        AAAA.abc()
        AAAA1.abc()
    }

    companion object AAAA : B {
        fun abc() {

        }

        override fun xyz() {
            super.xyz()
        }
    }

    object AAAA1 {
        fun abc() {

        }
    }
}
