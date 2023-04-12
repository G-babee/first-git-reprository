//This is the package name of my Kotlin file
package com.example.androidworld

//These are the import lists for my file
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//This is the class name for MainActivity extending AppCompatActivity
class MainActivity : AppCompatActivity() {
    //this is an builtin function onCreate which overrides the activity that was created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //parent function
        setContentView(R.layout.activity_main)//this explain the layout file associated with this activity
    }
}