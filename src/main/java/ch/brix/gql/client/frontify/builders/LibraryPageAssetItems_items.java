package ch.brix.gql.client.frontify.builders;

public class LibraryPageAssetItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.Asset>> {
  public LibraryPageAssetItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "Asset"));
  }
  public LibraryPageAssetItems_items onAudio(On_Audio typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryPageAssetItems_items onDocument(On_Document typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryPageAssetItems_items onImage(On_Image typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryPageAssetItems_items onVideo(On_Video typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryPageAssetItems_items onFile(On_File typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryPageAssetItems_items onEmbeddedContent(On_EmbeddedContent typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryPageAssetItems_items onAsset(On_Asset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
