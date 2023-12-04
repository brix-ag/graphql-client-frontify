package ch.brix.gql.client.frontify.builders;

public class RootMutation_syncAssetTags extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.SyncAssetTags> {
  public RootMutation_syncAssetTags() {
    super(new ch.brix.gql.client.Call<>("syncAssetTags", "SyncAssetTags"));
  }
  public RootMutation_syncAssetTags args(RootMutation_syncAssetTags_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_syncAssetTags onSyncAssetTags(On_SyncAssetTags typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
