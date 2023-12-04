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
   * `User` email.
   */
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
   * `User` avatar.
   */
  public On_User avatar() {
    _add_field("avatar");
    return this;
  }
}
