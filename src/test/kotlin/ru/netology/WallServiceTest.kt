package ru.netology

import org.junit.Assert.*
import org.junit.Test
import ru.netology.WallService.add
import ru.netology.WallService.createComment

class WallServiceTest {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comments>()

    val firstPost = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createdBy = 85,
        date = 1644747617,
        text = "Текст поста",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(
            count = 121
        ),
        postType = "post",
        PostSource(
            type = "vk",
            platform = "android",
            data = "profile_activity",
            url = "https://github.com/"
        ),
        arrayListOf(
            AttachmentPhoto(type = "photo", photo = Photo(
                id = 19,
                ownerId = 156,
                photo130 = "url",
                photo604 = "")),
            AttachmentVideo(type = "video", video = Video(
                id = 5568,
                ownerId = 196,
                title = "title",
                description = "dfgh",
                duration = 8,
                photo130 = "photo130",
                photo_320 = "photo33330",
                photo_640 = "photo_640",
                photo_800 = "800",
                date = 344222700,
                addingDate = 344747700,
                views = 589655,
                comments = 0,
                player = "player",
                access_key = "fer",
                processing = 963025,
                live = 18,
                upcoming = 98652,
                isFavorite = true))),
        Geo(
            type = "",
            coordinates = "",
            place = null
        ),
        signerId = 777,
        copyHistory = ArrayList(),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val secondPost = Post(
        id = 2,
        ownerId = 222,
        fromId = 222,
        createdBy = 95,
        date = 244747700,
        text = "Текст поста 2",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        PostSource(
            type = "vk",
            platform = "android",
            data = "profile_activity",
            url = "https://github.com/"
        ),
        arrayListOf(
            AttachmentGraffiti(
                type = "graffiti",
                graffiti = Graffiti(
                    id = 10,
                    ownerId = 236,
                    photo130 = "urlrtryry",
                    photo604 = "")),
            AttachmentApp(
                type = "app",
                app = ApplicationContent(
                    id = 36,
                    name = "AttachmentApp",
                    photo130 = "url36",
                    photo604 = "er"))),
        Geo(
            type = "",
            coordinates = "",
            place = null
        ),
        signerId = 777,
        copyHistory = ArrayList(),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val thirdPost = Post(
        id = 2,
        ownerId = 333,
        fromId = 333,
        createdBy = 33,
        date = 344747700,
        text = "Текст поста 3",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        PostSource(
            type = "vk",
            platform = "android",
            data = "profile_activity",
            url = "https://github.com/"
        ),
        arrayListOf(
            AttachmentPhoto(
                type = "photo",
                photo = Photo(
                    id = 19,
                    ownerId = 156,
                    photo130 = "url",
                    photo604 = "")),
            AttachmentVideo(type = "video", video = Video(
                id = 6568,
                ownerId = 296,
                title = "title",
                description = "dfgh",
                duration = 8,
                photo130 = "photo130",
                photo_320 = "photo33330",
                photo_640 = "photo_640",
                photo_800 = "800",
                date = 344222700,
                addingDate = 344747700,
                views = 589655,
                comments = 0,
                player = "player2",
                access_key = "fer",
                processing = 163025,
                live = 28,
                upcoming = 18652,
                isFavorite = false))),
        Geo(
            type = "",
            coordinates = "",
            place = null
        ),

        signerId = 777,
        copyHistory = ArrayList(),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val fourPost = Post(
        id = 3,
        ownerId = 444,
        fromId = 444,
        createdBy = 44,
        date = 444747617,
        text = "Текст поста 4",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        PostSource(
            type = "vk",
            platform = "android",
            data = "profile_activity",
            url = "https://github.com/"
        ),
        arrayListOf(
            AttachmentPhoto(
                type = "photo",
                photo = Photo(id = 19,
                    ownerId = 156,
                    photo130 = "url",
                    photo604 = "")),
            AttachmentAudio(
                type = "audio",
                audio = Audio(
                    id = 53,
                    ownerId = 200,
                    artist = "artist",
                    title = "title",
                    duration = 300,
                    url = "url",
                    lyricsId = 19,
                    albumId = 569,
                    ganreId = 9,
                    date = 1644747620,
                    noSearch = 98562))),
        Geo(
            type = "Geo",
            coordinates = "coordinates",
            place = null
        ),

        signerId = 777,
        copyHistory = ArrayList(),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val firstComment = Comment(
        ownerId = 1,
        postId = 1,
        fromGroup = 36,
        message = "Текст коммента",
        replyToComment = 1,
        attachments = arrayListOf(),
        stickerId = 369,
        guid = "guid"
    )

    val secondComment = Comment(
        ownerId = 145,
        postId = 145,
        fromGroup = 3645,
        message = "Текст коммента 2",
        replyToComment = 1,
        attachments = arrayListOf(),
        stickerId = 369,
        guid = "guid 2"
    )

    @Test
    //проверка на метод добавления
    fun createNewPost() {
        val postId = add(firstPost).id
        assertNotNull(postId)
    }

    @Test
    fun updateExistingTrue() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(firstPost)
        service.add(secondPost)
        // создаём информацию об обновлении
        val update = thirdPost
        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateExistingFalse() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(firstPost)
        service.add(secondPost)
        service.add(thirdPost)
        // создаём информацию об обновлении
        val update = fourPost
        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test
    fun createCommentPositive() {
        assertNotNull(createComment(firstPost, firstComment))
    }

    class PostNotFoundException(message: String) : RuntimeException(message)

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        createComment(firstPost, secondComment)
            ?: throw PostNotFoundException("You can't add a comment to a non-existent post")
    }
}