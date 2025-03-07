package ch.brix.gql.client.frontify.builders;

public class AssetLocation_brand extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetLocationBrand> {
  public AssetLocation_brand() {
    super(new ch.brix.gql.client.Call<>("brand", "AssetLocationBrand"));
  }
  public AssetLocation_brand onAssetLocationBrand(On_AssetLocationBrand typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
