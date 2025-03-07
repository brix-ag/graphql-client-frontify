package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public EmbeddedContent_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public EmbeddedContent_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public EmbeddedContent_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
