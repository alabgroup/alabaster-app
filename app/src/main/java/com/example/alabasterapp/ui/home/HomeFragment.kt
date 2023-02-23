package com.example.alabasterapp.ui.home

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.alabasterapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        //val coverImage: ImageView = binding.coverImage
//        val imageModifier = Modifier
//            .size(150.dp)
//            .border(BorderStroke(1.dp, Color.Black))
//            .background(Color.Yellow)
//        Image(
//            painter = painterResource(id = R.drawable.dog),
//            contentDescription = stringResource(id = R.string.dog_content_description),
//            contentScale = ContentScale.Fit,
//            modifier = imageModifier
//        )


        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}