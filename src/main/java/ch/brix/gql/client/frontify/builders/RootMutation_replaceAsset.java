package ch.brix.gql.client.frontify.builders;

public class RootMutation_replaceAsset extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.ReplaceAsset> {
  public RootMutation_replaceAsset() {
    super(new ch.brix.gql.client.Call<>("replaceAsset", "ReplaceAsset"));
  }
  public RootMutation_replaceAsset args(RootMutation_replaceAsset_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_replaceAsset onReplaceAsset(On_ReplaceAsset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
