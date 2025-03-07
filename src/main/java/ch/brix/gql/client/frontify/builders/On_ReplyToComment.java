package ch.brix.gql.client.frontify.builders;

public class On_ReplyToComment extends ch.brix.gql.client.TypeBuilder {
  public On_ReplyToComment() {
    super(new ch.brix.gql.client.On("ReplyToComment"));
  }
  /**
   * `AssetCommentReply` details.
   */
  public On_ReplyToComment reply(ReplyToComment_reply callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
