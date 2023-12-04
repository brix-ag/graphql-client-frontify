package ch.brix.gql.client.frontify.builders;

public class Document_creator extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public Document_creator() {
    super(new ch.brix.gql.client.Call<>("creator", "User"));
  }
  public Document_creator onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Document_creator onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
