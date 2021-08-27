package ua.sergeylevchenko.a31_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {
    private lateinit var infoTextView: TextView
    private lateinit var catImageView: ImageView
    private lateinit var catDescriptions: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        infoTextView = view.findViewById(R.id.textView)
        catImageView = view.findViewById(R.id.imageView)
        catDescriptions = resources.getStringArray(R.array.cats)
    }

    fun setDescription(buttonIndex: Int) {
        val description: String = catDescriptions[buttonIndex]
        infoTextView.text = description
        when (buttonIndex) {
            1 -> catImageView.setImageResource(R.drawable.cat1)
            2 -> catImageView.setImageResource(R.drawable.cat2)
            3 -> catImageView.setImageResource(R.drawable.cat3)
            else -> {
            }
        }
    }
}