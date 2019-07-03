package id.cashflow.android.data.model

import java.util.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Wed 03 2019 19:56
 **/
data class Transaction(
    val id: Int,
    val title: String,
    val desc: String,
    val date: Date,
    val image: String,
    val amount: Int
)