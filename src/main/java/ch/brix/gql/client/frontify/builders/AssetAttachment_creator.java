package ch.brix.gql.client.frontify.builders;

public class AssetAttachment_creator extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public AssetAttachment_creator() {
    super(new ch.brix.gql.client.Call<>("creator", "User"));
  }
  public AssetAttachment_creator onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetAttachment_creator onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
