package ch.brix.gql.client.frontify.builders;

public class Comment_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public Comment_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public Comment_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Comment_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
