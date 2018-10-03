package com.kotlin.application.firstproject

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs = this.getSharedPreferences("com.kotlin.application.firstproject", Context.MODE_PRIVATE)

        val list = mutableListOf<String>()
        var storedNames = ""

        add_button.setOnClickListener{
            if (user_edit_text.text.toString() == ""){
                Toast.makeText(this,"Input user name",Toast.LENGTH_SHORT).show()
            } else {
                var name = user_edit_text.text.toString()
                if (prefs.contains("users")){
                    storedNames = prefs.getString("users","Empty")
                    var st = StringTokenizer(storedNames,",")
                    for (i in 1..st.countTokens()){
                        list.add(st.nextToken())
                    }
                    list.add(name)
                    storedNames = list.joinToString(",")
                    prefs.edit().putString("users",storedNames).apply()
                 } else {
                    list.add(name)
                    storedNames = list.joinToString(",")
                    prefs.edit().putString("users",storedNames).apply()
                }
                user_edit_text.setText("")
                Toast.makeText(this, "User added", Toast.LENGTH_SHORT).show()
            }
        }

        show_button.setOnClickListener{
            var users = "Empty"
            if (prefs.contains("users")) {
                storedNames = prefs.getString("users","Empty")
                var st = StringTokenizer(storedNames,",")
                for (i in 1..st.countTokens()){
                    list.add(st.nextToken())
                }
                for (i in 0..list.size - 1) {
                    users += list[i] + "${if (i == list.lastIndex) "" else "\n"}"
                }
                user_text_view.text = users
            }
            else
                user_text_view.text = users
        }
    }
}

