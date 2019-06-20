package id.cashflow.android.util

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jun, Thu 20 2019 18:10
 *
 * - terdapat fungsi untuk menjumlahkan
 * - fungsi tersebut menerima 2 parameter integer
 * - fungsi tersebut mengembalikan 1 integer
 **/
class Calculator {

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun sub(x: Int, y: Int): Int {
        return x - y
    }

    fun times(x: Int, y: Int): Int {
        return x * y
    }

    fun div(x: Int, y: Int): Int {
        return x / y
    }
}