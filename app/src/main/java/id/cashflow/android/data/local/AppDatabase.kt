package id.cashflow.android.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import id.cashflow.android.data.local.dao.TransactionDao
import id.cashflow.android.data.local.entity.TransactionEntity

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Thu 04 2019 20:00
 **/
@Database(entities = arrayOf(TransactionEntity::class), version = 2)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun transactionDao(): TransactionDao
}