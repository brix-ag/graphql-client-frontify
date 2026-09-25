package ch.brix.gql.client.frontify.builders;

public class SetLibraryAssetTargets_assets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public SetLibraryAssetTargets_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "Asset"));
  }
  public SetLibraryAssetTargets_assets onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetLibraryAssetTargets_assets onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetLibraryAssetTargets_assets onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetLibraryAssetTargets_assets onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetLibraryAssetTargets_assets onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetLibraryAssetTargets_assets onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetLibraryAssetTargets_assets onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
