package com.example.gym

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gym.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GymFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GymFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_gym, container, false)

    }

    val DataList = arrayListOf(
        GData(R.drawable.jung,"대진 헬스 클럽","대표 트레이너 : 정종진",
            "\n Monthly Cost : 80,000₩ \n LOC : 경기도 포천시 선단동 대진헬스클럽 \n Time : 08:00 ~ 22:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Cable Machine \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "031-111-1111"),
        GData(R.drawable.jang,"의정부 헬스 클럽","대표 트레이너 : 장윤석",
            "\n Monthly Cost : 100,000₩ \n LOC : 경기도 의정부시 민락동 의정부 헬스 클럽 \n Time : 09:00 ~ 23:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Cycle Machine \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "031-111-1234"),
        GData(R.drawable.son,"노원 헬스 클럽","대표 트레이너 : 손방용",
            "\n Monthly Cost : 100,000₩ \n LOC : 서울 노원구 상계동 노원 헬스 클럽 \n Time : 08:00 ~ 23:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Cycle Machine \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "031-111-4567"),
        GData(R.drawable.lee,"건대 헬스 클럽","대표 트레이너 : 이시진",
            "\n Monthly Cost : 110,000₩ \n LOC : 서울 광진구 화양동 건대 헬스 클럽 \n Time : 09:00 ~ 24:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Back Extension \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "031-111-7891"),
        GData(R.drawable.pan,"종로 헬스 클럽","대표 트레이너 : 신판섭",
            "\n Monthly Cost : 110,000₩ \n LOC : 서울 종로구 익선동 종로 헬스 클럽 \n Time : 07:00 ~ 23:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Cycle Machine \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "031-111-1342"),
        GData(R.drawable.kim,"강남 헬스 클럽","대표 트레이너 : 김정민",
            "\n Monthly Cost : 130,000₩ \n LOC : 서울 강남구 신사동 강남 헬스 클럽 \n Time : 06:00 ~ 22:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Back Extension \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "0031-111-1612"),
        GData(R.drawable.seo,"구리 헬스 클럽","대표 트레이너 : 서혜선",
            "\n Monthly Cost : 90,000₩ \n LOC : 경기도 구리시 다산동 구리 헬스 클럽 \n Time : 07:00 ~ 23:00 \n\n " +
                    "Machine \n\n 1. Running Machine \n\n 2. Cable Machine \n\n 3. Smith Machine \n\n 4. Power Rack \n\n 5. Bench \n\n 6. Lat Pull Down \n\n 7. Leg Extension \n\n 8. Leg Curl \n\n 9. Leg Press",
            "031-111-1341")
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        g_recyclear.layoutManager = (LinearLayoutManager(getActivity()))
        g_recyclear.adapter = GAdapter(DataList)

    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GymFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GymFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}