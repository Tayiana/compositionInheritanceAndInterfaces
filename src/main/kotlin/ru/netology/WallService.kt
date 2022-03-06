package ru.netology

object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    // метод для создания записи
    fun add(post: Post): Post {
        val newPostWithUniqueIndex = post.copy(id = posts.lastIndex + 1)
        posts += newPostWithUniqueIndex
        return newPostWithUniqueIndex
    }

    // метод для обновления записи
    fun update(post: Post): Boolean {
        // обновлять все свойства, кроме id владельца и даты создания.
        val post = posts.find { it.id == post.id } ?: return false
        val postInd = posts.indexOf(post)
        val newPost = post.copy(ownerId = post.ownerId, date = post.date)
        posts[postInd] = newPost
        println("обновленное значение: $newPost")
        return true
    }

    fun createComment(post: Post,comment: Comment): Int? {
        return if (comment.postId == post.id) {
            comments += comment
            comments.lastIndex
        }  else null
    }
}