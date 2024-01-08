package com.o7.bunblepassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.io.println as println1

class DetailsActivity : AppCompatActivity() {
    var nametv : TextView? = null
    var age : TextView? = null
    var address : TextView? = null
    var roll : TextView? = null
    var doublev : TextView? = null
    var floatval : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        nametv = findViewById(R.id.tvName)
        age = findViewById(R.id.tvAge)
        address = findViewById(R.id.tvAddress)
        roll = findViewById(R.id.tvRollNum)
        doublev = findViewById(R.id.tvDouble)
        floatval = findViewById(R.id.tvFloat)

        var getName = intent.getStringExtra("name").toString()
        var getAge = intent.getIntExtra("age",0).toString()
        var getAddress = intent.getStringExtra("address").toString()
        var getRollNum = intent.getStringExtra("roll").toString()
        var getDouble = intent.getDoubleExtra("double",0.0).toString()
        var getFloat = intent.getFloatExtra("float",0.00000F).toString()

        nametv?.setText("$getName")
        age?.setText("$getAge")
        address?.setText("$getAddress")
        roll?.setText("$getRollNum")
        doublev?.setText("$getDouble")
        floatval?.setText("$getFloat")


    }
}