package ch.brix.gql.client.frontify.builders;

public class RemoveMetadataValue_creator extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public RemoveMetadataValue_creator() {
    super(new ch.brix.gql.client.Call<>("creator", "User"));
  }
  public RemoveMetadataValue_creator onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public RemoveMetadataValue_creator onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
