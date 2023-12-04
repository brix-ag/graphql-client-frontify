package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetTags extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddAssetTags> {
  public RootMutation_addAssetTags() {
    super(new ch.brix.gql.client.Call<>("addAssetTags", "AddAssetTags"));
  }
  public RootMutation_addAssetTags args(RootMutation_addAssetTags_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addAssetTags onAddAssetTags(On_AddAssetTags typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
