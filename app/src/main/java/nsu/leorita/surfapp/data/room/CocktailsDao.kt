package nsu.leorita.surfapp.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import io.reactivex.Completable
import io.reactivex.Observable
import nsu.leorita.surfapp.data.room.entities.CocktailDbEntity
import nsu.leorita.surfapp.data.room.entities.IngredientDbEntity
import nsu.leorita.surfapp.domain.model.Cocktail

@Dao
interface CocktailsDao {
    @Query("SELECT * FROM cocktails")
    fun getCocktailsInfo(): Observable<List<CocktailDbEntity>>

    @Query("SELECT * FROM ingredients WHERE cocktail = :cocktail")
    fun getIngredients(cocktail: Int): Observable<List<IngredientDbEntity>>

    @Update
    fun updateCocktail(cocktail: CocktailDbEntity): Completable

    @Insert
    fun insertCocktail(cocktail: CocktailDbEntity): Completable

    @Insert
    fun insertIngredient(ingredient: IngredientDbEntity): Completable
}