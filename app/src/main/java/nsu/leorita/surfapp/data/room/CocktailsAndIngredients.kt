package nsu.leorita.surfapp.data.room

import androidx.room.Embedded
import androidx.room.Relation
import nsu.leorita.surfapp.data.room.entities.IngredientDbEntity
import nsu.leorita.surfapp.domain.model.Cocktail

data class CocktailsAndIngredients(
    @Embedded
    val cocktail: Cocktail,
    @Relation(
        parentColumn = "name",
        entityColumn = "cocktail"
    )
    val ingredients: List<IngredientDbEntity>
)
