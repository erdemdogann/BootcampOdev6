package com.example.bootcampodev6.ui.fragment

import android.content.res.Resources.getSystem
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ConcatAdapter
import com.example.bootcampodev6.R
import com.example.bootcampodev6.data.entity.Kahve
import com.example.bootcampodev6.data.entity.Kampanya
import com.example.bootcampodev6.databinding.FragmentMainBinding
import com.example.bootcampodev6.ui.adapter.KahveAdapter
import com.example.bootcampodev6.ui.adapter.KampanyaAdapter
import com.example.bootcampodev6.ui.adapter.VerticalItemDecoration


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)

        val kahve = listOf<Kahve>(
            Kahve(R.drawable.image_card)
        )

        val kampanya = listOf<Kampanya>(
            Kampanya(
                R.drawable.kampanya_1,
                "",
                false,
                "3 al 2 öde! ☕\uD83C\uDF89",
                "2 senden, 1 bizden! 23 Şubat-7 Mart tarihleri arasında mağazalarımızdan alacağın Starbucks® kupa, termos ve aksesuarlarda 3 al 2 öde \uD83E\uDD73"
            ),
            Kampanya(
                R.drawable.kampanya_2,
                "Yemeksepeti",
                true,
                "STAR bir kupon \uD83E\uDD73",
                "60 TL hediyen Yemeksepeti’nden! Hemen 200 TL ve üzeri siparişini ver, STAR kupon koduyla 60 TL az öde \uD83D\uDE09"
            ),
            Kampanya(
                R.drawable.kampanya_3,
                "İşbank",
                true,
                "Starbucks®’ta 100 TL geri kazanın!",
                "15 - 29 Şubat 2024 tarihleri arasında Maximum Kart’ınız ile Starbucks® mağazalarından tek seferde yapacağınız 200 TL ve üzeri her ödemenizde 50 TL, toplam 100 TL geri kazanın!"
            ),
            Kampanya(
                R.drawable.kampanya_4,
                "",
                false,
                "Karamel & beyaz çikolata aşkına \uD83E\uDDE1\uD83E\uDD0D",
                "Yeni sıcak çikolata ve Frappuccino® lezzetimizle tatlı yönlerini paylaşmaya ne dersin? \uD83E\uDD70 Kısa süreliğine seninle ve sevdiklerinle \uD83D\uDE0A "
            )
        )

        binding.recyclerView.adapter = ConcatAdapter(KahveAdapter(kahve),KampanyaAdapter(kampanya))


        binding.recyclerView.addItemDecoration(VerticalItemDecoration(12.dp))

        return binding.root
    }

}

val Int.dp: Int get() = (this * getSystem().displayMetrics.density).toInt()//Int to dp