package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.Custom.MainActivityCustom
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnExit.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.apply {
                //tiêu đề
                setTitle("Confirm Window")
                setMessage("Do you want to close this app?")
                //nút phủ định
                setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                    dialogInterface.dismiss()
                }
                setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
                    MainActivityCustom()
                }
                //ngăn không cho đóng dialog khi click ra ngoài
                setCancelable(false)
            }
            dialog.show()
        }
    }
}