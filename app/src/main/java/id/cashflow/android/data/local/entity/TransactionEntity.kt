package id.cashflow.android.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Thu 04 2019 19:38
 **/
@Entity(tableName = "transactions")
data class TransactionEntity(
    @ColumnInfo(name = "type") val type: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "desc") val desc: String,
    @ColumnInfo(name = "created_at") val date: Date,
    @ColumnInfo(name = "image") val image: String,
    @ColumnInfo(name = "amount") val amount: Int
) {
    companion object {
        const val TYPE_BALANCE = 1
        const val TYPE_EXPENSE = 2
    }

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

}