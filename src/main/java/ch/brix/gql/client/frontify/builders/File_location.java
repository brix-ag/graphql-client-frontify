package ch.brix.gql.client.frontify.builders;

public class File_location extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetLocation> {
  public File_location() {
    super(new ch.brix.gql.client.Call<>("location", "AssetLocation"));
  }
  public File_location onAssetLocation(On_AssetLocation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
