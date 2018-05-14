package sealedclasses


sealed class KNotification
data class KMessageNotification(val userId: Long, val text: String) : KNotification()
data class KLikeNotification(val userId: Long, val wasLiked: Boolean) : KNotification()
data class KPostUpdatesNotification(val postId: Long, val newCommentsCount: Int) : KNotification()

private fun desribe(notification: KNotification) =
    when (notification) {
      is KMessageNotification     -> "New message: ${notification.text}"
      is KLikeNotification        -> "You were ${if (!notification.wasLiked) "un" else ""}liked"
      is KPostUpdatesNotification -> "You have ${notification.newCommentsCount} new comments"
//      else                        -> "... You don't need this anymore"
    }

fun main(args: Array<String>) {
  println(desribe(KLikeNotification(42L, false)))
}
