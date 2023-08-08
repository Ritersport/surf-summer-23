package nsu.leorita.surfapp.ui.cocktail_creating

import androidx.lifecycle.ViewModel
import nsu.leorita.surfapp.data.room.entities.CocktailDbEntity
import nsu.leorita.surfapp.data.room.entities.IngredientDbEntity
import nsu.leorita.surfapp.domain.room.AppDatabase
import nsu.leorita.surfapp.ui.base.BaseFragment
import nsu.leorita.surfapp.ui.base.BaseViewModel

class CocktailCreatingViewModel(val db: AppDatabase) : BaseViewModel() {

    fun saveCocktail(title: String, description: String, recipe: String, ingredients: List<String>) {
        db.getCocktailsDao().insertCocktail(CocktailDbEntity(name = title, description, recipe))
        ingredients.forEach {
            db.getCocktailsDao().insertIngredient(IngredientDbEntity(0, it, title))
        }

    }
}