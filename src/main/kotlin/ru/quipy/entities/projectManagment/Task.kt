package ru.quipy.entities.projectManagment

import java.util.UUID

data class Task(
    val id : UUID,
    val name : String,
    val projectId : UUID,
    var statusId : UUID,
) {
    val assigneeIds : MutableList<UUID> = mutableListOf()
}