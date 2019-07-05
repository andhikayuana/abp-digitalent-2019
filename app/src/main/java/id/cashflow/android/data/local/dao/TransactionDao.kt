package id.cashflow.android.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import id.cashflow.android.data.local.entity.TransactionEntity

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Thu 04 2019 19:52
 **/
@Dao
interface TransactionDao {

    @Query("SELECT * FROM transactions")
    fun getAll(): List<TransactionEntity>

    @Query("SELECT * FROM transactions WHERE type = ${TransactionEntity.TYPE_BALANCE}")
    suspend fun getAllBalance(): List<TransactionEntity>

    @Query("SELECT * FROM transactions WHERE type = ${TransactionEntity.TYPE_EXPENSE}")
    suspend fun getAllExpense(): List<TransactionEntity>

    @Insert
    fun insertAll(vararg transactions: TransactionEntity)

    @Delete
    suspend fun delete(transaction: TransactionEntity)
}