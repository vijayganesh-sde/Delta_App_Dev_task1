package com.example.app_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent
import android.graphics.Color
import android.provider.Settings
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.Toast
import java.util.logging.Logger.global
const val GAMEOVER = "com.example.app_task1.END"
const val NEXTPUZZ = "com.example.app_task1.NEXT"
class MainActivity : AppCompatActivity() {
    lateinit var Opnd1:TextView
    lateinit var Opnd2:TextView
    lateinit var Opnd3:TextView
    lateinit var Opnd4:TextView
    lateinit var Opnd5:TextView
    lateinit var Opnd6:TextView
    lateinit var Opnd7:TextView
    lateinit var Opnd8:TextView
    lateinit var Opnd9:TextView
    lateinit var Opnd10:TextView
    lateinit var Optr1:TextView
    lateinit var Optr2:TextView
    lateinit var Optr3:TextView
    lateinit var Optr4:TextView
    lateinit var Optr5:TextView
    lateinit var Res1:TextView
    lateinit var Res2:TextView
    lateinit var Res3:TextView
    lateinit var Res4:TextView
    lateinit var Res5:TextView
    lateinit var Opt1:TextView
    lateinit var Opt2:TextView
    lateinit var Opt3:TextView
    lateinit var Opt4:TextView
    lateinit var Opt5:TextView
    lateinit var Opt6:TextView
    lateinit var Opt7:TextView
    lateinit var Opt8:TextView
    lateinit var Opt9:TextView
    lateinit var Opt10:TextView
    lateinit var Lives:TextView
    lateinit var subBtn:TextView
    var _val:Int = 10
    var _val2:Int =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Opnd1=findViewById(R.id.idOpnd1)
        Opnd2=findViewById(R.id.idOpnd2)
        Opnd3=findViewById(R.id.idOpnd3)
        Opnd4=findViewById(R.id.idOpnd4)
        Opnd5=findViewById(R.id.idOpnd5)
        Opnd6=findViewById(R.id.idOpnd6)
        Opnd7=findViewById(R.id.idOpnd7)
        Opnd8=findViewById(R.id.idOpnd8)
        Opnd9=findViewById(R.id.idOpnd9)
        Opnd10=findViewById(R.id.idOpnd10)
        Opt1=findViewById(R.id.idOpt1)
        Opt2=findViewById(R.id.idOpt2)
        Opt3=findViewById(R.id.idOpt3)
        Opt4=findViewById(R.id.idOpt4)
        Opt5=findViewById(R.id.idOpt5)
        Opt6=findViewById(R.id.idOpt6)
        Opt7=findViewById(R.id.idOpt7)
        Opt8=findViewById(R.id.idOpt8)
        Opt9=findViewById(R.id.idOpt9)
        Opt10=findViewById(R.id.idOpt10)
        subBtn=findViewById(R.id.idSubmit)
        Lives=findViewById(R.id.idLives)
        assigning_values()
        opt1_click()
        opt2_click()
        opt3_click()
        opt4_click()
        opt5_click()
        opt6_click()
        opt7_click()
        opt8_click()
        opt9_click()
        opt10_click()
        subBtn.setOnClickListener {
            check()
        }
    }
    fun clickoperands_opt1(){
        Opnd1.setOnClickListener { _val = 0
            opt1_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt1_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt1_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt1_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt1_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt1_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt1_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt1_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt1_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt1_reclick()}
    }
    fun opt1_click(){
        Opt1.setOnClickListener {
            clickoperands_opt1()
        }
    }
    fun opt1_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt1.text
        Opt1.text=""
        Opt1.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt1.setOnClickListener{
            Opt1.setBackgroundResource(R.drawable.round_corner_white)
            Opt1.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt1_click()
        }
    }
    fun opt2_click(){
        Opt2.setOnClickListener {
            clickoperands_opt2()
        }
    }
    fun clickoperands_opt2(){
        Opnd1.setOnClickListener { _val = 0
            opt2_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt2_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt2_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt2_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt2_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt2_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt2_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt2_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt2_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt2_reclick()}
    }
    fun opt2_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt2.text
        Opt2.text=""
        Opt2.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt2.setOnClickListener{
            Opt2.setBackgroundResource(R.drawable.round_corner_white)
            Opt2.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt2_click()
        }
    }
    fun clickoperands_opt3(){
        Opnd1.setOnClickListener { _val = 0
            opt3_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt3_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt3_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt3_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt3_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt3_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt3_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt3_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt3_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt3_reclick()}
    }
    fun opt3_click(){
        Opt3.setOnClickListener {
            clickoperands_opt3()
        }
    }
    fun opt3_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt3.text
        Opt3.text=""
        Opt3.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt3.setOnClickListener{
            Opt3.setBackgroundResource(R.drawable.round_corner_white)
            Opt3.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt3_click()
        }
    }
    fun clickoperands_opt4(){
        Opnd1.setOnClickListener { _val = 0
            opt4_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt4_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt4_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt4_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt4_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt4_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt4_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt4_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt4_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt4_reclick()}
    }
    fun opt4_click(){
        Opt4.setOnClickListener {
            clickoperands_opt4()
        }
    }
    fun opt4_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt4.text
        Opt4.text=""
        Opt4.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt4.setOnClickListener{
            Opt4.setBackgroundResource(R.drawable.round_corner_white)
            Opt4.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt4_click()
        }
    }
    fun clickoperands_opt5(){
        Opnd1.setOnClickListener { _val = 0
            opt5_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt5_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt5_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt5_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt5_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt5_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt5_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt5_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt5_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt5_reclick()}
    }
    fun opt5_click(){
        Opt5.setOnClickListener {
            clickoperands_opt5()
        }
    }
    fun opt5_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt5.text
        Opt5.text=""
        Opt5.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt5.setOnClickListener{
            Opt5.setBackgroundResource(R.drawable.round_corner_white)
            Opt5.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt5_click()
        }
    }
    fun clickoperands_opt6(){
        Opnd1.setOnClickListener { _val = 0
            opt6_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt6_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt6_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt6_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt6_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt6_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt6_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt6_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt6_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt6_reclick()}
    }
    fun opt6_click(){
        Opt6.setOnClickListener {
            clickoperands_opt6()
        }
    }
    fun opt6_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt6.text
        Opt6.text=""
        Opt6.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt6.setOnClickListener{
            Opt6.setBackgroundResource(R.drawable.round_corner_white)
            Opt6.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt6_click()
        }
    }
    fun clickoperands_opt7(){
        Opnd1.setOnClickListener { _val = 0
            opt7_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt7_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt7_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt7_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt7_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt7_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt7_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt7_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt7_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt7_reclick()}
    }
    fun opt7_click(){
        Opt7.setOnClickListener {
            clickoperands_opt7()
        }
    }
    fun opt7_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt7.text
        Opt7.text=""
        Opt7.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt7.setOnClickListener{
            Opt7.setBackgroundResource(R.drawable.round_corner_white)
            Opt7.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt7_click()
        }
    }
    fun clickoperands_opt8(){
        Opnd1.setOnClickListener { _val = 0
            opt8_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt8_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt8_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt8_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt8_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt8_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt8_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt8_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt8_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt8_reclick()}
    }
    fun opt8_click(){
        Opt8.setOnClickListener {
            clickoperands_opt8()
        }
    }
    fun opt8_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt8.text
        Opt8.text=""
        Opt8.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt8.setOnClickListener{
            Opt8.setBackgroundResource(R.drawable.round_corner_white)
            Opt8.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt8_click()
        }
    }
    fun clickoperands_opt9(){
        Opnd1.setOnClickListener { _val = 0
            opt9_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt9_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt9_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt9_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt9_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt9_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt9_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt9_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt9_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt9_reclick()}
    }
    fun opt9_click(){
        Opt9.setOnClickListener {
            clickoperands_opt9()
        }
    }
    fun opt9_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt9.text
        Opt9.text=""
        Opt9.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt9.setOnClickListener{
            Opt9.setBackgroundResource(R.drawable.round_corner_white)
            Opt9.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt9_click()
        }
    }
    fun clickoperands_opt10(){
        Opnd1.setOnClickListener { _val = 0
            opt10_reclick()}
        Opnd2.setOnClickListener { _val = 1
            opt10_reclick()}
        Opnd3.setOnClickListener { _val = 2
            opt10_reclick()}
        Opnd4.setOnClickListener { _val = 3
            opt10_reclick()}
        Opnd5.setOnClickListener { _val = 4
            opt10_reclick()}
        Opnd6.setOnClickListener { _val = 5
            opt10_reclick()}
        Opnd7.setOnClickListener { _val = 6
            opt10_reclick()}
        Opnd8.setOnClickListener { _val = 7
            opt10_reclick()}
        Opnd9.setOnClickListener { _val = 8
            opt10_reclick()}
        Opnd10.setOnClickListener { _val = 9
            opt10_reclick()}
    }
    fun opt10_click(){
        Opt10.setOnClickListener {
            clickoperands_opt10()
        }
    }
    fun opt10_reclick(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        operands[_val].setBackgroundResource(R.drawable.round_corner_white)
        operands[_val].text=Opt10.text
        Opt10.text=""
        Opt10.setBackgroundResource(R.drawable.round_corner_view)
        stop_reclick()
        Opt10.setOnClickListener{
            Opt10.setBackgroundResource(R.drawable.round_corner_white)
            Opt10.text=operands[_val].text
            operands[_val].text=""
            operands[_val].setBackgroundResource(R.drawable.round_corner_view)
            opt10_click()
        }
    }
    fun assigning_values(){
        val opt1val = intent.getStringExtra(OPTION1)
        val opt2val = intent.getStringExtra(OPTION2)
        val res1val = intent.getStringExtra(RES1)
        val opt3val = intent.getStringExtra(OPTION3)
        val opt4val = intent.getStringExtra(OPTION4)
        val res2val = intent.getStringExtra(RES2)
        val opt5val = intent.getStringExtra(OPTION5)
        val opt6val = intent.getStringExtra(OPTION6)
        val res3val = intent.getStringExtra(RES3)
        val opt7val = intent.getStringExtra(OPTION7)
        val opt8val = intent.getStringExtra(OPTION8)
        val res4val = intent.getStringExtra(RES4)
        val opt9val = intent.getStringExtra(OPTION9)
        val opt10val = intent.getStringExtra(OPTION10)
        val res5val = intent.getStringExtra(RES5)
        Opnd1=findViewById(R.id.idOpnd1)
        Opnd2=findViewById(R.id.idOpnd2)
        Opnd3=findViewById(R.id.idOpnd3)
        Opnd4=findViewById(R.id.idOpnd4)
        Opnd5=findViewById(R.id.idOpnd5)
        Opnd6=findViewById(R.id.idOpnd6)
        Opnd7=findViewById(R.id.idOpnd7)
        Opnd8=findViewById(R.id.idOpnd8)
        Opnd9=findViewById(R.id.idOpnd9)
        Opnd10=findViewById(R.id.idOpnd10)
        Opt1=findViewById(R.id.idOpt1)
        Opt2=findViewById(R.id.idOpt2)
        Opt3=findViewById(R.id.idOpt3)
        Opt4=findViewById(R.id.idOpt4)
        Opt5=findViewById(R.id.idOpt5)
        Opt6=findViewById(R.id.idOpt6)
        Opt7=findViewById(R.id.idOpt7)
        Opt8=findViewById(R.id.idOpt8)
        Opt9=findViewById(R.id.idOpt9)
        Opt10=findViewById(R.id.idOpt10)
        subBtn=findViewById(R.id.idSubmit)
        Lives=findViewById(R.id.idLives)
        val opts= listOf(opt1val,opt2val,opt3val,opt4val,opt5val,opt6val,opt7val,opt8val,opt9val,opt10val)
        val opt_vals =opts.shuffled()
        Opt1=findViewById<TextView>(R.id.idOpt1).apply {
            text = opt_vals[0]
        }
        Opt2=findViewById<TextView>(R.id.idOpt2).apply {
            text = opt_vals[1]
        }
        Res1=findViewById<TextView>(R.id.idRes1).apply {
            text = res1val
        }
        Opt3=findViewById<TextView>(R.id.idOpt3).apply {
            text = opt_vals[2]
        }
        Opt4=findViewById<TextView>(R.id.idOpt4).apply {
            text = opt_vals[3]
        }
        Res2=findViewById<TextView>(R.id.idRes2).apply {
            text = res2val
        }
        Opt5=findViewById<TextView>(R.id.idOpt5).apply {
            text = opt_vals[4]
        }
        Opt6=findViewById<TextView>(R.id.idOpt6).apply {
            text = opt_vals[5]
        }
        Res3=findViewById<TextView>(R.id.idRes3).apply {
            text = res3val
        }
        Opt7=findViewById<TextView>(R.id.idOpt7).apply {
            text = opt_vals[6]
        }
        Opt8=findViewById<TextView>(R.id.idOpt8).apply {
            text = opt_vals[7]
        }
        Res4=findViewById<TextView>(R.id.idRes4).apply {
            text = res4val
        }
        Opt9=findViewById<TextView>(R.id.idOpt9).apply {
            text = opt_vals[8]
        }
        Opt10=findViewById<TextView>(R.id.idOpt10).apply {
            text = opt_vals[9]
        }
        Res5=findViewById<TextView>(R.id.idRes5).apply {
            text = res5val
        }
    }
    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return (start..end).random()
    }
    var _val1=3
    fun continueGame(){
        val opt1_val=rand(1,200)
        val opt2_val=rand(1,200)
        val res1_val=opt1_val+opt2_val
        val opt3_val=rand(1,200)
        val opt4_val=rand(1,200)
        val res2_val=opt3_val-opt4_val
        val opt5_val=rand(1,30)
        val opt6_val=rand(1,30)
        val res3_val=opt5_val*opt6_val
        val opt7_val=rand(200,600)
        val opt8_val=rand(1,200)
        val res4_val="%.2f".format(opt7_val.toDouble()/opt8_val.toDouble())
        val opt9_val=rand(1,200)
        val opt10_val=rand(1,200)
        val res5_val=opt9_val+opt10_val
        val opts= listOf(opt1_val,opt2_val,opt3_val,opt4_val,opt5_val,opt6_val,opt7_val,opt8_val,opt9_val,opt10_val)
        val opt_vals =opts.shuffled()
        Opt1.text=opt_vals[0].toString()
        Opt2.text=opt_vals[1].toString()
        Opt3.text=opt_vals[2].toString()
        Opt4.text=opt_vals[3].toString()
        Opt5.text=opt_vals[4].toString()
        Opt6.text=opt_vals[5].toString()
        Opt7.text=opt_vals[6].toString()
        Opt8.text=opt_vals[7].toString()
        Opt9.text=opt_vals[8].toString()
        Opt10.text=opt_vals[9].toString()
        Res1.text=res1_val.toString()
        Res2.text=res2_val.toString()
        Res3.text=res3_val.toString()
        Res4.text=res4_val.toString()
        Res5.text=res5_val.toString()
        reset_textviews()
    }
    fun reset_textviews(){
        Opt1.setBackgroundResource(R.drawable.round_corner_white)
        Opt2.setBackgroundResource(R.drawable.round_corner_white)
        Opt3.setBackgroundResource(R.drawable.round_corner_white)
        Opt4.setBackgroundResource(R.drawable.round_corner_white)
        Opt5.setBackgroundResource(R.drawable.round_corner_white)
        Opt6.setBackgroundResource(R.drawable.round_corner_white)
        Opt7.setBackgroundResource(R.drawable.round_corner_white)
        Opt8.setBackgroundResource(R.drawable.round_corner_white)
        Opt9.setBackgroundResource(R.drawable.round_corner_white)
        Opt10.setBackgroundResource(R.drawable.round_corner_white)
        Opnd1.text=""
        Opnd1.setBackgroundResource(R.drawable.round_corner_view)
        Opnd2.text=""
        Opnd2.setBackgroundResource(R.drawable.round_corner_view)
        Opnd3.text=""
        Opnd3.setBackgroundResource(R.drawable.round_corner_view)
        Opnd4.text=""
        Opnd4.setBackgroundResource(R.drawable.round_corner_view)
        Opnd5.text=""
        Opnd5.setBackgroundResource(R.drawable.round_corner_view)
        Opnd6.text=""
        Opnd6.setBackgroundResource(R.drawable.round_corner_view)
        Opnd7.text=""
        Opnd7.setBackgroundResource(R.drawable.round_corner_view)
        Opnd8.text=""
        Opnd8.setBackgroundResource(R.drawable.round_corner_view)
        Opnd9.text=""
        Opnd9.setBackgroundResource(R.drawable.round_corner_view)
        Opnd10.text=""
        Opnd10.setBackgroundResource(R.drawable.round_corner_view)
    }
    fun stop_reclick(){
        Opnd1.setOnClickListener {
            _val2=0
            stop_reclick_opts()
        }
        Opnd2.setOnClickListener {
            _val2=1
            stop_reclick_opts()}
        Opnd3.setOnClickListener {
            _val2=2
            stop_reclick_opts()}
        Opnd4.setOnClickListener {
            _val2=3
            stop_reclick_opts()}
        Opnd5.setOnClickListener {
            _val2=4
            stop_reclick_opts()}
        Opnd6.setOnClickListener {
            _val2=5
            stop_reclick_opts()}
        Opnd7.setOnClickListener {
            _val2=6
            stop_reclick_opts()}
        Opnd8.setOnClickListener {
            _val2=7
            stop_reclick_opts()}
        Opnd9.setOnClickListener {
            _val2=8
            stop_reclick_opts()}
        Opnd10.setOnClickListener {
            _val2=9
            stop_reclick_opts()}
    }
    fun stop_reclick_opts(){
        val operands = listOf(Opnd1,Opnd2,Opnd3,Opnd4,Opnd5,Opnd6,Opnd7,Opnd8,Opnd9,Opnd10)
        Opt1.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt1.text=operands[_val2].text
            operands[_val2].text=""
            Opt1.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt2.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt2.text=operands[_val2].text
            operands[_val2].text=""
            Opt2.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt3.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt3.text=operands[_val2].text
            operands[_val2].text=""
            Opt3.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt4.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt4.text=operands[_val2].text
            operands[_val2].text=""
            Opt4.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt5.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt5.text=operands[_val2].text
            operands[_val2].text=""
            Opt5.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt6.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt6.text=operands[_val2].text
            operands[_val2].text=""
            Opt6.setBackgroundResource(R.drawable.round_corner_white)
            opt6_click()
        }
        Opt7.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt7.text=operands[_val2].text
            operands[_val2].text=""
            Opt7.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt8.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt8.text=operands[_val2].text
            operands[_val2].text=""
            Opt8.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt9.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt9.text=operands[_val2].text
            operands[_val2].text=""
            Opt9.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }
        Opt10.setOnClickListener {
            operands[_val2].setBackgroundResource(R.drawable.round_corner_view)
            Opt10.text=operands[_val2].text
            operands[_val2].text=""
            Opt10.setBackgroundResource(R.drawable.round_corner_white)
            opt1_click()
            opt2_click()
            opt3_click()
            opt4_click()
            opt5_click()
            opt6_click()
            opt7_click()
            opt8_click()
            opt9_click()
            opt10_click()
        }

    }
    var score=0
    fun check(){
        if(Opnd1.text!="" && Opnd2.text!="" && Opnd3.text!="" && Opnd4.text!="" && Opnd5.text!="" && Opnd6.text!=""
            && Opnd7.text!="" && Opnd8.text!="" && Opnd9.text!="" && Opnd10.text!=""){
            if((Opnd1.text.toString().toInt()+Opnd2.text.toString().toInt()==Res1.text.toString().toInt()) &&
                (Opnd3.text.toString().toInt()-Opnd4.text.toString().toInt()==Res2.text.toString().toInt()) &&
                (Opnd5.text.toString().toInt()*Opnd6.text.toString().toInt()==Res3.text.toString().toInt())&&
                ("%.2f".format(Opnd7.text.toString().toDouble()/Opnd8.text.toString().toDouble()).toDouble()==Res4.text.toString().toDouble()) &&
                (Opnd9.text.toString().toInt()+Opnd10.text.toString().toInt()==Res5.text.toString().toInt())){
                    Toast.makeText(this, "Your Have Successfully solved the puzzle❤️", Toast.LENGTH_SHORT).show()
                    score+=5
                    continueGame()
                    opt1_click()
                    opt2_click()
                    opt3_click()
                    opt4_click()
                    opt5_click()
                    opt6_click()
                    opt7_click()
                    opt8_click()
                    opt9_click()
                    opt10_click()
                    subBtn.setOnClickListener {
                        check()
                    }
            }
            else{
                _val1-=1
                if(_val1==0){
                    Toast.makeText(this, "Congatulations!!! Your Total Score is ${score}", Toast.LENGTH_SHORT).show()
                    val intent1=Intent(this,initialDisp::class.java)
                    startActivity(intent1)
                }
                if(_val1==1){
                    Lives.text="❤️"
                    Toast.makeText(this, "You have ${_val1} more lives", Toast.LENGTH_SHORT).show()
                }
                if(_val1==2){
                    Lives.text="❤️❤️"
                    Toast.makeText(this, "You have ${_val1} more lives", Toast.LENGTH_SHORT).show()
                }
                if(_val1==3){
                    Lives.text="❤️❤❤️️"
                    Toast.makeText(this, "You have ${_val1} more lives", Toast.LENGTH_SHORT).show()
                }
                reset_textviews()
                assigning_values()
                opt1_click()
                opt2_click()
                opt3_click()
                opt4_click()
                opt5_click()
                opt6_click()
                opt7_click()
                opt8_click()
                opt9_click()
                opt10_click()
                subBtn.setOnClickListener {
                    check()
                }

            }
        }
    }
}