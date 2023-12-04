package ch.brix.gql.client.frontify.builders;

public class On_AccountUser extends ch.brix.gql.client.TypeBuilder {
  public On_AccountUser() {
    super(new ch.brix.gql.client.On("AccountUser"));
  }
  /**
   * `AccountUser` Id.
   */
  public On_AccountUser id() {
    _add_field("id");
    return this;
  }
  /**
   * `AccountUser` email.
   */
  public On_AccountUser email() {
    _add_field("email");
    return this;
  }
  /**
   * `AccountUser` name.
   */
  public On_AccountUser name() {
    _add_field("name");
    return this;
  }
  /**
   * `AccountUser` avatar.
   */
  public On_AccountUser avatar() {
    _add_field("avatar");
    return this;
  }
}
