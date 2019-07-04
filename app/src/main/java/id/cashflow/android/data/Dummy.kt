package id.cashflow.android.data

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import id.cashflow.android.App
import id.cashflow.android.R
import id.cashflow.android.data.model.Transaction
import java.io.IOException

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Wed 03 2019 19:55
 **/
object Dummy {

    fun getTransactions(): List<Transaction> {
        val stream = App.context!!.resources.openRawResource(R.raw.transactions_dummy)
        try {
            val bytes = ByteArray(stream.available())
            stream.read(bytes)
            val dummy = String(bytes)
            val type = object : TypeToken<List<Transaction>>() {}.type
            val result = GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .create()
                .fromJson<ArrayList<Transaction>>(dummy, type)
            return result
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return listOf()
    }
}