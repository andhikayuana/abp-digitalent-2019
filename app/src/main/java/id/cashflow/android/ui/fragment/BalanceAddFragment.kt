package id.cashflow.android.ui.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.cashflow.android.App
import id.cashflow.android.R
import id.cashflow.android.data.local.entity.TransactionEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class BalanceAddFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balance_add, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val scope = CoroutineScope(Dispatchers.Default)
        scope.launch {
            val dao = App.db?.transactionDao()
            dao?.insertAll(
                TransactionEntity(
                    TransactionEntity.TYPE_BALANCE,
                    "Gaji",
                    "gajian bulan juli",
                    Date(),
                    "",
                    10000000
                ),
                TransactionEntity(
                    TransactionEntity.TYPE_EXPENSE,
                    "makan",
                    "kebutuhan makan bulan juli",
                    Date(),
                    "",
                    1000000
                )
            )
            Log.d("TRANSACTION", dao?.getAll().toString())

        }
    }

}
