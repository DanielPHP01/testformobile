package com.geeks.myapplication

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.geeks.myapplication.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
// parcelable  == serializable
        if (arguments != null) {
            val args = DetailFragmentArgs.fromBundle(requireArguments())
            binding.btnBack.setOnClickListener() {
                findNavController().navigateUp()
            }
            binding.tvName.text = args.name
            binding.tvDescription.text = args.desc
            binding.tvPrice.text = args.price
            view
            Glide.with(requireContext()).load(args.image).into(binding.ivFruit)
        }


    }
}

// Дз
// доделать приложение
// 1 позвонить при нажатии звоним по номеру // detail fragment
// 2 заказать при нажатии перекидываем на WA // detail fragment
// добавить RV новый с напитками // другая верстка