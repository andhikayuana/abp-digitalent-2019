package id.cashflow.android.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import id.cashflow.android.R
import id.cashflow.android.data.Dummy
import id.cashflow.android.ui.adapter.TransactionAdapter
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jun, Sat 22 2019 10:45
 **/
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    private fun initView() {
        btnAddBalance.setOnClickListener {
            findNavController().navigate(R.id.balanceAddFragment)
        }
        btnAddExpense.setOnClickListener {
            findNavController().navigate(R.id.expenseAddFragment)
        }
    }

    private fun initData() {
        val transactions = Dummy.getTransactions()
        val linearLayoutManager = LinearLayoutManager(context)
        val transactionAdapter = TransactionAdapter(transactions)
        rvTransactions.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = transactionAdapter
        }
    }
}