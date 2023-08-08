package nsu.leorita.surfapp.domain.room

import androidx.room.Database
import androidx.room.RoomDatabase
import nsu.leorita.surfapp.data.room.CocktailsDao
import nsu.leorita.surfapp.data.room.entities.CocktailDbEntity
import nsu.leorita.surfapp.data.room.entities.IngredientDbEntity

@Database(
    version = 1,
    entities = [
        CocktailDbEntity::class,
        IngredientDbEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getCocktailsDao(): CocktailsDao
}