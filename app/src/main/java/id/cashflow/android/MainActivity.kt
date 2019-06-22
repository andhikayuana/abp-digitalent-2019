package id.cashflow.android

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import id.cashflow.android.util.Calculator
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jun, Thu 20 2019 17:50
 **/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivNotification.setOnClickListener {
            Toast.makeText(this@MainActivity, "Notification", Toast.LENGTH_SHORT).show()
        }
        ivSetting.setOnClickListener { view ->
            val popup = PopupMenu(this@MainActivity, view)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.menu_main_setting, popup.menu)
            popup.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.action_setting -> {
                        Toast.makeText(this@MainActivity, "Setting", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.action_logout -> {
                        Toast.makeText(this@MainActivity, "Logout", Toast.LENGTH_SHORT).show()
                        true
                    }

                    else -> super.onOptionsItemSelected(it)
                }
            }
            popup.show()
        }

        println("HALO ANDROID !")

        val calc = Calculator()
        val resultSum = calc.sum(5, 5)
        println("result : ${resultSum}")
        val resultSub = calc.sub(5, 5)
        println("result : ${resultSub}")
        val resultTimes = calc.times(5, 5)
        println("result : ${resultTimes}")
        val resultDiv = calc.div(5, 5)
        println("result : ${resultDiv}")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main_setting, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        return when (item?.itemId) {
            R.id.action_setting -> {
                Toast.makeText(this@MainActivity, "Setting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_logout -> {
                Toast.makeText(this@MainActivity, "Logout", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}