package com.example.matrixdeterminant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.matrixdeterminant.databinding.FragmentMatrix3x3Binding
import kotlinx.android.synthetic.main.fragment_matrix3x3.*

class fragment_matrix3x3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMatrix3x3Binding>(inflater,
            R.layout.fragment_matrix3x3, container, false)

        binding.button2x2.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragment_matrix3x3_to_matrix2x2)
        }

        binding.buttonCalculate.setOnClickListener { view: View ->
            val answer = calculate()

            textview_answer.text = answer.toString()
        }

        return binding.root
    }

    private fun calculate() : Float{
        var num1 = editText00.text.toString().toFloat()
        var num2 = editText01.text.toString().toFloat()
        var num3 = editText02.text.toString().toFloat()
        var num4 = editText10.text.toString().toFloat()
        var num5 = editText11.text.toString().toFloat()
        var num6 = editText12.text.toString().toFloat()
        var num7 = editText20.text.toString().toFloat()
        var num8 = editText21.text.toString().toFloat()
        var num9 = editText22.text.toString().toFloat()

        var answer = (num1 * ((num5 * num9) - (num6 * num8))) - (num2 * ((num4 * num9) - (num6 * num7))) + (num3 * ((num4 * num8) - (num5 * num7)))

        return answer
    }
}