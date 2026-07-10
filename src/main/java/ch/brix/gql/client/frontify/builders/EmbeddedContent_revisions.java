package ch.brix.gql.client.frontify.builders;

public class EmbeddedContent_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public EmbeddedContent_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public EmbeddedContent_revisions args(EmbeddedContent_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public EmbeddedContent_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
