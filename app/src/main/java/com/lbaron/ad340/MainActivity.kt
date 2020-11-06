package com.lbaron.ad340

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


// : = extends meaning inherits from AppCompatActivity
class MainActivity : AppCompatActivity() {

    // region Setup Methods

    //eg below we are overriding the onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // this method makes the view. We are passing a LAYOUT file into contentView
        //R = resources
        //layout - layout resource
        //could be eg string = string resourse or color resource, then the NAME of it in purple
        setContentView(R.layout.activity_main)

        val zipcodeEditText: EditText = findViewById(R.id.zipcodeEditText)
        val enterButton: Button = findViewById(R.id.enterButton)

        enterButton.setOnClickListener {
            //this - refers to this activity(main)
            //stores the text of user input to a string called zipcode
            val zipcode: String = zipcodeEditText.text.toString()

            if(zipcode.length != 5){
                Toast.makeText(this, R.string.zipcode_entry_error, Toast.LENGTH_SHORT).show()
            } else{
                // Toast gives quick feedback to users
                Toast.makeText(this, zipcode, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
    // endregion Setup Methods
    // region Teardown Methods
    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    // endregion Teardown Methods
}