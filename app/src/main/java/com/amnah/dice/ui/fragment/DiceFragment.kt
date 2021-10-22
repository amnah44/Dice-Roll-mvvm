package com.amnah.dice.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.amnah.dice.databinding.FragmentDiceBinding

class DiceFragment : Fragment() {
    private lateinit var _binding: FragmentDiceBinding
    private val _diceViewModel: DiceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiceBinding.inflate(layoutInflater)
        _binding.apply {
            diceViewModel = _diceViewModel
            lifecycleOwner = this@DiceFragment
        }

        return _binding.root
    }

}