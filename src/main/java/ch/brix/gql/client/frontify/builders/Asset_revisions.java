package ch.brix.gql.client.frontify.builders;

public class Asset_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public Asset_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public Asset_revisions args(Asset_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Asset_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
