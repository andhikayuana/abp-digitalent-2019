package id.cashflow.android.data.local

import androidx.room.TypeConverter
import java.util.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Thu 04 2019 21:58
 **/
class DateConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }
}