package id.cashflow.android

import android.app.Application
import android.content.Context
import java.lang.RuntimeException

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Wed 03 2019 18:32
 **/
class App : Application() {

    companion object {
        var context: Context? = null
        var INSTANCE: App? = null

        val instance: App
        get() {
            if (INSTANCE == null) {
                throw RuntimeException("instance is null")
            }
            return INSTANCE as App
        }
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        Companion.context = this
    }
}