package id.cashflow.android.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import id.cashflow.android.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jun, Thu 20 2019 17:50
 **/
class MainActivity : AppCompatActivity() {

    var host: NavHostFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        host = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
    }

    private fun initView() {
        tvTitle.setOnClickListener {
            host?.navController?.navigate(R.id.mainFragment)
        }
        ivNotification.setOnClickListener {
            host?.navController?.navigate(R.id.notificationFragment)
        }
        ivSetting.setOnClickListener { view ->
            val popup = PopupMenu(this@MainActivity, view)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.menu_main_setting, popup.menu)
            popup.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.action_setting -> {
                        host?.navController?.navigate(R.id.settingFragment)
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