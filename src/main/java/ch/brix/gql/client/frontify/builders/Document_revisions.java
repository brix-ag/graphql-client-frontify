package ch.brix.gql.client.frontify.builders;

public class Document_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public Document_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public Document_revisions args(Document_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Document_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
