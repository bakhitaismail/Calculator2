package dev.bakhita.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.get
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumerical:TextInputLayout
    lateinit var etNumerical:TextInputEditText
    lateinit var tilDenomenator:TextInputLayout
    lateinit var etDenomentaor:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvAnswer:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumerical=findViewById(R.id.tilNumerical)
        etNumerical=findViewById(R.id.etNumerical)
        tilDenomenator=findViewById(R.id.tilDenomenator)
        etDenomentaor=findViewById(R.id.etDenomenator)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivide=findViewById(R.id.btnDivide)
        tvAnswer=findViewById(R.id.tvAnswer)


        btnAdd.setOnClickListener {
            var numerator= etNumerical.text.toString().toInt()
            var denomenator= etDenomentaor.text.toString().toInt()
            add(numerator, denomenator)

        }
        btnSubtract.setOnClickListener {
            var numerator= etNumerical.text.toString().toInt()
            var denomenator= etDenomentaor.text.toString().toInt()
            subtract(numerator, denomenator)
        }
        btnModulus.setOnClickListener {
            var numerator= etNumerical.text.toString().toInt()
            var denomenator= etDenomentaor.text.toString().toInt()
            modulus(numerator, denomenator)

        }
        btnDivide.setOnClickListener {
            var numerator= etNumerical.text.toString().toInt()
            var denomenator= etDenomentaor.text.toString().toInt()
            division(numerator, denomenator)
        }
        validate()
    }

    fun add(numerator:Int, denomenator:Int){
        var answer= numerator+denomenator
        tvAnswer.text=answer.toString()
    }
    fun subtract(numerator:Int, denomenator:Int){
        var answer= numerator-denomenator
        tvAnswer.text=answer.toString()
    }
    fun modulus(numerator: Int, denomenator: Int){
        var answer= numerator%denomenator
        tvAnswer.text=answer.toString()
    }
    fun division(numerator: Int, denomenator: Int){
        var answer= numerator/denomenator
        tvAnswer.text=answer.toString()
    }
    fun validate(){
        var add =etNumerical.text.toString()
        var add2=etDenomentaor.text.toString()
        if (add.isBlank()){
            tilNumerical.error="Enter a number"
        }
        if (add2.isBlank()){
            tilDenomenator.error="Enter a number"
        }

    }

}