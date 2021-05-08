package com.example.sliding.ui.translator

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.sliding.R
import com.example.sliding.ui.slideshow.SlideshowViewModel

class TranslatorFragment : Fragment() {

    companion object {
        fun newInstance() = TranslatorFragment()
    }

    private lateinit var translatorViewModel: TranslatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        translatorViewModel = ViewModelProvider(this).get(TranslatorViewModel::class.java)
        val root = inflater.inflate(R.layout.translator_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.text_translator)
        translatorViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        translatorViewModel = ViewModelProvider(this).get(TranslatorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}