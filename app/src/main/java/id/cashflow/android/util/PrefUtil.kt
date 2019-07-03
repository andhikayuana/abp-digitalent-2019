package id.cashflow.android.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import id.cashflow.android.App
import id.cashflow.android.BuildConfig
import id.cashflow.android.R

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Wed 03 2019 18:14
 **/
object PrefUtil {

    const val PREF_EMAIL: String = "user_email"

    private fun preferences(): SharedPreferences {
        return App.context!!.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE)
    }

    fun setLoginEmail(email: String) {
        preferences().edit {
            putString(PREF_EMAIL, email)
        }
    }

    fun isLogin(): Boolean {
        return preferences().getString(PREF_EMAIL, "")
            .equals(App.context!!.getString(R.string.user_email))
    }

    fun logout() {
        preferences().edit().clear().apply()
    }
}