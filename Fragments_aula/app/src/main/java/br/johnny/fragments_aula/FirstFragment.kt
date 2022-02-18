package br.johnny.fragments_aula

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.buttonNext)
        button.setOnClickListener(){
            parentFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, SecondFragment())
                .addToBackStack(null)
                .commit()

            val fragment = SecondFragment()
            val bundle = Bundle().apply { putString("key", "value") }
            fragment.arguments = bundle

            val intent = Intent(this, SecondFragment::class.java)
            startActivity(intent)
        }

    }
    
}