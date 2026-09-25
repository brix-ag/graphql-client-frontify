package ch.brix.gql.client.frontify.builders;

public class LibraryAssetsByExternalIdResult_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public LibraryAssetsByExternalIdResult_items() {
    super(new ch.brix.gql.client.Call<>("items", "Asset"));
  }
  public LibraryAssetsByExternalIdResult_items onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryAssetsByExternalIdResult_items onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryAssetsByExternalIdResult_items onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryAssetsByExternalIdResult_items onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryAssetsByExternalIdResult_items onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryAssetsByExternalIdResult_items onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryAssetsByExternalIdResult_items onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
