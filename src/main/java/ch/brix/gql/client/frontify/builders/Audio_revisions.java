package ch.brix.gql.client.frontify.builders;

public class Audio_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public Audio_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public Audio_revisions args(Audio_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Audio_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
