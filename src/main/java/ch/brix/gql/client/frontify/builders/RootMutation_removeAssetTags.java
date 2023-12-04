package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeAssetTags extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveAssetTags> {
  public RootMutation_removeAssetTags() {
    super(new ch.brix.gql.client.Call<>("removeAssetTags", "RemoveAssetTags"));
  }
  public RootMutation_removeAssetTags args(RootMutation_removeAssetTags_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeAssetTags onRemoveAssetTags(On_RemoveAssetTags typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
