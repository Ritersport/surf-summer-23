package nsu.leorita.surfapp.ui.cocktail_creating

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import nsu.leorita.surfapp.databinding.FragmentCocktailCreatingBinding
import nsu.leorita.surfapp.ui.base.BaseFragment
import nsu.leorita.surfapp.ui.base.viewBinding
import nsu.leorita.surfapp.ui.factory

class CocktailCreatingFragment : BaseFragment() {

    override val binding by viewBinding { inflater, container ->
        FragmentCocktailCreatingBinding.inflate(inflater, container, false)
    }
    override val viewModel: CocktailCreatingViewModel by viewModels {   factory() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.saveButton.setOnClickListener {
            //viewModel.saveCocktail(binding.title.text.toString(), binding.description.text.toString(), binding.recipe.text.toString(), b)
        }
    }
}