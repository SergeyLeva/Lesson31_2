package ua.sergeylevchenko.a31_1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class Fragment1 : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment1, container, false)
    }

    override fun onClick(v: View?) {

        val buttonIndex = translateIdToIndex(v!!.id)

        val listener = activity as OnSelectedButtonListener?
        listener?.onButtonSelected(buttonIndex)
        println("Вы щёлкнули по кнопке $buttonIndex")

    }

    interface OnSelectedButtonListener {
        fun onButtonSelected(buttonIndex: Int)
    }

    private fun translateIdToIndex(id: Int): Int {
        var index = -1
        when (id) {
            R.id.button1 -> index = 1
            R.id.button2 -> index = 2
            R.id.button3 -> index = 3
        }
        return index
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1: Button = view.findViewById(R.id.button1)
        val button2: Button = view.findViewById(R.id.button2)
        val button3: Button = view.findViewById(R.id.button3)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
    }


}