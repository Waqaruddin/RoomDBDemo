package com.example.roomdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdemo.database.Employee
import kotlinx.android.synthetic.main.row_adapter_emp.view.*
import kotlin.math.ln1p

class AdapterEmployee(var mContext: Context, var mList:List<Employee>):RecyclerView.Adapter<AdapterEmployee.MyViewHolder>(){


    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(emp:Employee){
            itemView.text_view_name.text = emp.name.toString()
            itemView.text_view_email.text = emp.email.toString()
            itemView.text_view_id.text = emp.id.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(mContext).inflate(R.layout.row_adapter_emp, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var emp = mList[position]
        holder.bind(emp)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    fun setData(l:List<Employee>){
        mList = l
        notifyDataSetChanged()
    }
}