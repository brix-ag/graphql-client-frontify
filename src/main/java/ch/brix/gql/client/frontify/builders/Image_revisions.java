package ch.brix.gql.client.frontify.builders;

public class Image_revisions extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetRevisionItems> {
  public Image_revisions() {
    super(new ch.brix.gql.client.Call<>("revisions", "AssetRevisionItems"));
  }
  public Image_revisions args(Image_revisions_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Image_revisions onAssetRevisionItems(On_AssetRevisionItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
