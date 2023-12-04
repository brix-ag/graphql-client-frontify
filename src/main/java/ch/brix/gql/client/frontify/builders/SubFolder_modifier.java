package ch.brix.gql.client.frontify.builders;

public class SubFolder_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public SubFolder_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public SubFolder_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SubFolder_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
