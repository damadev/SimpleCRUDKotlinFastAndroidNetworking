package com.damadev.simplecrud

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.student_list.view.*

class RVAdapterStudent (private val context: Context, private val arrayList: ArrayList<Students>)
    : RecyclerView.Adapter<RVAdapterStudent.Holder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.student_list, parent, false))
    }

    override fun getItemCount(): Int = arrayList!!.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.lbNimList.text = arrayList?.get(position)?.nim
        holder.view.lnNameList.text = "Nama : " + arrayList?.get(position)?.name
        holder.view.lbAddressList.text = "Alamat : " + arrayList?.get(position)?.address
        holder.view.lbGenderList.text = "Jenkel : " + arrayList?.get(position)?.gender
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}