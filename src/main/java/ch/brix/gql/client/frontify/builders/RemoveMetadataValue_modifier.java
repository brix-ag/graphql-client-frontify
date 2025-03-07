package ch.brix.gql.client.frontify.builders;

public class RemoveMetadataValue_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public RemoveMetadataValue_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public RemoveMetadataValue_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveMetadataValue_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
