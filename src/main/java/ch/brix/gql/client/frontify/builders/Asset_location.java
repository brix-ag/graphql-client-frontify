package ch.brix.gql.client.frontify.builders;

public class Asset_location extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetLocation> {
  public Asset_location() {
    super(new ch.brix.gql.client.Call<>("location", "AssetLocation"));
  }
  public Asset_location onAssetLocation(On_AssetLocation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
