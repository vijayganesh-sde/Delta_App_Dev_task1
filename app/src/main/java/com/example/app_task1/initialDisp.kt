package com.example.app_task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
const val OPTION1 = "com.example.app_task1.VALUE3"
const val OPTION2 = "com.example.app_task1.VALUE1"
const val RES1 = "com.example.app_task1.VALUE2"
const val OPTION3 = "com.example.app_task1.VALUE4"
const val OPTION4 = "com.example.app_task1.VALUE5"
const val RES2 = "com.example.app_task1.VALUE6"
const val OPTION5 = "com.example.app_task1.VALUE7"
const val OPTION6 = "com.example.app_task1.VALUE8"
const val RES3 = "com.example.app_task1.VALUE9"
const val OPTION7 = "com.example.app_task1.VALUE10"
const val OPTION8 = "com.example.app_task1.VALUE11"
const val RES4 = "com.example.app_task1.VALUE12"
const val OPTION9 = "com.example.app_task1.VALUE13"
const val OPTION10 = "com.example.app_task1.VALUE14"
const val RES5 = "com.example.app_task1.VALUE15"
class initialDisp : AppCompatActivity() {
    lateinit var opnd1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial_disp)


    }

    fun startGame(view:View){
        val opt1val=rand(1,200)
        val opt2val=rand(1,200)
        val res1val=opt1val+opt2val
        val opt3val=rand(1,200)
        val opt4val=rand(1,200)
        val res2val=opt3val-opt4val
        val opt5val=rand(1,30)
        val opt6val=rand(1,30)
        val res3val=opt5val*opt6val
        val opt7val=rand(200,600)
        val opt8val=rand(1,200)
        val res4val="%.2f".format(opt7val.toDouble()/opt8val.toDouble())
        val opt9val=rand(1,200)
        val opt10val=rand(1,200)
        val res5val=opt9val+opt10val
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(OPTION1, opt1val.toString())
            putExtra(OPTION2,opt2val.toString())
            putExtra(RES1,res1val.toString())
            putExtra(OPTION3, opt3val.toString())
            putExtra(OPTION4,opt4val.toString())
            putExtra(RES2,res2val.toString())
            putExtra(OPTION5, opt5val.toString())
            putExtra(OPTION6,opt6val.toString())
            putExtra(RES3,res3val.toString())
            putExtra(OPTION7, opt7val.toString())
            putExtra(OPTION8,opt8val.toString())
            putExtra(RES4,res4val.toString())
            putExtra(OPTION9, opt9val.toString())
            putExtra(OPTION10,opt10val.toString())
            putExtra(RES5,res5val.toString())
        }
        startActivity(intent)
    }

    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }
}