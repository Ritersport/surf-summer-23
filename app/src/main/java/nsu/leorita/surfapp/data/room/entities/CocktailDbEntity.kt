package nsu.leorita.surfapp.data.room.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(
    tableName = "cocktails",
    indices = [
        Index("name", unique = true)
    ],
)
data class CocktailDbEntity(
    @PrimaryKey(autoGenerate = false) val name: String,
    val description: String?,
    val recipe: String?

) {
}