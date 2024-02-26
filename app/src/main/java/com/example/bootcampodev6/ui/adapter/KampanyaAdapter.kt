package com.example.bootcampodev6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcampodev6.data.entity.Kampanya
import com.example.bootcampodev6.databinding.KampanyaCardBinding
import com.google.android.material.snackbar.Snackbar

class KampanyaAdapter(var kampanyaListesi: List<Kampanya>) :
    RecyclerView.Adapter<KampanyaAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: KampanyaCardBinding) :
        RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding =
            KampanyaCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kampanya = kampanyaListesi.get(position)
        holder.tasarim.apply {
            imageViewKapmanya.setImageResource(
                kampanya.resim
            )
            button4.visibility = if (kampanya.buttonGorunum) View.VISIBLE else View.GONE
            button4.text = kampanya.button

            textView3.visibility = if (kampanya.baslik == null)View.GONE else View.VISIBLE
            textView4.visibility = if (kampanya.baslik == null)View.GONE else View.VISIBLE

            textView3.text = kampanya.baslik
            textView4.text = kampanya.aciklama
        }
    }

    override fun getItemCount(): Int {
        return kampanyaListesi.size
    }
}