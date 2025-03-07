package ch.brix.gql.client.frontify.builders;

public class On_User extends ch.brix.gql.client.TypeBuilder {
  public On_User() {
    super(new ch.brix.gql.client.On("User"));
  }
  /**
   * `User` Id.
   */
  public On_User id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `User` email. This field will be removed. Use `AccountUser.email` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `AccountUser.email` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_User email() {
    _add_field("email");
    return this;
  }
  /**
   * `User` name.
   */
  public On_User name() {
    _add_field("name");
    return this;
  }
  /**
   * **DEPRECATED** `User` avatar. This field will be removed. Use `AccountUser.avatar` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `AccountUser.avatar` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_User avatar() {
    _add_field("avatar");
    return this;
  }
}
