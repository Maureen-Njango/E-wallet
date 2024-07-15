package com.example.userapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.userapplication.databinding.ActivityMainBinding

class Adapter (var wallet:List<User_list>):RecyclerView.Adapter<walletviewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): walletviewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_applications, parent,false)
        return walletviewHolder(itemView)


    }

    override fun getItemCount(): Int {
        return wallet.size

    }

    override fun onBindViewHolder(holder: walletviewHolder, position: Int) {

        val walletlist=wallet[position]
        holder.tvsalary.text=walletlist.salary
        holder.tvamount.text = walletlist.amount
        holder.tvdate.text = walletlist.amount







    }

}




class walletviewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvsalary = itemView.findViewById<TextView>(R.id.tvsalary)
    var tvamount = itemView.findViewById<TextView>(R.id.tvsalaryamount)
    var tvdate = itemView.findViewById<TextView>(R.id.tvjulyone)
}


