package com.example.gym
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_menu.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    class Food(val sides: Int) {
        fun roll(): Int {
            return (1..sides).random()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var uriValue:String = ""


        m_btn1.setOnClickListener {
            val myFood: Food = Food(8)
            val num = myFood.roll()

            when (num) {
                1 -> {m_img.setImageResource(R.drawable.broccoli_m)
                    m_title.text = "브로콜리 샐러드"
                    uriValue = "https://www.10000recipe.com/recipe/6902283"}
                2 -> {m_img.setImageResource(R.drawable.tomato_mm)
                    m_title.text = "토마토 샐러드"
                    uriValue = "https://www.10000recipe.com/recipe/6902079"}
                3 -> {m_img.setImageResource(R.drawable.sdufu_m)
                    m_title.text = "연두부 샐러드"
                    uriValue = "https://www.10000recipe.com/recipe/6842280"}
                4 -> {m_img.setImageResource(R.drawable.salmon_m)
                    m_title.text = "연어 샐러드"
                    uriValue = "https://www.10000recipe.com/recipe/6908991"}
                5 -> {m_img.setImageResource(R.drawable.chicken_m)
                    m_title.text = "닭가슴살 샐러드"
                    uriValue = "https://www.10000recipe.com/recipe/6844730"}
                6 -> {m_img.setImageResource(R.drawable.beaf_m)
                    m_title.text = "소고기 샐러드"
                    uriValue = "https://www.10000recipe.com/recipe/6830455"}
                7 -> {m_img.setImageResource(R.drawable.conyak_m)
                    m_title.text = "곤약 볶음밥"
                    uriValue = "https://www.10000recipe.com/recipe/6939159"}
                8 -> {m_img.setImageResource(R.drawable.dufu_m)
                    m_title.text = "두부 유부초밥"
                    uriValue = "https://www.10000recipe.com/recipe/6903698"}

            }

        }

        m_btn2.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("$uriValue"))
            startActivity(intent)
        }
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MenuFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MenuFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}