package ch.brix.gql.client.frontify.builders;

public class RootMutation_resolveAssetComment extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ResolveAssetComment> {
  public RootMutation_resolveAssetComment() {
    super(new ch.brix.gql.client.Call<>("resolveAssetComment", "ResolveAssetComment"));
  }
  public RootMutation_resolveAssetComment args(RootMutation_resolveAssetComment_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_resolveAssetComment onResolveAssetComment(On_ResolveAssetComment typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
