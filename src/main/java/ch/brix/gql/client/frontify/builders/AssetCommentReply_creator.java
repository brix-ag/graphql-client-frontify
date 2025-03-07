package ch.brix.gql.client.frontify.builders;

public class AssetCommentReply_creator extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public AssetCommentReply_creator() {
    super(new ch.brix.gql.client.Call<>("creator", "User"));
  }
  public AssetCommentReply_creator onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetCommentReply_creator onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
