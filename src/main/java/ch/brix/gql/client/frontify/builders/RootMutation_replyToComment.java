package ch.brix.gql.client.frontify.builders;

public class RootMutation_replyToComment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ReplyToComment> {
  public RootMutation_replyToComment() {
    super(new ch.brix.gql.client.Call<>("replyToComment", "ReplyToComment"));
  }
  public RootMutation_replyToComment args(RootMutation_replyToComment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_replyToComment onReplyToComment(On_ReplyToComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
