package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteComment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteComment> {
  public RootMutation_deleteComment() {
    super(new ch.brix.gql.client.Call<>("deleteComment", "DeleteComment"));
  }
  public RootMutation_deleteComment args(RootMutation_deleteComment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteComment onDeleteComment(On_DeleteComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
