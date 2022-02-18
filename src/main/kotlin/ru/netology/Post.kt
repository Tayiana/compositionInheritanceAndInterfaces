package ru.netology

data class Post(
    var id: Int,
    var ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comments: Comments?, //nullable
    val copyright: Copyright?,
    val likes: Likes?,
    val reposts: Reposts?,
    val views: Views?,
    val postType: String,
    val postSource: PostSource?,
    //val attachments
    val geo: Geo?,
    val signerId: Int?,
    val copyHistory: ArrayList<String>?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut?,
    val postponedId: Int?
)

data class Comments(
    val count: Int?,
    val canPost: Boolean?,
    val groupsCanPost: Boolean?,
    val canClose: Boolean?,
    val canOpen: Boolean?
)

data class Copyright(
    val id: Int?,
    val link: String?,
    val name: String?,
    val type: String?
)

data class Likes(
    val count: Int?,
    val userLikes: Boolean?,
    val canLike: Boolean?,
    val canPublish: Boolean?
)

data class Reposts(
    val count: Int?,
    val userReposted: Boolean?
)

data class Views(
    val count: Int?
)

data class PostSource(
    val type: String?,
    val platform: String?,
    val data: String?,
    val url: String?,
)

data class Geo(
    val type: String?,
    val coordinates: String?,
    val place: String?
)

data class Donut(
    val isDonut: Boolean?,
    val paidDuration: Int?,
    val placeholder: Any?,
    val canPublishFreeCopy: Boolean?,
    val editMode: String?
)