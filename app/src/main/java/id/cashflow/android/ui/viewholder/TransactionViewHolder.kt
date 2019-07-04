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
        with(itemView) {
            Glide.with(App.context!!)
                .load(transaction.image)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(ivImage)
            tvTitle.text = transaction.title
            tvDesc.text = transaction.desc
            tvAmount.text = transaction.amount.toString()
            tvDate.text = transaction.date.toString()
        }
    }

}

