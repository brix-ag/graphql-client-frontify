package ch.brix.gql.client.frontify.builders;

public class RootQuery_currentUser extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public RootQuery_currentUser() {
    super(new ch.brix.gql.client.Call<>("currentUser", "User"));
  }
  public RootQuery_currentUser onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RootQuery_currentUser onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
