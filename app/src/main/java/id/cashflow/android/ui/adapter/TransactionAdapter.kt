package id.cashflow.android.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.cashflow.android.R
import id.cashflow.android.data.model.Transaction
import id.cashflow.android.ui.viewholder.TransactionViewHolder

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Wed 03 2019 19:50
 **/
class TransactionAdapter(val data: List<Transaction>) : RecyclerView.Adapter<TransactionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_transaction, parent, false)
        return TransactionViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        holder.bind(data[position])
    }
}