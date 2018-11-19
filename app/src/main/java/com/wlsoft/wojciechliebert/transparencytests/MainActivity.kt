package com.wlsoft.wojciechliebert.transparencytests

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val builder: AlertDialog.Builder? = this.let {
            AlertDialog.Builder(it)
        }

        builder?.setTitle("Wojciszke's tricky application")
                ?.setMessage("Odkrył jeden dziwny sposób na wyświetlenie dialogu gdziekolwiek.\nSPRAWDŹ JUŻ TERAZ!!!")
                ?.setPositiveButton("OK") { dialogInterface, i ->  }
                ?.setNegativeButton("OK") { dialogInterface, i ->  }

        val dialog: AlertDialog? = builder?.create()

        dialog?.show()
    }
}
