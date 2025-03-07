package ch.brix.gql.client.frontify.builders;

public class AssetLocation_folder extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetLocationFolder> {
  public AssetLocation_folder() {
    super(new ch.brix.gql.client.Call<>("folder", "AssetLocationFolder"));
  }
  public AssetLocation_folder onAssetLocationFolder(On_AssetLocationFolder typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
