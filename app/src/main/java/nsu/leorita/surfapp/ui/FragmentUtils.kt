package nsu.leorita.surfapp.ui

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import nsu.leorita.surfapp.App
import nsu.leorita.surfapp.ui.cocktail_creating.CocktailCreatingViewModel
import nsu.leorita.surfapp.ui.cocktails_list.CocktailsListViewModel
import java.lang.IllegalStateException

class ViewModelFactory (
    private val app: App
        ) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val viewModel = when (modelClass) {
            CocktailsListViewModel::class.java -> {
                CocktailsListViewModel()
            }
                CocktailCreatingViewModel::class.java -> {
                    app.db?.let { CocktailCreatingViewModel(it) }
                }
            else -> {
                throw IllegalStateException("Unknown view model class")
            }
        }
        return viewModel as T
    }
        }

fun Fragment.factory() = ViewModelFactory(requireContext().applicationContext as App)