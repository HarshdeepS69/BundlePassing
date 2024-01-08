package com.o7.bunblepassing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var name :EditText? = null
    var age : EditText? = null
    var rollNum :EditText? = null
    var address :EditText? = null
    var button : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.etName)
        age = findViewById(R.id.etAge)
        rollNum = findViewById(R.id.etRollNumber)
        address = findViewById(R.id.etAddress)
        button = findViewById(R.id.btnSubmit)

        button?.setOnClickListener() {
            if (name?.text.toString().isEmpty()) {
                name?.error = "Enter Name"
            } else if (age?.text.toString().isEmpty()) {
                age?.error = "Enter Age"
            } else if (rollNum?.text.toString().isEmpty()) {
                rollNum?.error = "Enter Roll Number"
            } else if (address?.text.toString().isEmpty()) {
                address?.error = "Enter Address"
            }
            else{
                var intent = Intent(this,DetailsActivity::class.java)
                intent.putExtra("name",name?.text.toString())
                intent.putExtra("age",age?.text.toString().toInt())
                intent.putExtra("address","${address?.text.toString()}")
                intent.putExtra("roll","${rollNum?.text.toString()}")


                var doubleVal :Double = 23.33
                var floatVal :Float = 12.2323F
                intent.putExtra("double",doubleVal)
                intent.putExtra("float",floatVal)

                startActivity(intent)

            }
        }

    }
}