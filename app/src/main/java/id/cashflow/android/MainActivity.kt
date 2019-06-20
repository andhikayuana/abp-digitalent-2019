package id.cashflow.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.cashflow.android.util.Calculator

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jun, Thu 20 2019 17:50
 **/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("HALO ANDROID !")

        val calc = Calculator()
        val resultSum = calc.sum(5 , 5)
        println("result : ${resultSum}")
        val resultSub = calc.sub(5 , 5)
        println("result : ${resultSub}")
        val resultTimes = calc.times(5 , 5)
        println("result : ${resultTimes}")
        val resultDiv = calc.div(5 , 5)
        println("result : ${resultDiv}")

    }
}