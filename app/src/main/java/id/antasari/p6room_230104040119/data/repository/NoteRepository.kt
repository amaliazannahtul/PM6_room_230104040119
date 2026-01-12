package id.antasari.p6room_230104040119.data.repository

import id.antasari.p6room_230104040119.data.local.dao.NoteDao
import id.antasari.p6room_230104040119.data.local.entity.NoteEntity

class NoteRepository(private val noteDao: NoteDao) {

    suspend fun insert(note: NoteEntity) {
        noteDao.insertNote(note)
    }

    suspend fun getNotes(): List<NoteEntity> {
        return noteDao.getAllNotes()
    }

    suspend fun deleteAll() {
        noteDao.deleteAllNotes()
    }
}
