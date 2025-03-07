package ch.brix.gql.client.frontify.builders;

public class AssetCommentReply_mentionedUsers extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.User>> {
  public AssetCommentReply_mentionedUsers() {
    super(new ch.brix.gql.client.Call<>("mentionedUsers", "User"));
  }
  public AssetCommentReply_mentionedUsers onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AssetCommentReply_mentionedUsers onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
