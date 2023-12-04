package ch.brix.gql.client.frontify.builders;

public class RootMutation_editComment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.EditComment> {
  public RootMutation_editComment() {
    super(new ch.brix.gql.client.Call<>("editComment", "EditComment"));
  }
  public RootMutation_editComment args(RootMutation_editComment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_editComment onEditComment(On_EditComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
