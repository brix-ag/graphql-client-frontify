package ch.brix.gql.client.frontify.builders;

public class On_UserGroup extends ch.brix.gql.client.TypeBuilder {
  public On_UserGroup() {
    super(new ch.brix.gql.client.On("UserGroup"));
  }
  /**
   * `UserGroup` Id.
   */
  public On_UserGroup id() {
    _add_field("id");
    return this;
  }
  /**
   * `UserGroup` name.
   */
  public On_UserGroup name() {
    _add_field("name");
    return this;
  }
  /**
   * `UserGroup`'s `UserItems`.
   */
  public On_UserGroup users(UserGroup_users callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
