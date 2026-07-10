package ch.brix.gql.client.frontify.builders;

public class AssetVariantItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetVariant>> {
  public AssetVariantItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "AssetVariant"));
  }
  public AssetVariantItems_items onAssetVariant(On_AssetVariant typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
