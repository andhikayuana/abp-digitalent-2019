package id.cashflow.android.ui.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.cashflow.android.App
import id.cashflow.android.R
import id.cashflow.android.data.model.Transaction
import kotlinx.android.synthetic.main.item_transaction.view.*

/**
 * @author Yuana andhikayuana@gmail.com
 * @since Jul, Wed 03 2019 19:52
 **/
class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(transaction: Transaction) {
        Glide.with(App.context!!)
            .load(transaction.image)
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            .into(itemView.ivImage)
        itemView.tvTitle.text = transaction.title
        itemView.tvDesc.text = transaction.desc
        itemView.tvAmount.text = transaction.amount.toString()
        itemView.tvDate.text = transaction.date.toString()
    }

}

