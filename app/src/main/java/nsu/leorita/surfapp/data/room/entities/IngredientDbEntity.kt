package nsu.leorita.surfapp.data.room.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "ingredients",
    foreignKeys = [ForeignKey(
        entity = CocktailDbEntity::class,
        parentColumns = arrayOf("name"),
        childColumns = arrayOf("cocktail"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class IngredientDbEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val text: String,
    val cocktail: String
)
