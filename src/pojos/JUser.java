package pojos;

import java.util.Date;
import org.jetbrains.annotations.Nullable;

public class JUser {
  private final String id;
  private String firstName;
  private @Nullable String lastName;
  private @Nullable Date birthday;

  public JUser(String id, String firstName, @Nullable String lastName, @Nullable Date birthday) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Nullable public String getLastName() {
    return lastName;
  }

  public void setLastName(@Nullable String lastName) {
    this.lastName = lastName;
  }

  @Nullable public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(@Nullable Date birthday) {
    this.birthday = birthday;
  }

  @Override public String toString() {
    return "User{"
        + "id='" + id + '\''
        + ", firstName='" + firstName + '\''
        + ", lastName='" + lastName + '\''
        + ", birthday=" + birthday + '}';
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    JUser user = (JUser) o;

    if (!id.equals(user.id)) return false;
    if (!firstName.equals(user.firstName)) return false;
    if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
    return birthday != null ? birthday.equals(user.birthday) : user.birthday == null;
  }

  @Override public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + firstName.hashCode();
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
    return result;
  }
}
