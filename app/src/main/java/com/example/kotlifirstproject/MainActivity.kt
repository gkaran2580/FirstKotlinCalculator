package com.example.kotlifirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    var res:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvOne=findViewById<TextView>(R.id.tvOne)
        val tvTwo=findViewById<TextView>(R.id.tvTwo)
        val tvThree=findViewById<TextView>(R.id.tvThree)
        val tvFour=findViewById<TextView>(R.id.tvFour)
        val tvFive=findViewById<TextView>(R.id.tvFive)
        val tvSix=findViewById<TextView>(R.id.tvSix)
        val tvSeven=findViewById<TextView>(R.id.tvSeven)
        val tvEight=findViewById<TextView>(R.id.tvEight)
        val tvNine=findViewById<TextView>(R.id.tvNine)
        val tvZero=findViewById<TextView>(R.id.tvZero)

        val tvClear=findViewById<TextView>(R.id.tvClear)
        val tvBack=findViewById<TextView>(R.id.tvBack)
        val tvDivide=findViewById<TextView>(R.id.tvDivide)
        val tvDot=findViewById<TextView>(R.id.tvDot)
        val tvEquals=findViewById<TextView>(R.id.tvEquals)
        val tvExpression=findViewById<TextView>(R.id.tvExpression)
        val tvMul=findViewById<TextView>(R.id.tvMul)
        val tvPlus=findViewById<TextView>(R.id.tvPlus)


        tvOne.setOnClickListener{


            expression("1")

        }

        tvTwo.setOnClickListener{


            expression("2")

        }

        tvThree.setOnClickListener{


            expression("3")

        }


        tvFour.setOnClickListener{


            expression("4")

        }


        tvFive.setOnClickListener{


            expression("5")

        }

        tvSix.setOnClickListener{


            expression("6")

        }

        tvSeven.setOnClickListener{


            expression("7")

        }

        tvEight.setOnClickListener{


            expression("8")

        }

         tvNine.setOnClickListener{


            expression("9")

        }

         tvZero.setOnClickListener{


            expression("0")

        }

        tvPlus.setOnClickListener{


            expression("+")

        }

         tvMul.setOnClickListener{


            expression("*")

        }


    tvDivide.setOnClickListener{


                expression("/")

            }


        tvDivide.setOnClickListener{


            Toast.makeText(this,"Total",Toast.LENGTH_LONG).show()

        }

        tvClear.setOnClickListener {

            expression("clear")

        }



    }

    fun expression(resu:String){

        val tvResult=findViewById<TextView>(R.id.tvResult)

        if (resu.equals("clear")){
            tvResult.setText("")
            res=""
        }



        else{


            res=resu.plus(res)
            res.reversed()
            tvResult.setText(res.toString())

        }

    }


}