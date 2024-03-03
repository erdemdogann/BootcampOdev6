package com.example.bootcampodev6.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcampodev6.data.entity.Kahve
import com.example.bootcampodev6.databinding.KahveCardBinding

class KahveAdapter(var kahve: List<Kahve>) : RecyclerView.Adapter<KahveAdapter.KahveTutucu>() {

    inner class KahveTutucu(var tasarim: KahveCardBinding) :
        RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KahveTutucu {
        val binding =
            KahveCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return KahveTutucu(binding)
    }

    override fun getItemCount(): Int {
        return kahve.size
    }

    override fun onBindViewHolder(holder: KahveTutucu, position: Int) {
        val kahveResmi = kahve.get(position)
        holder.tasarim.apply {
            imageView4.setImageResource(
                kahveResmi.resim
            )
        }
    }
}