package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import android.net.Uri
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        super.onCreate(savedInstanceState, persistentState)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item1 ->{

            }

            R.id.item2->{

            }

            R.id.contact ->{

            }

            R.id.dail ->{
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:6204854219"))
                startActivity(intent)
            }

            R.id.call ->{
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:6204854219"))
                startActivity(intent)


            }

            R.id.email->{


            }

            R.id.web->{



            }
        }




        return super.onOptionsItemSelected(item)
    }

    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weightEditText = findViewById(R.id.weight_edit_text)
        heightEditText = findViewById(R.id.height_edit_text)
        calculateButton = findViewById(R.id.calculate_button)
        resultTextView = findViewById(R.id.result_text_view)

        calculateButton.setOnClickListener {
            calculateBMI()
        }
}

    private fun calculateBMI() {
        val weight = weightEditText.text.toString().toFloat()
        val height = heightEditText.text.toString().toFloat() / 100 // convert cm to m
        val bmi = weight / (height * height)
        resultTextView.text = "Your BMI is: %.2f".format(bmi)
    }
}



