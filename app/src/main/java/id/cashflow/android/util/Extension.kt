package id.cashflow.android.util

import android.content.Context
import android.widget.Toast

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Mon 01 2019 18:23
 **/
fun Context.toast(msg: String) =
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()