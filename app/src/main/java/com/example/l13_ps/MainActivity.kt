package com.example.l13_ps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
var output = ""
var totalNum = 0
var number = ""
var operator = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnOnClick(view : View) {
        val btnSelected = view as Button
        when(btnSelected.id) {
            btn1.id -> {
                output = output + "1"
                number = number + "1"
            }
            btn2.id -> {
                output = output + "2"
                number = number + "2"
            }
            btn3.id -> {
                output = output + "3"
                number = number + "3"
            }
            btn4.id -> {
                output = output + "4"
                number = number + "4"
            }
            btn5.id -> {
                output = output + "5"
                number = number + "5"
            }
            btn6.id -> {
                output = output + "6"
                number = number + "6"
            }
            btn7.id -> {
                output = output + "7"
                number = number + "7"
            }
            btn8.id -> {
                output = output + "8"
                number = number + "8"
            }
            btn9.id -> {
                output = output + "9"
                number = number + "9"
            }
            btn0.id -> {
                output = output + "0"
                number = number + "0"
            }
            btnDecimal.id -> {
                output += "."
                operator += "."
            }
            btnAdd.id -> {
                output += "+"
                operator += "+"
            }
            btnMinus.id -> {
                output += "-"
                operator += "-"
            }
            btnAC.id -> {
                output = ""
                operator += ""
            }
            btnMultiply.id -> {
                output += "*"
                operator += "*"
            }
            btnDivide.id -> {
                output += "/"
                operator += "/"
            }

            btnCalculate.id -> {
                var numbersOnly = output.replace("[-+*/]", " ")
                var operators = output.replace("[123456789]", " ")
                var operatorsList = arrayListOf<String>("+", "-", "*", "/")
                var numberList = output.split("+","-","*","/")
                for (operatorUsed in output){
                    Log.i("Test123", operatorUsed.toString())
                    if (operatorsList.contains(operatorUsed.toString())){
                        operator = operatorUsed.toString()
                    }
                }
                Log.i("operatoring", operator);
                Log.i("numbersonly", numberList.toString())
                Log.i("Operators", operators)
                Log.i("operatorList", operatorsList.toString())
                Log.i("numbers", numbersOnly)
                //var numbersArray = arrayListOf<Int>(number.toInt())
                //Log.i("Array", numbersArray.toString())


                if (operator.equals("+")){
                    totalNum = numberList[0].toInt() + numberList[1].toInt()
                    Log.i("TotalNum", totalNum.toString())
                    calculationDisplay.text = "$totalNum"
                }
                else if (operators.equals("-")){
                    totalNum = numberList[0].toInt() - numberList[1].toInt()
                }
                else if (operators.equals("/")){
                    totalNum = numberList[0].toInt() / numberList[1].toInt()
                }
                else if (operators.equals("*")){
                    totalNum = numberList[0].toInt() * numberList[1].toInt()
                }
            }
        }
        calculationDisplay.text = "$totalNum"
        Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
    }
}