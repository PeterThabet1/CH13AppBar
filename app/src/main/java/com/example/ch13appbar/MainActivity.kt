package com.example.ch13appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuFile ->{
                showMessage("File Menu")
                return true
            }
            R.id.menuEdit ->{
                showMessage("Edit Menu")
                return true
            }
            R.id.menuHelp ->{
                showMessage("Help Menu")
                return true
            }
            else -> {
                showMessage("Exit Menu")
                return true
            }
        }

        return super.onOptionsItemSelected(item)

    }

    private fun showMessage(msg: String){
        Snackbar.make(root_layout,msg,Snackbar.LENGTH_LONG).show()
    }

}