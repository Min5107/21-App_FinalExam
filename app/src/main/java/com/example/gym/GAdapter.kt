package com.example.gym


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.gym_re.view.*

class GData(
    val G_img: Int,
    val G_title: String,
    val G_name: String,
    val G_script: String,
    val G_phone: String
)

class GAdapterViewHolder(v : View) : RecyclerView.ViewHolder(v){
    val G_img = v.re_img_g
    val G_title = v.re_title_g
    val G_name = v.re_name_g
    val G_script = v.re_script_g
    val G_phone = v.re_phone_g

}

class GAdapter(val DataList:ArrayList<GData>) : RecyclerView.Adapter<GAdapterViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GAdapterViewHolder {
        val cellForwRow = LayoutInflater.from(parent.context).inflate(R.layout.gym_re,parent, false)
        return GAdapterViewHolder(cellForwRow)
    }

    override fun onBindViewHolder(holder: GAdapterViewHolder, position: Int) {
        val curData = DataList[position]
        holder.G_img.setImageResource(DataList[position].G_img)
        holder.G_title.text = DataList[position].G_title
        holder.G_name.text = DataList[position].G_name
        holder.G_script.text = DataList[position].G_script
        holder.G_phone.text = DataList[position].G_phone

        holder.itemView.setOnClickListener {
            val gssang_i = Intent(holder.itemView.context, G_Ssang1::class.java)
            gssang_i.putExtra("G_img", curData.G_img)
            gssang_i.putExtra("G_title", curData.G_title)
            gssang_i.putExtra("G_name", curData.G_name)
            gssang_i.putExtra("G_script", curData.G_script)
            gssang_i.putExtra("G_phone", curData.G_phone)

            ContextCompat.startActivity(holder.itemView.context, gssang_i, null)
        }
    }

    override fun getItemCount() = DataList.size

}
