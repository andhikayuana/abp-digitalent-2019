package id.cashflow.android.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import id.cashflow.android.R
import id.cashflow.android.util.toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jun, Thu 20 2019 17:50
 **/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initFragment()
    }

    private fun initFragment() {
        val mainFragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, mainFragment)
            .commit()
    }

    private fun initView() {
        ivNotification.setOnClickListener {
            this@MainActivity.toast("Notification")
        }
        ivSetting.setOnClickListener { view ->
            val popup = PopupMenu(this@MainActivity, view)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.menu_main_setting, popup.menu)
            popup.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.action_setting -> {
                        this@MainActivity.toast("Setting")
                        true
                    }
                    R.id.action_logout -> {
                        onLogoutClick()
                        true
                    }

                    else -> super.onOptionsItemSelected(it)
                }
            }
            popup.show()
        }
    }

    private fun onLogoutClick() {
        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        finish()
    }
}