package org.easydarwin.easypusher

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IndexActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        val live = findViewById<Button>(R.id.live);
        val watch = findViewById<Button>(R.id.watch);

        live.setOnClickListener{
            val intent = Intent()
            intent.setClass(this, StreamActivity::class.java)//this前面为当前activty名称，class前面为要跳转到得activity名称
            startActivity(intent)
        }

        watch.setOnClickListener{
            val intent = Intent()
            intent.setClass(this, StreamActivity::class.java)//this前面为当前activty名称，class前面为要跳转到得activity名称
            startActivity(intent)
        }
    }
}
