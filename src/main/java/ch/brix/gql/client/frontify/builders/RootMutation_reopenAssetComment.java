package ch.brix.gql.client.frontify.builders;

public class RootMutation_reopenAssetComment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ReopenAssetComment> {
  public RootMutation_reopenAssetComment() {
    super(new ch.brix.gql.client.Call<>("reopenAssetComment", "ReopenAssetComment"));
  }
  public RootMutation_reopenAssetComment args(RootMutation_reopenAssetComment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_reopenAssetComment onReopenAssetComment(On_ReopenAssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
