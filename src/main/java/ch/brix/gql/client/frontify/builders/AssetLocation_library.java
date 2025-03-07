package ch.brix.gql.client.frontify.builders;

public class AssetLocation_library extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetLocationLibrary> {
  public AssetLocation_library() {
    super(new ch.brix.gql.client.Call<>("library", "AssetLocationLibrary"));
  }
  public AssetLocation_library onAssetLocationLibrary(On_AssetLocationLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
