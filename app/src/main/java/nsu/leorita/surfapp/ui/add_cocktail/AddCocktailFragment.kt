package nsu.leorita.surfapp.ui.add_cocktail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import nsu.leorita.surfapp.R
import nsu.leorita.surfapp.databinding.FragmentAddCocktailBinding
import nsu.leorita.surfapp.ui.base.BaseFragment
import nsu.leorita.surfapp.ui.base.BaseViewModel
import nsu.leorita.surfapp.ui.base.viewBinding

class AddCocktailFragment : BaseFragment(){
    override val binding by viewBinding { inflater, container ->
        FragmentAddCocktailBinding.inflate(inflater, container, false)
    }

    override val viewModel: BaseViewModel
        get() = TODO("Not yet implemented")


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addCocktailButton.setOnClickListener {
            findNavController().navigate(R.id.action_addCocktailFragment_to_cocktailCreatingFragment)
        }
    }


}