package ch.brix.gql.client.frontify.builders;

public class Asset_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public Asset_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public Asset_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Asset_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
