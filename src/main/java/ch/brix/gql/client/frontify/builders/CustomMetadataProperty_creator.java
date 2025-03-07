package ch.brix.gql.client.frontify.builders;

public class CustomMetadataProperty_creator extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public CustomMetadataProperty_creator() {
    super(new ch.brix.gql.client.Call<>("creator", "User"));
  }
  public CustomMetadataProperty_creator onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_creator onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
