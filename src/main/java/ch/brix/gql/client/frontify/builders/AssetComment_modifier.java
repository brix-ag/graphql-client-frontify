package ch.brix.gql.client.frontify.builders;

public class AssetComment_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public AssetComment_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public AssetComment_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetComment_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
