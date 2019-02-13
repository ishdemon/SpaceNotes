package com.wiseassblog.domain.interactor

import com.wiseassblog.domain.NoteServiceLocator
import com.wiseassblog.domain.domainmodel.Note
import com.wiseassblog.domain.domainmodel.Result
import com.wiseassblog.domain.domainmodel.User
import kotlinx.coroutines.channels.Channel


class PublicNoteSource {
    suspend fun getNotes(locator: NoteServiceLocator): Result<Exception, List<Note>> = locator
            .remotePublic
            .getNotes()


    suspend fun getNoteById(id: String,
                            locator: NoteServiceLocator): Result<Exception, Note?> = locator
            .remotePublic
            .getNote(id)

    suspend fun updateNote(note: Note,
                           locator: NoteServiceLocator): Result<Exception, Unit> = locator
            .remotePublic
            .updateNote(note)

    suspend fun deleteNote(note: Note,
                           locator: NoteServiceLocator): Result<Exception, Unit> = locator
            .remotePublic
            .deleteNote(note)
}
