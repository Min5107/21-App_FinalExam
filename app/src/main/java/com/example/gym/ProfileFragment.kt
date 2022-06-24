package com.example.gym

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.fragment_profile.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cm:EditText = p_text2
        val kg:EditText = p_text3
        val bmi1:TextView = p_bmi
        val button:Button = p_btn

        button.setOnClickListener {
            val strValue2 = cm.text.toString()
            val strValue3 = kg.text.toString()
            val H = strValue2.toFloat()
            val K = strValue3.toInt()
            val Hd = H / 100
            val bmi:Int = (K / (Hd * Hd)).toInt()

            val T1 = if (bmi >= 35)
            { "Your BMI : $bmi \n 고도비만 입니다!"
            } else if (bmi > 25) {
                "Your BMI : $bmi \n 비만 입니다!"
            } else if (bmi > 23) {
                "Your BMI : $bmi \n 과체중 입니다!"
            } else if (bmi > 18.5) {
                "Your BMI : $bmi \n 정상체중 입니다!"
            }  else{
                "Your BMI : $bmi \n 저체중 입니다!"
            }

            val result = T1

            bmi1.setText(result)

        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfileFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}