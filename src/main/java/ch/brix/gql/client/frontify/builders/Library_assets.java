package ch.brix.gql.client.frontify.builders;

public class Library_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Library_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public Library_assets args(Library_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Library_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
