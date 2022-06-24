package com.example.gym
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_training.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TrainingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TrainingFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_training, container, false)
    }
    val DataList1 = arrayListOf(
        TData("유산소", "https://www.youtube.com/watch?v=swRNeYw1JkY",
            "\n <유산소 운동> \n\n 1. 워밍업 \n\n 2. 트위스트니 \n\n 3. 스쿼트&킥 \n\n 4. 스텝&스윙 \n\n 5. 플랭크&리프트 \n\n 6. 밸리 밤 \n\n 7. 쿨다운 \n\n 8. 마무리"),
        TData("상체", "https://www.youtube.com/watch?v=7NPwSCjqka0",
            "\n <상체운동> \n\n 1.벤치프레스 \n\n 2.인클라인 벤치프레스 \n\n 3. 디클라인 벤치프레스 \n\n 4. 밀리터리X아놀드 컴파운드 \n\n 5. 사이드레터럴레이즈 \n\n 6. 벤트오버 레터럴레이즈 \n\n 7. 푸쉬다운 \n\n 8. 오버헤드 익스텐션 "),
        TData("하체","https://www.youtube.com/watch?v=tzN6ypk6Sps",
            "\n <하체운동> \n\n 1. 스트레칭 \n\n 2. 스쿼트 \n\n 3. 런지 \n\n 4. 레그 익스텐션 \n\n 5.레그컬 레그프레스")

    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        t_recyclear.layoutManager = (LinearLayoutManager(getActivity()))
        t_recyclear.adapter = TAdapter(DataList1)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TrainingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TrainingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}