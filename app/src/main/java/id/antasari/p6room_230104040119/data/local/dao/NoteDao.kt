package id.antasari.p6room_230104040119.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import id.antasari.p6room_230104040119.data.local.entity.NoteEntity

@Dao
interface NoteDao {

    @Insert
    suspend fun insertNote(note: NoteEntity)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes(): List<NoteEntity>

    @Query("DELETE FROM notes")
    suspend fun deleteAllNotes()
}
