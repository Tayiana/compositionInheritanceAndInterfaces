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
    val attachments: ArrayList<Attachments>,
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

class Photo(
    val id: Int?,
    val ownerId: Int?,
    val photo130: String?,
    val photo604: String?,
)

class Video(
    val id: Int?,
    val ownerId: Int,
    val title: String?,
    val description: String?,
    val duration: Int,
    val photo130: String?,
    val photo_320: String?,
    val photo_640: String?,
    val photo_800: String?,
    val date: Int?,
    val addingDate: Int?,
    val views: Int?,
    val comments: Int?,
    val player: String,
    val access_key: String,
    val processing: Int?,
    val live: Int?,
    val upcoming: Int?,
    val isFavorite: Boolean
)

class Audio(
    val id: Int?,
    val ownerId: Int,
    val artist: String?,
    val title: String?,
    val duration: Int?,
    val url: String?,
    val lyricsId: Int?,
    val albumId: Int?,
    val ganreId: Int?,
    val date: Int?,
    val noSearch: Int?
)

class Graffiti(
    val id: Int?,
    val ownerId: Int,
    val photo130: String?,
    val photo604: String?
)

class ApplicationContent(
    val id: Int?,
    val name: String?,
    val photo130: String?,
    val photo604: String?
)

interface Attachments {
    val type: String
}

data class AttachmentPhoto(
    override val type: String = "photo",
    val photo: Photo,
) : Attachments

data class AttachmentVideo(
    override val type: String = "video",
    val video: Video,
) : Attachments

data class AttachmentAudio(
    override val type: String = "audio",
    val audio: Audio,
) : Attachments

data class AttachmentGraffiti(
    override val type: String = "graffiti",
    val graffiti: Graffiti,
) : Attachments

data class AttachmentApp(
    override val type: String = "app",
    val app: ApplicationContent,
) : Attachments