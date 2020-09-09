package com.example.matrixdeterminant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.matrixdeterminant.databinding.FragmentMatrix2x2Binding
import kotlinx.android.synthetic.main.fragment_matrix2x2.*

class Matrix2x2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMatrix2x2Binding>(inflater,
            R.layout.fragment_matrix2x2,container,false)


        binding.button3x3.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_matrix2x2_to_fragment_matrix3x3)
        }

        binding.buttonCalculate.setOnClickListener { view: View ->

            var answer = calculate()

            textview_answer.text = answer.toString()

        }

        return binding.root
    }

    private fun calculate() : Float{
        var answer = (editText00.text.toString().toFloat() * editText11.text.toString().toFloat()) - (editText01.text.toString().toFloat() * editText10.text.toString().toFloat())

        return answer
    }



}
