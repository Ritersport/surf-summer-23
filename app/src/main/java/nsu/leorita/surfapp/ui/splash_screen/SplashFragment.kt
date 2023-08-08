package nsu.leorita.surfapp.ui.splash_screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import nsu.leorita.surfapp.R
import nsu.leorita.surfapp.databinding.FragmentSplashBinding
import nsu.leorita.surfapp.ui.base.BaseFragment
import nsu.leorita.surfapp.ui.base.BaseViewModel
import nsu.leorita.surfapp.ui.base.viewBinding

class SplashFragment : BaseFragment(){
    override val binding by viewBinding { inflater, container ->
        FragmentSplashBinding.inflate(inflater, container, false)
    }
    override val viewModel: BaseViewModel
        get() = TODO("Not yet implemented")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        findNavController().navigate(R.id.action_splashFragment_to_addCocktailFragment)
    }



}