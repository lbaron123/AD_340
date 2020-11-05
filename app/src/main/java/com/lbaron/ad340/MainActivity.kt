package com.lbaron.ad340

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


// : = extends meaning inherits from AppCompatActivity
class MainActivity : AppCompatActivity() {
    //eg below we are overriding the onCreate method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // this method makes the view. We are passing a LAYOUT file into contentView
        //R = resources
        //layout - layout resource
        //could be eg string = string resourse or color resource, then the NAME of it in purple
        setContentView(R.layout.activity_main)
    }
}