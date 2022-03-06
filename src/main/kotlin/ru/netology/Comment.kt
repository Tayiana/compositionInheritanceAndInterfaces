package ru.netology

data class Comment(
    val ownerId: Int,
    var postId: Int,
    var fromGroup: Int,
    val message: String,
    var replyToComment: Int,
    val attachments: ArrayList<CommentAttachments>,
    var stickerId: Int,
    val guid: String,
)

data class CommentAttachments(
    val type: String?,
    val ownerId: Int?,
    val mediaId: Int?
)