package sealedclasses;


public class SealedClasses {

  private static String desribe(JNotification notification) {
    switch (notification.getType()) {
      case MESSAGE:
        return "New message: " + ((JMessageNotification) notification).text;

      case LIKE:
        return "You were " + (!((JLikeNotification) notification).wasLiked ? " un " : "") + "liked";

      case POST_UPDATES:
        return "You have " + ((JPostUpdatesNotification) notification).newCommentsCount + " new comments";

      default:
        throw new IllegalArgumentException("Unsupported type"); // Try to comment this line.
    }
  }

  public static void main(String[] args) {
    System.out.println(desribe(new JLikeNotification(42L, false)));
  }
}

enum NType {
  MESSAGE, LIKE, POST_UPDATES
}

interface JNotification {
  NType getType();
}

class JMessageNotification implements JNotification {
  public final long userId;
  public final String text;

  JMessageNotification(long userId, String text) {
    this.userId = userId;
    this.text = text;
  }

  @Override public NType getType() {
    return NType.MESSAGE;
  }
}

class JLikeNotification implements JNotification {
  public final long userId;
  public final boolean wasLiked;

  public JLikeNotification(long userId, boolean wasLiked) {
    this.userId = userId;
    this.wasLiked = wasLiked;
  }

  @Override public NType getType() {
    return NType.LIKE;
  }
}

class JPostUpdatesNotification implements JNotification {
  public final long userId;
  public final int newCommentsCount;

  JPostUpdatesNotification(long userId, int newCommentsCount) {
    this.userId = userId;
    this.newCommentsCount = newCommentsCount;
  }

  @Override public NType getType() {
    return NType.POST_UPDATES;
  }
}
