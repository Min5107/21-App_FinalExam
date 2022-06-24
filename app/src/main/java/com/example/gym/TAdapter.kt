package com.example.gym

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.training_re.view.*


class TData(val Re_txt: String, val Re_txt_h: String, val Re_txt_h2: String)

class TAdapterViewHolder(v : View) : RecyclerView.ViewHolder(v){
    val Re_txt = v.re_text1_t
    val Re_txt_h = v.re_text_h
    val Re_txt_h2 = v.re_text_h2
}
class TAdapter(val DataList1:ArrayList<TData>) : RecyclerView.Adapter<TAdapterViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TAdapterViewHolder {
        val cellForwRow = LayoutInflater.from(parent.context).inflate(R.layout.training_re,parent, false)
        return TAdapterViewHolder(cellForwRow)
    }

    override fun onBindViewHolder(holder: TAdapterViewHolder, position: Int) {
        val curData = DataList1[position]
        holder.Re_txt.text=(DataList1[position].Re_txt)
        holder.Re_txt_h.text=(DataList1[position].Re_txt_h)
        holder.Re_txt_h2.text=(DataList1[position].Re_txt_h2)

        holder.itemView.setOnClickListener {
            val tssang_i = Intent(holder.itemView.context, T_Ssang1::class.java)
            tssang_i.putExtra("Re_txt_h", curData.Re_txt_h)
            tssang_i.putExtra("Re_txt_h2", curData.Re_txt_h2)

            ContextCompat.startActivity(holder.itemView.context,tssang_i,null)

        }
    }

    override fun getItemCount() = DataList1.size

}

