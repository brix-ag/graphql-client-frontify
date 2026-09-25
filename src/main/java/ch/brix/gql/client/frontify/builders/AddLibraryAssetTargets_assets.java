package ch.brix.gql.client.frontify.builders;

public class AddLibraryAssetTargets_assets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public AddLibraryAssetTargets_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "Asset"));
  }
  public AddLibraryAssetTargets_assets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddLibraryAssetTargets_assets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddLibraryAssetTargets_assets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddLibraryAssetTargets_assets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddLibraryAssetTargets_assets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddLibraryAssetTargets_assets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public AddLibraryAssetTargets_assets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
