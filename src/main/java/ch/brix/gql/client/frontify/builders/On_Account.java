package ch.brix.gql.client.frontify.builders;

public class On_Account extends ch.brix.gql.client.TypeBuilder {
  public On_Account() {
    super(new ch.brix.gql.client.On("Account"));
  }
  /**
   * `Account` Id.
   */
  public On_Account id() {
    _add_field("id");
    return this;
  }
  /**
   * List and search `UserItems`.
   */
  public On_Account users(Account_users callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List and search `UserGroupItems`.
   */
  public On_Account userGroups(Account_userGroups callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** List and search `AccountSearch` item(s).
   */
  public On_Account search(Account_search callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
