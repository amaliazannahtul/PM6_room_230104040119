package id.antasari.p6room_230104040119.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import id.antasari.p6room_230104040119.data.local.dao.NoteDao
import id.antasari.p6room_230104040119.data.local.entity.NoteEntity

@Database(
    entities = [NoteEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}
