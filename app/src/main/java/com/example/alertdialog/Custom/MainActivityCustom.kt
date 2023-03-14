package com.example.alertdialog.Custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.R
import com.example.alertdialog.databinding.CustomDialogBinding
import kotlinx.android.synthetic.main.activity_main_custom.*
import kotlinx.android.synthetic.main.custom_dialog.*

class MainActivityCustom : AppCompatActivity() {
    lateinit var dialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_custom)
        btnAlert.setOnClickListener {
//            showDialogNomal()
            showDialogBinding()
        }

    }

    private fun showDialogBinding() {
        val build = AlertDialog.Builder(this,R.style.ThemeCustom)
        val dialogBinding = CustomDialogBinding.inflate(LayoutInflater.from(this))
        build.setView(dialogBinding.root)
        dialogBinding.btnclose.setOnClickListener{
            dialog.dismiss()
        }
        dialogBinding.btnThamgia.setOnClickListener {
            Toast.makeText(this,"Bạn đã tham gia thành công", Toast.LENGTH_SHORT).show()
        }
        dialog = build.create()
        dialog.show()
    }

    private fun showDialogNomal() {
        val build = AlertDialog.Builder(this,R.style.ThemeCustom)
        val view  = layoutInflater.inflate(R.layout.custom_dialog,null)
        build.setView(view)
        //code close
        val btnclose = view.findViewById<ImageButton>(R.id.btnclose)
        btnclose.setOnClickListener{dialog.dismiss()}
        val btnThamgia = view.findViewById<Button>(R.id.btnThamgia)
        btnThamgia.setOnClickListener{
            Toast.makeText(this,"Bạn đã tham gia thành công", Toast.LENGTH_SHORT).show()
        }
        dialog = build.create()
        dialog.show()
    }
}