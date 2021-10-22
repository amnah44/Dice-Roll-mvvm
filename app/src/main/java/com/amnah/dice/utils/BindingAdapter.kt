package com.amnah.dice.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.amnah.dice.model.DiceNumber
import com.bumptech.glide.Glide

@BindingAdapter(value = ["app:showDiceImages"])
fun getDiceIMage(view: ImageView, diceNumber: DiceNumber?){
    when(diceNumber){
        DiceNumber.ONE -> Glide.with(view.context).load(Constants.DICE_ONE_URL).into(view)
        DiceNumber.TWO -> Glide.with(view.context).load(Constants.DICE_TWO_URL).into(view)
        DiceNumber.THREE -> Glide.with(view.context).load(Constants.DICE_THREE_URL).into(view)
        DiceNumber.FOUR -> Glide.with(view.context).load(Constants.DICE_FOUR_URL).into(view)
        DiceNumber.FIVE -> Glide.with(view.context).load(Constants.DICE_FIVE_URL).into(view)
        DiceNumber.SIX -> Glide.with(view.context).load(Constants.DICE_SIX_URL).into(view)
    }
}