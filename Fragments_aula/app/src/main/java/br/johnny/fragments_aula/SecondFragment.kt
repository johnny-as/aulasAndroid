package br.johnny.fragments_aula

import android.inputmethodservice.ExtractEditText
import android.os.Bundle
import android.provider.DocumentsContract.EXTRA_INFO
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textinfo = arguments?.getString(EXTRA_INFO)
        val eText = view.findViewById<TextView>(R.id.textView3)
        eText.setText(textinfo)
    }
}