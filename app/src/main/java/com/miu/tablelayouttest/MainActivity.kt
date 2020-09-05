package com.miu.tablelayouttest

import android.graphics.Color
import android.graphics.Color.rgb
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Space
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view:View){



        //creating objects
        // var tableview = tableviews
        val tablerow= TableRow(getApplicationContext())
        //styling table row
        tablerow.setBackgroundColor(Color.rgb(0, 0, 0))
        val layoutParamsrow= TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
        layoutParamsrow.setMargins(0,0,0,2)

        val layoutParamstv2= TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT)
        val layoutParams= TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(0,2,0,2)
        layoutParamstv2.setMargins(0,2,2,2)
        //tablerow.setLayoutParams(layoutParamsrow)


        //styling TextView

        val Textview1 = TextView(this)
        val Textview2 = TextView(this)

        Textview1.setBackgroundColor(Color.rgb(253, 61, 126))
        Textview2.setBackgroundColor(Color.rgb(253, 61, 126))

        Textview1.setTextColor(Color.rgb(0,0,0))
        Textview2.setTextColor(Color.rgb(0,0,0))

        Textview1.layoutParams=layoutParamstv2
        Textview2.layoutParams=layoutParams

        Textview1.setTextSize(14f)
        Textview2.setTextSize(14f)


        //Textview1.setLayoutParams(layoutParams)
        //Textview2.setLayoutParams(layoutParams);



        //setting text on text View
        Textview1.setText(et1.text.toString())
        Textview2.setText(et2.text.toString())

        //adding text view on the table row

        tablerow.addView(Textview1,0)
        tablerow.addView(Textview2,1)

        var space= Space(this)
        space.minimumHeight=3


        tableviews.addView(tablerow)
        tableviews.addView(space)



    }
}