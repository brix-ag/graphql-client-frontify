package ch.brix.gql.client.frontify.builders;

public class AssetComment_mentionedUsers extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.User>> {
  public AssetComment_mentionedUsers() {
    super(new ch.brix.gql.client.Call<>("mentionedUsers", "User"));
  }
  public AssetComment_mentionedUsers onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetComment_mentionedUsers onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
